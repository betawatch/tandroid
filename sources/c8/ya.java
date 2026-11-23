package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.z80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class ya {
    public static boolean a(z80 z80Var) {
        Context context = org.telegram.messenger.t0.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(z80Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z80Var == z80.h);
    }

    public static void b(z80 z80Var) {
        Context context = org.telegram.messenger.t0.b;
        PackageManager packageManager = context.getPackageManager();
        z80[] values = z80.values();
        int length = values.length;
        for (int i7 = 0; i7 < length; i7++) {
            z80 z80Var2 = values[i7];
            packageManager.setComponentEnabledSetting(z80Var2.a(context), z80Var2 == z80Var ? 1 : 2, 1);
        }
    }
}
