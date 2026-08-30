package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String k10 = v2.k(str, "@env");
        StringBuilder f10 = v2.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addNewCommand(k10, f10.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.o("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String k10 = v2.k(str, "@env");
        StringBuilder f10 = v2.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addReNewCommand(k10, f10.toString(), i11);
    }
}
