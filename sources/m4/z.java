package m4;

import android.os.RemoteException;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class z implements b2.z0 {
    public final WeakReference a;
    public final WeakReference b;

    public z(b0 b0Var, l1 l1Var) {
        this.a = new WeakReference(b0Var);
        this.b = new WeakReference(l1Var);
    }

    public final b0 a() {
        return (b0) this.a.get();
    }

    @Override // b2.z0
    public final void onAudioAttributesChanged(b2.e eVar) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        a2.f(x0Var);
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.z0
    public final void onIsLoadingChanged(boolean z10) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        e2.d.g(k1Var.p() || q1Var.a.b < k1Var.o());
        a2.s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z10, n0Var2, j3, j10, j11, s1Var, q1Var2);
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
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        e2.d.g(k1Var.p() || q1Var.a.b < k1Var.o());
        a2.s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var2);
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
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var2 = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        a2.s = j1Var.b(i10, j1Var.x, z10);
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
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaybackStateChanged(int i10) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        l1 l1Var = (l1) this.b.get();
        if (l1Var == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 W = l1Var.W();
        int i11 = j1Var.b;
        q1 q1Var = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i12 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i13 = j1Var.h;
        boolean z10 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i14 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i15 = j1Var.r;
        boolean z11 = j1Var.s;
        boolean z12 = j1Var.t;
        int i16 = j1Var.u;
        boolean z13 = j1Var.w;
        int i17 = j1Var.x;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        boolean z14 = i10 == 3 && z12 && i17 == 0;
        e2.d.g(k1Var.p() || q1Var.a.b < k1Var.o());
        a2.s = new j1(W, i11, q1Var, a1Var, a1Var2, i12, v0Var, i13, z10, x1Var, k1Var, i14, n0Var, f7, eVar, cVar, lVar, i15, z11, z12, i16, i17, i10, z14, z13, n0Var2, j3, j10, j11, s1Var, q1Var2);
        a2.c.a(true, true);
        try {
            j0 j0Var = a2.h.i;
            l1Var.W();
            l0 l0Var = (l0) j0Var.e;
            l0Var.N(l0Var.g.t);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        a2.s = j1Var.b(j1Var.u, i10, j1Var.t);
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
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        int i10 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z10 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z11 = j1Var.s;
        boolean z12 = j1Var.t;
        int i15 = j1Var.u;
        boolean z13 = j1Var.v;
        boolean z14 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        e2.d.g(k1Var.p() || q1Var.a.b < k1Var.o());
        a2.s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var2);
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
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        ki.f fVar = a2.g.b;
        e9.i0 r10 = fVar.r();
        for (int i10 = 0; i10 < r10.size(); i10++) {
            r rVar = (r) r10.get(i10);
            fVar.u(rVar);
            a2.c(rVar, new j2.h(14));
        }
    }

    @Override // b2.z0
    public final void onRepeatModeChanged(int i10) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i11 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i12 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.q1 q1Var;
        boolean z11;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z11 = false;
                    e2.d.g(z11);
                    a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        l1 l1Var = (l1) this.b.get();
        if (l1Var == null) {
            return;
        }
        a2.s = a2.s.c(k1Var, l1Var.O0(), i10);
        a2.c.a(false, true);
        try {
            a2.h.i.q(k1Var);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.d(q1Var);
        a2.c.a(true, true);
        a2.d(new j2.h(q1Var, 15));
    }

    @Override // b2.z0
    public final void onTracksChanged(b2.s1 s1Var) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.a(s1Var);
        a2.c.a(true, false);
        a2.d(new j2.h(s1Var, 13));
    }

    @Override // b2.z0
    public final void onVideoSizeChanged(x1 x1Var) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z10 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z11 = j1Var.s;
        boolean z12 = j1Var.t;
        int i15 = j1Var.u;
        boolean z13 = j1Var.v;
        boolean z14 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        e2.d.g(k1Var.p() || q1Var.a.b < k1Var.o());
        a2.s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var2);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onVolumeChanged(float f7) {
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z10 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z11 = j1Var.s;
        boolean z12 = j1Var.t;
        int i15 = j1Var.u;
        boolean z13 = j1Var.v;
        boolean z14 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        e2.d.g(k1Var.p() || q1Var.a.b < k1Var.o());
        a2.s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z11, z12, i15, i16, i17, z13, z14, n0Var2, j3, j10, j11, s1Var, q1Var2);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.z0
    public final void onCues(d2.c cVar) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i10 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var3;
        } else {
            q1Var = q1Var3;
            if (q1Var2.a.b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.c.a(true, true);
    }

    @Override // b2.z0
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.b.get()) == null) {
            return;
        }
        j1 j1Var = a2.s;
        b2.u0 u0Var = j1Var.a;
        int i11 = j1Var.b;
        q1 q1Var2 = j1Var.c;
        b2.v0 v0Var = j1Var.g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.i;
        b2.k1 k1Var = j1Var.j;
        int i13 = j1Var.k;
        x1 x1Var = j1Var.l;
        b2.n0 n0Var = j1Var.m;
        float f7 = j1Var.n;
        b2.e eVar = j1Var.o;
        d2.c cVar = j1Var.p;
        b2.l lVar = j1Var.q;
        int i14 = j1Var.r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.t;
        int i15 = j1Var.u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.w;
        int i16 = j1Var.x;
        int i17 = j1Var.y;
        b2.n0 n0Var2 = j1Var.z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.a.b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
        a2.s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
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
