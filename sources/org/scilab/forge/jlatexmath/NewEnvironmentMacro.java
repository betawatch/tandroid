package org.scilab.forge.jlatexmath;

import a4.a;
import sa.e;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String v = e.v(str, "@env");
        StringBuilder j3 = e.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(v, j3.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String v = e.v(str, "@env");
        StringBuilder j3 = e.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addReNewCommand(v, j3.toString(), i11);
    }
}
