package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class y implements b2.z0 {
    public final WeakReference a;
    public final WeakReference b;

    public y(a0 a0Var, f1 f1Var) {
        this.a = new WeakReference(a0Var);
        this.b = new WeakReference(f1Var);
    }

    public final a0 a() {
        return (a0) this.a.get();
    }

    @Override // b2.z0
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.j(eVar);
                    return;
                }
            }
            a2.h.i.j(eVar);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        a2.f(x0Var);
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.z0
    public final void onIsLoadingChanged(boolean z10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        e2.d.g(k1Var2.p() || k1Var.a.b < k1Var2.o());
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        a2.t();
    }

    @Override // b2.z0
    public final void onIsPlayingChanged(boolean z10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        e2.d.g(k1Var2.p() || k1Var.a.b < k1Var2.o());
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            l0 l0Var = (l0) a2.h.i.e;
            l0Var.N(l0Var.g.t);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        a2.t();
    }

    @Override // b2.z0
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.l(k0Var);
                    return;
                }
            }
            a2.h.i.l(k0Var);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var2 = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.r();
                    return;
                }
            }
            a2.h.i.r();
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        a2.s = d1Var.b(i10, d1Var.x, z10);
        a2.c.a(true, true);
        try {
            l0 l0Var = (l0) a2.h.i.e;
            l0Var.N(l0Var.g.t);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    l0 l0Var = (l0) a2.h.i.e;
                    l0Var.N(l0Var.g.t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.i.e;
            l0Var2.N(l0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaybackStateChanged(int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        f1 f1Var = (f1) this.b.get();
        if (f1Var == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 W = f1Var.W();
        int i11 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i12 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i13 = d1Var.h;
        boolean z10 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i14 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i15 = d1Var.r;
        boolean z11 = d1Var.s;
        boolean z12 = d1Var.t;
        int i16 = d1Var.u;
        boolean z13 = d1Var.w;
        int i17 = d1Var.x;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        boolean z14 = i10 == 3 && z12 && i17 == 0;
        e2.d.g(k1Var2.p() || k1Var.a.b < k1Var2.o());
        a2.s = new d1(W, i11, k1Var, a1Var, a1Var2, i12, v0Var, i13, z10, x1Var, k1Var2, i14, n0Var, f7, eVar, dVar, lVar, i15, z11, z12, i16, i17, i10, z14, z13, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            j0 j0Var = a2.h.i;
            f1Var.W();
            l0 l0Var = (l0) j0Var.e;
            l0Var.N(l0Var.g.t);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        a2.s = d1Var.b(d1Var.u, i10, d1Var.t);
        a2.c.a(true, true);
        try {
            l0 l0Var = (l0) a2.h.i.e;
            l0Var.N(l0Var.g.t);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onPlayerError(b2.u0 u0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    l0 l0Var = (l0) a2.h.i.e;
                    l0Var.N(l0Var.g.t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.i.e;
            l0Var2.N(l0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z10 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z11 = d1Var.s;
        boolean z12 = d1Var.t;
        int i15 = d1Var.u;
        boolean z13 = d1Var.v;
        boolean z14 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        e2.d.g(k1Var2.p() || k1Var.a.b < k1Var2.o());
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.n(n0Var);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // b2.z0
    public final void onRenderedFirstFrame() {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        ni.f fVar = a2.g.b;
        e9.i0 s10 = fVar.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            fVar.v(rVar);
            a2.c(rVar, new j2.e(21));
        }
    }

    @Override // b2.z0
    public final void onRepeatModeChanged(int i10) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i11 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i12 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.o(i10);
                    return;
                }
            }
            a2.h.i.o(i10);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z11 = false;
                    e2.d.g(z11);
                    a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.p(z10);
                    return;
                }
            }
            a2.h.i.p(z10);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z11 = true;
        e2.d.g(z11);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        f1 f1Var = (f1) this.b.get();
        if (f1Var == null) {
            return;
        }
        a2.s = a2.s.c(k1Var, f1Var.O0(), i10);
        a2.c.a(false, true);
        try {
            a2.h.i.q(k1Var);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.d(q1Var);
        a2.c.a(true, true);
        a2.d(new j2.e(q1Var, 22));
    }

    @Override // b2.z0
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.a(s1Var);
        a2.c.a(true, false);
        a2.d(new j2.e(s1Var, 20));
    }

    @Override // b2.z0
    public final void onVideoSizeChanged(x1 x1Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z10 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z11 = d1Var.s;
        boolean z12 = d1Var.t;
        int i15 = d1Var.u;
        boolean z13 = d1Var.v;
        boolean z14 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        e2.d.g(k1Var2.p() || k1Var.a.b < k1Var2.o());
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onVolumeChanged(float f7) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z10 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z11 = d1Var.s;
        boolean z12 = d1Var.t;
        int i15 = d1Var.u;
        boolean z13 = d1Var.v;
        boolean z14 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        e2.d.g(k1Var2.p() || k1Var.a.b < k1Var2.o());
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onCues(d2.d dVar) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i10 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.e;
        int i11 = d1Var.f;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        if (k1Var2.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (k1Var.a.b >= k1Var2.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.b.get()) == null) {
            return;
        }
        d1 d1Var = a2.s;
        b2.u0 u0Var = d1Var.a;
        int i11 = d1Var.b;
        k1 k1Var = d1Var.c;
        b2.v0 v0Var = d1Var.g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.i;
        b2.k1 k1Var2 = d1Var.j;
        int i13 = d1Var.k;
        x1 x1Var = d1Var.l;
        b2.n0 n0Var = d1Var.m;
        float f7 = d1Var.n;
        b2.e eVar = d1Var.o;
        d2.d dVar = d1Var.p;
        b2.l lVar = d1Var.q;
        int i14 = d1Var.r;
        boolean z12 = d1Var.s;
        boolean z13 = d1Var.t;
        int i15 = d1Var.u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.w;
        int i16 = d1Var.x;
        int i17 = d1Var.y;
        b2.n0 n0Var2 = d1Var.z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.a.b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    l0 l0Var = (l0) a2.h.i.e;
                    l0Var.N(l0Var.g.t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.i.e;
            l0Var2.N(l0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onMetadata(b2.p0 p0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayerErrorChanged(b2.u0 u0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // b2.z0
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }
}
