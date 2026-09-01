package f9;

import android.util.Log;
import c9.r;
import e3.f;
import java.util.concurrent.atomic.AtomicReference;
import k9.b1;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        String k10 = yh.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", k10, null);
        }
        this.a.a(new f(str, j10, b1Var, 2));
    }
}
