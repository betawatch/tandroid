package aa;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
