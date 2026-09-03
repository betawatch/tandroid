package cb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c {
    public static final b6.h a = new b6.h("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e6) {
            String concat = "Exception thrown when trying to get app version ".concat(e6.toString());
            b6.h hVar = a;
            if (!Log.isLoggable(hVar.b, 6)) {
                return "";
            }
            String str = hVar.c;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
