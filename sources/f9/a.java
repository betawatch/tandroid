package f9;

import android.util.Log;
import c9.s;
import e3.f;
import java.util.concurrent.atomic.AtomicReference;
import k9.b1;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final s a;
    public final AtomicReference b = new AtomicReference(null);

    public a(s sVar) {
        this.a = sVar;
        sVar.a(new a1.c(this, 27));
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
        String e = w2.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e, null);
        }
        this.a.a(new f(str, j10, b1Var, 2));
    }
}
