package org.scilab.forge.jlatexmath;

import a4.a;
import org.telegram.ui.Cells.p6;
import w.f;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String t10 = p6.t(str, "@env");
        StringBuilder g10 = f.g(str2, " #");
        int i11 = i10 + 1;
        g10.append(i11);
        g10.append(" ");
        g10.append(str3);
        NewCommandMacro.addNewCommand(t10, g10.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String t10 = p6.t(str, "@env");
        StringBuilder g10 = f.g(str2, " #");
        int i11 = i10 + 1;
        g10.append(i11);
        g10.append(" ");
        g10.append(str3);
        NewCommandMacro.addReNewCommand(t10, g10.toString(), i11);
    }
}
