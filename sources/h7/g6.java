package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(ta0 ta0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ta0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ta0Var == ta0.h);
    }

    public static void b(ta0 ta0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ta0[] values = ta0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ta0 ta0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ta0Var2.a(context), ta0Var2 == ta0Var ? 1 : 2, 1);
        }
    }
}
