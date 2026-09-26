package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class y implements b2.z0 {
    public final WeakReference a;
    public final WeakReference b;

    public y(a0 a0Var, e1 e1Var) {
        this.a = new WeakReference(a0Var);
        this.b = new WeakReference(e1Var);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((e1) this.b.get()) == null) {
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        e2.d.g(k1Var.p() || j1Var.a.b < k1Var.o());
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        e2.d.g(k1Var.p() || j1Var.a.b < k1Var.o());
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            k0 k0Var = (k0) a2.h.i.e;
            k0Var.N(k0Var.g.t);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var2 = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        a2.s = c1Var.b(i10, c1Var.x, z10);
        a2.c.a(true, true);
        try {
            k0 k0Var = (k0) a2.h.i.e;
            k0Var.N(k0Var.g.t);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    k0 k0Var = (k0) a2.h.i.e;
                    k0Var.N(k0Var.g.t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.i.e;
            k0Var2.N(k0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaybackStateChanged(int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        e1 e1Var = (e1) this.b.get();
        if (e1Var == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 W = e1Var.W();
        int i11 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i12 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i13 = c1Var.h;
        boolean z10 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i14 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i15 = c1Var.r;
        boolean z11 = c1Var.s;
        boolean z12 = c1Var.t;
        int i16 = c1Var.u;
        boolean z13 = c1Var.w;
        int i17 = c1Var.x;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        boolean z14 = i10 == 3 && z12 && i17 == 0;
        e2.d.g(k1Var.p() || j1Var.a.b < k1Var.o());
        a2.s = new c1(W, i11, j1Var, a1Var, a1Var2, i12, v0Var, i13, z10, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z11, z12, i16, i17, i10, z14, z13, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            i0 i0Var = a2.h.i;
            e1Var.W();
            k0 k0Var = (k0) i0Var.e;
            k0Var.N(k0Var.g.t);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        a2.s = c1Var.b(c1Var.u, i10, c1Var.t);
        a2.c.a(true, true);
        try {
            k0 k0Var = (k0) a2.h.i.e;
            k0Var.N(k0Var.g.t);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    k0 k0Var = (k0) a2.h.i.e;
                    k0Var.N(k0Var.g.t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.i.e;
            k0Var2.N(k0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z10 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z11 = c1Var.s;
        boolean z12 = c1Var.t;
        int i15 = c1Var.u;
        boolean z13 = c1Var.v;
        boolean z14 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        e2.d.g(k1Var.p() || j1Var.a.b < k1Var.o());
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        oi.f fVar = a2.g.b;
        e9.i0 s10 = fVar.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            fVar.v(rVar);
            a2.c(rVar, new j2.e(23));
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i11 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i12 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z11 = false;
                    e2.d.g(z11);
                    a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        e1 e1Var = (e1) this.b.get();
        if (e1Var == null) {
            return;
        }
        a2.s = a2.s.c(k1Var, e1Var.O0(), i10);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.d(q1Var);
        a2.c.a(true, true);
        a2.d(new j2.e(q1Var, 24));
    }

    @Override // b2.z0
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((e1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.a(s1Var);
        a2.c.a(true, false);
        a2.d(new j2.e(s1Var, 22));
    }

    @Override // b2.z0
    public final void onVideoSizeChanged(x1 x1Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z10 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z11 = c1Var.s;
        boolean z12 = c1Var.t;
        int i15 = c1Var.u;
        boolean z13 = c1Var.v;
        boolean z14 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        e2.d.g(k1Var.p() || j1Var.a.b < k1Var.o());
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z10 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z11 = c1Var.s;
        boolean z12 = c1Var.t;
        int i15 = c1Var.u;
        boolean z13 = c1Var.v;
        boolean z14 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        e2.d.g(k1Var.p() || j1Var.a.b < k1Var.o());
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i10 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (j1Var.a.b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        if (((e1) this.b.get()) == null) {
            return;
        }
        c1 c1Var = a2.s;
        b2.u0 u0Var = c1Var.a;
        int i11 = c1Var.b;
        j1 j1Var = c1Var.c;
        b2.v0 v0Var = c1Var.g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.i;
        b2.k1 k1Var = c1Var.j;
        int i13 = c1Var.k;
        x1 x1Var = c1Var.l;
        b2.n0 n0Var = c1Var.m;
        float f7 = c1Var.n;
        b2.e eVar = c1Var.o;
        d2.d dVar = c1Var.p;
        b2.l lVar = c1Var.q;
        int i14 = c1Var.r;
        boolean z12 = c1Var.s;
        boolean z13 = c1Var.t;
        int i15 = c1Var.u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.w;
        int i16 = c1Var.x;
        int i17 = c1Var.y;
        b2.n0 n0Var2 = c1Var.z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    k0 k0Var = (k0) a2.h.i.e;
                    k0Var.N(k0Var.g.t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.i.e;
            k0Var2.N(k0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
