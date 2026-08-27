package org.scilab.forge.jlatexmath;

import a9.p;
import s3.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String l10 = c.l(str, "@env");
        StringBuilder f10 = c.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addNewCommand(l10, f10.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(p.m("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String l10 = c.l(str, "@env");
        StringBuilder f10 = c.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addReNewCommand(l10, f10.toString(), i11);
    }
}
