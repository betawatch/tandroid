package i9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j {
    public static final i d = new i(0);
    public static final e5.f e = new e5.f(14);
    public final n9.b a;
    public String b = null;
    public String c = null;

    public j(n9.b bVar) {
        this.a = bVar;
    }

    public static void a(n9.b bVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e6);
        }
    }
}
