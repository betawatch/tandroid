package org.scilab.forge.jlatexmath;

import a4.a;
import v7.j;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String t10 = j.t(str, "@env");
        StringBuilder h = j.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addNewCommand(t10, h.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(a.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String t10 = j.t(str, "@env");
        StringBuilder h = j.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addReNewCommand(t10, h.toString(), i11);
    }
}
