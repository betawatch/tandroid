package org.scilab.forge.jlatexmath;

import a1.g;
import si.o0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String u10 = o0.u(str, "@env");
        StringBuilder i11 = o0.i(str2, " #");
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
        String u10 = o0.u(str, "@env");
        StringBuilder i11 = o0.i(str2, " #");
        int i12 = i10 + 1;
        i11.append(i12);
        i11.append(" ");
        i11.append(str3);
        NewCommandMacro.addReNewCommand(u10, i11.toString(), i12);
    }
}
