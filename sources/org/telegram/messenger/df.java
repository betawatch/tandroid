package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class df implements e2.a1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public df(p4.d0 d0Var, p4.g1 g1Var) {
        this.b = new WeakReference(d0Var);
        this.c = new WeakReference(g1Var);
    }

    @Override // e2.a1
    public final /* synthetic */ void B(List list) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void C(int i7, boolean z9) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final void D(e2.q1 q1Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.d(q1Var);
                        b10.c.a(true, true);
                        b10.d(new org.telegram.utils.twidget.e(q1Var, 17));
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
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
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
                    p4.g1 g1Var = (p4.g1) ((WeakReference) this.c).get();
                    if (g1Var != null) {
                        b10.s = b10.s.c(l1Var, g1Var.R0(), i7);
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
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        b10.f(y0Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void P(boolean z9) {
        switch (this.a) {
            case 0:
                l2.p pVar = (l2.p) this.b;
                ef efVar = (ef) this.c;
                a aVar = efVar.e;
                if (z9) {
                    efVar.c = ((l2.i0) pVar).l();
                } else {
                    long l10 = ((l2.i0) pVar).l();
                    long j3 = efVar.c;
                    if (j3 != -9223372036854775807L && l10 > j3) {
                        ef.a(efVar, j3, l10);
                    }
                    efVar.c = -9223372036854775807L;
                }
                g0.r(aVar);
                if (!z9) {
                    g0.i3(aVar, 60000L);
                    break;
                }
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j10 = e1Var.C;
                        long j11 = e1Var.D;
                        long j12 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        a8.ia.p(l1Var2.p() || l1Var.a.b < l1Var2.o());
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z9, z13, o0Var2, j10, j11, j12, s1Var, q1Var);
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
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.e1 e1Var = b10.s;
                    e2.v0 v0Var = e1Var.a;
                    int i7 = e1Var.b;
                    p4.l1 l1Var = e1Var.c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.e;
                    int i10 = e1Var.f;
                    e2.w0 w0Var = e1Var.g;
                    int i11 = e1Var.h;
                    boolean z10 = e1Var.i;
                    e2.l1 l1Var2 = e1Var.j;
                    int i12 = e1Var.k;
                    e2.o0 o0Var = e1Var.m;
                    float f10 = e1Var.n;
                    float f11 = e1Var.o;
                    int i13 = e1Var.p;
                    e2.e eVar = e1Var.q;
                    g2.d dVar = e1Var.r;
                    e2.o oVar = e1Var.s;
                    int i14 = e1Var.t;
                    boolean z11 = e1Var.u;
                    boolean z12 = e1Var.v;
                    int i15 = e1Var.w;
                    boolean z13 = e1Var.x;
                    boolean z14 = e1Var.y;
                    int i16 = e1Var.z;
                    int i17 = e1Var.A;
                    e2.o0 o0Var2 = e1Var.B;
                    long j3 = e1Var.C;
                    long j10 = e1Var.D;
                    long j11 = e1Var.E;
                    e2.s1 s1Var = e1Var.F;
                    e2.q1 q1Var2 = e1Var.G;
                    try {
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.a.b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    z9 = true;
                    a8.ia.p(z9);
                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    public p4.d0 b() {
        return (p4.d0) ((WeakReference) this.b).get();
    }

    @Override // e2.a1
    public final void c(int i7) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i10 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i11 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i12 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i13 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i7, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i7, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void e(int i7) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i10 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i11 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i7, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i7, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void f(boolean z9) {
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
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        b10.s = e1Var.b(e1Var.w, i7, e1Var.v);
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
    public final /* synthetic */ void h(boolean z9) {
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
    public final void j(boolean z9) {
        e2.s1 s1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z12 = e1Var.u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z14 = e1Var.x;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var2 = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        if (!l1Var2.p()) {
                            s1Var = s1Var2;
                            if (l1Var.a.b >= l1Var2.o()) {
                                z10 = false;
                                a8.ia.p(z10);
                                b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z12, z13, i15, i16, i17, z14, z9, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                b10.h.j.getClass();
                                b10.t();
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        z10 = true;
                        a8.ia.p(z10);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z12, z13, i15, i16, i17, z14, z9, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                        b10.h.j.getClass();
                        b10.t();
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void k(int i7, boolean z9) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        b10.s = e1Var.b(i7, e1Var.z, z9);
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
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.e1 e1Var = b10.s;
                    e2.v0 v0Var = e1Var.a;
                    int i7 = e1Var.b;
                    p4.l1 l1Var = e1Var.c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.e;
                    int i10 = e1Var.f;
                    e2.w0 w0Var = e1Var.g;
                    int i11 = e1Var.h;
                    boolean z10 = e1Var.i;
                    e2.l1 l1Var2 = e1Var.j;
                    int i12 = e1Var.k;
                    e2.x1 x1Var = e1Var.l;
                    e2.o0 o0Var = e1Var.m;
                    float f11 = e1Var.n;
                    int i13 = e1Var.p;
                    e2.e eVar = e1Var.q;
                    g2.d dVar = e1Var.r;
                    e2.o oVar = e1Var.s;
                    int i14 = e1Var.t;
                    boolean z11 = e1Var.u;
                    boolean z12 = e1Var.v;
                    int i15 = e1Var.w;
                    boolean z13 = e1Var.x;
                    boolean z14 = e1Var.y;
                    int i16 = e1Var.z;
                    int i17 = e1Var.A;
                    e2.o0 o0Var2 = e1Var.B;
                    long j3 = e1Var.C;
                    long j10 = e1Var.D;
                    long j11 = e1Var.E;
                    e2.s1 s1Var = e1Var.F;
                    e2.q1 q1Var2 = e1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.a.b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    z9 = true;
                    a8.ia.p(z9);
                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    p4.g1 g1Var = (p4.g1) ((WeakReference) this.c).get();
                    if (g1Var != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 W = g1Var.W();
                        int i10 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i11 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i12 = e1Var.h;
                        boolean z9 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i13 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i14 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i15 = e1Var.t;
                        boolean z10 = e1Var.u;
                        boolean z11 = e1Var.v;
                        int i16 = e1Var.w;
                        boolean z12 = e1Var.y;
                        int i17 = e1Var.z;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        boolean z13 = i7 == 3 && z11 && i17 == 0;
                        a8.ia.p(l1Var2.p() || l1Var.a.b < l1Var2.o());
                        b10.s = new p4.e1(W, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z9, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i14, dVar, oVar, i15, z10, z11, i16, i17, i7, z13, z12, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                        try {
                            re reVar = b10.h.j;
                            g1Var.W();
                            p4.m0 m0Var = (p4.m0) reVar.e;
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
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.e1 e1Var = b10.s;
                    e2.v0 v0Var = e1Var.a;
                    int i7 = e1Var.b;
                    p4.l1 l1Var = e1Var.c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.e;
                    int i10 = e1Var.f;
                    e2.w0 w0Var = e1Var.g;
                    int i11 = e1Var.h;
                    boolean z10 = e1Var.i;
                    e2.l1 l1Var2 = e1Var.j;
                    int i12 = e1Var.k;
                    e2.x1 x1Var = e1Var.l;
                    float f10 = e1Var.n;
                    float f11 = e1Var.o;
                    int i13 = e1Var.p;
                    e2.e eVar = e1Var.q;
                    g2.d dVar = e1Var.r;
                    e2.o oVar = e1Var.s;
                    int i14 = e1Var.t;
                    boolean z11 = e1Var.u;
                    boolean z12 = e1Var.v;
                    int i15 = e1Var.w;
                    boolean z13 = e1Var.x;
                    boolean z14 = e1Var.y;
                    int i16 = e1Var.z;
                    int i17 = e1Var.A;
                    e2.o0 o0Var2 = e1Var.B;
                    long j3 = e1Var.C;
                    long j10 = e1Var.D;
                    long j11 = e1Var.E;
                    e2.s1 s1Var = e1Var.F;
                    e2.q1 q1Var2 = e1Var.G;
                    try {
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.a.b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    z9 = true;
                    a8.ia.p(z9);
                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.c.a(true, true);
                }
                break;
        }
    }

    @Override // e2.a1
    public final void o(e2.e eVar) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    ui.e eVar = b10.g.b;
                    h9.i0 w10 = eVar.w();
                    for (int i7 = 0; i7 < w10.size(); i7++) {
                        p4.v vVar = (p4.v) w10.get(i7);
                        eVar.A(vVar);
                        b10.c(vVar, new org.telegram.utils.twidget.e(16));
                    }
                    break;
                }
                break;
        }
    }

    @Override // e2.a1
    public final void p(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var2 = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var2, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var2, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var, j3, j10, j11, s1Var, q1Var);
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
                ef efVar = (ef) this.c;
                if (i7 == 1) {
                    long j3 = efVar.c;
                    if (j3 != -9223372036854775807L) {
                        ef.a(efVar, j3, b1Var.f);
                    }
                    efVar.c = ((bi.b1) ((l2.p) this.b)).h() ? b1Var2.f : -9223372036854775807L;
                    g0.r(efVar.e);
                    break;
                }
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i10 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z9 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z10 = e1Var.u;
                        boolean z11 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z12 = e1Var.x;
                        boolean z13 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j10 = e1Var.C;
                        long j11 = e1Var.D;
                        long j12 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        a8.ia.p(l1Var2.p() || l1Var.a.b < l1Var2.o());
                        b10.s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i7, w0Var, i11, z9, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z10, z11, i15, i16, i17, z12, z13, o0Var2, j10, j11, j12, s1Var, q1Var);
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
    public final void t(boolean z9) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ia.p(z10);
                                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z9, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.c.a(true, true);
                                    b10.h.j.s(z9);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.j.s(z9);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ia.p(z10);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z9, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        b10.s = b10.s.a(s1Var);
                        b10.c.a(true, false);
                        b10.d(new org.telegram.utils.twidget.e(s1Var, 15));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void v(int i7, e2.l0 l0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void x(g2.d dVar) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        e2.v0 v0Var = e1Var.a;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.a.b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.c.a(true, true);
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void y(e2.v0 v0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.c).get()) != null) {
                        p4.e1 e1Var = b10.s;
                        int i7 = e1Var.b;
                        p4.l1 l1Var = e1Var.c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.e;
                        int i10 = e1Var.f;
                        e2.w0 w0Var = e1Var.g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.i;
                        e2.l1 l1Var2 = e1Var.j;
                        int i12 = e1Var.k;
                        e2.x1 x1Var = e1Var.l;
                        e2.o0 o0Var = e1Var.m;
                        float f10 = e1Var.n;
                        float f11 = e1Var.o;
                        int i13 = e1Var.p;
                        e2.e eVar = e1Var.q;
                        g2.d dVar = e1Var.r;
                        e2.o oVar = e1Var.s;
                        int i14 = e1Var.t;
                        boolean z11 = e1Var.u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.w;
                        boolean z13 = e1Var.x;
                        boolean z14 = e1Var.y;
                        int i16 = e1Var.z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.a.b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
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
                        z9 = true;
                        a8.ia.p(z9);
                        b10.s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.c.a(true, true);
                    }
                }
                break;
        }
    }

    public df(ef efVar, l2.p pVar) {
        this.c = efVar;
        this.b = pVar;
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void A(List list) {
    }

    private final /* synthetic */ void E(List list) {
    }

    private final /* synthetic */ void G(e2.z0 z0Var) {
    }

    private final /* synthetic */ void I(e2.z0 z0Var) {
    }

    private final /* synthetic */ void K(boolean z9) {
    }

    private final /* synthetic */ void N(boolean z9) {
    }

    private final /* synthetic */ void Q(boolean z9) {
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

    private final /* synthetic */ void d(e2.e eVar) {
    }

    private final /* synthetic */ void e0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void f0(int i7) {
    }

    private final /* synthetic */ void g0(int i7) {
    }

    private final /* synthetic */ void i0(int i7) {
    }

    private final /* synthetic */ void j0(boolean z9) {
    }

    private final /* synthetic */ void k0(boolean z9) {
    }

    private final /* synthetic */ void l0(boolean z9) {
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

    private final /* synthetic */ void z(g2.d dVar) {
    }

    private final /* synthetic */ void R(int i7, e2.l0 l0Var) {
    }

    private final /* synthetic */ void V(int i7, boolean z9) {
    }

    private final /* synthetic */ void c0(int i7, boolean z9) {
    }

    private final /* synthetic */ void d0(int i7, boolean z9) {
    }

    private final /* synthetic */ void m0(int i7, int i10) {
    }

    private final /* synthetic */ void n0(e2.l1 l1Var, int i7) {
    }
}
