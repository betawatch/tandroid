// default package

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class jme {
    public static boolean a(c06 c06Var) {
        Context context = a.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(c06Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && c06Var == c06.h);
    }

    public static void b(c06 c06Var) {
        Context context = a.b;
        PackageManager packageManager = context.getPackageManager();
        c06[] values = c06.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            c06 c06Var2 = values[i];
            packageManager.setComponentEnabledSetting(c06Var2.a(context), c06Var2 == c06Var ? 1 : 2, 1);
        }
    }
}
