package org.scilab.forge.jlatexmath;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class MacroInfo {
    public static HashMap<String, MacroInfo> Commands = new HashMap<>(kk7.W4);
    public static HashMap<String, Object> Packages = new HashMap<>();
    public boolean hasOptions;
    public Method macro;
    public int nbArgs;
    public Object pack;
    public int posOpts;

    public MacroInfo(String str, String str2, float f, float f2) {
        this.hasOptions = false;
        int i = (int) f;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i;
            this.hasOptions = true;
            this.posOpts = (int) f2;
        } catch (Exception e) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e.toString());
        }
    }

    public Object invoke(TeXParser teXParser, String[] strArr) {
        try {
            return this.macro.invoke(this.pack, teXParser, strArr);
        } catch (IllegalAccessException e) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e);
        } catch (IllegalArgumentException e2) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + cause.getMessage());
        }
    }

    public MacroInfo(Object obj, Method method, int i, int i2) {
        this(obj, method, i);
        this.hasOptions = true;
        this.posOpts = i2;
    }

    public MacroInfo(int i, int i2) {
        this((Object) null, (Method) null, i);
        this.hasOptions = true;
        this.posOpts = i2;
    }

    public MacroInfo(int i) {
        this((Object) null, (Method) null, i);
    }

    public MacroInfo(String str, String str2, float f) {
        this.hasOptions = false;
        int i = (int) f;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i;
        } catch (Exception e) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e.toString());
        }
    }

    public MacroInfo(Object obj, Method method, int i) {
        this.hasOptions = false;
        this.pack = obj;
        this.macro = method;
        this.nbArgs = i;
    }
}
