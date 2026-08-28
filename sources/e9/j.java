package e9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public static final i d = new i(0);
    public static final a5.e e = new a5.e(13);
    public final j9.c a;
    public String b = null;
    public String c = null;

    public j(j9.c cVar) {
        this.a = cVar;
    }

    public static void a(j9.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
