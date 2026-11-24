package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i) {
        String o = tb4.o(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addNewCommand(o, sb.toString(), i2);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            qm0.g(tb4.y("Environment ", str, "is not defined ! Use newenvironment instead ..."));
            return;
        }
        String o = tb4.o(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addReNewCommand(o, sb.toString(), i2);
    }
}
