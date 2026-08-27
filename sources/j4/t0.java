package j4;

import android.net.Uri;
import android.os.Looper;
import h3.s2;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 extends a {
    public final h3.f1 h;
    public final h3.c1 i;
    public final com.google.android.exoplayer2.upstream.l j;
    public final h3.x k;
    public final l3.j l;
    public final ab.a m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public com.google.android.exoplayer2.upstream.y0 s;

    public t0(h3.f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, h3.x xVar, l3.j jVar, ab.a aVar, int i10) {
        h3.c1 c1Var = f1Var.b;
        c1Var.getClass();
        this.i = c1Var;
        this.h = f1Var;
        this.j = lVar;
        this.k = xVar;
        this.l = jVar;
        this.m = aVar;
        this.n = i10;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // j4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        com.google.android.exoplayer2.upstream.m createDataSource = this.j.createDataSource();
        com.google.android.exoplayer2.upstream.y0 y0Var = this.s;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        Uri uri = this.i.a;
        d5.a.j(this.g);
        return new r0(uri, createDataSource, new a5.n((m3.i) this.k.b), this.l, new b6.a((CopyOnWriteArrayList) this.d.d, 0, c0Var, 14), this.m, a(c0Var), this, rVar, this.n);
    }

    @Override // j4.a
    public final h3.f1 h() {
        return this.h;
    }

    @Override // j4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.s = y0Var;
        l3.j jVar = this.l;
        jVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i3.k kVar = this.g;
        d5.a.j(kVar);
        jVar.w(myLooper, kVar);
        s();
    }

    @Override // j4.a
    public final void n(z zVar) {
        r0 r0Var = (r0) zVar;
        if (r0Var.G) {
            for (a1 a1Var : r0Var.D) {
                a1Var.i();
                l3.f fVar = a1Var.h;
                if (fVar != null) {
                    fVar.h(a1Var.e);
                    a1Var.h = null;
                    a1Var.g = null;
                }
            }
        }
        r0Var.s.e(r0Var);
        r0Var.A.removeCallbacksAndMessages(null);
        r0Var.B = null;
        r0Var.W = true;
    }

    @Override // j4.a
    public final void p() {
        this.l.release();
    }

    public final void s() {
        long j10 = this.p;
        boolean z10 = this.q;
        boolean z11 = this.r;
        h3.f1 f1Var = this.h;
        s2 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, f1Var, z11 ? f1Var.c : null);
        if (this.o) {
            h1Var = new q(h1Var, 1);
        }
        m(h1Var);
    }

    public final void t(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.p;
        }
        if (!this.o && this.p == j10 && this.q == z10 && this.r == z11) {
            return;
        }
        this.p = j10;
        this.q = z10;
        this.r = z11;
        this.o = false;
        s();
    }

    @Override // j4.a
    public final void j() {
    }
}
