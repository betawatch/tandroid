package m4;

import android.os.RemoteException;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class y implements b2.z0 {
    public final WeakReference a;
    public final WeakReference b;

    public y(a0 a0Var, j1 j1Var) {
        this.a = new WeakReference(a0Var);
        this.b = new WeakReference(j1Var);
    }

    public final a0 a() {
        return (a0) this.a.get();
    }

    @Override // b2.z0
    public final void onAudioAttributesChanged(b2.e eVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.j(eVar);
                    return;
                }
            }
            a2.h.i.j(eVar);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
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
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
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
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            k0 k0Var = (k0) a2.h.i.e;
            k0Var.N(k0Var.g.t);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
        a2.t();
    }

    @Override // b2.z0
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.l(k0Var);
                    return;
                }
            }
            a2.h.i.l(k0Var);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var2 = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.r();
                    return;
                }
            }
            a2.h.i.r();
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        a2.s = h1Var.b(i10, h1Var.x, z10);
        a2.c.a(true, true);
        try {
            k0 k0Var = (k0) a2.h.i.e;
            k0Var.N(k0Var.g.t);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override // b2.z0
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    k0 k0Var = (k0) a2.h.i.e;
                    k0Var.N(k0Var.g.t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.i.e;
            k0Var2.N(k0Var2.g.t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaybackStateChanged(int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        j1 j1Var = (j1) this.b.get();
        if (j1Var == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 W = j1Var.W();
        int i11 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i12 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i13 = h1Var.h;
        boolean z10 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i14 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i15 = h1Var.r;
        boolean z11 = h1Var.s;
        boolean z12 = h1Var.t;
        int i16 = h1Var.u;
        boolean z13 = h1Var.w;
        int i17 = h1Var.x;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        boolean z14 = i10 == 3 && z12 && i17 == 0;
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        a2.s = new h1(W, i11, o1Var, a1Var, a1Var2, i12, v0Var, i13, z10, x1Var, k1Var, i14, n0Var, f7, eVar, cVar, lVar, i15, z11, z12, i16, i17, i10, z14, z13, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            i0 i0Var = a2.h.i;
            j1Var.W();
            k0 k0Var = (k0) i0Var.e;
            k0Var.N(k0Var.g.t);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override // b2.z0
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        a2.s = h1Var.b(h1Var.u, i10, h1Var.t);
        a2.c.a(true, true);
        try {
            k0 k0Var = (k0) a2.h.i.e;
            k0Var.N(k0Var.g.t);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override // b2.z0
    public final void onPlayerError(b2.u0 u0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    k0 k0Var = (k0) a2.h.i.e;
                    k0Var.N(k0Var.g.t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.i.e;
            k0Var2.N(k0Var2.g.t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z10 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z11 = h1Var.s;
        boolean z12 = h1Var.t;
        int i15 = h1Var.u;
        boolean z13 = h1Var.v;
        boolean z14 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.n(n0Var);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
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
        fg.f fVar = a2.g.b;
        e9.i0 t10 = fVar.t();
        for (int i10 = 0; i10 < t10.size(); i10++) {
            r rVar = (r) t10.get(i10);
            fVar.w(rVar);
            a2.c(rVar, new j2.e(21));
        }
    }

    @Override // b2.z0
    public final void onRepeatModeChanged(int i10) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i11 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i12 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.o(i10);
                    return;
                }
            }
            a2.h.i.o(i10);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z11 = false;
                    e2.d.g(z11);
                    a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    a2.h.i.p(z10);
                    return;
                }
            }
            a2.h.i.p(z10);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z11 = true;
        e2.d.g(z11);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        j1 j1Var = (j1) this.b.get();
        if (j1Var == null) {
            return;
        }
        a2.s = a2.s.c(k1Var, j1Var.O0(), i10);
        a2.c.a(false, true);
        try {
            a2.h.i.q(k1Var);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override // b2.z0
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
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
        if (((j1) this.b.get()) == null) {
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
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z10 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z11 = h1Var.s;
        boolean z12 = h1Var.t;
        int i15 = h1Var.u;
        boolean z13 = h1Var.v;
        boolean z14 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override // b2.z0
    public final void onVolumeChanged(float f7) {
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z10 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z11 = h1Var.s;
        boolean z12 = h1Var.t;
        int i15 = h1Var.u;
        boolean z13 = h1Var.v;
        boolean z14 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override // b2.z0
    public final void onCues(d2.c cVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i10 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (o1Var.a.b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.b.get()) == null) {
            return;
        }
        h1 h1Var = a2.s;
        b2.u0 u0Var = h1Var.a;
        int i11 = h1Var.b;
        o1 o1Var = h1Var.c;
        b2.v0 v0Var = h1Var.g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.i;
        b2.k1 k1Var = h1Var.j;
        int i13 = h1Var.k;
        x1 x1Var = h1Var.l;
        b2.n0 n0Var = h1Var.m;
        float f7 = h1Var.n;
        b2.e eVar = h1Var.o;
        d2.c cVar = h1Var.p;
        b2.l lVar = h1Var.q;
        int i14 = h1Var.r;
        boolean z12 = h1Var.s;
        boolean z13 = h1Var.t;
        int i15 = h1Var.u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.w;
        int i16 = h1Var.x;
        int i17 = h1Var.y;
        b2.n0 n0Var2 = h1Var.z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.c.a(true, true);
                    k0 k0Var = (k0) a2.h.i.e;
                    k0Var.N(k0Var.g.t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.i.e;
            k0Var2.N(k0Var2.g.t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
