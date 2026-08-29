package i7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.sa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class m6 {
    public static boolean a(sa0 sa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(sa0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && sa0Var == sa0.h);
    }

    public static void b(sa0 sa0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        sa0[] values = sa0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            sa0 sa0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(sa0Var2.a(context), sa0Var2 == sa0Var ? 1 : 2, 1);
        }
    }
}
