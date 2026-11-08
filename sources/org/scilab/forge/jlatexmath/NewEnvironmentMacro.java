package org.scilab.forge.jlatexmath;

import a8.p0;
import rf.b;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i7) {
        String r10 = b.r(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i10 = i7 + 1;
        j3.append(i10);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(r10, j3.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i7) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(p0.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String r10 = b.r(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i10 = i7 + 1;
        j3.append(i10);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addReNewCommand(r10, j3.toString(), i10);
    }
}
