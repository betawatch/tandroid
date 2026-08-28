package g7;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j0 {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (a == null) {
                    a = (SharedPreferences) r8.a(new d7.p(context, 9));
                }
                sharedPreferences = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
