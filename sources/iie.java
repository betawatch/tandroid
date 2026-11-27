// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class iie {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = f;
        if (bool == null) {
            bool = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            f = bool;
        }
        return bool.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        Boolean bool = d;
        if (bool == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            d = bool;
        }
        return bool.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        Boolean bool = b;
        if (bool == null) {
            bool = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || b(resources));
            b = bool;
        }
        return bool.booleanValue();
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = g;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
            g = bool;
        }
        return bool.booleanValue();
    }
}
