package org.scilab.forge.jlatexmath;

import a8.p0;
import r.b;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i7) {
        String v = b.v(str, "@env");
        StringBuilder m10 = b.m(str2, " #");
        int i10 = i7 + 1;
        m10.append(i10);
        m10.append(" ");
        m10.append(str3);
        NewCommandMacro.addNewCommand(v, m10.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i7) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(p0.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String v = b.v(str, "@env");
        StringBuilder m10 = b.m(str2, " #");
        int i10 = i7 + 1;
        m10.append(i10);
        m10.append(" ");
        m10.append(str3);
        NewCommandMacro.addReNewCommand(v, m10.toString(), i10);
    }
}
