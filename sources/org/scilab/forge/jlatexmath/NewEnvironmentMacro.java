package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;
import w.c;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String e6 = c.e(str, "@env");
        StringBuilder f10 = c.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addNewCommand(e6, f10.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.o("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String e6 = c.e(str, "@env");
        StringBuilder f10 = c.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addReNewCommand(e6, f10.toString(), i11);
    }
}
