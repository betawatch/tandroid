package o4;

import android.os.RemoteException;
import b8.zb;
import d2.a2;
import d2.v1;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.we;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 implements d2.c1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c0(e0 e0Var, l1 l1Var) {
        this.b = new WeakReference(e0Var);
        this.c = new WeakReference(l1Var);
    }

    @Override // d2.c1
    public final void B(d2.s1 s1Var) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.d(s1Var);
                        b10.c.a(true, true);
                        b10.d(new n9.j(s1Var, 4));
                        break;
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void C(d2.q0 q0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    j1 j1Var = b10.s;
                    d2.x0 x0Var = j1Var.a;
                    int i3 = j1Var.b;
                    q1 q1Var = j1Var.c;
                    d2.d1 d1Var = j1Var.d;
                    d2.d1 d1Var2 = j1Var.e;
                    int i10 = j1Var.f;
                    d2.y0 y0Var = j1Var.g;
                    int i11 = j1Var.h;
                    boolean z11 = j1Var.i;
                    d2.n1 n1Var = j1Var.j;
                    int i12 = j1Var.k;
                    a2 a2Var = j1Var.l;
                    float f10 = j1Var.n;
                    float f11 = j1Var.o;
                    int i13 = j1Var.p;
                    d2.f fVar = j1Var.q;
                    f2.c cVar = j1Var.r;
                    d2.p pVar = j1Var.s;
                    int i14 = j1Var.t;
                    boolean z12 = j1Var.u;
                    boolean z13 = j1Var.v;
                    int i15 = j1Var.w;
                    boolean z14 = j1Var.x;
                    boolean z15 = j1Var.y;
                    int i16 = j1Var.z;
                    int i17 = j1Var.A;
                    d2.q0 q0Var2 = j1Var.B;
                    long j10 = j1Var.C;
                    long j11 = j1Var.D;
                    long j12 = j1Var.E;
                    v1 v1Var = j1Var.F;
                    d2.s1 s1Var2 = j1Var.G;
                    try {
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.a.b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.c.a(true, true);
                                b10.h.j.p(q0Var);
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        b10.h.j.p(q0Var);
                    } catch (RemoteException e10) {
                        g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    zb.p(z10);
                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // d2.c1
    public final void E(d2.n1 n1Var, int i3) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = (l1) ((WeakReference) this.c).get();
                    if (l1Var != null) {
                        b10.s = b10.s.c(n1Var, l1Var.R0(), i3);
                        b10.c.a(false, true);
                        try {
                            b10.h.j.s(n1Var);
                            break;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void F(List list) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void G(int i3, boolean z10) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final void H(d2.y0 y0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    o0 o0Var = (o0) b10.h.j.e;
                                    o0Var.p0(o0Var.h.t);
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.j.e;
                            o0Var2.p0(o0Var2.h.t);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void J(int i3, int i10) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        b10.d(new hh.c(i3, i10, 3));
                        break;
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void L(d2.q0 q0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var2 = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var2, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.u();
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.j.u();
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var2, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void N(d2.a1 a1Var) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        b10.f(a1Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void O(d2.b1 b1Var) {
        int i3 = this.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|(2:24|(5:26|27|28|29|30))(1:36)|35|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0104, code lost:
    
        g2.a.d("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // d2.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z10) {
        v1 v1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z12 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z13 = j1Var.u;
                        boolean z14 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var2 = j1Var.F;
                        d2.s1 s1Var = j1Var.G;
                        if (!n1Var.p()) {
                            v1Var = v1Var2;
                            if (q1Var.a.b >= n1Var.o()) {
                                z11 = false;
                                zb.p(z11);
                                b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z12, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z13, z14, i15, i16, i17, z10, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.c.a(true, true);
                                o0 o0Var = (o0) b10.h.j.e;
                                o0Var.p0(o0Var.h.t);
                                b10.t();
                                break;
                            }
                        } else {
                            v1Var = v1Var2;
                        }
                        z11 = true;
                        zb.p(z11);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z12, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z13, z14, i15, i16, i17, z10, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                        o0 o0Var2 = (o0) b10.h.j.e;
                        o0Var2.p0(o0Var2.h.t);
                        b10.t();
                    }
                }
                break;
            default:
                k2.p pVar2 = (k2.p) this.b;
                we weVar = (we) this.c;
                org.telegram.messenger.a aVar = weVar.e;
                if (z10) {
                    weVar.c = ((k2.i0) pVar2).N0();
                } else {
                    long N0 = ((k2.i0) pVar2).N0();
                    long j13 = weVar.c;
                    if (j13 != -9223372036854775807L && N0 > j13) {
                        we.a(weVar, j13, N0);
                    }
                    weVar.c = -9223372036854775807L;
                }
                org.telegram.messenger.g0.r(aVar);
                if (!z10) {
                    org.telegram.messenger.g0.i3(aVar, 60000L);
                    break;
                }
                break;
        }
    }

    @Override // d2.c1
    public final void a(int i3) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i10 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i11 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i12 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i13 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i12, z11, a2Var, n1Var, i13, q0Var, f10, f11, fVar, i3, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.getClass();
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.j.getClass();
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i12, z11, a2Var, n1Var, i13, q0Var, f10, f11, fVar, i3, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    public e0 b() {
        return (e0) ((WeakReference) this.b).get();
    }

    @Override // d2.c1
    public final void c(int i3) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i10 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i11 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i3, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.q(i3);
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.j.q(i3);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i3, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void e(boolean z10) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final void f(a2 a2Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    j1 j1Var = b10.s;
                    d2.x0 x0Var = j1Var.a;
                    int i3 = j1Var.b;
                    q1 q1Var = j1Var.c;
                    d2.d1 d1Var = j1Var.d;
                    d2.d1 d1Var2 = j1Var.e;
                    int i10 = j1Var.f;
                    d2.y0 y0Var = j1Var.g;
                    int i11 = j1Var.h;
                    boolean z11 = j1Var.i;
                    d2.n1 n1Var = j1Var.j;
                    int i12 = j1Var.k;
                    d2.q0 q0Var = j1Var.m;
                    float f10 = j1Var.n;
                    float f11 = j1Var.o;
                    int i13 = j1Var.p;
                    d2.f fVar = j1Var.q;
                    f2.c cVar = j1Var.r;
                    d2.p pVar = j1Var.s;
                    int i14 = j1Var.t;
                    boolean z12 = j1Var.u;
                    boolean z13 = j1Var.v;
                    int i15 = j1Var.w;
                    boolean z14 = j1Var.x;
                    boolean z15 = j1Var.y;
                    int i16 = j1Var.z;
                    int i17 = j1Var.A;
                    d2.q0 q0Var2 = j1Var.B;
                    long j10 = j1Var.C;
                    long j11 = j1Var.D;
                    long j12 = j1Var.E;
                    v1 v1Var = j1Var.F;
                    d2.s1 s1Var2 = j1Var.G;
                    try {
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.a.b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        b10.h.j.getClass();
                    } catch (RemoteException e10) {
                        g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    zb.p(z10);
                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // d2.c1
    public final void g(int i3) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        b10.s = j1Var.b(j1Var.w, i3, j1Var.v);
                        b10.c.a(true, true);
                        try {
                            o0 o0Var = (o0) b10.h.j.e;
                            o0Var.p0(o0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void h(boolean z10) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void i(int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final void k(f2.c cVar) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.a.b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.c.a(true, true);
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void l(d2.x0 x0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void m(d2.s0 s0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final void n(int i3, d2.n0 n0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.n(n0Var);
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.j.n(n0Var);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void o(d2.x0 x0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    o0 o0Var = (o0) b10.h.j.e;
                                    o0Var.p0(o0Var.h.t);
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.j.e;
                            o0Var2.p0(o0Var2.h.t);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    ui.f fVar = b10.g.b;
                    g9.i0 n4 = fVar.n();
                    for (int i3 = 0; i3 < n4.size(); i3++) {
                        v vVar = (v) n4.get(i3);
                        fVar.p(vVar);
                        b10.c(vVar, new n9.j(3));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:9|(2:11|(5:13|14|15|16|17))(1:23)|22|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        g2.a.d("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // d2.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z10) {
        v1 v1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z12 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z13 = j1Var.u;
                        boolean z14 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z15 = j1Var.x;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var2 = j1Var.F;
                        d2.s1 s1Var = j1Var.G;
                        if (!n1Var.p()) {
                            v1Var = v1Var2;
                            if (q1Var.a.b >= n1Var.o()) {
                                z11 = false;
                                zb.p(z11);
                                b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z12, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z13, z14, i15, i16, i17, z15, z10, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                b10.t();
                                break;
                            }
                        } else {
                            v1Var = v1Var2;
                        }
                        z11 = true;
                        zb.p(z11);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z12, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z13, z14, i15, i16, i17, z15, z10, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                        b10.h.j.getClass();
                        b10.t();
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void q(d2.d1 d1Var, d2.d1 d1Var2, int i3) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i10 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i3, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    o0 o0Var = (o0) b10.h.j.e;
                                    o0Var.p0(o0Var.h.t);
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.j.e;
                            o0Var2.p0(o0Var2.h.t);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i3, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
            default:
                we weVar = (we) this.c;
                if (i3 == 1) {
                    long j13 = weVar.c;
                    if (j13 != -9223372036854775807L) {
                        we.a(weVar, j13, d1Var.f);
                    }
                    weVar.c = ((ci.u0) ((k2.p) this.b)).i0() ? d1Var2.f : -9223372036854775807L;
                    org.telegram.messenger.g0.r(weVar.e);
                    break;
                }
                break;
        }
    }

    @Override // d2.c1
    public final void r(int i3, boolean z10) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        b10.s = j1Var.b(i3, j1Var.z, z10);
                        b10.c.a(true, true);
                        try {
                            o0 o0Var = (o0) b10.h.j.e;
                            o0Var.p0(o0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void s(float f10) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    j1 j1Var = b10.s;
                    d2.x0 x0Var = j1Var.a;
                    int i3 = j1Var.b;
                    q1 q1Var = j1Var.c;
                    d2.d1 d1Var = j1Var.d;
                    d2.d1 d1Var2 = j1Var.e;
                    int i10 = j1Var.f;
                    d2.y0 y0Var = j1Var.g;
                    int i11 = j1Var.h;
                    boolean z11 = j1Var.i;
                    d2.n1 n1Var = j1Var.j;
                    int i12 = j1Var.k;
                    a2 a2Var = j1Var.l;
                    d2.q0 q0Var = j1Var.m;
                    float f11 = j1Var.n;
                    int i13 = j1Var.p;
                    d2.f fVar = j1Var.q;
                    f2.c cVar = j1Var.r;
                    d2.p pVar = j1Var.s;
                    int i14 = j1Var.t;
                    boolean z12 = j1Var.u;
                    boolean z13 = j1Var.v;
                    int i15 = j1Var.w;
                    boolean z14 = j1Var.x;
                    boolean z15 = j1Var.y;
                    int i16 = j1Var.z;
                    int i17 = j1Var.A;
                    d2.q0 q0Var2 = j1Var.B;
                    long j10 = j1Var.C;
                    long j11 = j1Var.D;
                    long j12 = j1Var.E;
                    v1 v1Var = j1Var.F;
                    d2.s1 s1Var2 = j1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.a.b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        b10.h.j.getClass();
                    } catch (RemoteException e10) {
                        g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    zb.p(z10);
                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // d2.c1
    public final void u(d2.f fVar) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    o0 o0Var = (o0) b10.h.j.e;
                                    o0Var.h.t.I().getClass();
                                    ((p4.l) o0Var.n.a).a.setPlaybackToLocal(fVar.b());
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.j.e;
                            o0Var2.h.t.I().getClass();
                            ((p4.l) o0Var2.n.a).a.setPlaybackToLocal(fVar.b());
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void v(v1 v1Var) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.a(v1Var);
                        b10.c.a(true, false);
                        b10.d(new n9.j(v1Var, 2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void w(int i3) {
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = (l1) ((WeakReference) this.c).get();
                    if (l1Var != null) {
                        j1 j1Var = b10.s;
                        d2.x0 U = l1Var.U();
                        int i10 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i11 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i12 = j1Var.h;
                        boolean z10 = j1Var.i;
                        d2.n1 n1Var = j1Var.j;
                        int i13 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i14 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i15 = j1Var.t;
                        boolean z11 = j1Var.u;
                        boolean z12 = j1Var.v;
                        int i16 = j1Var.w;
                        boolean z13 = j1Var.y;
                        int i17 = j1Var.z;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var = j1Var.G;
                        boolean z14 = i3 == 3 && z12 && i17 == 0;
                        zb.p(n1Var.p() || q1Var.a.b < n1Var.o());
                        b10.s = new j1(U, i10, q1Var, d1Var, d1Var2, i11, y0Var, i12, z10, a2Var, n1Var, i13, q0Var, f10, f11, fVar, i14, cVar, pVar, i15, z11, z12, i16, i17, i3, z14, z13, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                        try {
                            m0 m0Var = b10.h.j;
                            l1Var.U();
                            o0 o0Var = (o0) m0Var.e;
                            o0Var.p0(o0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final void y(boolean z10) {
        d2.s1 s1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.c).get()) != null) {
                        j1 j1Var = b10.s;
                        d2.x0 x0Var = j1Var.a;
                        int i3 = j1Var.b;
                        q1 q1Var = j1Var.c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.e;
                        int i10 = j1Var.f;
                        d2.y0 y0Var = j1Var.g;
                        int i11 = j1Var.h;
                        d2.n1 n1Var = j1Var.j;
                        int i12 = j1Var.k;
                        a2 a2Var = j1Var.l;
                        d2.q0 q0Var = j1Var.m;
                        float f10 = j1Var.n;
                        float f11 = j1Var.o;
                        int i13 = j1Var.p;
                        d2.f fVar = j1Var.q;
                        f2.c cVar = j1Var.r;
                        d2.p pVar = j1Var.s;
                        int i14 = j1Var.t;
                        boolean z12 = j1Var.u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.w;
                        boolean z14 = j1Var.x;
                        boolean z15 = j1Var.y;
                        int i16 = j1Var.z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.a.b >= n1Var.o()) {
                                    z11 = false;
                                    zb.p(z11);
                                    b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z10, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.r(z10);
                                    break;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.j.r(z10);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z11 = true;
                        zb.p(z11);
                        b10.s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z10, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    public c0(we weVar, k2.p pVar) {
        this.c = weVar;
        this.b = pVar;
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void A(List list) {
    }

    private final /* synthetic */ void D(d2.b1 b1Var) {
    }

    private final /* synthetic */ void I(d2.b1 b1Var) {
    }

    private final /* synthetic */ void K(boolean z10) {
    }

    private final /* synthetic */ void M(boolean z10) {
    }

    private final /* synthetic */ void Q(boolean z10) {
    }

    private final /* synthetic */ void S(d2.q0 q0Var) {
    }

    private final /* synthetic */ void T(d2.s0 s0Var) {
    }

    private final /* synthetic */ void U(d2.s0 s0Var) {
    }

    private final /* synthetic */ void W(d2.y0 y0Var) {
    }

    private final /* synthetic */ void X(int i3) {
    }

    private final /* synthetic */ void Y(int i3) {
    }

    private final /* synthetic */ void Z(d2.x0 x0Var) {
    }

    private final /* synthetic */ void a0(d2.x0 x0Var) {
    }

    private final /* synthetic */ void b0(d2.x0 x0Var) {
    }

    private final /* synthetic */ void d(d2.f fVar) {
    }

    private final /* synthetic */ void e0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void f0(int i3) {
    }

    private final /* synthetic */ void g0(int i3) {
    }

    private final /* synthetic */ void i0(int i3) {
    }

    private final /* synthetic */ void j(int i3) {
    }

    private final /* synthetic */ void j0(boolean z10) {
    }

    private final /* synthetic */ void k0(boolean z10) {
    }

    private final /* synthetic */ void l0(boolean z10) {
    }

    private final /* synthetic */ void o0(d2.s1 s1Var) {
    }

    private final /* synthetic */ void p0(v1 v1Var) {
    }

    private final /* synthetic */ void q0(a2 a2Var) {
    }

    private final /* synthetic */ void r0(float f10) {
    }

    private final /* synthetic */ void t(d2.a1 a1Var) {
    }

    private final /* synthetic */ void x(List list) {
    }

    private final /* synthetic */ void z(f2.c cVar) {
    }

    private final /* synthetic */ void R(int i3, d2.n0 n0Var) {
    }

    private final /* synthetic */ void V(int i3, boolean z10) {
    }

    private final /* synthetic */ void c0(int i3, boolean z10) {
    }

    private final /* synthetic */ void d0(int i3, boolean z10) {
    }

    private final /* synthetic */ void m0(int i3, int i10) {
    }

    private final /* synthetic */ void n0(d2.n1 n1Var, int i3) {
    }
}
