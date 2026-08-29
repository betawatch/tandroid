package g9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j {
    public static final i d = new i(0);
    public static final c5.e e = new c5.e(14);
    public final l9.b a;
    public String b = null;
    public String c = null;

    public j(l9.b bVar) {
        this.a = bVar;
    }

    public static void a(l9.b bVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
