package f7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f == null) {
            f = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return f.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            d = Boolean.valueOf(z10);
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (b == null) {
            b = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || b(resources));
        }
        return b.booleanValue();
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (g == null) {
            g = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return g.booleanValue();
    }
}
