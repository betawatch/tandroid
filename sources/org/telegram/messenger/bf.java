package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class bf implements e2.a1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public bf(p4.d0 d0Var, p4.i1 i1Var) {
        this.b = new WeakReference(d0Var);
        this.c = new WeakReference(i1Var);
    }

    @Override // e2.a1
    public final /* synthetic */ void B(List list) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void D(int i7, boolean z10) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final void E(e2.q1 q1Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.d(q1Var);
                        b10.c.a(true, true);
                        b10.d(new org.telegram.utils.twidget.f(q1Var, 23));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void F(e2.z0 z0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void H(e2.w0 w0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) b10.h.j.e;
                                    m0Var.p0(m0Var.h.t);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) b10.h.j.e;
                            m0Var2.p0(m0Var2.h.t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void J(int i7, int i10) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        b10.d(new gh.c(i7, i10, 3));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void L(e2.l1 l1Var, int i7) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.i1 i1Var = (p4.i1) ((WeakReference) this.c).get();
                    if (i1Var != null) {
                        b10.s = b10.s.c(l1Var, i1Var.R0(), i7);
                        b10.c.a(false, true);
                        try {
                            b10.h.j.t(l1Var);
                            break;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void M(e2.q0 q0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void O(e2.y0 y0Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        b10.f(y0Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void P(boolean z10) {
        switch (this.a) {
            case 0:
                l2.p pVar = (l2.p) this.b;
                cf cfVar = (cf) this.c;
                a aVar = cfVar.e;
                if (z10) {
                    cfVar.c = ((l2.f0) pVar).l();
                } else {
                    long l10 = ((l2.f0) pVar).l();
                    long j3 = cfVar.c;
                    if (j3 != -9223372036854775807L && l10 > j3) {
                        cf.a(cfVar, j3, l10);
                    }
                    cfVar.c = -9223372036854775807L;
                }
                g0.r(aVar);
                if (!z10) {
                    g0.h3(aVar, 60000L);
                    break;
                }
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j10 = g1Var.C;
                        long j11 = g1Var.D;
                        long j12 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        a8.la.p(l1Var.p() || n1Var.a.b < l1Var.o());
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z10, z14, o0Var2, j10, j11, j12, s1Var, q1Var);
                        b10.c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.j.e;
                            m0Var.p0(m0Var.h.t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        b10.t();
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void a(e2.x1 x1Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = b10.s;
                    e2.v0 v0Var = g1Var.a;
                    int i7 = g1Var.b;
                    p4.n1 n1Var = g1Var.c;
                    e2.b1 b1Var = g1Var.d;
                    e2.b1 b1Var2 = g1Var.e;
                    int i10 = g1Var.f;
                    e2.w0 w0Var = g1Var.g;
                    int i11 = g1Var.h;
                    boolean z11 = g1Var.i;
                    e2.l1 l1Var = g1Var.j;
                    int i12 = g1Var.k;
                    e2.o0 o0Var = g1Var.m;
                    float f10 = g1Var.n;
                    float f11 = g1Var.o;
                    int i13 = g1Var.p;
                    e2.e eVar = g1Var.q;
                    g2.c cVar = g1Var.r;
                    e2.o oVar = g1Var.s;
                    int i14 = g1Var.t;
                    boolean z12 = g1Var.u;
                    boolean z13 = g1Var.v;
                    int i15 = g1Var.w;
                    boolean z14 = g1Var.x;
                    boolean z15 = g1Var.y;
                    int i16 = g1Var.z;
                    int i17 = g1Var.A;
                    e2.o0 o0Var2 = g1Var.B;
                    long j3 = g1Var.C;
                    long j10 = g1Var.D;
                    long j11 = g1Var.E;
                    e2.s1 s1Var = g1Var.F;
                    e2.q1 q1Var2 = g1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.j.getClass();
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                    }
                    z10 = true;
                    a8.la.p(z10);
                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    public p4.d0 b() {
        return (p4.d0) ((WeakReference) this.b).get();
    }

    @Override // e2.a1
    public final void d(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i10 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i11 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i12 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i13 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i7, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.getClass();
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.j.getClass();
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i7, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void e(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i10 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i11 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i7, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.r(i7);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.j.r(i7);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i7, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void f(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void g(int i7) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        b10.s = g1Var.b(g1Var.w, i7, g1Var.v);
                        b10.c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.j.e;
                            m0Var.p0(m0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void h(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void i(int i7) {
        int i10 = this.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:7|(2:9|(5:11|12|13|14|15))(1:22)|21|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        h2.a.d("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // e2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        e2.s1 s1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z12 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z13 = g1Var.u;
                        boolean z14 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z15 = g1Var.x;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var2 = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        if (!l1Var.p()) {
                            s1Var = s1Var2;
                            if (n1Var.a.b >= l1Var.o()) {
                                z11 = false;
                                a8.la.p(z11);
                                b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z12, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z13, z14, i15, i16, i17, z15, z10, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                b10.t();
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        z11 = true;
                        a8.la.p(z11);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z12, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z13, z14, i15, i16, i17, z15, z10, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                        b10.h.j.getClass();
                        b10.t();
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void k(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        b10.s = g1Var.b(i7, g1Var.z, z10);
                        b10.c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.j.e;
                            m0Var.p0(m0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void l(float f10) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = b10.s;
                    e2.v0 v0Var = g1Var.a;
                    int i7 = g1Var.b;
                    p4.n1 n1Var = g1Var.c;
                    e2.b1 b1Var = g1Var.d;
                    e2.b1 b1Var2 = g1Var.e;
                    int i10 = g1Var.f;
                    e2.w0 w0Var = g1Var.g;
                    int i11 = g1Var.h;
                    boolean z11 = g1Var.i;
                    e2.l1 l1Var = g1Var.j;
                    int i12 = g1Var.k;
                    e2.x1 x1Var = g1Var.l;
                    e2.o0 o0Var = g1Var.m;
                    float f11 = g1Var.n;
                    int i13 = g1Var.p;
                    e2.e eVar = g1Var.q;
                    g2.c cVar = g1Var.r;
                    e2.o oVar = g1Var.s;
                    int i14 = g1Var.t;
                    boolean z12 = g1Var.u;
                    boolean z13 = g1Var.v;
                    int i15 = g1Var.w;
                    boolean z14 = g1Var.x;
                    boolean z15 = g1Var.y;
                    int i16 = g1Var.z;
                    int i17 = g1Var.A;
                    e2.o0 o0Var2 = g1Var.B;
                    long j3 = g1Var.C;
                    long j10 = g1Var.D;
                    long j11 = g1Var.E;
                    e2.s1 s1Var = g1Var.F;
                    e2.q1 q1Var2 = g1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.j.getClass();
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                    }
                    z10 = true;
                    a8.la.p(z10);
                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // e2.a1
    public final void m(int i7) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.i1 i1Var = (p4.i1) ((WeakReference) this.c).get();
                    if (i1Var != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 W = i1Var.W();
                        int i10 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i11 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i12 = g1Var.h;
                        boolean z10 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i13 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i14 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i15 = g1Var.t;
                        boolean z11 = g1Var.u;
                        boolean z12 = g1Var.v;
                        int i16 = g1Var.w;
                        boolean z13 = g1Var.y;
                        int i17 = g1Var.z;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        boolean z14 = i7 == 3 && z12 && i17 == 0;
                        a8.la.p(l1Var.p() || n1Var.a.b < l1Var.o());
                        b10.s = new p4.g1(W, i10, n1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z11, z12, i16, i17, i7, z14, z13, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                        try {
                            pe peVar = b10.h.j;
                            i1Var.W();
                            p4.m0 m0Var = (p4.m0) peVar.e;
                            m0Var.p0(m0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void n(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = b10.s;
                    e2.v0 v0Var = g1Var.a;
                    int i7 = g1Var.b;
                    p4.n1 n1Var = g1Var.c;
                    e2.b1 b1Var = g1Var.d;
                    e2.b1 b1Var2 = g1Var.e;
                    int i10 = g1Var.f;
                    e2.w0 w0Var = g1Var.g;
                    int i11 = g1Var.h;
                    boolean z11 = g1Var.i;
                    e2.l1 l1Var = g1Var.j;
                    int i12 = g1Var.k;
                    e2.x1 x1Var = g1Var.l;
                    float f10 = g1Var.n;
                    float f11 = g1Var.o;
                    int i13 = g1Var.p;
                    e2.e eVar = g1Var.q;
                    g2.c cVar = g1Var.r;
                    e2.o oVar = g1Var.s;
                    int i14 = g1Var.t;
                    boolean z12 = g1Var.u;
                    boolean z13 = g1Var.v;
                    int i15 = g1Var.w;
                    boolean z14 = g1Var.x;
                    boolean z15 = g1Var.y;
                    int i16 = g1Var.z;
                    int i17 = g1Var.A;
                    e2.o0 o0Var2 = g1Var.B;
                    long j3 = g1Var.C;
                    long j10 = g1Var.D;
                    long j11 = g1Var.E;
                    e2.s1 s1Var = g1Var.F;
                    e2.q1 q1Var2 = g1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                b10.h.j.q(o0Var);
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.j.q(o0Var);
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                    }
                    z10 = true;
                    a8.la.p(z10);
                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // e2.a1
    public final void o(e2.e eVar) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) b10.h.j.e;
                                    m0Var.h.t.K().getClass();
                                    ((q4.l) m0Var.n.b).a.setPlaybackToLocal(eVar.b());
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) b10.h.j.e;
                            m0Var2.h.t.K().getClass();
                            ((q4.l) m0Var2.n.b).a.setPlaybackToLocal(eVar.b());
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    ab.c0 c0Var = b10.g.b;
                    h9.i0 p10 = c0Var.p();
                    for (int i7 = 0; i7 < p10.size(); i7++) {
                        p4.v vVar = (p4.v) p10.get(i7);
                        c0Var.t(vVar);
                        b10.c(vVar, new org.telegram.utils.twidget.f(22));
                    }
                    break;
                }
                break;
        }
    }

    @Override // e2.a1
    public final void p(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var2 = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var2, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.v();
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.j.v();
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var2, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void q(e2.v0 v0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
        switch (this.a) {
            case 0:
                cf cfVar = (cf) this.c;
                if (i7 == 1) {
                    long j3 = cfVar.c;
                    if (j3 != -9223372036854775807L) {
                        cf.a(cfVar, j3, b1Var.f);
                    }
                    cfVar.c = ((com.google.android.gms.common.api.q) ((l2.p) this.b)).h() ? b1Var2.f : -9223372036854775807L;
                    g0.r(cfVar.e);
                    break;
                }
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i10 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z10 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z11 = g1Var.u;
                        boolean z12 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z13 = g1Var.x;
                        boolean z14 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j10 = g1Var.C;
                        long j11 = g1Var.D;
                        long j12 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        a8.la.p(l1Var.p() || n1Var.a.b < l1Var.o());
                        b10.s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i7, w0Var, i11, z10, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j10, j11, j12, s1Var, q1Var);
                        b10.c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.j.e;
                            m0Var.p0(m0Var.h.t);
                            break;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void t(boolean z10) {
        e2.q1 q1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z11 = false;
                                    a8.la.p(z11);
                                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.s(z10);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.j.s(z10);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z11 = true;
                        a8.la.p(z11);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void u(e2.s1 s1Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.a(s1Var);
                        b10.c.a(true, false);
                        b10.d(new org.telegram.utils.twidget.f(s1Var, 21));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void v(int i7, e2.l0 l0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.o(l0Var);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.j.o(l0Var);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void x(g2.c cVar) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        e2.v0 v0Var = g1Var.a;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void y(e2.v0 v0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.c).get()) != null) {
                        p4.g1 g1Var = b10.s;
                        int i7 = g1Var.b;
                        p4.n1 n1Var = g1Var.c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.e;
                        int i10 = g1Var.f;
                        e2.w0 w0Var = g1Var.g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.i;
                        e2.l1 l1Var = g1Var.j;
                        int i12 = g1Var.k;
                        e2.x1 x1Var = g1Var.l;
                        e2.o0 o0Var = g1Var.m;
                        float f10 = g1Var.n;
                        float f11 = g1Var.o;
                        int i13 = g1Var.p;
                        e2.e eVar = g1Var.q;
                        g2.c cVar = g1Var.r;
                        e2.o oVar = g1Var.s;
                        int i14 = g1Var.t;
                        boolean z12 = g1Var.u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.w;
                        boolean z14 = g1Var.x;
                        boolean z15 = g1Var.y;
                        int i16 = g1Var.z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) b10.h.j.e;
                                    m0Var.p0(m0Var.h.t);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) b10.h.j.e;
                            m0Var2.p0(m0Var2.h.t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    public bf(cf cfVar, l2.p pVar) {
        this.c = cfVar;
        this.b = pVar;
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void A(List list) {
    }

    private final /* synthetic */ void C(List list) {
    }

    private final /* synthetic */ void G(e2.z0 z0Var) {
    }

    private final /* synthetic */ void I(e2.z0 z0Var) {
    }

    private final /* synthetic */ void K(boolean z10) {
    }

    private final /* synthetic */ void N(boolean z10) {
    }

    private final /* synthetic */ void Q(boolean z10) {
    }

    private final /* synthetic */ void S(e2.o0 o0Var) {
    }

    private final /* synthetic */ void T(e2.q0 q0Var) {
    }

    private final /* synthetic */ void U(e2.q0 q0Var) {
    }

    private final /* synthetic */ void W(e2.w0 w0Var) {
    }

    private final /* synthetic */ void X(int i7) {
    }

    private final /* synthetic */ void Y(int i7) {
    }

    private final /* synthetic */ void Z(e2.v0 v0Var) {
    }

    private final /* synthetic */ void a0(e2.v0 v0Var) {
    }

    private final /* synthetic */ void b0(e2.v0 v0Var) {
    }

    private final /* synthetic */ void c(e2.e eVar) {
    }

    private final /* synthetic */ void e0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void f0(int i7) {
    }

    private final /* synthetic */ void g0(int i7) {
    }

    private final /* synthetic */ void i0(int i7) {
    }

    private final /* synthetic */ void j0(boolean z10) {
    }

    private final /* synthetic */ void k0(boolean z10) {
    }

    private final /* synthetic */ void l0(boolean z10) {
    }

    private final /* synthetic */ void o0(e2.q1 q1Var) {
    }

    private final /* synthetic */ void p0(e2.s1 s1Var) {
    }

    private final /* synthetic */ void q0(e2.x1 x1Var) {
    }

    private final /* synthetic */ void r(int i7) {
    }

    private final /* synthetic */ void r0(float f10) {
    }

    private final /* synthetic */ void w(e2.y0 y0Var) {
    }

    private final /* synthetic */ void z(g2.c cVar) {
    }

    private final /* synthetic */ void R(int i7, e2.l0 l0Var) {
    }

    private final /* synthetic */ void V(int i7, boolean z10) {
    }

    private final /* synthetic */ void c0(int i7, boolean z10) {
    }

    private final /* synthetic */ void d0(int i7, boolean z10) {
    }

    private final /* synthetic */ void m0(int i7, int i10) {
    }

    private final /* synthetic */ void n0(e2.l1 l1Var, int i7) {
    }
}
