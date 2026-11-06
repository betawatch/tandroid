package b3;

import a8.ia;
import a8.ra;
import android.os.Looper;
import android.os.SystemClock;
import h2.m0;
import java.io.IOException;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o implements p {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i e = new i(2, -9223372036854775807L, false);
    public static final i f = new i(3, -9223372036854775807L, false);
    public final c3.a a;
    public k b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(String str) {
        this(new c3.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new a3.l(19)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = m0.a;
    }

    @Override // b3.p
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        k kVar = this.b;
        if (kVar != null) {
            int i7 = kVar.a;
            IOException iOException2 = kVar.e;
            if (iOException2 != null && kVar.f > i7) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        k kVar = this.b;
        kVar.getClass();
        kVar.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(m mVar) {
        k kVar = this.b;
        if (kVar != null) {
            kVar.a(true);
        }
        c3.a aVar = this.a;
        if (mVar != null) {
            aVar.execute(new ra(mVar, 10));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(l lVar, j jVar, int i7) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = null;
        k kVar = new k(this, myLooper, lVar, jVar, i7, SystemClock.elapsedRealtime());
        ia.p(this.b == null);
        this.b = kVar;
        kVar.b();
    }

    public o(c3.a aVar) {
        this.a = aVar;
    }
}
