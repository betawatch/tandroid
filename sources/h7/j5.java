package h7;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class j5 {
    public static void a(Object obj, String str, String str2) {
        String c3 = c(str);
        if (Log.isLoggable(c3, 3)) {
            Log.d(c3, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c3 = c(str);
        if (Log.isLoggable(c3, 6)) {
            Log.e(c3, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }
}
