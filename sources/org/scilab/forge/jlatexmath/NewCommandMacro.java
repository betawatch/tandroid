package org.scilab.forge.jlatexmath;

import aa.d;
import java.util.HashMap;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class NewCommandMacro {
    protected static HashMap<String, String> macrocode = new HashMap<>();
    protected static HashMap<String, String> macroreplacement = new HashMap<>();

    public static void addNewCommand(String str, String str2, int i9) {
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i9));
    }

    public static void addReNewCommand(String str, String str2, int i9) {
        if (macrocode.get(str) == null) {
            throw new ParseException(d.o("Command ", str, " is not defined ! Use newcommand instead ..."));
        }
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i9));
    }

    public static boolean isMacro(String str) {
        return macrocode.containsKey(str);
    }

    public static void reset() {
        macrocode.clear();
        macroreplacement.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0040 A[LOOP:0: B:6:0x003e->B:7:0x0040, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String executeMacro(TeXParser teXParser, String[] strArr) {
        int i9 = 0;
        String str = macrocode.get(strArr[0]);
        int length = strArr.length;
        int i10 = length - 11;
        String str2 = strArr[length - 10];
        if (str2 == null) {
            if (macroreplacement.get(strArr[0]) != null) {
                str = str.replaceAll("#1", Matcher.quoteReplacement(macroreplacement.get(strArr[0])));
            }
            for (int i11 = 1; i11 <= i10; i11++) {
                str = str.replaceAll("#" + (i11 + i9), Matcher.quoteReplacement(strArr[i11]));
            }
            return str;
        }
        str = str.replaceAll("#1", Matcher.quoteReplacement(str2));
        i9 = 1;
        while (i11 <= i10) {
        }
        return str;
    }

    public static void addNewCommand(String str, String str2, int i9, String str3) {
        if (macrocode.get(str) == null) {
            macrocode.put(str, str2);
            macroreplacement.put(str, str3);
            MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i9, 1.0f));
            return;
        }
        throw new ParseException(d.o("Command ", str, " already exists ! Use renewcommand instead ..."));
    }
}
