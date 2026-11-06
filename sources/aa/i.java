package aa;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
