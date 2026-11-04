package org.scilab.forge.jlatexmath;

import a1.g;
import t4.c;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i3) {
        String q10 = c.q(str, "@env");
        StringBuilder h = c.h(str2, " #");
        int i10 = i3 + 1;
        h.append(i10);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addNewCommand(q10, h.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i3) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(g.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String q10 = c.q(str, "@env");
        StringBuilder h = c.h(str2, " #");
        int i10 = i3 + 1;
        h.append(i10);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addReNewCommand(q10, h.toString(), i10);
    }
}
