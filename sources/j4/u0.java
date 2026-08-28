package j4;

import android.net.Uri;
import android.os.Looper;
import gh.i3;
import h3.r2;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u0 extends a {
    public final h3.f1 h;
    public final h3.c1 i;
    public final com.google.android.exoplayer2.upstream.l j;
    public final i3 k;
    public final l3.i l;
    public final v9.d m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public com.google.android.exoplayer2.upstream.y0 s;

    public u0(h3.f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, i3 i3Var, l3.i iVar, v9.d dVar, int i9) {
        h3.c1 c1Var = f1Var.b;
        c1Var.getClass();
        this.i = c1Var;
        this.h = f1Var;
        this.j = lVar;
        this.k = i3Var;
        this.l = iVar;
        this.m = dVar;
        this.n = i9;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // j4.a
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        com.google.android.exoplayer2.upstream.m createDataSource = this.j.createDataSource();
        com.google.android.exoplayer2.upstream.y0 y0Var = this.s;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        h3.c1 c1Var = this.i;
        Uri uri = c1Var.a;
        d5.a.j(this.g);
        return new s0(uri, createDataSource, new c((m3.i) this.k.b), this.l, new a6.a((CopyOnWriteArrayList) this.d.d, 0, d0Var, 14), this.m, a(d0Var), this, rVar, c1Var.d, this.n);
    }

    @Override // j4.a
    public final h3.f1 h() {
        return this.h;
    }

    @Override // j4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.s = y0Var;
        l3.i iVar = this.l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i3.l lVar = this.g;
        d5.a.j(lVar);
        iVar.H(myLooper, lVar);
        s();
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        s0 s0Var = (s0) a0Var;
        if (s0Var.H) {
            for (a1 a1Var : s0Var.E) {
                a1Var.i();
                l3.e eVar = a1Var.h;
                if (eVar != null) {
                    eVar.k(a1Var.e);
                    a1Var.h = null;
                    a1Var.g = null;
                }
            }
        }
        s0Var.v.e(s0Var);
        s0Var.B.removeCallbacksAndMessages(null);
        s0Var.C = null;
        s0Var.X = true;
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
        r2 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, f1Var, z11 ? f1Var.c : null);
        if (this.o) {
            h1Var = new r(h1Var, 1);
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
