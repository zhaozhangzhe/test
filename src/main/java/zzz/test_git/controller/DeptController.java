package zzz.test_git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DeptController {
    @RequestMapping("/test")
    @ResponseBody
    public String  test(){
        System.out.println("hello");
        return "test";
    }
}
