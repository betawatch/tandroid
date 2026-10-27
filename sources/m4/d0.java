package m4;

import a8.yb;
import android.os.RemoteException;
import b2.b2;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d0 implements b2.e1 {
    public final WeakReference a;
    public final WeakReference b;

    public d0(f0 f0Var, n1 n1Var) {
        this.a = new WeakReference(f0Var);
        this.b = new WeakReference(n1Var);
    }

    public final f0 a() {
        return (f0) this.a.get();
    }

    @Override // b2.e1
    public final void onAudioAttributesChanged(b2.f fVar) {
        b2.u1 u1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onAudioSessionIdChanged(int i10) {
        b2.u1 u1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i11 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i12 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i13 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i14 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i11, s1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i10, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i11, s1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i10, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onAvailableCommandsChanged(b2.c1 c1Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        a2.f(c1Var);
    }

    @Override // b2.e1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.e1
    public final void onIsLoadingChanged(boolean z10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
        b2.q qVar = l1Var.s;
        int i15 = l1Var.t;
        boolean z12 = l1Var.u;
        boolean z13 = l1Var.v;
        int i16 = l1Var.w;
        boolean z14 = l1Var.x;
        int i17 = l1Var.z;
        int i18 = l1Var.A;
        b2.s0 s0Var2 = l1Var.B;
        long j10 = l1Var.C;
        long j11 = l1Var.D;
        long j12 = l1Var.E;
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var = l1Var.G;
        yb.p(p1Var.p() || s1Var.a.b < p1Var.o());
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z10, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
        b2.q qVar = l1Var.s;
        int i15 = l1Var.t;
        boolean z12 = l1Var.u;
        boolean z13 = l1Var.v;
        int i16 = l1Var.w;
        boolean z14 = l1Var.y;
        int i17 = l1Var.z;
        int i18 = l1Var.A;
        b2.s0 s0Var2 = l1Var.B;
        long j10 = l1Var.C;
        long j11 = l1Var.D;
        long j12 = l1Var.E;
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var = l1Var.G;
        yb.p(p1Var.p() || s1Var.a.b < p1Var.o());
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z10, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onMediaMetadataChanged(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var2 = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var2, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var2, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        a2.s = l1Var.b(i10, l1Var.z, z10);
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
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPlaybackStateChanged(int i10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        n1 n1Var = (n1) this.b.get();
        if (n1Var == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 W = n1Var.W();
        int i11 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i12 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i13 = l1Var.h;
        boolean z10 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i14 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i15 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var = l1Var.G;
        boolean z14 = i10 == 3 && z12 && i18 == 0;
        yb.p(p1Var.p() || s1Var.a.b < p1Var.o());
        a2.s = new l1(W, i11, s1Var, f1Var, f1Var2, i12, a1Var, i13, z10, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i15, cVar, qVar, i16, z11, z12, i17, i18, i10, z14, z13, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            n0 n0Var = a2.h.i;
            n1Var.W();
            p0 p0Var = (p0) n0Var.e;
            p0Var.O(p0Var.g.t);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        a2.s = l1Var.b(l1Var.w, i10, l1Var.v);
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
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPlaylistMetadataChanged(b2.s0 s0Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z10 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
        b2.q qVar = l1Var.s;
        int i15 = l1Var.t;
        boolean z11 = l1Var.u;
        boolean z12 = l1Var.v;
        int i16 = l1Var.w;
        boolean z13 = l1Var.x;
        boolean z14 = l1Var.y;
        int i17 = l1Var.z;
        int i18 = l1Var.A;
        b2.s0 s0Var2 = l1Var.B;
        long j10 = l1Var.C;
        long j11 = l1Var.D;
        long j12 = l1Var.E;
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var = l1Var.G;
        yb.p(p1Var.p() || s1Var.a.b < p1Var.o());
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z11, z12, i16, i17, i18, z13, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        com.google.firebase.messaging.q qVar = a2.g.b;
        f9.i0 k10 = qVar.k();
        for (int i10 = 0; i10 < k10.size(); i10++) {
            w wVar = (w) k10.get(i10);
            qVar.n(wVar);
            a2.c(wVar, new jh.l(11));
        }
    }

    @Override // b2.e1
    public final void onRepeatModeChanged(int i10) {
        b2.u1 u1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i11 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i12 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i11, s1Var, f1Var, f1Var2, i12, a1Var, i10, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i11, s1Var, f1Var, f1Var2, i12, a1Var, i10, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.u1 u1Var;
        boolean z11;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z11 = false;
                    yb.p(z11);
                    a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z11);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        a2.d(new fh.c(i10, i11, 3));
    }

    @Override // b2.e1
    public final void onTimelineChanged(b2.p1 p1Var, int i10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        n1 n1Var = (n1) this.b.get();
        if (n1Var == null) {
            return;
        }
        a2.s = a2.s.c(p1Var, n1Var.R0(), i10);
        a2.c.a(false, true);
        try {
            a2.h.i.q(p1Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onTrackSelectionParametersChanged(b2.u1 u1Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.d(u1Var);
        a2.c.a(true, true);
        a2.d(new jh.l(u1Var, 12));
    }

    @Override // b2.e1
    public final void onTracksChanged(b2.w1 w1Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.a(w1Var);
        a2.c.a(true, false);
        a2.d(new jh.l(w1Var, 10));
    }

    @Override // b2.e1
    public final void onVideoSizeChanged(b2 b2Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z10 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
        b2.q qVar = l1Var.s;
        int i15 = l1Var.t;
        boolean z11 = l1Var.u;
        boolean z12 = l1Var.v;
        int i16 = l1Var.w;
        boolean z13 = l1Var.x;
        boolean z14 = l1Var.y;
        int i17 = l1Var.z;
        int i18 = l1Var.A;
        b2.s0 s0Var2 = l1Var.B;
        long j10 = l1Var.C;
        long j11 = l1Var.D;
        long j12 = l1Var.E;
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var = l1Var.G;
        yb.p(p1Var.p() || s1Var.a.b < p1Var.o());
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z11, z12, i16, i17, i18, z13, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.e1
    public final void onVolumeChanged(float f7) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z10 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f10 = l1Var.n;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
        b2.q qVar = l1Var.s;
        int i15 = l1Var.t;
        boolean z11 = l1Var.u;
        boolean z12 = l1Var.v;
        int i16 = l1Var.w;
        boolean z13 = l1Var.x;
        boolean z14 = l1Var.y;
        int i17 = l1Var.z;
        int i18 = l1Var.A;
        b2.s0 s0Var2 = l1Var.B;
        long j10 = l1Var.C;
        long j11 = l1Var.D;
        long j12 = l1Var.E;
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var = l1Var.G;
        if (f7 != 0.0f) {
            f10 = f7;
        }
        yb.p(p1Var.p() || s1Var.a.b < p1Var.o());
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z11, z12, i16, i17, i18, z13, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i10 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.f1 f1Var = l1Var.d;
        b2.f1 f1Var2 = l1Var.e;
        int i11 = l1Var.f;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        if (p1Var.p()) {
            u1Var = u1Var2;
        } else {
            u1Var = u1Var2;
            if (s1Var.a.b >= p1Var.o()) {
                z10 = false;
                yb.p(z10);
                a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        yb.p(z10);
        a2.s = new l1(z0Var, i10, s1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.c.a(true, true);
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(b2.f1 f1Var, b2.f1 f1Var2, int i10) {
        b2.u1 u1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((n1) this.b.get()) == null) {
            return;
        }
        l1 l1Var = a2.s;
        b2.z0 z0Var = l1Var.a;
        int i11 = l1Var.b;
        s1 s1Var = l1Var.c;
        b2.a1 a1Var = l1Var.g;
        int i12 = l1Var.h;
        boolean z11 = l1Var.i;
        b2.p1 p1Var = l1Var.j;
        int i13 = l1Var.k;
        b2 b2Var = l1Var.l;
        b2.s0 s0Var = l1Var.m;
        float f7 = l1Var.n;
        float f10 = l1Var.o;
        int i14 = l1Var.p;
        b2.f fVar = l1Var.q;
        d2.c cVar = l1Var.r;
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
        b2.w1 w1Var = l1Var.F;
        b2.u1 u1Var2 = l1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (s1Var.a.b >= p1Var.o()) {
                    z10 = false;
                    yb.p(z10);
                    a2.s = new l1(z0Var, i11, s1Var, f1Var, f1Var2, i10, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
        yb.p(z10);
        a2.s = new l1(z0Var, i11, s1Var, f1Var, f1Var2, i10, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
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
