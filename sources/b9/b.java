package b9;

import android.util.Log;
import g9.b1;
import java.util.concurrent.atomic.AtomicReference;
import y8.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public static final d c = new d();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public b(p pVar) {
        this.a = pVar;
        pVar.a(new a1.c(this, 1));
    }

    public final d a(String str) {
        b bVar = (b) this.b.get();
        return bVar == null ? c : bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c(String str) {
        b bVar = (b) this.b.get();
        return bVar != null && bVar.c(str);
    }

    public final void d(String str, long j10, b1 b1Var) {
        String d = ta.b.d("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", d, null);
        }
        this.a.a(new a(str, j10, b1Var, 0));
    }
}
