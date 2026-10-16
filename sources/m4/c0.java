package m4;

import android.os.RemoteException;
import b2.b2;
import b2.w1;
import java.lang.ref.WeakReference;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c0 implements b2.e1 {
    public final WeakReference a;
    public final WeakReference b;

    public c0(e0 e0Var, m1 m1Var) {
        this.a = new WeakReference(e0Var);
        this.b = new WeakReference(m1Var);
    }

    public final e0 a() {
        return (e0) this.a.get();
    }

    @Override // b2.e1
    public final void onAudioAttributesChanged(b2.f fVar) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    p0 p0Var = (p0) a2.h.i.e;
                    p0Var.g.t.J().getClass();
                    ((n4.n) p0Var.m.b).a.setPlaybackToLocal(fVar.b());
                    return;
                }
            }
            p0 p0Var2 = (p0) a2.h.i.e;
            p0Var2.g.t.J().getClass();
            ((n4.n) p0Var2.m.b).a.setPlaybackToLocal(fVar.b());
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onAudioSessionIdChanged(int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i12 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i13 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i14 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i10, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    a2.h.i.getClass();
                    return;
                }
            }
            a2.h.i.getClass();
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i10, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onAvailableCommandsChanged(b2.c1 c1Var) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.f(c1Var);
    }

    @Override // b2.e1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.e1
    public final void onIsLoadingChanged(boolean z10) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        u6.p(p1Var.p() || r1Var.a.b < p1Var.o());
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z10, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        a2.t();
    }

    @Override // b2.e1
    public final void onIsPlayingChanged(boolean z10) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        u6.p(p1Var.p() || r1Var.a.b < p1Var.o());
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z10, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            p0 p0Var = (p0) a2.h.i.e;
            p0Var.O(p0Var.g.t);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        a2.t();
    }

    @Override // b2.e1
    public final void onMediaItemTransition(b2.p0 p0Var, int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    a2.h.i.l(p0Var);
                    return;
                }
            }
            a2.h.i.l(p0Var);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onMediaMetadataChanged(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var2 = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var2, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    a2.h.i.r();
                    return;
                }
            }
            a2.h.i.r();
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var2, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        a2.s = k1Var.b(i10, k1Var.z, z10);
        a2.c.a(true, true);
        try {
            p0 p0Var = (p0) a2.h.i.e;
            p0Var.O(p0Var.g.t);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onPlaybackParametersChanged(b2.a1 a1Var) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    p0 p0Var = (p0) a2.h.i.e;
                    p0Var.O(p0Var.g.t);
                    return;
                }
            }
            p0 p0Var2 = (p0) a2.h.i.e;
            p0Var2.O(p0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPlaybackStateChanged(int i10) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        m1 m1Var = (m1) this.b.get();
        if (m1Var == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 W = m1Var.W();
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i12 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i13 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i14 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i15 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i16 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i17 = k1Var.w;
        boolean z13 = k1Var.y;
        int i18 = k1Var.z;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        boolean z14 = i10 == 3 && z12 && i18 == 0;
        u6.p(p1Var.p() || r1Var.a.b < p1Var.o());
        a2.s = new k1(W, i11, r1Var, f1Var, f1Var2, i12, a1Var, i13, z10, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i15, cVar, qVar, i16, z11, z12, i17, i18, i10, z14, z13, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            n0 n0Var = a2.h.i;
            m1Var.W();
            p0 p0Var = (p0) n0Var.e;
            p0Var.O(p0Var.g.t);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        a2.s = k1Var.b(k1Var.w, i10, k1Var.v);
        a2.c.a(true, true);
        try {
            p0 p0Var = (p0) a2.h.i.e;
            p0Var.O(p0Var.g.t);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onPlayerError(b2.z0 z0Var) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    p0 p0Var = (p0) a2.h.i.e;
                    p0Var.O(p0Var.g.t);
                    return;
                }
            }
            p0 p0Var2 = (p0) a2.h.i.e;
            p0Var2.O(p0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPlaylistMetadataChanged(b2.s0 s0Var) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i16 = k1Var.w;
        boolean z13 = k1Var.x;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        u6.p(p1Var.p() || r1Var.a.b < p1Var.o());
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z11, z12, i16, i17, i18, z13, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.n(s0Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // b2.e1
    public final void onRenderedFirstFrame() {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        pi.e eVar = a2.g.b;
        e9.n0 m10 = eVar.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            v vVar = (v) m10.get(i10);
            eVar.o(vVar);
            a2.c(vVar, new k2.y0(10));
        }
    }

    @Override // b2.e1
    public final void onRepeatModeChanged(int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i12 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i10, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    a2.h.i.o(i10);
                    return;
                }
            }
            a2.h.i.o(i10);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i10, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.u1 u1Var;
        boolean z11;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z11 = false;
                    u6.p(z11);
                    a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    a2.h.i.p(z10);
                    return;
                }
            }
            a2.h.i.p(z10);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z11 = true;
        u6.p(z11);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.d(new eh.c(i10, i11, 3));
    }

    @Override // b2.e1
    public final void onTimelineChanged(b2.p1 p1Var, int i10) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        m1 m1Var = (m1) this.b.get();
        if (m1Var == null) {
            return;
        }
        a2.s = a2.s.c(p1Var, m1Var.R0(), i10);
        a2.c.a(false, true);
        try {
            a2.h.i.q(p1Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onTrackSelectionParametersChanged(b2.u1 u1Var) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.d(u1Var);
        a2.c.a(true, true);
        a2.d(new k2.y0(u1Var, 11));
    }

    @Override // b2.e1
    public final void onTracksChanged(w1 w1Var) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.a(w1Var);
        a2.c.a(true, false);
        a2.d(new k2.y0(w1Var, 9));
    }

    @Override // b2.e1
    public final void onVideoSizeChanged(b2 b2Var) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i16 = k1Var.w;
        boolean z13 = k1Var.x;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        u6.p(p1Var.p() || r1Var.a.b < p1Var.o());
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z11, z12, i16, i17, i18, z13, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onVolumeChanged(float f7) {
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f10 = k1Var.n;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i16 = k1Var.w;
        boolean z13 = k1Var.x;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        if (f7 != 0.0f) {
            f10 = f7;
        }
        u6.p(p1Var.p() || r1Var.a.b < p1Var.o());
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z11, z12, i16, i17, i18, z13, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onCues(d2.c cVar) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        if (p1Var.p()) {
            u1Var = u1Var2;
        } else {
            u1Var = u1Var2;
            if (r1Var.a.b >= p1Var.o()) {
                z10 = false;
                u6.p(z10);
                a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(b2.f1 f1Var, b2.f1 f1Var2, int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.z0 z0Var = k1Var.a;
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.a1 a1Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.p1 p1Var = k1Var.j;
        int i13 = k1Var.k;
        b2 b2Var = k1Var.l;
        b2.s0 s0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.q qVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i10, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.c.a(true, true);
                    p0 p0Var = (p0) a2.h.i.e;
                    p0Var.O(p0Var.g.t);
                    return;
                }
            }
            p0 p0Var2 = (p0) a2.h.i.e;
            p0Var2.O(p0Var2.g.t);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i10, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onMetadata(b2.u0 u0Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlayerErrorChanged(b2.z0 z0Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onEvents(b2.g1 g1Var, b2.d1 d1Var) {
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }
}
