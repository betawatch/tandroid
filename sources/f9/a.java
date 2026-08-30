package f9;

import android.util.Log;
import c9.r;
import e3.f;
import java.util.concurrent.atomic.AtomicReference;
import k9.b1;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final r a;
    public final AtomicReference b = new AtomicReference(null);

    public a(r rVar) {
        this.a = rVar;
        rVar.a(new a1.c(this, 27));
    }

    public final b a(String str) {
        a aVar = (a) this.b.get();
        return aVar == null ? c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j10, b1 b1Var) {
        String e = v2.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e, null);
        }
        this.a.a(new f(str, j10, b1Var, 2));
    }
}
