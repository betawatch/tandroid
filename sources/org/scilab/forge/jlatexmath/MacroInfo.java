package org.scilab.forge.jlatexmath;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes3.dex */
public class MacroInfo {
    public static HashMap Commands = new HashMap(NotificationCenter.onDatabaseOpened);
    public static HashMap Packages = new HashMap();
    public boolean hasOptions;
    public Method macro;
    public int nbArgs;
    public Object pack;
    public int posOpts;

    public MacroInfo(Object obj, Method method, int i) {
        this.hasOptions = false;
        this.pack = obj;
        this.macro = method;
        this.nbArgs = i;
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
            PrintStream printStream = System.err;
            printStream.println("Cannot load package " + str + ":");
            printStream.println(e.toString());
        }
    }

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
            PrintStream printStream = System.err;
            printStream.println("Cannot load package " + str + ":");
            printStream.println(e.toString());
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
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e3.getCause().getMessage());
        }
    }
}
