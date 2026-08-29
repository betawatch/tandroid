package org.scilab.forge.jlatexmath;

import a4.w;
import java.util.HashMap;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class NewCommandMacro {
    protected static HashMap<String, String> macrocode = new HashMap<>();
    protected static HashMap<String, String> macroreplacement = new HashMap<>();

    public static void addNewCommand(String str, String str2, int i10) {
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i10));
    }

    public static void addReNewCommand(String str, String str2, int i10) {
        if (macrocode.get(str) == null) {
            throw new ParseException(w.n("Command ", str, " is not defined ! Use newcommand instead ..."));
        }
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i10));
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
        int i10 = 0;
        String str = macrocode.get(strArr[0]);
        int length = strArr.length;
        int i11 = length - 11;
        String str2 = strArr[length - 10];
        if (str2 == null) {
            if (macroreplacement.get(strArr[0]) != null) {
                str = str.replaceAll("#1", Matcher.quoteReplacement(macroreplacement.get(strArr[0])));
            }
            for (int i12 = 1; i12 <= i11; i12++) {
                str = str.replaceAll("#" + (i12 + i10), Matcher.quoteReplacement(strArr[i12]));
            }
            return str;
        }
        str = str.replaceAll("#1", Matcher.quoteReplacement(str2));
        i10 = 1;
        while (i12 <= i11) {
        }
        return str;
    }

    public static void addNewCommand(String str, String str2, int i10, String str3) {
        if (macrocode.get(str) == null) {
            macrocode.put(str, str2);
            macroreplacement.put(str, str3);
            MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i10, 1.0f));
            return;
        }
        throw new ParseException(w.n("Command ", str, " already exists ! Use renewcommand instead ..."));
    }
}
