package k7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.cb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static boolean a(cb0 cb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(cb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && cb0Var == cb0.h);
    }

    public static void b(cb0 cb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        cb0[] values = cb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            cb0 cb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(cb0Var2.a(context), cb0Var2 == cb0Var ? 1 : 2, 1);
        }
    }
}
