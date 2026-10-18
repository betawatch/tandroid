package org.scilab.forge.jlatexmath;

import a1.g;
import r4.c;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String u10 = c.u(str, "@env");
        StringBuilder i11 = c.i(str2, " #");
        int i12 = i10 + 1;
        i11.append(i12);
        i11.append(" ");
        i11.append(str3);
        NewCommandMacro.addNewCommand(u10, i11.toString(), i12);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(g.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String u10 = c.u(str, "@env");
        StringBuilder i11 = c.i(str2, " #");
        int i12 = i10 + 1;
        i11.append(i12);
        i11.append(" ");
        i11.append(str3);
        NewCommandMacro.addReNewCommand(u10, i11.toString(), i12);
    }
}
