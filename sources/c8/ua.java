package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.w80;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class ua {
    public static boolean a(w80 w80Var) {
        Context context = org.telegram.messenger.t0.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(w80Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && w80Var == w80.h);
    }

    public static void b(w80 w80Var) {
        Context context = org.telegram.messenger.t0.b;
        PackageManager packageManager = context.getPackageManager();
        w80[] values = w80.values();
        int length = values.length;
        for (int i7 = 0; i7 < length; i7++) {
            w80 w80Var2 = values[i7];
            packageManager.setComponentEnabledSetting(w80Var2.a(context), w80Var2 == w80Var ? 1 : 2, 1);
        }
    }
}
