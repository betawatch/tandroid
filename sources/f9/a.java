package f9;

import android.util.Log;
import c9.r;
import e3.f;
import java.util.concurrent.atomic.AtomicReference;
import k9.b1;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
