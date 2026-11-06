package d3;

import a8.ia;
import android.view.Surface;
import bi.ab;
import e2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e implements k0 {
    public final y a;
    public final z b;
    public final e0 c;
    public final ArrayDeque d;
    public Surface e;
    public e2.u f;
    public long g;
    public i0 h;
    public Executor i;
    public w j;

    public e(y yVar, z zVar, h2.g0 g0Var) {
        this.a = yVar;
        this.b = zVar;
        yVar.l = g0Var;
        this.c = new e0(new q4.q(this), yVar, zVar);
        this.d = new ArrayDeque();
        this.f = new e2.u(new e2.t());
        this.g = -9223372036854775807L;
        this.h = i0.k;
        this.i = new b(0);
        this.j = new c();
    }

    @Override // d3.k0
    public final boolean a() {
        e0 e0Var = this.c;
        long j3 = e0Var.j;
        return j3 != -9223372036854775807L && e0Var.i == j3;
    }

    @Override // d3.k0
    public final Surface b() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // d3.k0
    public final void c(w wVar) {
        this.j = wVar;
    }

    @Override // d3.k0
    public final void d(float f10) {
        this.a.h(f10);
    }

    @Override // d3.k0
    public final void e(cb.c cVar) {
        this.h = cVar;
        this.i = m9.r.a;
    }

    @Override // d3.k0
    public final void f() {
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

    @Override // d3.k0
    public final void g(Surface surface, h2.y yVar) {
        this.e = surface;
        this.a.g(surface);
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
        e0 e0Var = this.c;
        if (e0Var.h == -9223372036854775807L) {
            e0Var.h = Long.MIN_VALUE;
            e0Var.i = Long.MIN_VALUE;
        }
        e0Var.j = e0Var.h;
    }

    @Override // d3.k0
    public final void l(int i7) {
        d0 d0Var = this.a.b;
        if (d0Var.j == i7) {
            return;
        }
        d0Var.j = i7;
        d0Var.d(true);
    }

    @Override // d3.k0
    public final void m() {
        this.e = null;
        this.a.g(null);
    }

    @Override // d3.k0
    public final boolean n(long j3, i iVar) {
        this.d.add(iVar);
        e0 e0Var = this.c;
        h2.s sVar = e0Var.f;
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
        e0Var.h = j3;
        e0Var.j = -9223372036854775807L;
        this.i.execute(new ab(this, 11));
        return true;
    }

    @Override // d3.k0
    public final void o(boolean z9) {
        if (z9) {
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
        h2.j0 j0Var = e0Var.d;
        h2.s sVar = e0Var.f;
        sVar.a = 0;
        sVar.b = -1;
        sVar.c = 0;
        e0Var.h = -9223372036854775807L;
        e0Var.i = -9223372036854775807L;
        e0Var.j = -9223372036854775807L;
        h2.j0 j0Var2 = e0Var.e;
        if (j0Var2.p() > 0) {
            ia.f(j0Var2.p() > 0);
            while (j0Var2.p() > 1) {
                j0Var2.i();
            }
            Object i7 = j0Var2.i();
            i7.getClass();
            e0Var.l = ((Long) i7).longValue();
        }
        if (j0Var.p() > 0) {
            ia.f(j0Var.p() > 0);
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
    public final void r(boolean z9) {
        this.a.c(z9);
    }

    @Override // d3.k0
    public final boolean s(boolean z9) {
        return this.a.b(z9);
    }

    @Override // d3.k0
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // d3.k0
    public final void u(e2.u uVar, long j3, int i7, List list) {
        ia.p(list.isEmpty());
        int i10 = uVar.z;
        int i11 = uVar.A;
        e2.u uVar2 = this.f;
        int i12 = uVar2.z;
        e0 e0Var = this.c;
        if (i10 != i12 || i11 != uVar2.A) {
            h2.j0 j0Var = e0Var.d;
            long j10 = e0Var.h;
            j0Var.a(new x1(i10, i11), j10 == -9223372036854775807L ? 0L : j10 + 1);
        }
        float f10 = uVar.D;
        if (f10 != this.f.D) {
            this.a.f(f10);
        }
        this.f = uVar;
        if (j3 != this.g) {
            if (e0Var.f.c == 0) {
                e0Var.b.e(i7);
                e0Var.l = j3;
            } else {
                h2.j0 j0Var2 = e0Var.e;
                long j11 = e0Var.h;
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
        y yVar = this.a;
        if (yVar.e == 0) {
            yVar.e = 1;
        }
    }

    @Override // d3.k0
    public final void release() {
    }
}
