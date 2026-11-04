package c3;

import android.view.Surface;
import b8.zb;
import d2.a2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements l0 {
    public final y a;
    public final z b;
    public final e0 c;
    public final ArrayDeque d;
    public Surface e;
    public d2.v f;
    public long g;
    public j0 h;
    public Executor i;
    public w j;

    public e(y yVar, z zVar, g2.h0 h0Var) {
        this.a = yVar;
        this.b = zVar;
        yVar.l = h0Var;
        p4.q qVar = new p4.q();
        qVar.b = this;
        this.c = new e0(qVar, yVar, zVar);
        this.d = new ArrayDeque();
        this.f = new d2.v(new d2.u());
        this.g = -9223372036854775807L;
        this.h = j0.i;
        this.i = new b(0);
        this.j = new c();
    }

    @Override // c3.l0
    public final boolean a() {
        e0 e0Var = this.c;
        long j10 = e0Var.j;
        return j10 != -9223372036854775807L && e0Var.i == j10;
    }

    @Override // c3.l0
    public final void b(float f10) {
        this.a.h(f10);
    }

    @Override // c3.l0
    public final Surface c() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // c3.l0
    public final void d() {
        this.b.b();
        y yVar = this.a;
        yVar.d = false;
        yVar.i = -9223372036854775807L;
        d0 d0Var = yVar.b;
        d0Var.d = false;
        a0 a0Var = d0Var.c;
        if (a0Var != null) {
            a0Var.b();
        }
        d0Var.a();
    }

    @Override // c3.l0
    public final boolean e(d2.v vVar) {
        return true;
    }

    @Override // c3.l0
    public final void f(d2.v vVar, long j10, int i3, List list) {
        zb.p(list.isEmpty());
        int i10 = vVar.z;
        int i11 = vVar.A;
        d2.v vVar2 = this.f;
        int i12 = vVar2.z;
        e0 e0Var = this.c;
        if (i10 != i12 || i11 != vVar2.A) {
            g2.k0 k0Var = e0Var.d;
            long j11 = e0Var.h;
            k0Var.a(new a2(i10, i11), j11 == -9223372036854775807L ? 0L : j11 + 1);
        }
        float f10 = vVar.D;
        if (f10 != this.f.D) {
            this.a.f(f10);
        }
        this.f = vVar;
        if (j10 != this.g) {
            if (e0Var.f.c == 0) {
                e0Var.b.e(i3);
                e0Var.l = j10;
            } else {
                g2.k0 k0Var2 = e0Var.e;
                long j12 = e0Var.h;
                k0Var2.a(Long.valueOf(j10), j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1);
            }
            this.g = j10;
        }
    }

    @Override // c3.l0
    public final void g() {
        this.b.b();
        this.a.d();
    }

    @Override // c3.l0
    public final void h(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // c3.l0
    public final void i() {
        e0 e0Var = this.c;
        if (e0Var.h == -9223372036854775807L) {
            e0Var.h = Long.MIN_VALUE;
            e0Var.i = Long.MIN_VALUE;
        }
        e0Var.j = e0Var.h;
    }

    @Override // c3.l0
    public final void j(int i3) {
        d0 d0Var = this.a.b;
        if (d0Var.j == i3) {
            return;
        }
        d0Var.j = i3;
        d0Var.d(true);
    }

    @Override // c3.l0
    public final void k() {
        this.e = null;
        this.a.g(null);
    }

    @Override // c3.l0
    public final void l(boolean z10) {
        if (z10) {
            y yVar = this.a;
            yVar.b.b();
            yVar.h = -9223372036854775807L;
            yVar.f = -9223372036854775807L;
            yVar.e = Math.min(yVar.e, 1);
            yVar.i = -9223372036854775807L;
            yVar.n = false;
        }
        this.b.b();
        e0 e0Var = this.c;
        g2.k0 k0Var = e0Var.d;
        g2.t tVar = e0Var.f;
        tVar.a = 0;
        tVar.b = -1;
        tVar.c = 0;
        e0Var.h = -9223372036854775807L;
        e0Var.i = -9223372036854775807L;
        e0Var.j = -9223372036854775807L;
        g2.k0 k0Var2 = e0Var.e;
        if (k0Var2.p() > 0) {
            zb.f(k0Var2.p() > 0);
            while (k0Var2.p() > 1) {
                k0Var2.i();
            }
            Object i3 = k0Var2.i();
            i3.getClass();
            e0Var.l = ((Long) i3).longValue();
        }
        if (k0Var.p() > 0) {
            zb.f(k0Var.p() > 0);
            while (k0Var.p() > 1) {
                k0Var.i();
            }
            Object i10 = k0Var.i();
            i10.getClass();
            k0Var.a((a2) i10, 0L);
        }
        this.d.clear();
    }

    @Override // c3.l0
    public final void m(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // c3.l0
    public final void n(long j10, long j11) {
        try {
            this.c.a(j10, j11);
        } catch (k2.l e10) {
            throw new k0(e10, this.f);
        }
    }

    @Override // c3.l0
    public final void o(Surface surface, g2.z zVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // c3.l0
    public final void p(w wVar) {
        this.j = wVar;
    }

    @Override // c3.l0
    public final void q(boolean z10) {
        this.a.c(z10);
    }

    @Override // c3.l0
    public final boolean r(boolean z10) {
        return this.a.b(z10);
    }

    @Override // c3.l0
    public final void s() {
        throw new UnsupportedOperationException();
    }

    @Override // c3.l0
    public final boolean t(long j10, i iVar) {
        this.d.add(iVar);
        e0 e0Var = this.c;
        g2.t tVar = e0Var.f;
        int i3 = tVar.c;
        long[] jArr = (long[]) tVar.e;
        if (i3 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i10 = tVar.a;
            int i11 = length2 - i10;
            System.arraycopy(jArr, i10, jArr2, 0, i11);
            System.arraycopy((long[]) tVar.e, 0, jArr2, i11, i10);
            tVar.a = 0;
            tVar.b = tVar.c - 1;
            tVar.e = jArr2;
            tVar.d = length - 1;
        }
        int i12 = (tVar.b + 1) & tVar.d;
        tVar.b = i12;
        ((long[]) tVar.e)[i12] = j10;
        tVar.c++;
        e0Var.h = j10;
        e0Var.j = -9223372036854775807L;
        this.i.execute(new ai.s(this, 19));
        return true;
    }

    @Override // c3.l0
    public final boolean u() {
        return true;
    }

    @Override // c3.l0
    public final void v() {
        y yVar = this.a;
        if (yVar.e == 0) {
            yVar.e = 1;
        }
    }

    @Override // c3.l0
    public final void w(c6.i iVar) {
        this.h = iVar;
        this.i = l9.r.a;
    }

    @Override // c3.l0
    public final void release() {
    }
}
