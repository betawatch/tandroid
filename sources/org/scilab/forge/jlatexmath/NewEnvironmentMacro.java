package org.scilab.forge.jlatexmath;

import a4.a;
import t8.b;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String v = b.v(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(v, j3.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String v = b.v(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addReNewCommand(v, j3.toString(), i11);
    }
}
