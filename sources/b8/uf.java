package b8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class uf {
    public static boolean a(t80 t80Var) {
        Context context = org.telegram.messenger.t0.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(t80Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && t80Var == t80.h);
    }

    public static void b(t80 t80Var) {
        Context context = org.telegram.messenger.t0.b;
        PackageManager packageManager = context.getPackageManager();
        t80[] values = t80.values();
        int length = values.length;
        for (int i3 = 0; i3 < length; i3++) {
            t80 t80Var2 = values[i3];
            packageManager.setComponentEnabledSetting(t80Var2.a(context), t80Var2 == t80Var ? 1 : 2, 1);
        }
    }
}
