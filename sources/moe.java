// default package

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class moe {
    public static boolean a(c26 c26Var) {
        Context context = a.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(c26Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && c26Var == c26.h);
    }

    public static void b(c26 c26Var) {
        Context context = a.b;
        PackageManager packageManager = context.getPackageManager();
        c26[] values = c26.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            c26 c26Var2 = values[i];
            packageManager.setComponentEnabledSetting(c26Var2.a(context), c26Var2 == c26Var ? 1 : 2, 1);
        }
    }
}
