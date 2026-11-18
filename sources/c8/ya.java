package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.y80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class ya {
    public static boolean a(y80 y80Var) {
        Context context = org.telegram.messenger.t0.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(y80Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && y80Var == y80.h);
    }

    public static void b(y80 y80Var) {
        Context context = org.telegram.messenger.t0.b;
        PackageManager packageManager = context.getPackageManager();
        y80[] values = y80.values();
        int length = values.length;
        for (int i7 = 0; i7 < length; i7++) {
            y80 y80Var2 = values[i7];
            packageManager.setComponentEnabledSetting(y80Var2.a(context), y80Var2 == y80Var ? 1 : 2, 1);
        }
    }
}
