// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class om2 {
    public static final ce3 a = new ce3("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            ce3 ce3Var = a;
            if (!Log.isLoggable(ce3Var.b, 6)) {
                return "";
            }
            String str = ce3Var.c;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
