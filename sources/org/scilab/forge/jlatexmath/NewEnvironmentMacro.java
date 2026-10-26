package org.scilab.forge.jlatexmath;

import a1.g;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String u10 = b10.u(str, "@env");
        StringBuilder l4 = b10.l(str2, " #");
        int i11 = i10 + 1;
        l4.append(i11);
        l4.append(" ");
        l4.append(str3);
        NewCommandMacro.addNewCommand(u10, l4.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(g.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String u10 = b10.u(str, "@env");
        StringBuilder l4 = b10.l(str2, " #");
        int i11 = i10 + 1;
        l4.append(i11);
        l4.append(" ");
        l4.append(str3);
        NewCommandMacro.addReNewCommand(u10, l4.toString(), i11);
    }
}
