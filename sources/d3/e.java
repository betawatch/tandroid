package d3;

import a8.la;
import android.view.Surface;
import e2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e implements k0 {
    public final x a;
    public final y b;
    public final d0 c;
    public final ArrayDeque d;
    public Surface e;
    public e2.u f;
    public long g;
    public i0 h;
    public Executor i;
    public v j;

    public e(x xVar, y yVar, h2.g0 g0Var) {
        this.a = xVar;
        this.b = yVar;
        xVar.l = g0Var;
        this.c = new d0(new q4.q(this), xVar, yVar);
        this.d = new ArrayDeque();
        this.f = new e2.u(new e2.t());
        this.g = -9223372036854775807L;
        this.h = i0.k;
        this.i = new b(0);
        this.j = new c();
    }

    @Override // d3.k0
    public final boolean a() {
        d0 d0Var = this.c;
        long j3 = d0Var.j;
        return j3 != -9223372036854775807L && d0Var.i == j3;
    }

    @Override // d3.k0
    public final Surface b() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // d3.k0
    public final void c(v vVar) {
        this.j = vVar;
    }

    @Override // d3.k0
    public final void d(float f10) {
        this.a.h(f10);
    }

    @Override // d3.k0
    public final void e() {
        this.b.b();
        x xVar = this.a;
        xVar.d = false;
        xVar.i = -9223372036854775807L;
        c0 c0Var = xVar.b;
        c0Var.d = false;
        z zVar = c0Var.c;
        if (zVar != null) {
            zVar.b();
        }
        c0Var.a();
    }

    @Override // d3.k0
    public final void f(Surface surface, h2.y yVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // d3.k0
    public final void g(d6.i iVar) {
        this.h = iVar;
        this.i = m9.r.a;
    }

    @Override // d3.k0
    public final void h() {
        this.b.b();
        this.a.d();
    }

    @Override // d3.k0
    public final void i(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // d3.k0
    public final boolean j(e2.u uVar) {
        return true;
    }

    @Override // d3.k0
    public final void k() {
        d0 d0Var = this.c;
        if (d0Var.h == -9223372036854775807L) {
            d0Var.h = Long.MIN_VALUE;
            d0Var.i = Long.MIN_VALUE;
        }
        d0Var.j = d0Var.h;
    }

    @Override // d3.k0
    public final void l(int i7) {
        c0 c0Var = this.a.b;
        if (c0Var.j == i7) {
            return;
        }
        c0Var.j = i7;
        c0Var.d(true);
    }

    @Override // d3.k0
    public final void m() {
        this.e = null;
        this.a.g(null);
    }

    @Override // d3.k0
    public final boolean n(long j3, i iVar) {
        this.d.add(iVar);
        d0 d0Var = this.c;
        h2.s sVar = d0Var.f;
        int i7 = sVar.c;
        long[] jArr = (long[]) sVar.e;
        if (i7 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i10 = sVar.a;
            int i11 = length2 - i10;
            System.arraycopy(jArr, i10, jArr2, 0, i11);
            System.arraycopy((long[]) sVar.e, 0, jArr2, i11, i10);
            sVar.a = 0;
            sVar.b = sVar.c - 1;
            sVar.e = jArr2;
            sVar.d = length - 1;
        }
        int i12 = (sVar.b + 1) & sVar.d;
        sVar.b = i12;
        ((long[]) sVar.e)[i12] = j3;
        sVar.c++;
        d0Var.h = j3;
        d0Var.j = -9223372036854775807L;
        this.i.execute(new ca.r(this, 6));
        return true;
    }

    @Override // d3.k0
    public final void o(boolean z10) {
        if (z10) {
            x xVar = this.a;
            xVar.b.b();
            xVar.h = -9223372036854775807L;
            xVar.f = -9223372036854775807L;
            xVar.e = Math.min(xVar.e, 1);
            xVar.i = -9223372036854775807L;
            xVar.n = false;
        }
        this.b.b();
        d0 d0Var = this.c;
        h2.j0 j0Var = d0Var.d;
        h2.s sVar = d0Var.f;
        sVar.a = 0;
        sVar.b = -1;
        sVar.c = 0;
        d0Var.h = -9223372036854775807L;
        d0Var.i = -9223372036854775807L;
        d0Var.j = -9223372036854775807L;
        h2.j0 j0Var2 = d0Var.e;
        if (j0Var2.p() > 0) {
            la.f(j0Var2.p() > 0);
            while (j0Var2.p() > 1) {
                j0Var2.i();
            }
            Object i7 = j0Var2.i();
            i7.getClass();
            d0Var.l = ((Long) i7).longValue();
        }
        if (j0Var.p() > 0) {
            la.f(j0Var.p() > 0);
            while (j0Var.p() > 1) {
                j0Var.i();
            }
            Object i10 = j0Var.i();
            i10.getClass();
            j0Var.a((x1) i10, 0L);
        }
        this.d.clear();
    }

    @Override // d3.k0
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // d3.k0
    public final void q(long j3, long j10) {
        try {
            this.c.a(j3, j10);
        } catch (l2.l e10) {
            throw new j0(e10, this.f);
        }
    }

    @Override // d3.k0
    public final void r(boolean z10) {
        this.a.c(z10);
    }

    @Override // d3.k0
    public final boolean s(boolean z10) {
        return this.a.b(z10);
    }

    @Override // d3.k0
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // d3.k0
    public final void u(e2.u uVar, long j3, int i7, List list) {
        la.p(list.isEmpty());
        int i10 = uVar.z;
        int i11 = uVar.A;
        e2.u uVar2 = this.f;
        int i12 = uVar2.z;
        d0 d0Var = this.c;
        if (i10 != i12 || i11 != uVar2.A) {
            h2.j0 j0Var = d0Var.d;
            long j10 = d0Var.h;
            j0Var.a(new x1(i10, i11), j10 == -9223372036854775807L ? 0L : j10 + 1);
        }
        float f10 = uVar.D;
        if (f10 != this.f.D) {
            this.a.f(f10);
        }
        this.f = uVar;
        if (j3 != this.g) {
            if (d0Var.f.c == 0) {
                d0Var.b.e(i7);
                d0Var.l = j3;
            } else {
                h2.j0 j0Var2 = d0Var.e;
                long j11 = d0Var.h;
                j0Var2.a(Long.valueOf(j3), j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1);
            }
            this.g = j3;
        }
    }

    @Override // d3.k0
    public final boolean v() {
        return true;
    }

    @Override // d3.k0
    public final void w() {
        x xVar = this.a;
        if (xVar.e == 0) {
            xVar.e = 1;
        }
    }

    @Override // d3.k0
    public final void release() {
    }
}
