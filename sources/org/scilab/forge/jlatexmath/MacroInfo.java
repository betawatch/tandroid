package org.scilab.forge.jlatexmath;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class MacroInfo {
    public static HashMap<String, MacroInfo> Commands = new HashMap<>(hs.X4);
    public static HashMap<String, Object> Packages = new HashMap<>();
    public boolean hasOptions;
    public Method macro;
    public int nbArgs;
    public Object pack;
    public int posOpts;

    public MacroInfo(Object obj, Method method, int i3) {
        this.hasOptions = false;
        this.pack = obj;
        this.macro = method;
        this.nbArgs = i3;
    }

    public Object invoke(TeXParser teXParser, String[] strArr) {
        try {
            return this.macro.invoke(this.pack, teXParser, strArr);
        } catch (IllegalAccessException e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e10);
        } catch (IllegalArgumentException e11) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n", e11);
        } catch (InvocationTargetException e12) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e12.getCause().getMessage());
        }
    }

    public MacroInfo(Object obj, Method method, int i3, int i10) {
        this(obj, method, i3);
        this.hasOptions = true;
        this.posOpts = i10;
    }

    public MacroInfo(int i3, int i10) {
        this((Object) null, (Method) null, i3);
        this.hasOptions = true;
        this.posOpts = i10;
    }

    public MacroInfo(int i3) {
        this((Object) null, (Method) null, i3);
    }

    public MacroInfo(String str, String str2, float f10) {
        this.hasOptions = false;
        int i3 = (int) f10;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i3;
        } catch (Exception e10) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e10.toString());
        }
    }

    public MacroInfo(String str, String str2, float f10, float f11) {
        this.hasOptions = false;
        int i3 = (int) f10;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i3;
            this.hasOptions = true;
            this.posOpts = (int) f11;
        } catch (Exception e10) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e10.toString());
        }
    }
}
