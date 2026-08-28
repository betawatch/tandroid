package g7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l6 {
    public static boolean a(pa0 pa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(pa0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && pa0Var == pa0.h);
    }

    public static void b(pa0 pa0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        pa0[] values = pa0.values();
        int length = values.length;
        for (int i9 = 0; i9 < length; i9++) {
            pa0 pa0Var2 = values[i9];
            packageManager.setComponentEnabledSetting(pa0Var2.a(context), pa0Var2 == pa0Var ? 1 : 2, 1);
        }
    }
}
