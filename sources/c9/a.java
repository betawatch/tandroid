package c9;

import android.util.Log;
import c3.f;
import h9.b1;
import java.util.concurrent.atomic.AtomicReference;
import z8.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public static final c c = new c();
    public final o a;
    public final AtomicReference b = new AtomicReference(null);

    public a(o oVar) {
        this.a = oVar;
        oVar.a(new a1.c(this, 7));
    }

    public final c a(String str) {
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
        String e9 = s3.c.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e9, null);
        }
        this.a.a(new f(str, j10, b1Var, 1));
    }
}
