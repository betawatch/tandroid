package l4;

import ag.j2;
import android.net.Uri;
import android.os.Looper;
import j3.r2;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u0 extends a {
    public final j3.f1 h;
    public final j3.c1 i;
    public final com.google.android.exoplayer2.upstream.l j;
    public final s0 k;
    public final n3.i l;
    public final f7.v m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public com.google.android.exoplayer2.upstream.y0 s;

    public u0(j3.f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, n3.i iVar, f7.v vVar, int i10) {
        j3.c1 c1Var = f1Var.b;
        c1Var.getClass();
        this.i = c1Var;
        this.h = f1Var;
        this.j = lVar;
        this.k = s0Var;
        this.l = iVar;
        this.m = vVar;
        this.n = i10;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // l4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        com.google.android.exoplayer2.upstream.m createDataSource = this.j.createDataSource();
        com.google.android.exoplayer2.upstream.y0 y0Var = this.s;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        j3.c1 c1Var = this.i;
        Uri uri = c1Var.a;
        f5.a.j(this.g);
        return new r0(uri, createDataSource, new l3.g0((o3.i) this.k.b), this.l, new j2((CopyOnWriteArrayList) this.d.d, 0, c0Var), this.m, a(c0Var), this, rVar, c1Var.d, this.n);
    }

    @Override // l4.a
    public final j3.f1 h() {
        return this.h;
    }

    @Override // l4.a
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.s = y0Var;
        n3.i iVar = this.l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.g;
        f5.a.j(kVar);
        iVar.q(myLooper, kVar);
        s();
    }

    @Override // l4.a
    public final void n(z zVar) {
        r0 r0Var = (r0) zVar;
        if (r0Var.H) {
            for (b1 b1Var : r0Var.E) {
                b1Var.i();
                n3.e eVar = b1Var.h;
                if (eVar != null) {
                    eVar.p(b1Var.e);
                    b1Var.h = null;
                    b1Var.g = null;
                }
            }
        }
        r0Var.v.e(r0Var);
        r0Var.B.removeCallbacksAndMessages(null);
        r0Var.C = null;
        r0Var.X = true;
    }

    @Override // l4.a
    public final void p() {
        this.l.release();
    }

    public final void s() {
        long j10 = this.p;
        boolean z10 = this.q;
        boolean z11 = this.r;
        j3.f1 f1Var = this.h;
        r2 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, f1Var, z11 ? f1Var.c : null);
        if (this.o) {
            i1Var = new q(i1Var, 1);
        }
        m(i1Var);
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

    @Override // l4.a
    public final void j() {
    }
}
