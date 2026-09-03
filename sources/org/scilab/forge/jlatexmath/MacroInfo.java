package org.scilab.forge.jlatexmath;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class MacroInfo {
    public static HashMap<String, MacroInfo> Commands = new HashMap<>(300);
    public static HashMap<String, Object> Packages = new HashMap<>();
    public boolean hasOptions;
    public Method macro;
    public int nbArgs;
    public Object pack;
    public int posOpts;

    public MacroInfo(Object obj, Method method, int i10) {
        this.hasOptions = false;
        this.pack = obj;
        this.macro = method;
        this.nbArgs = i10;
    }

    public Object invoke(TeXParser teXParser, String[] strArr) {
        try {
            return this.macro.invoke(this.pack, teXParser, strArr);
        } catch (IllegalAccessException e6) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e6);
        } catch (IllegalArgumentException e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e10);
        } catch (InvocationTargetException e11) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e11.getCause().getMessage());
        }
    }

    public MacroInfo(Object obj, Method method, int i10, int i11) {
        this(obj, method, i10);
        this.hasOptions = true;
        this.posOpts = i11;
    }

    public MacroInfo(int i10, int i11) {
        this((Object) null, (Method) null, i10);
        this.hasOptions = true;
        this.posOpts = i11;
    }

    public MacroInfo(int i10) {
        this((Object) null, (Method) null, i10);
    }

    public MacroInfo(String str, String str2, float f10) {
        this.hasOptions = false;
        int i10 = (int) f10;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i10;
        } catch (Exception e6) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e6.toString());
        }
    }

    public MacroInfo(String str, String str2, float f10, float f11) {
        this.hasOptions = false;
        int i10 = (int) f10;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i10;
            this.hasOptions = true;
            this.posOpts = (int) f11;
        } catch (Exception e6) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e6.toString());
        }
    }
}
