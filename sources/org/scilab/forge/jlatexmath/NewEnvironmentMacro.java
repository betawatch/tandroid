package org.scilab.forge.jlatexmath;

import a4.a;
import w.c;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String g10 = c.g(str, "@env");
        StringBuilder h = c.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addNewCommand(g10, h.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String g10 = c.g(str, "@env");
        StringBuilder h = c.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addReNewCommand(g10, h.toString(), i11);
    }
}
