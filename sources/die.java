// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class die {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = a;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            a = bool;
        }
        if (bool.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        Boolean bool2 = b;
        if (bool2 == null) {
            bool2 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            b = bool2;
        }
        if (bool2.booleanValue()) {
            return !rve.a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
