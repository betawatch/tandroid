package org.scilab.forge.jlatexmath;

import a1.g;
import sc.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String v = v.v(str, "@env");
        StringBuilder j3 = v.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(v, j3.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(g.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String v = v.v(str, "@env");
        StringBuilder j3 = v.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addReNewCommand(v, j3.toString(), i11);
    }
}
