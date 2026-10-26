package a3;

import a8.yb;
import android.view.Surface;
import b2.b2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f implements p0 {
    public final a0 a;
    public final b0 b;
    public final g0 c;
    public final ArrayDeque d;
    public Surface e;
    public b2.x f;
    public long g;
    public n0 h;
    public Executor i;
    public y j;

    public f(a0 a0Var, b0 b0Var, e2.g0 g0Var) {
        this.a = a0Var;
        this.b = b0Var;
        a0Var.l = g0Var;
        this.c = new g0(new rf.b(this), a0Var, b0Var);
        this.d = new ArrayDeque();
        this.f = new b2.x(new b2.w());
        this.g = -9223372036854775807L;
        this.h = n0.g;
        this.i = new b(0);
        this.j = new c();
    }

    @Override // a3.p0
    public final void b(float f7) {
        this.a.h(f7);
    }

    @Override // a3.p0
    public final boolean c() {
        g0 g0Var = this.c;
        long j10 = g0Var.j;
        return j10 != -9223372036854775807L && g0Var.i == j10;
    }

    @Override // a3.p0
    public final Surface d() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // a3.p0
    public final boolean e(b2.x xVar) {
        return true;
    }

    @Override // a3.p0
    public final void f() {
        this.b.b();
        a0 a0Var = this.a;
        a0Var.d = false;
        a0Var.i = -9223372036854775807L;
        f0 f0Var = a0Var.b;
        f0Var.d = false;
        c0 c0Var = f0Var.c;
        if (c0Var != null) {
            c0Var.b();
        }
        f0Var.a();
    }

    @Override // a3.p0
    public final void g() {
        this.b.b();
        this.a.d();
    }

    @Override // a3.p0
    public final void h(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // a3.p0
    public final void i() {
        g0 g0Var = this.c;
        if (g0Var.h == -9223372036854775807L) {
            g0Var.h = Long.MIN_VALUE;
            g0Var.i = Long.MIN_VALUE;
        }
        g0Var.j = g0Var.h;
    }

    @Override // a3.p0
    public final void j(int i10) {
        f0 f0Var = this.a.b;
        if (f0Var.j == i10) {
            return;
        }
        f0Var.j = i10;
        f0Var.d(true);
    }

    @Override // a3.p0
    public final void k() {
        this.e = null;
        this.a.g(null);
    }

    @Override // a3.p0
    public final void l(b2.x xVar, long j10, int i10, List list) {
        yb.p(list.isEmpty());
        int i11 = xVar.z;
        int i12 = xVar.A;
        b2.x xVar2 = this.f;
        int i13 = xVar2.z;
        g0 g0Var = this.c;
        if (i11 != i13 || i12 != xVar2.A) {
            e2.j0 j0Var = g0Var.d;
            long j11 = g0Var.h;
            j0Var.a(new b2(i11, i12), j11 == -9223372036854775807L ? 0L : j11 + 1);
        }
        float f7 = xVar.D;
        if (f7 != this.f.D) {
            this.a.f(f7);
        }
        this.f = xVar;
        if (j10 != this.g) {
            if (g0Var.f.c == 0) {
                g0Var.b.e(i10);
                g0Var.l = j10;
            } else {
                e2.j0 j0Var2 = g0Var.e;
                long j12 = g0Var.h;
                j0Var2.a(Long.valueOf(j10), j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1);
            }
            this.g = j10;
        }
    }

    @Override // a3.p0
    public final void m(b6.i iVar) {
        this.h = iVar;
        this.i = k9.r.a;
    }

    @Override // a3.p0
    public final void n(boolean z10) {
        if (z10) {
            a0 a0Var = this.a;
            a0Var.b.b();
            a0Var.h = -9223372036854775807L;
            a0Var.f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.i = -9223372036854775807L;
            a0Var.n = false;
        }
        this.b.b();
        g0 g0Var = this.c;
        e2.j0 j0Var = g0Var.d;
        e2.s sVar = g0Var.f;
        sVar.a = 0;
        sVar.b = -1;
        sVar.c = 0;
        g0Var.h = -9223372036854775807L;
        g0Var.i = -9223372036854775807L;
        g0Var.j = -9223372036854775807L;
        e2.j0 j0Var2 = g0Var.e;
        if (j0Var2.j() > 0) {
            yb.g(j0Var2.j() > 0);
            while (j0Var2.j() > 1) {
                j0Var2.f();
            }
            Object f7 = j0Var2.f();
            f7.getClass();
            g0Var.l = ((Long) f7).longValue();
        }
        if (j0Var.j() > 0) {
            yb.g(j0Var.j() > 0);
            while (j0Var.j() > 1) {
                j0Var.f();
            }
            Object f10 = j0Var.f();
            f10.getClass();
            j0Var.a((b2) f10, 0L);
        }
        this.d.clear();
    }

    @Override // a3.p0
    public final boolean o(long j10, j jVar) {
        this.d.add(jVar);
        g0 g0Var = this.c;
        e2.s sVar = g0Var.f;
        int i10 = sVar.c;
        long[] jArr = (long[]) sVar.e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i11 = sVar.a;
            int i12 = length2 - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy((long[]) sVar.e, 0, jArr2, i12, i11);
            sVar.a = 0;
            sVar.b = sVar.c - 1;
            sVar.e = jArr2;
            sVar.d = length - 1;
        }
        int i13 = (sVar.b + 1) & sVar.d;
        sVar.b = i13;
        ((long[]) sVar.e)[i13] = j10;
        sVar.c++;
        g0Var.h = j10;
        g0Var.j = -9223372036854775807L;
        this.i.execute(new d(this, 0));
        return true;
    }

    @Override // a3.p0
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // a3.p0
    public final void q(long j10, long j11) {
        try {
            this.c.a(j10, j11);
        } catch (i2.m e) {
            throw new o0(e, this.f);
        }
    }

    @Override // a3.p0
    public final void r(boolean z10) {
        this.a.c(z10);
    }

    @Override // a3.p0
    public final boolean s(boolean z10) {
        return this.a.b(z10);
    }

    @Override // a3.p0
    public final void t(Surface surface, e2.y yVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // a3.p0
    public final void u() {
        throw new UnsupportedOperationException();
    }

    @Override // a3.p0
    public final void v(y yVar) {
        this.j = yVar;
    }

    @Override // a3.p0
    public final boolean w() {
        return true;
    }

    @Override // a3.p0
    public final void x() {
        a0 a0Var = this.a;
        if (a0Var.e == 0) {
            a0Var.e = 1;
        }
    }

    @Override // a3.p0
    public final void release() {
    }
}
