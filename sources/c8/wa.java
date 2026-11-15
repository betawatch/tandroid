package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.w80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class wa {
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
