package o4;

import android.net.Uri;
import android.os.Looper;
import j3.c1;
import j3.o2;
import j3.y0;
import l7.w0;
import lh.m5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f0 extends a {
    public final c1 h;
    public final y0 i;
    public final g5.l j;
    public final m5 k;
    public final o3.p l;
    public final z9.d m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public g5.v0 s;

    public f0(c1 c1Var, g5.l lVar, m5 m5Var, o3.p pVar, z9.d dVar, int i10) {
        y0 y0Var = c1Var.b;
        y0Var.getClass();
        this.i = y0Var;
        this.h = c1Var;
        this.j = lVar;
        this.k = m5Var;
        this.l = pVar;
        this.m = dVar;
        this.n = i10;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // o4.a
    public final t b(v vVar, g5.q qVar, long j10) {
        g5.m createDataSource = this.j.createDataSource();
        g5.v0 v0Var = this.s;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        y0 y0Var = this.i;
        Uri uri = y0Var.a;
        h5.a.j(this.g);
        return new e0(uri, createDataSource, new w0((r3.i) this.k.b, 15), this.l, new o3.m(this.d.c, 0, vVar), this.m, a(vVar), this, qVar, y0Var.f, this.n);
    }

    @Override // o4.a
    public final c1 h() {
        return this.h;
    }

    @Override // o4.a
    public final void l(g5.v0 v0Var) {
        this.s = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.g;
        h5.a.j(kVar);
        o3.p pVar = this.l;
        pVar.e0(myLooper, kVar);
        pVar.b();
        s();
    }

    @Override // o4.a
    public final void n(t tVar) {
        e0 e0Var = (e0) tVar;
        if (e0Var.I) {
            for (k0 k0Var : e0Var.F) {
                k0Var.i();
                o3.j jVar = k0Var.h;
                if (jVar != null) {
                    jVar.c(k0Var.e);
                    k0Var.h = null;
                    k0Var.g = null;
                }
            }
        }
        e0Var.v.e(e0Var);
        e0Var.C.removeCallbacksAndMessages(null);
        e0Var.D = null;
        e0Var.Y = true;
    }

    @Override // o4.a
    public final void p() {
        this.l.release();
    }

    public final void s() {
        long j10 = this.p;
        boolean z4 = this.q;
        boolean z10 = this.r;
        c1 c1Var = this.h;
        o2 r0Var = new r0(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z4, false, false, null, c1Var, z10 ? c1Var.c : null);
        if (this.o) {
            r0Var = new k(r0Var, 1);
        }
        m(r0Var);
    }

    public final void t(long j10, boolean z4, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.p;
        }
        if (!this.o && this.p == j10 && this.q == z4 && this.r == z10) {
            return;
        }
        this.p = j10;
        this.q = z4;
        this.r = z10;
        this.o = false;
        s();
    }

    @Override // o4.a
    public final void j() {
    }
}
