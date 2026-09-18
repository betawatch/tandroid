package org.scilab.forge.jlatexmath;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        } catch (IllegalAccessException e) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e);
        } catch (IllegalArgumentException e7) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e7);
        } catch (InvocationTargetException e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e10.getCause().getMessage());
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

    public MacroInfo(String str, String str2, float f7) {
        this.hasOptions = false;
        int i10 = (int) f7;
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
        } catch (Exception e) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e.toString());
        }
    }

    public MacroInfo(String str, String str2, float f7, float f10) {
        this.hasOptions = false;
        int i10 = (int) f7;
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
            this.posOpts = (int) f10;
        } catch (Exception e) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e.toString());
        }
    }
}
