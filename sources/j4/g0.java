package j4;

import h3.p1;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g0 {
    public final int a;
    public final c0 b;
    public final CopyOnWriteArrayList c;
    public final long d;

    public g0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, c0 c0Var, long j10) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = c0Var;
        this.d = j10;
    }

    public final long a(long j10) {
        long S = d5.g0.S(j10);
        if (S == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + S;
    }

    public final void b(int i10, h3.t0 t0Var, int i11, Object obj, long j10) {
        c(new x(1, i10, t0Var, i11, obj, a(j10), -9223372036854775807L));
    }

    public final void c(x xVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            d5.g0.L(f0Var.a, new j3.m(this, f0Var.b, xVar, 1));
        }
    }

    public final void d(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        e(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [j4.h0, java.lang.Object] */
    public final void e(p pVar, x xVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            d5.g0.L(f0Var.a, new e0(this, f0Var.b, pVar, xVar, 1));
        }
    }

    public final void f(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        g(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [j4.h0, java.lang.Object] */
    public final void g(p pVar, x xVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            d5.g0.L(f0Var.a, new e0(this, f0Var.b, pVar, xVar, 0));
        }
    }

    public final void h(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        j(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)), iOException, z10);
    }

    public final void i(p pVar, int i10, IOException iOException, boolean z10) {
        h(pVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public final void j(p pVar, x xVar, IOException iOException, boolean z10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            d5.g0.L(f0Var.a, new p1(this, f0Var.b, pVar, xVar, iOException, z10, 1));
        }
    }

    public final void k(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        l(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [j4.h0, java.lang.Object] */
    public final void l(p pVar, x xVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            d5.g0.L(f0Var.a, new e0(this, f0Var.b, pVar, xVar, 2));
        }
    }

    public final void m(x xVar) {
        c0 c0Var = this.b;
        c0Var.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            d5.g0.L(f0Var.a, new androidx.car.app.utils.b(this, f0Var.b, c0Var, xVar, 10));
        }
    }
}
