package k7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.bb0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class j6 {
    public static boolean a(bb0 bb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(bb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && bb0Var == bb0.h);
    }

    public static void b(bb0 bb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        bb0[] values = bb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            bb0 bb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(bb0Var2.a(context), bb0Var2 == bb0Var ? 1 : 2, 1);
        }
    }
}
