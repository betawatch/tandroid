package k3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import h5.a0;
import h5.d0;
import h5.y;
import j3.a2;
import j3.c1;
import j3.e1;
import j3.m2;
import j3.n;
import j3.n2;
import j3.o2;
import j3.q0;
import j3.q2;
import j3.t1;
import j3.v1;
import j3.w1;
import j3.x1;
import j3.y1;
import j3.z1;
import java.io.IOException;
import java.util.List;
import o3.m;
import o4.r;
import o4.u;
import o4.z;
import org.telegram.messenger.MediaDataController;
import s8.i0;
import s8.n0;
import s8.t;
import s8.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f implements y1, z, m {
    public final y a;
    public final m2 b;
    public final n2 c;
    public final a9.a d;
    public final SparseArray e;
    public h5.m f;
    public a2 h;
    public a0 n;
    public boolean r;

    public f(y yVar) {
        yVar.getClass();
        this.a = yVar;
        int i10 = d0.a;
        Looper myLooper = Looper.myLooper();
        this.f = new h5.m(myLooper == null ? Looper.getMainLooper() : myLooper, yVar, new c());
        m2 m2Var = new m2();
        this.b = m2Var;
        this.c = new n2();
        a9.a aVar = new a9.a();
        aVar.a = m2Var;
        t tVar = v.b;
        aVar.b = i0.e;
        aVar.c = n0.h;
        this.d = aVar;
        this.e = new SparseArray();
    }

    @Override // o4.z
    public final void a(int i10, o4.v vVar, o4.j jVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1001, new q0(o10, jVar, rVar, 24));
    }

    @Override // o3.m
    public final void b(int i10, o4.v vVar) {
        a o10 = o(i10, vVar);
        q(o10, 1023, new c(o10, 29));
    }

    @Override // o3.m
    public final void c(int i10, o4.v vVar, int i11) {
        a o10 = o(i10, vVar);
        q(o10, 1022, new c(o10, i11, 22));
    }

    @Override // o4.z
    public final void d(int i10, o4.v vVar, o4.j jVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1002, new e(o10, jVar, rVar));
    }

    @Override // o3.m
    public final void e(int i10, o4.v vVar, Exception exc) {
        a o10 = o(i10, vVar);
        q(o10, 1024, new c(o10, exc, 19));
    }

    @Override // o4.z
    public final void f(int i10, o4.v vVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1004, new c1.b(20, o10, rVar));
    }

    @Override // o4.z
    public final void g(int i10, o4.v vVar, o4.j jVar, r rVar, IOException iOException, boolean z4) {
        a o10 = o(i10, vVar);
        q(o10, 1003, new hg.f(o10, jVar, rVar, iOException, z4));
    }

    @Override // o4.z
    public final void h(int i10, o4.v vVar, o4.j jVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, MediaDataController.MAX_STYLE_RUNS_COUNT, new c(o10, jVar, rVar, 13));
    }

    @Override // o4.z
    public final void i(int i10, o4.v vVar, r rVar) {
        a o10 = o(i10, vVar);
        q(o10, 1005, new c(o10, rVar, 18));
    }

    @Override // o3.m
    public final void j(int i10, o4.v vVar) {
        a o10 = o(i10, vVar);
        q(o10, 1025, new e(o10, 0));
    }

    @Override // o3.m
    public final void k(int i10, o4.v vVar) {
        a o10 = o(i10, vVar);
        q(o10, 1027, new c(o10, 10));
    }

    public final a l() {
        return n((o4.v) this.d.d);
    }

    public final a m(o2 o2Var, int i10, o4.v vVar) {
        o4.v vVar2 = o2Var.p() ? null : vVar;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = o2Var.equals(this.h.z()) && i10 == this.h.x();
        long j10 = 0;
        if (vVar2 == null || !vVar2.a()) {
            if (z4) {
                j10 = this.h.r();
            } else if (!o2Var.p()) {
                j10 = d0.S(o2Var.m(i10, this.c, 0L).x);
            }
        } else if (z4 && this.h.w() == vVar2.b && this.h.o() == vVar2.c) {
            j10 = this.h.C();
        }
        return new a(elapsedRealtime, o2Var, i10, vVar2, j10, this.h.z(), this.h.x(), (o4.v) this.d.d, this.h.C(), this.h.h());
    }

    public final a n(o4.v vVar) {
        this.h.getClass();
        o2 o2Var = vVar == null ? null : (o2) ((n0) this.d.c).get(vVar);
        if (vVar != null && o2Var != null) {
            return m(o2Var, o2Var.g(vVar.a, this.b).c, vVar);
        }
        int x10 = this.h.x();
        o2 z4 = this.h.z();
        if (x10 >= z4.o()) {
            z4 = o2.a;
        }
        return m(z4, x10, null);
    }

    public final a o(int i10, o4.v vVar) {
        this.h.getClass();
        if (vVar != null) {
            return ((o2) ((n0) this.d.c).get(vVar)) != null ? n(vVar) : m(o2.a, i10, vVar);
        }
        o2 z4 = this.h.z();
        if (i10 >= z4.o()) {
            z4 = o2.a;
        }
        return m(z4, i10, null);
    }

    @Override // j3.y1
    public final void onAudioAttributesChanged(l3.d dVar) {
        a p10 = p();
        q(p10, 20, new e(p10, dVar, 3));
    }

    @Override // j3.y1
    public final void onAvailableCommandsChanged(w1 w1Var) {
        a l10 = l();
        q(l10, 13, new c(l10, w1Var, 0));
    }

    @Override // j3.y1
    public final void onCues(List list) {
        a l10 = l();
        q(l10, 27, new j3.z(l10, list));
    }

    @Override // j3.y1
    public final void onIsLoadingChanged(boolean z4) {
        a l10 = l();
        q(l10, 3, new c(l10, z4, 23));
    }

    @Override // j3.y1
    public final void onIsPlayingChanged(boolean z4) {
        a l10 = l();
        q(l10, 7, new e(l10, z4));
    }

    @Override // j3.y1
    public final void onMediaItemTransition(c1 c1Var, int i10) {
        a l10 = l();
        q(l10, 1, new q0(l10, c1Var, i10));
    }

    @Override // j3.y1
    public final void onMediaMetadataChanged(e1 e1Var) {
        a l10 = l();
        q(l10, 14, new q0(l10, e1Var, 22));
    }

    @Override // j3.y1
    public final void onMetadata(e4.c cVar) {
        a l10 = l();
        q(l10, 28, new c(l10, cVar, 25));
    }

    @Override // j3.y1
    public final void onPlayWhenReadyChanged(boolean z4, int i10) {
        a l10 = l();
        q(l10, 5, new q0(l10, z4, i10, 26));
    }

    @Override // j3.y1
    public final void onPlaybackParametersChanged(v1 v1Var) {
        a l10 = l();
        q(l10, 12, new q0(l10, v1Var, 23));
    }

    @Override // j3.y1
    public final void onPlaybackStateChanged(int i10) {
        a l10 = l();
        q(l10, 4, new c(l10, i10, 3));
    }

    @Override // j3.y1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l10 = l();
        q(l10, 6, new c(l10, i10, 15));
    }

    @Override // j3.y1
    public final void onPlayerError(t1 t1Var) {
        u uVar;
        a l10 = (!(t1Var instanceof n) || (uVar = ((n) t1Var).n) == null) ? l() : n(new o4.v(uVar));
        q(l10, 10, new hg.f(l10, t1Var, 17));
    }

    @Override // j3.y1
    public final void onPlayerErrorChanged(t1 t1Var) {
        u uVar;
        a l10 = (!(t1Var instanceof n) || (uVar = ((n) t1Var).n) == null) ? l() : n(new o4.v(uVar));
        q(l10, 10, new c(l10, t1Var, 14));
    }

    @Override // j3.y1
    public final void onPlayerStateChanged(boolean z4, int i10) {
        a l10 = l();
        q(l10, -1, new q0(l10, z4, i10, 25));
    }

    @Override // j3.y1
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override // j3.y1
    public final void onRepeatModeChanged(int i10) {
        a l10 = l();
        q(l10, 8, new c(l10, i10, 8));
    }

    @Override // j3.y1
    public final void onShuffleModeEnabledChanged(boolean z4) {
        a l10 = l();
        q(l10, 9, new q0(l10, z4));
    }

    @Override // j3.y1
    public final void onSkipSilenceEnabledChanged(boolean z4) {
        a p10 = p();
        q(p10, 23, new c(p10, z4, 27));
    }

    @Override // j3.y1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p10 = p();
        q(p10, 24, new q0(p10, i10, i11));
    }

    @Override // j3.y1
    public final void onTimelineChanged(o2 o2Var, int i10) {
        a2 a2Var = this.h;
        a2Var.getClass();
        a9.a aVar = this.d;
        aVar.d = a9.a.o(a2Var, (v) aVar.b, (o4.v) aVar.e, (m2) aVar.a);
        aVar.E(a2Var.z());
        a l10 = l();
        q(l10, 0, new c(l10, i10, 21));
    }

    @Override // j3.y1
    public final void onTracksChanged(q2 q2Var) {
        a l10 = l();
        q(l10, 2, new c(l10, q2Var, 11));
    }

    @Override // j3.y1
    public final void onVideoSizeChanged(i5.y yVar) {
        a p10 = p();
        q(p10, 25, new j3.a0(p10, yVar));
    }

    @Override // j3.y1
    public final void onVolumeChanged(float f10) {
        a p10 = p();
        q(p10, 22, new c(p10, f10));
    }

    public final a p() {
        return n((o4.v) this.d.f);
    }

    public final void q(a aVar, int i10, h5.j jVar) {
        this.e.put(i10, aVar);
        this.f.e(i10, jVar);
    }

    public final void r(a2 a2Var, Looper looper) {
        h5.a.i(this.h == null || ((v) this.d.b).isEmpty());
        a2Var.getClass();
        this.h = a2Var;
        this.n = this.a.a(looper, null);
        h5.m mVar = this.f;
        this.f = new h5.m(mVar.d, looper, mVar.a, new c1.b(19, this, a2Var), mVar.i);
    }

    @Override // j3.y1
    public final void onPositionDiscontinuity(z1 z1Var, z1 z1Var2, int i10) {
        if (i10 == 1) {
            this.r = false;
        }
        a2 a2Var = this.h;
        a2Var.getClass();
        a9.a aVar = this.d;
        aVar.d = a9.a.o(a2Var, (v) aVar.b, (o4.v) aVar.e, (m2) aVar.a);
        a l10 = l();
        q(l10, 11, new hg.m2(l10, i10, z1Var, z1Var2));
    }

    @Override // j3.y1
    public final void onCues(v4.c cVar) {
        a l10 = l();
        q(l10, 27, new q0(l10, cVar, 29));
    }

    @Override // j3.y1
    public final void onRenderedFirstFrame() {
    }

    @Override // j3.y1
    public final void onLoadingChanged(boolean z4) {
    }

    @Override // j3.y1
    public final void onEvents(a2 a2Var, x1 x1Var) {
    }
}
