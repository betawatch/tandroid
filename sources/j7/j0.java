package j7;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class j0 {
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
