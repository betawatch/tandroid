package org.scilab.forge.jlatexmath;

import a8.p0;
import rf.b;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i7) {
        String q10 = b.q(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i10 = i7 + 1;
        j3.append(i10);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(q10, j3.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i7) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(p0.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String q10 = b.q(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i10 = i7 + 1;
        j3.append(i10);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addReNewCommand(q10, j3.toString(), i10);
    }
}
