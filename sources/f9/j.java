package f9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j {
    public static final i d = new i(0);
    public static final a5.f e = new a5.f(14);
    public final k9.c a;
    public String b = null;
    public String c = null;

    public j(k9.c cVar) {
        this.a = cVar;
    }

    public static void a(k9.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e9);
        }
    }
}
