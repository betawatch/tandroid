package b3;

import a8.ma;
import a8.sa;
import android.os.Looper;
import android.os.SystemClock;
import h2.l0;
import java.io.IOException;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p implements q {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i e = new i(2, -9223372036854775807L, false);
    public static final i f = new i(3, -9223372036854775807L, false);
    public final c3.a a;
    public l b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(String str) {
        this(new c3.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new a3.l(17)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = l0.a;
    }

    @Override // b3.q
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        l lVar = this.b;
        if (lVar != null) {
            int i7 = lVar.a;
            IOException iOException2 = lVar.e;
            if (iOException2 != null && lVar.f > i7) {
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
        c3.a aVar = this.a;
        if (nVar != null) {
            aVar.execute(new sa(nVar, 12));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(m mVar, k kVar, int i7) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = null;
        l lVar = new l(this, myLooper, mVar, kVar, i7, SystemClock.elapsedRealtime());
        ma.p(this.b == null);
        this.b = lVar;
        lVar.b();
    }

    public p(c3.a aVar) {
        this.a = aVar;
    }
}
