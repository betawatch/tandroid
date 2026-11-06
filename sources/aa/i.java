package aa;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i {
    public static final h d = new h(0);
    public static final a3.c e = new a3.c(8);
    public final ga.d a;
    public String b = null;
    public String c = null;

    public i(ga.d dVar) {
        this.a = dVar;
    }

    public static void a(ga.d dVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            dVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
