package mb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.telegram.messenger.m6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c {
    public static final m6 a = new m6("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            m6 m6Var = a;
            if (!Log.isLoggable(m6Var.a, 6)) {
                return "";
            }
            String str = m6Var.b;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
