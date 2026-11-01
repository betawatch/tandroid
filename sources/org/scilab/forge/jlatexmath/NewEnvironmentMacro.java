package org.scilab.forge.jlatexmath;

import a1.g;
import sc.e;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String A = e.A(str, "@env");
        StringBuilder i11 = e.i(str2, " #");
        int i12 = i10 + 1;
        i11.append(i12);
        i11.append(" ");
        i11.append(str3);
        NewCommandMacro.addNewCommand(A, i11.toString(), i12);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(g.n("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String A = e.A(str, "@env");
        StringBuilder i11 = e.i(str2, " #");
        int i12 = i10 + 1;
        i11.append(i12);
        i11.append(" ");
        i11.append(str3);
        NewCommandMacro.addReNewCommand(A, i11.toString(), i12);
    }
}
