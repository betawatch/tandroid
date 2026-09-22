package org.scilab.forge.jlatexmath;

import a4.a;
import v7.j0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String s10 = j0.s(str, "@env");
        StringBuilder h = j0.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addNewCommand(s10, h.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String s10 = j0.s(str, "@env");
        StringBuilder h = j0.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addReNewCommand(s10, h.toString(), i11);
    }
}
