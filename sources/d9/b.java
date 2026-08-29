package d9;

import a9.t;
import android.util.Log;
import i9.b1;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public static final d c = new d();
    public final t a;
    public final AtomicReference b = new AtomicReference(null);

    public b(t tVar) {
        this.a = tVar;
        tVar.a(new a1.c(this, 21));
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
        String e10 = u3.c.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e10, null);
        }
        this.a.a(new a(str, j10, b1Var, 0));
    }
}
