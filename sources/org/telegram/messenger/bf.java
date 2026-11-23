package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class bf implements e2.a1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public bf(p4.d0 d0Var, p4.h1 h1Var) {
        this.b = new WeakReference(d0Var);
        this.c = new WeakReference(h1Var);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        i7.s = i7.s.d(q1Var);
                        i7.c.a(true, true);
                        i7.d(new org.telegram.utils.twidget.f(q1Var, 23));
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) i7.h.j.e;
                                    n0Var.p0(n0Var.h.t);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) i7.h.j.e;
                            n0Var2.p0(n0Var2.h.t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
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
                p4.d0 i11 = i();
                if (i11 != null) {
                    i11.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        i11.d(new gh.c(i7, i10, 3));
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
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    p4.h1 h1Var = (p4.h1) ((WeakReference) this.c).get();
                    if (h1Var != null) {
                        i10.s = i10.s.c(l1Var, h1Var.R0(), i7);
                        i10.c.a(false, true);
                        try {
                            i10.h.j.t(l1Var);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        i7.f(y0Var);
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
                l2.q qVar = (l2.q) this.b;
                cf cfVar = (cf) this.c;
                a aVar = cfVar.e;
                if (z10) {
                    cfVar.c = ((l2.g0) qVar).n();
                } else {
                    long n10 = ((l2.g0) qVar).n();
                    long j3 = cfVar.c;
                    if (j3 != -9223372036854775807L && n10 > j3) {
                        cf.a(cfVar, j3, n10);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j10 = f1Var.C;
                        long j11 = f1Var.D;
                        long j12 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        a8.ma.p(l1Var.p() || m1Var.a.b < l1Var.o());
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z10, z14, o0Var2, j10, j11, j12, s1Var, q1Var);
                        i7.c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i7.h.j.e;
                            n0Var.p0(n0Var.h.t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        i7.t();
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void a(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i10.s;
                        e2.v0 v0Var = f1Var.a;
                        int i11 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i12 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i13 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i14 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i10.s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i13, z11, x1Var, l1Var, i14, o0Var, f10, f11, eVar, i7, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i10.c.a(true, true);
                                    i10.h.j.getClass();
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i10.h.j.getClass();
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i10.s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i13, z11, x1Var, l1Var, i14, o0Var, f10, f11, eVar, i7, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.c.a(true, true);
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final void b(e2.x1 x1Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    p4.f1 f1Var = i7.s;
                    e2.v0 v0Var = f1Var.a;
                    int i10 = f1Var.b;
                    p4.m1 m1Var = f1Var.c;
                    e2.b1 b1Var = f1Var.d;
                    e2.b1 b1Var2 = f1Var.e;
                    int i11 = f1Var.f;
                    e2.w0 w0Var = f1Var.g;
                    int i12 = f1Var.h;
                    boolean z11 = f1Var.i;
                    e2.l1 l1Var = f1Var.j;
                    int i13 = f1Var.k;
                    e2.o0 o0Var = f1Var.m;
                    float f10 = f1Var.n;
                    float f11 = f1Var.o;
                    int i14 = f1Var.p;
                    e2.e eVar = f1Var.q;
                    g2.c cVar = f1Var.r;
                    e2.o oVar = f1Var.s;
                    int i15 = f1Var.t;
                    boolean z12 = f1Var.u;
                    boolean z13 = f1Var.v;
                    int i16 = f1Var.w;
                    boolean z14 = f1Var.x;
                    boolean z15 = f1Var.y;
                    int i17 = f1Var.z;
                    int i18 = f1Var.A;
                    e2.o0 o0Var2 = f1Var.B;
                    long j3 = f1Var.C;
                    long j10 = f1Var.D;
                    long j11 = f1Var.E;
                    e2.s1 s1Var = f1Var.F;
                    e2.q1 q1Var2 = f1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.c.a(true, true);
                                i7.h.j.getClass();
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        i7.h.j.getClass();
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                    }
                    z10 = true;
                    a8.ma.p(z10);
                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    i7.c.a(true, true);
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void c(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void d(int i7) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i10.s;
                        i10.s = f1Var.b(f1Var.w, i7, f1Var.v);
                        i10.c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i10.h.j.e;
                            n0Var.p0(n0Var.h.t);
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
    public final void e(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i10.s;
                        e2.v0 v0Var = f1Var.a;
                        int i11 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i12 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i10.s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i7, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i10.c.a(true, true);
                                    i10.h.j.r(i7);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i10.h.j.r(i7);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i10.s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i7, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.c.a(true, true);
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
    public final /* synthetic */ void g(int i7) {
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
    public final void h(boolean z10) {
        e2.s1 s1Var;
        boolean z11;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z12 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z13 = f1Var.u;
                        boolean z14 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z15 = f1Var.x;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var2 = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        if (!l1Var.p()) {
                            s1Var = s1Var2;
                            if (m1Var.a.b >= l1Var.o()) {
                                z11 = false;
                                a8.ma.p(z11);
                                i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z12, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z13, z14, i16, i17, i18, z15, z10, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.c.a(true, true);
                                i7.h.j.getClass();
                                i7.t();
                                break;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        z11 = true;
                        a8.ma.p(z11);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z12, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z13, z14, i16, i17, i18, z15, z10, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
                        i7.h.j.getClass();
                        i7.t();
                    }
                }
                break;
        }
    }

    public p4.d0 i() {
        return (p4.d0) ((WeakReference) this.b).get();
    }

    @Override // e2.a1
    public final void j(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i10.s;
                        i10.s = f1Var.b(i7, f1Var.z, z10);
                        i10.c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i10.h.j.e;
                            n0Var.p0(n0Var.h.t);
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
    public final void k(float f10) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.a) {
            case 0:
                break;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    p4.f1 f1Var = i7.s;
                    e2.v0 v0Var = f1Var.a;
                    int i10 = f1Var.b;
                    p4.m1 m1Var = f1Var.c;
                    e2.b1 b1Var = f1Var.d;
                    e2.b1 b1Var2 = f1Var.e;
                    int i11 = f1Var.f;
                    e2.w0 w0Var = f1Var.g;
                    int i12 = f1Var.h;
                    boolean z11 = f1Var.i;
                    e2.l1 l1Var = f1Var.j;
                    int i13 = f1Var.k;
                    e2.x1 x1Var = f1Var.l;
                    e2.o0 o0Var = f1Var.m;
                    float f11 = f1Var.n;
                    int i14 = f1Var.p;
                    e2.e eVar = f1Var.q;
                    g2.c cVar = f1Var.r;
                    e2.o oVar = f1Var.s;
                    int i15 = f1Var.t;
                    boolean z12 = f1Var.u;
                    boolean z13 = f1Var.v;
                    int i16 = f1Var.w;
                    boolean z14 = f1Var.x;
                    boolean z15 = f1Var.y;
                    int i17 = f1Var.z;
                    int i18 = f1Var.A;
                    e2.o0 o0Var2 = f1Var.B;
                    long j3 = f1Var.C;
                    long j10 = f1Var.D;
                    long j11 = f1Var.E;
                    e2.s1 s1Var = f1Var.F;
                    e2.q1 q1Var2 = f1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.c.a(true, true);
                                i7.h.j.getClass();
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        i7.h.j.getClass();
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                    }
                    z10 = true;
                    a8.ma.p(z10);
                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    i7.c.a(true, true);
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
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    p4.h1 h1Var = (p4.h1) ((WeakReference) this.c).get();
                    if (h1Var != null) {
                        p4.f1 f1Var = i10.s;
                        e2.v0 X = h1Var.X();
                        int i11 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i12 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i13 = f1Var.h;
                        boolean z10 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i14 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i15 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i16 = f1Var.t;
                        boolean z11 = f1Var.u;
                        boolean z12 = f1Var.v;
                        int i17 = f1Var.w;
                        boolean z13 = f1Var.y;
                        int i18 = f1Var.z;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        boolean z14 = i7 == 3 && z12 && i18 == 0;
                        a8.ma.p(l1Var.p() || m1Var.a.b < l1Var.o());
                        i10.s = new p4.f1(X, i11, m1Var, b1Var, b1Var2, i12, w0Var, i13, z10, x1Var, l1Var, i14, o0Var, f10, f11, eVar, i15, cVar, oVar, i16, z11, z12, i17, i18, i7, z14, z13, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.c.a(true, true);
                        try {
                            pe peVar = i10.h.j;
                            h1Var.X();
                            p4.n0 n0Var = (p4.n0) peVar.e;
                            n0Var.p0(n0Var.h.t);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    p4.f1 f1Var = i7.s;
                    e2.v0 v0Var = f1Var.a;
                    int i10 = f1Var.b;
                    p4.m1 m1Var = f1Var.c;
                    e2.b1 b1Var = f1Var.d;
                    e2.b1 b1Var2 = f1Var.e;
                    int i11 = f1Var.f;
                    e2.w0 w0Var = f1Var.g;
                    int i12 = f1Var.h;
                    boolean z11 = f1Var.i;
                    e2.l1 l1Var = f1Var.j;
                    int i13 = f1Var.k;
                    e2.x1 x1Var = f1Var.l;
                    float f10 = f1Var.n;
                    float f11 = f1Var.o;
                    int i14 = f1Var.p;
                    e2.e eVar = f1Var.q;
                    g2.c cVar = f1Var.r;
                    e2.o oVar = f1Var.s;
                    int i15 = f1Var.t;
                    boolean z12 = f1Var.u;
                    boolean z13 = f1Var.v;
                    int i16 = f1Var.w;
                    boolean z14 = f1Var.x;
                    boolean z15 = f1Var.y;
                    int i17 = f1Var.z;
                    int i18 = f1Var.A;
                    e2.o0 o0Var2 = f1Var.B;
                    long j3 = f1Var.C;
                    long j10 = f1Var.D;
                    long j11 = f1Var.E;
                    e2.s1 s1Var = f1Var.F;
                    e2.q1 q1Var2 = f1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.c.a(true, true);
                                i7.h.j.q(o0Var);
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        i7.h.j.q(o0Var);
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                    }
                    z10 = true;
                    a8.ma.p(z10);
                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    i7.c.a(true, true);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) i7.h.j.e;
                                    n0Var.h.t.L().getClass();
                                    ((q4.l) n0Var.n.b).a.setPlaybackToLocal(eVar.b());
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) i7.h.j.e;
                            n0Var2.h.t.L().getClass();
                            ((q4.l) n0Var2.n.b).a.setPlaybackToLocal(eVar.b());
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    ab.c0 c0Var = i7.g.b;
                    h9.i0 s5 = c0Var.s();
                    for (int i10 = 0; i10 < s5.size(); i10++) {
                        p4.v vVar = (p4.v) s5.get(i10);
                        c0Var.w(vVar);
                        i7.c(vVar, new org.telegram.utils.twidget.f(22));
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var2 = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var2, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                                    i7.c.a(true, true);
                                    i7.h.j.v();
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i7.h.j.v();
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var2, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
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
                    cfVar.c = ((com.google.android.gms.common.api.q) ((l2.q) this.b)).j() ? b1Var2.f : -9223372036854775807L;
                    g0.r(cfVar.e);
                    break;
                }
                break;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i10.s;
                        e2.v0 v0Var = f1Var.a;
                        int i11 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z10 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z11 = f1Var.u;
                        boolean z12 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z13 = f1Var.x;
                        boolean z14 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j10 = f1Var.C;
                        long j11 = f1Var.D;
                        long j12 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        a8.ma.p(l1Var.p() || m1Var.a.b < l1Var.o());
                        i10.s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i7, w0Var, i12, z10, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z11, z12, i16, i17, i18, z13, z14, o0Var2, j10, j11, j12, s1Var, q1Var);
                        i10.c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i10.h.j.e;
                            n0Var.p0(n0Var.h.t);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z11 = false;
                                    a8.ma.p(z11);
                                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.c.a(true, true);
                                    i7.h.j.s(z10);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i7.h.j.s(z10);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z11 = true;
                        a8.ma.p(z11);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        i7.s = i7.s.a(s1Var);
                        i7.c.a(true, false);
                        i7.d(new org.telegram.utils.twidget.f(s1Var, 21));
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
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i10.s;
                        e2.v0 v0Var = f1Var.a;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i10.s = new p4.f1(v0Var, i7, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i10.c.a(true, true);
                                    i10.h.j.o(l0Var);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i10.h.j.o(l0Var);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i10.s = new p4.f1(v0Var, i7, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.c.a(true, true);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        e2.v0 v0Var = f1Var.a;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.a.b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.c.a(true, true);
                                break;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
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
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.c).get()) != null) {
                        p4.f1 f1Var = i7.s;
                        int i10 = f1Var.b;
                        p4.m1 m1Var = f1Var.c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.e;
                        int i11 = f1Var.f;
                        e2.w0 w0Var = f1Var.g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.i;
                        e2.l1 l1Var = f1Var.j;
                        int i13 = f1Var.k;
                        e2.x1 x1Var = f1Var.l;
                        e2.o0 o0Var = f1Var.m;
                        float f10 = f1Var.n;
                        float f11 = f1Var.o;
                        int i14 = f1Var.p;
                        e2.e eVar = f1Var.q;
                        g2.c cVar = f1Var.r;
                        e2.o oVar = f1Var.s;
                        int i15 = f1Var.t;
                        boolean z12 = f1Var.u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.w;
                        boolean z14 = f1Var.x;
                        boolean z15 = f1Var.y;
                        int i17 = f1Var.z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.a.b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) i7.h.j.e;
                                    n0Var.p0(n0Var.h.t);
                                    break;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) i7.h.j.e;
                            n0Var2.p0(n0Var2.h.t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.c.a(true, true);
                    }
                }
                break;
        }
    }

    public bf(cf cfVar, l2.q qVar) {
        this.c = cfVar;
        this.b = qVar;
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

    private final /* synthetic */ void l(e2.e eVar) {
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
