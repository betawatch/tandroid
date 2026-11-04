package a3;

import android.os.Looper;
import android.os.SystemClock;
import b8.zb;
import g2.n0;
import java.io.IOException;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements r {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i e = new i(2, -9223372036854775807L, false);
    public static final i f = new i(3, -9223372036854775807L, false);
    public final b3.a a;
    public l b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str) {
        this(new b3.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new j(0)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = n0.a;
    }

    @Override // a3.r
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        l lVar = this.b;
        if (lVar != null) {
            int i3 = lVar.a;
            IOException iOException2 = lVar.e;
            if (iOException2 != null && lVar.f > i3) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        l lVar = this.b;
        lVar.getClass();
        lVar.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(n nVar) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(true);
        }
        b3.a aVar = this.a;
        if (nVar != null) {
            aVar.execute(new o(nVar, 0));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(m mVar, k kVar, int i3) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = null;
        l lVar = new l(this, myLooper, mVar, kVar, i3, SystemClock.elapsedRealtime());
        zb.p(this.b == null);
        this.b = lVar;
        lVar.b();
    }

    public q(b3.a aVar) {
        this.a = aVar;
    }
}
