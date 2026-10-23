package m4;

import android.os.RemoteException;
import b2.a2;
import b2.v1;
import java.lang.ref.WeakReference;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class d0 implements b2.d1 {
    public final WeakReference a;
    public final WeakReference b;

    public d0(f0 f0Var, m1 m1Var) {
        this.a = new WeakReference(f0Var);
        this.b = new WeakReference(m1Var);
    }

    public final f0 a() {
        return (f0) this.a.get();
    }

    @Override // b2.d1
    public final void onAudioAttributesChanged(b2.f fVar) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onAudioSessionIdChanged(int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i12 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i13 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i14 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i13, z11, a2Var, o1Var, i14, r0Var, f7, f10, fVar, i10, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i13, z11, a2Var, o1Var, i14, r0Var, f7, f10, fVar, i10, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onAvailableCommandsChanged(b2.b1 b1Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.f(b1Var);
    }

    @Override // b2.d1
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // b2.d1
    public final void onIsLoadingChanged(boolean z10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        u6.p(o1Var.p() || r1Var.a.b < o1Var.o());
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z10, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        a2.t();
    }

    @Override // b2.d1
    public final void onIsPlayingChanged(boolean z10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        u6.p(o1Var.p() || r1Var.a.b < o1Var.o());
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z10, z14, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
        try {
            p0 p0Var = (p0) a2.h.i.e;
            p0Var.O(p0Var.g.t);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        a2.t();
    }

    @Override // b2.d1
    public final void onMediaItemTransition(b2.o0 o0Var, int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                    a2.c.a(true, true);
                    a2.h.i.l(o0Var);
                    return;
                }
            }
            a2.h.i.l(o0Var);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onMediaMetadataChanged(b2.r0 r0Var) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var2 = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
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
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var2, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var2, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        f0 a2 = a();
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

    @Override // b2.d1
    public final void onPlaybackParametersChanged(b2.z0 z0Var) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onPlaybackStateChanged(int i10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        m1 m1Var = (m1) this.b.get();
        if (m1Var == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 W = m1Var.W();
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i12 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i13 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i14 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i15 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i16 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i17 = k1Var.w;
        boolean z13 = k1Var.y;
        int i18 = k1Var.z;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        boolean z14 = i10 == 3 && z12 && i18 == 0;
        u6.p(o1Var.p() || r1Var.a.b < o1Var.o());
        a2.s = new k1(W, i11, r1Var, e1Var, e1Var2, i12, z0Var, i13, z10, a2Var, o1Var, i14, r0Var, f7, f10, fVar, i15, cVar, pVar, i16, z11, z12, i17, i18, i10, z14, z13, r0Var2, j10, j11, j12, v1Var, t1Var);
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

    @Override // b2.d1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        f0 a2 = a();
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

    @Override // b2.d1
    public final void onPlayerError(b2.y0 y0Var) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
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
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onPlaylistMetadataChanged(b2.r0 r0Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i16 = k1Var.w;
        boolean z13 = k1Var.x;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        u6.p(o1Var.p() || r1Var.a.b < o1Var.o());
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z11, z12, i16, i17, i18, z13, z14, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.n(r0Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // b2.d1
    public final void onRenderedFirstFrame() {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        qi.e eVar = a2.g.b;
        e9.n0 p5 = eVar.p();
        for (int i10 = 0; i10 < p5.size(); i10++) {
            v vVar = (v) p5.get(i10);
            eVar.r(vVar);
            a2.c(vVar, new k2.f0(10));
        }
    }

    @Override // b2.d1
    public final void onRepeatModeChanged(int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i12 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i10, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i10, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.t1 t1Var;
        boolean z11;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z11 = false;
                    u6.p(z11);
                    a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.d(new eh.c(i10, i11, 3));
    }

    @Override // b2.d1
    public final void onTimelineChanged(b2.o1 o1Var, int i10) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        m1 m1Var = (m1) this.b.get();
        if (m1Var == null) {
            return;
        }
        a2.s = a2.s.c(o1Var, m1Var.R0(), i10);
        a2.c.a(false, true);
        try {
            a2.h.i.q(o1Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.d1
    public final void onTrackSelectionParametersChanged(b2.t1 t1Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.d(t1Var);
        a2.c.a(true, true);
        a2.d(new k2.f0(t1Var, 11));
    }

    @Override // b2.d1
    public final void onTracksChanged(v1 v1Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        a2.s = a2.s.a(v1Var);
        a2.c.a(true, false);
        a2.d(new k2.f0(v1Var, 9));
    }

    @Override // b2.d1
    public final void onVideoSizeChanged(a2 a2Var) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i16 = k1Var.w;
        boolean z13 = k1Var.x;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        u6.p(o1Var.p() || r1Var.a.b < o1Var.o());
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z11, z12, i16, i17, i18, z13, z14, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.d1
    public final void onVolumeChanged(float f7) {
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z10 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f10 = k1Var.n;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z11 = k1Var.u;
        boolean z12 = k1Var.v;
        int i16 = k1Var.w;
        boolean z13 = k1Var.x;
        boolean z14 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        if (f7 != 0.0f) {
            f10 = f7;
        }
        u6.p(o1Var.p() || r1Var.a.b < o1Var.o());
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z11, z12, i16, i17, i18, z13, z14, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
        try {
            a2.h.i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // b2.d1
    public final void onCues(d2.c cVar) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i10 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        if (o1Var.p()) {
            t1Var = t1Var2;
        } else {
            t1Var = t1Var2;
            if (r1Var.a.b >= o1Var.o()) {
                z10 = false;
                u6.p(z10);
                a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                a2.c.a(true, true);
            }
        }
        z10 = true;
        u6.p(z10);
        a2.s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final void onPositionDiscontinuity(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.b.get()) == null) {
            return;
        }
        k1 k1Var = a2.s;
        b2.y0 y0Var = k1Var.a;
        int i11 = k1Var.b;
        r1 r1Var = k1Var.c;
        b2.z0 z0Var = k1Var.g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.i;
        b2.o1 o1Var = k1Var.j;
        int i13 = k1Var.k;
        a2 a2Var = k1Var.l;
        b2.r0 r0Var = k1Var.m;
        float f7 = k1Var.n;
        float f10 = k1Var.o;
        int i14 = k1Var.p;
        b2.f fVar = k1Var.q;
        d2.c cVar = k1Var.r;
        b2.p pVar = k1Var.s;
        int i15 = k1Var.t;
        boolean z12 = k1Var.u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.w;
        boolean z14 = k1Var.x;
        boolean z15 = k1Var.y;
        int i17 = k1Var.z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.a.b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i10, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
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
        a2.s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i10, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.c.a(true, true);
    }

    @Override // b2.d1
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onMetadata(b2.t0 t0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlayerErrorChanged(b2.y0 y0Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onEvents(b2.f1 f1Var, b2.c1 c1Var) {
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }
}
