package org.scilab.forge.jlatexmath;

import aa.d;
import ta.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i9) {
        String j10 = b.j(str, "@env");
        StringBuilder e10 = b.e(str2, " #");
        int i10 = i9 + 1;
        e10.append(i10);
        e10.append(" ");
        e10.append(str3);
        NewCommandMacro.addNewCommand(j10, e10.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i9) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(d.o("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String j10 = b.j(str, "@env");
        StringBuilder e10 = b.e(str2, " #");
        int i10 = i9 + 1;
        e10.append(i10);
        e10.append(" ");
        e10.append(str3);
        NewCommandMacro.addReNewCommand(j10, e10.toString(), i10);
    }
}
