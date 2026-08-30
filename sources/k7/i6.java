package k7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ab0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static boolean a(ab0 ab0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ab0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ab0Var == ab0.h);
    }

    public static void b(ab0 ab0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ab0[] values = ab0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ab0 ab0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ab0Var2.a(context), ab0Var2 == ab0Var ? 1 : 2, 1);
        }
    }
}
