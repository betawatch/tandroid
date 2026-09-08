package a3;

import android.view.Surface;
import b2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f implements o0 {
    public final a0 a;
    public final f0 b;
    public final ArrayDeque c;
    public Surface d;
    public b2.s e;
    public long f;
    public m0 g;
    public Executor h;
    public y i;

    public f(a0 a0Var, e2.x xVar) {
        this.a = a0Var;
        a0Var.l = xVar;
        this.b = new f0(new n4.y(this), a0Var);
        this.c = new ArrayDeque();
        this.e = new b2.s(new b2.r());
        this.f = -9223372036854775807L;
        this.g = m0.g;
        this.h = new b(0);
        this.i = new c();
    }

    @Override // a3.o0
    public final void a(float f7) {
        this.a.i(f7);
    }

    @Override // a3.o0
    public final boolean b() {
        f0 f0Var = this.b;
        long j3 = f0Var.i;
        return j3 != -9223372036854775807L && f0Var.h == j3;
    }

    @Override // a3.o0
    public final Surface c() {
        Surface surface = this.d;
        e2.d.h(surface);
        return surface;
    }

    @Override // a3.o0
    public final boolean d(b2.s sVar) {
        return true;
    }

    @Override // a3.o0
    public final void e() {
        this.a.e();
    }

    @Override // a3.o0
    public final void f() {
        this.a.d();
    }

    @Override // a3.o0
    public final void g(a6.i iVar) {
        this.g = iVar;
        this.h = i9.q.a;
    }

    @Override // a3.o0
    public final void h(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // a3.o0
    public final void i() {
        f0 f0Var = this.b;
        if (f0Var.g == -9223372036854775807L) {
            f0Var.g = Long.MIN_VALUE;
            f0Var.h = Long.MIN_VALUE;
        }
        f0Var.i = f0Var.g;
    }

    @Override // a3.o0
    public final void j(int i10) {
        e0 e0Var = this.a.b;
        if (e0Var.j == i10) {
            return;
        }
        e0Var.j = i10;
        e0Var.d(true);
    }

    @Override // a3.o0
    public final void k() {
        this.d = null;
        this.a.h(null);
    }

    @Override // a3.o0
    public final void l(b2.s sVar, long j3, int i10, List list) {
        e2.d.g(list.isEmpty());
        int i11 = sVar.y;
        int i12 = sVar.z;
        b2.s sVar2 = this.e;
        int i13 = sVar2.y;
        f0 f0Var = this.b;
        if (i11 != i13 || i12 != sVar2.z) {
            e2.a0 a0Var = f0Var.d;
            long j10 = f0Var.g;
            a0Var.a(new x1(i11, i12), j10 == -9223372036854775807L ? 0L : j10 + 1);
        }
        float f7 = sVar.C;
        if (f7 != this.e.C) {
            this.a.g(f7);
        }
        this.e = sVar;
        if (j3 != this.f) {
            if (f0Var.f.c == 0) {
                f0Var.b.f(i10);
                f0Var.k = j3;
            } else {
                e2.a0 a0Var2 = f0Var.e;
                long j11 = f0Var.g;
                a0Var2.a(Long.valueOf(j3), j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1);
            }
            this.f = j3;
        }
    }

    @Override // a3.o0
    public final void m(boolean z10) {
        if (z10) {
            a0 a0Var = this.a;
            e0 e0Var = a0Var.b;
            e0Var.m = 0L;
            e0Var.p = -1L;
            e0Var.n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.i = -9223372036854775807L;
        }
        f0 f0Var = this.b;
        e2.a0 a0Var2 = f0Var.d;
        e2.q qVar = f0Var.f;
        qVar.a = 0;
        qVar.b = -1;
        qVar.c = 0;
        f0Var.g = -9223372036854775807L;
        f0Var.h = -9223372036854775807L;
        f0Var.i = -9223372036854775807L;
        e2.a0 a0Var3 = f0Var.e;
        if (a0Var3.i() > 0) {
            e2.d.b(a0Var3.i() > 0);
            while (a0Var3.i() > 1) {
                a0Var3.f();
            }
            Object f7 = a0Var3.f();
            f7.getClass();
            f0Var.k = ((Long) f7).longValue();
        }
        if (a0Var2.i() > 0) {
            e2.d.b(a0Var2.i() > 0);
            while (a0Var2.i() > 1) {
                a0Var2.f();
            }
            Object f10 = a0Var2.f();
            f10.getClass();
            a0Var2.a((x1) f10, 0L);
        }
        this.c.clear();
    }

    @Override // a3.o0
    public final boolean n(long j3, j jVar) {
        this.c.add(jVar);
        f0 f0Var = this.b;
        e2.q qVar = f0Var.f;
        int i10 = qVar.c;
        long[] jArr = (long[]) qVar.e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i11 = qVar.a;
            int i12 = length2 - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy((long[]) qVar.e, 0, jArr2, i12, i11);
            qVar.a = 0;
            qVar.b = qVar.c - 1;
            qVar.e = jArr2;
            qVar.d = length - 1;
        }
        int i13 = (qVar.b + 1) & qVar.d;
        qVar.b = i13;
        ((long[]) qVar.e)[i13] = j3;
        qVar.c++;
        f0Var.g = j3;
        f0Var.i = -9223372036854775807L;
        this.h.execute(new d(this, 0));
        return true;
    }

    @Override // a3.o0
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // a3.o0
    public final void p(long j3, long j10) {
        try {
            this.b.a(j3, j10);
        } catch (i2.o e7) {
            throw new n0(e7, this.e);
        }
    }

    @Override // a3.o0
    public final void q(boolean z10) {
        this.a.c(z10);
    }

    @Override // a3.o0
    public final boolean r(boolean z10) {
        return this.a.b(z10);
    }

    @Override // a3.o0
    public final void s(Surface surface, e2.w wVar) {
        this.d = surface;
        this.a.h(surface);
    }

    @Override // a3.o0
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // a3.o0
    public final void u(y yVar) {
        this.i = yVar;
    }

    @Override // a3.o0
    public final boolean v() {
        return true;
    }

    @Override // a3.o0
    public final void w() {
        a0 a0Var = this.a;
        if (a0Var.e == 0) {
            a0Var.e = 1;
        }
    }

    @Override // a3.o0
    public final void release() {
    }
}
