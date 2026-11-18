package org.scilab.forge.jlatexmath;

import a8.p0;
import p5.c;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i7) {
        String v = c.v(str, "@env");
        StringBuilder n10 = c.n(str2, " #");
        int i10 = i7 + 1;
        n10.append(i10);
        n10.append(" ");
        n10.append(str3);
        NewCommandMacro.addNewCommand(v, n10.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i7) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(p0.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String v = c.v(str, "@env");
        StringBuilder n10 = c.n(str2, " #");
        int i10 = i7 + 1;
        n10.append(i10);
        n10.append(" ");
        n10.append(str3);
        NewCommandMacro.addReNewCommand(v, n10.toString(), i10);
    }
}
