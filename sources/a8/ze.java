package a8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class ze {
    public static boolean a(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ua0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ua0Var == ua0.h);
    }

    public static void b(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ua0[] values = ua0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ua0 ua0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ua0Var2.a(context), ua0Var2 == ua0Var ? 1 : 2, 1);
        }
    }
}
