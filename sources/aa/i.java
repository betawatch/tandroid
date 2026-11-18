package aa;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
