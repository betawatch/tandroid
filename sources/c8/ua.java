package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.y80;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class ua {
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
