package m4;

import android.os.RemoteException;
import b2.b2;
import b2.w1;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.df;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 implements b2.d1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public d0(f0 f0Var, n1 n1Var) {
        this.b = new WeakReference(f0Var);
        this.c = new WeakReference(n1Var);
    }

    @Override // b2.d1
    public final void A(d2.d dVar) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.a.b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.c.a(true, true);
                                break;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void C(int i10, b2.p0 p0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.n(p0Var);
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.j.n(p0Var);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void D(b2.c1 c1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void F(b2.u0 u0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void H(b2.y0 y0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    p0 p0Var = (p0) b10.h.j.e;
                                    p0Var.p0(p0Var.h.t);
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.j.e;
                            p0Var2.p0(p0Var2.h.t);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void I(List list) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void K(int i10, boolean z10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void M(int i10, int i11) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        b10.d(new i2.v(i10, i11, 2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void N(w1 w1Var) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.a(w1Var);
                        b10.c.a(true, false);
                        b10.d(new k2.k0(w1Var, 12));
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void O(b2.o1 o1Var, int i10) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    n1 n1Var = (n1) ((WeakReference) this.c).get();
                    if (n1Var != null) {
                        b10.s = b10.s.c(o1Var, n1Var.R0(), i10);
                        b10.c.a(false, true);
                        try {
                            b10.h.j.s(o1Var);
                            break;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|(2:24|(5:26|27|28|29|30))(1:36)|35|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0104, code lost:
    
        e2.a.d("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // b2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z10) {
        w1 w1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z12 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z13 = l1Var.u;
                        boolean z14 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var2 = l1Var.F;
                        b2.u1 u1Var = l1Var.G;
                        if (!o1Var.p()) {
                            w1Var = w1Var2;
                            if (s1Var.a.b >= o1Var.o()) {
                                z11 = false;
                                t6.p(z11);
                                b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z12, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z13, z14, i16, i17, i18, z10, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.c.a(true, true);
                                p0 p0Var = (p0) b10.h.j.e;
                                p0Var.p0(p0Var.h.t);
                                b10.t();
                                break;
                            }
                        } else {
                            w1Var = w1Var2;
                        }
                        z11 = true;
                        t6.p(z11);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z12, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z13, z14, i16, i17, i18, z10, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                        p0 p0Var2 = (p0) b10.h.j.e;
                        p0Var2.p0(p0Var2.h.t);
                        b10.t();
                    }
                }
                break;
            default:
                i2.p pVar = (i2.p) this.b;
                df dfVar = (df) this.c;
                org.telegram.messenger.a aVar = dfVar.e;
                if (z10) {
                    dfVar.c = ((i2.i0) pVar).M0();
                } else {
                    long M0 = ((i2.i0) pVar).M0();
                    long j13 = dfVar.c;
                    if (j13 != -9223372036854775807L && M0 > j13) {
                        df.a(dfVar, j13, M0);
                    }
                    dfVar.c = -9223372036854775807L;
                }
                org.telegram.messenger.i0.r(aVar);
                if (!z10) {
                    org.telegram.messenger.i0.h3(aVar, 60000L);
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final void a(int i10) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i11 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i12 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i13 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i14 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i13, z11, b2Var, o1Var, i14, s0Var, f7, f10, fVar, i10, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.getClass();
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.j.getClass();
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i13, z11, b2Var, o1Var, i14, s0Var, f7, f10, fVar, i10, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    public f0 b() {
        return (f0) ((WeakReference) this.b).get();
    }

    @Override // b2.d1
    public final void c(int i10) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i11 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i12 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i10, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.q(i10);
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.j.q(i10);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i10, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void d(b2 b2Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = b10.s;
                    b2.y0 y0Var = l1Var.a;
                    int i10 = l1Var.b;
                    s1 s1Var = l1Var.c;
                    b2.e1 e1Var = l1Var.d;
                    b2.e1 e1Var2 = l1Var.e;
                    int i11 = l1Var.f;
                    b2.z0 z0Var = l1Var.g;
                    int i12 = l1Var.h;
                    boolean z11 = l1Var.i;
                    b2.o1 o1Var = l1Var.j;
                    int i13 = l1Var.k;
                    b2.s0 s0Var = l1Var.m;
                    float f7 = l1Var.n;
                    float f10 = l1Var.o;
                    int i14 = l1Var.p;
                    b2.f fVar = l1Var.q;
                    d2.d dVar = l1Var.r;
                    b2.q qVar = l1Var.s;
                    int i15 = l1Var.t;
                    boolean z12 = l1Var.u;
                    boolean z13 = l1Var.v;
                    int i16 = l1Var.w;
                    boolean z14 = l1Var.x;
                    boolean z15 = l1Var.y;
                    int i17 = l1Var.z;
                    int i18 = l1Var.A;
                    b2.s0 s0Var2 = l1Var.B;
                    long j10 = l1Var.C;
                    long j11 = l1Var.D;
                    long j12 = l1Var.E;
                    w1 w1Var = l1Var.F;
                    b2.u1 u1Var2 = l1Var.G;
                    try {
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.a.b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                break;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        b10.h.j.getClass();
                    } catch (RemoteException e) {
                        e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z10 = true;
                    t6.p(z10);
                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void e(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void f(int i10) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b10.s = l1Var.b(l1Var.w, i10, l1Var.v);
                        b10.c.a(true, true);
                        try {
                            p0 p0Var = (p0) b10.h.j.e;
                            p0Var.p0(p0Var.h.t);
                            break;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void g(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void h(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void i(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = b10.s;
                    b2.y0 y0Var = l1Var.a;
                    int i10 = l1Var.b;
                    s1 s1Var = l1Var.c;
                    b2.e1 e1Var = l1Var.d;
                    b2.e1 e1Var2 = l1Var.e;
                    int i11 = l1Var.f;
                    b2.z0 z0Var = l1Var.g;
                    int i12 = l1Var.h;
                    boolean z11 = l1Var.i;
                    b2.o1 o1Var = l1Var.j;
                    int i13 = l1Var.k;
                    b2 b2Var = l1Var.l;
                    float f7 = l1Var.n;
                    float f10 = l1Var.o;
                    int i14 = l1Var.p;
                    b2.f fVar = l1Var.q;
                    d2.d dVar = l1Var.r;
                    b2.q qVar = l1Var.s;
                    int i15 = l1Var.t;
                    boolean z12 = l1Var.u;
                    boolean z13 = l1Var.v;
                    int i16 = l1Var.w;
                    boolean z14 = l1Var.x;
                    boolean z15 = l1Var.y;
                    int i17 = l1Var.z;
                    int i18 = l1Var.A;
                    b2.s0 s0Var2 = l1Var.B;
                    long j10 = l1Var.C;
                    long j11 = l1Var.D;
                    long j12 = l1Var.E;
                    w1 w1Var = l1Var.F;
                    b2.u1 u1Var2 = l1Var.G;
                    try {
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.a.b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.c.a(true, true);
                                b10.h.j.p(s0Var);
                                break;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        b10.h.j.p(s0Var);
                    } catch (RemoteException e) {
                        e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z10 = true;
                    t6.p(z10);
                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:9|(2:11|(5:13|14|15|16|17))(1:23)|22|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        e2.a.d("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // b2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z10) {
        w1 w1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z12 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z13 = l1Var.u;
                        boolean z14 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z15 = l1Var.x;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var2 = l1Var.F;
                        b2.u1 u1Var = l1Var.G;
                        if (!o1Var.p()) {
                            w1Var = w1Var2;
                            if (s1Var.a.b >= o1Var.o()) {
                                z11 = false;
                                t6.p(z11);
                                b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z12, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z13, z14, i16, i17, i18, z15, z10, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                b10.t();
                                break;
                            }
                        } else {
                            w1Var = w1Var2;
                        }
                        z11 = true;
                        t6.p(z11);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z12, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z13, z14, i16, i17, i18, z15, z10, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                        b10.h.j.getClass();
                        b10.t();
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void m(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var2 = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var2, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.u();
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.j.u();
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var2, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void o(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b10.s = l1Var.b(i10, l1Var.z, z10);
                        b10.c.a(true, true);
                        try {
                            p0 p0Var = (p0) b10.h.j.e;
                            p0Var.p0(p0Var.h.t);
                            break;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    xa.n nVar = b10.g.b;
                    e9.n0 A = nVar.A();
                    for (int i10 = 0; i10 < A.size(); i10++) {
                        w wVar = (w) A.get(i10);
                        nVar.E(wVar);
                        b10.c(wVar, new k2.k0(13));
                    }
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final void p(b2.b1 b1Var) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        b10.f(b1Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void q(float f7) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = b10.s;
                    b2.y0 y0Var = l1Var.a;
                    int i10 = l1Var.b;
                    s1 s1Var = l1Var.c;
                    b2.e1 e1Var = l1Var.d;
                    b2.e1 e1Var2 = l1Var.e;
                    int i11 = l1Var.f;
                    b2.z0 z0Var = l1Var.g;
                    int i12 = l1Var.h;
                    boolean z11 = l1Var.i;
                    b2.o1 o1Var = l1Var.j;
                    int i13 = l1Var.k;
                    b2 b2Var = l1Var.l;
                    b2.s0 s0Var = l1Var.m;
                    float f10 = l1Var.n;
                    int i14 = l1Var.p;
                    b2.f fVar = l1Var.q;
                    d2.d dVar = l1Var.r;
                    b2.q qVar = l1Var.s;
                    int i15 = l1Var.t;
                    boolean z12 = l1Var.u;
                    boolean z13 = l1Var.v;
                    int i16 = l1Var.w;
                    boolean z14 = l1Var.x;
                    boolean z15 = l1Var.y;
                    int i17 = l1Var.z;
                    int i18 = l1Var.A;
                    b2.s0 s0Var2 = l1Var.B;
                    long j10 = l1Var.C;
                    long j11 = l1Var.D;
                    long j12 = l1Var.E;
                    w1 w1Var = l1Var.F;
                    b2.u1 u1Var2 = l1Var.G;
                    if (f7 != 0.0f) {
                        f10 = f7;
                    }
                    try {
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.a.b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                break;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        b10.h.j.getClass();
                    } catch (RemoteException e) {
                        e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z10 = true;
                    t6.p(z10);
                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // b2.d1
    public final void s(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i11 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i10, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    p0 p0Var = (p0) b10.h.j.e;
                                    p0Var.p0(p0Var.h.t);
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.j.e;
                            p0Var2.p0(p0Var2.h.t);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i10, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
            default:
                df dfVar = (df) this.c;
                if (i10 == 1) {
                    long j13 = dfVar.c;
                    if (j13 != -9223372036854775807L) {
                        df.a(dfVar, j13, e1Var.f);
                    }
                    dfVar.c = ((b2.h) ((i2.p) this.b)).i0() ? e1Var2.f : -9223372036854775807L;
                    org.telegram.messenger.i0.r(dfVar.e);
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final void u(int i10) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    n1 n1Var = (n1) ((WeakReference) this.c).get();
                    if (n1Var != null) {
                        l1 l1Var = b10.s;
                        b2.y0 V = n1Var.V();
                        int i11 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i12 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i13 = l1Var.h;
                        boolean z10 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i14 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i15 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i16 = l1Var.t;
                        boolean z11 = l1Var.u;
                        boolean z12 = l1Var.v;
                        int i17 = l1Var.w;
                        boolean z13 = l1Var.y;
                        int i18 = l1Var.z;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var = l1Var.G;
                        boolean z14 = i10 == 3 && z12 && i18 == 0;
                        t6.p(o1Var.p() || s1Var.a.b < o1Var.o());
                        b10.s = new l1(V, i11, s1Var, e1Var, e1Var2, i12, z0Var, i13, z10, b2Var, o1Var, i14, s0Var, f7, f10, fVar, i15, dVar, qVar, i16, z11, z12, i17, i18, i10, z14, z13, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                        try {
                            n0 n0Var = b10.h.j;
                            n1Var.V();
                            p0 p0Var = (p0) n0Var.e;
                            p0Var.p0(p0Var.h.t);
                            break;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void v(b2.y0 y0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void w(b2.u1 u1Var) {
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.d(u1Var);
                        b10.c.a(true, true);
                        b10.d(new k2.k0(u1Var, 14));
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void x(boolean z10) {
        b2.u1 u1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z11 = false;
                                    t6.p(z11);
                                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z10, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.r(z10);
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.j.r(z10);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z11 = true;
                        t6.p(z11);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z10, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void y(b2.f fVar) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        b2.z0 z0Var = l1Var.g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    p0 p0Var = (p0) b10.h.j.e;
                                    p0Var.h.t.J().getClass();
                                    ((n4.l) p0Var.n.a).a.setPlaybackToLocal(fVar.b());
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.j.e;
                            p0Var2.h.t.J().getClass();
                            ((n4.l) p0Var2.n.a).a.setPlaybackToLocal(fVar.b());
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final void z(b2.z0 z0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.c).get()) != null) {
                        l1 l1Var = b10.s;
                        b2.y0 y0Var = l1Var.a;
                        int i10 = l1Var.b;
                        s1 s1Var = l1Var.c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.i;
                        b2.o1 o1Var = l1Var.j;
                        int i13 = l1Var.k;
                        b2 b2Var = l1Var.l;
                        b2.s0 s0Var = l1Var.m;
                        float f7 = l1Var.n;
                        float f10 = l1Var.o;
                        int i14 = l1Var.p;
                        b2.f fVar = l1Var.q;
                        d2.d dVar = l1Var.r;
                        b2.q qVar = l1Var.s;
                        int i15 = l1Var.t;
                        boolean z12 = l1Var.u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.w;
                        boolean z14 = l1Var.x;
                        boolean z15 = l1Var.y;
                        int i17 = l1Var.z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.a.b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.c.a(true, true);
                                    p0 p0Var = (p0) b10.h.j.e;
                                    p0Var.p0(p0Var.h.t);
                                    break;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.j.e;
                            p0Var2.p0(p0Var2.h.t);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    public d0(df dfVar, i2.p pVar) {
        this.c = dfVar;
        this.b = pVar;
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void B(List list) {
    }

    private final /* synthetic */ void E(b2.c1 c1Var) {
    }

    private final /* synthetic */ void G(b2.c1 c1Var) {
    }

    private final /* synthetic */ void J(boolean z10) {
    }

    private final /* synthetic */ void L(boolean z10) {
    }

    private final /* synthetic */ void Q(boolean z10) {
    }

    private final /* synthetic */ void S(b2.s0 s0Var) {
    }

    private final /* synthetic */ void T(b2.u0 u0Var) {
    }

    private final /* synthetic */ void U(b2.u0 u0Var) {
    }

    private final /* synthetic */ void W(b2.z0 z0Var) {
    }

    private final /* synthetic */ void X(int i10) {
    }

    private final /* synthetic */ void Y(int i10) {
    }

    private final /* synthetic */ void Z(b2.y0 y0Var) {
    }

    private final /* synthetic */ void a0(b2.y0 y0Var) {
    }

    private final /* synthetic */ void b0(b2.y0 y0Var) {
    }

    private final /* synthetic */ void e0(b2.s0 s0Var) {
    }

    private final /* synthetic */ void f0(int i10) {
    }

    private final /* synthetic */ void g0(int i10) {
    }

    private final /* synthetic */ void i0(int i10) {
    }

    private final /* synthetic */ void j(b2.f fVar) {
    }

    private final /* synthetic */ void j0(boolean z10) {
    }

    private final /* synthetic */ void k0(boolean z10) {
    }

    private final /* synthetic */ void l(int i10) {
    }

    private final /* synthetic */ void l0(boolean z10) {
    }

    private final /* synthetic */ void n(b2.b1 b1Var) {
    }

    private final /* synthetic */ void o0(b2.u1 u1Var) {
    }

    private final /* synthetic */ void p0(w1 w1Var) {
    }

    private final /* synthetic */ void q0(b2 b2Var) {
    }

    private final /* synthetic */ void r(List list) {
    }

    private final /* synthetic */ void r0(float f7) {
    }

    private final /* synthetic */ void t(d2.d dVar) {
    }

    private final /* synthetic */ void R(int i10, b2.p0 p0Var) {
    }

    private final /* synthetic */ void V(int i10, boolean z10) {
    }

    private final /* synthetic */ void c0(int i10, boolean z10) {
    }

    private final /* synthetic */ void d0(int i10, boolean z10) {
    }

    private final /* synthetic */ void m0(int i10, int i11) {
    }

    private final /* synthetic */ void n0(b2.o1 o1Var, int i10) {
    }
}
