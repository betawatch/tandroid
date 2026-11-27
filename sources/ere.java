// default package

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ere {
    public static boolean a(g26 g26Var) {
        Context context = a.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(g26Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && g26Var == g26.h);
    }

    public static void b(g26 g26Var) {
        Context context = a.b;
        PackageManager packageManager = context.getPackageManager();
        g26[] values = g26.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            g26 g26Var2 = values[i];
            packageManager.setComponentEnabledSetting(g26Var2.a(context), g26Var2 == g26Var ? 1 : 2, 1);
        }
    }
}
