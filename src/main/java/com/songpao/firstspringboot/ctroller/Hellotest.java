package com.songpao.firstspringboot.ctroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Hellotest {
    @RequestMapping("/")
    @ResponseBody
    public String getHello(){
        return "hello";
    }
}
