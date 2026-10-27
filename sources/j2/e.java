package j2;

import a8.yb;
import aa.m0;
import ai.f0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.a1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.g1;
import b2.m1;
import b2.o1;
import b2.p0;
import b2.p1;
import b2.s0;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.z0;
import e2.g0;
import e2.i0;
import e2.n0;
import e2.o;
import e2.r;
import f9.s1;
import f9.x1;
import i2.a0;
import i2.j0;
import i2.m;
import java.io.IOException;
import java.util.List;
import n2.k;
import org.telegram.messenger.MediaDataController;
import u2.c0;
import u2.k0;
import u2.u;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e implements e1, k0, k {
    public final g0 a;
    public final m1 b;
    public final o1 c;
    public final m0 d;
    public final SparseArray e;
    public r f;
    public g1 h;
    public i0 n;
    public boolean r;

    public e(g0 g0Var) {
        g0Var.getClass();
        this.a = g0Var;
        String str = n0.a;
        Looper myLooper = Looper.myLooper();
        this.f = new r((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        m1 m1Var = new m1();
        this.b = m1Var;
        this.c = new o1();
        m0 m0Var = new m0();
        m0Var.a = m1Var;
        f9.g0 g0Var2 = f9.i0.b;
        m0Var.b = s1.e;
        m0Var.c = x1.h;
        this.d = m0Var;
        this.e = new SparseArray();
    }

    @Override // n2.k
    public final void a(int i10, u2.g0 g0Var, int i11) {
        a o10 = o(i10, g0Var);
        q(o10, 1022, new ig.g(o10, i11, 29, (char) 0));
    }

    @Override // n2.k
    public final void b(int i10, u2.g0 g0Var, Exception exc) {
        a o10 = o(i10, g0Var);
        q(o10, 1024, new d(o10, exc, 0));
    }

    @Override // u2.k0
    public final void c(int i10, u2.g0 g0Var, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1005, new d(o10, c0Var, 8));
    }

    @Override // u2.k0
    public final void d(int i10, u2.g0 g0Var, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1004, new f0(19, o10, c0Var));
    }

    @Override // u2.k0
    public final void e(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1001, new d(o10, uVar, c0Var, 1));
    }

    @Override // u2.k0
    public final void f(int i10, u2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a o10 = o(i10, g0Var);
        q(o10, 1003, new e1.c(o10, uVar, c0Var, iOException, z10));
    }

    @Override // n2.k
    public final void g(int i10, u2.g0 g0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1027, new d(o10, 9));
    }

    @Override // u2.k0
    public final void h(int i10, u2.g0 g0Var, u uVar, c0 c0Var, int i11) {
        a o10 = o(i10, g0Var);
        q(o10, MediaDataController.MAX_STYLE_RUNS_COUNT, new ig.g(o10, uVar, c0Var, i11));
    }

    @Override // n2.k
    public final void i(int i10, u2.g0 g0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1025, new d(o10, 17));
    }

    @Override // u2.k0
    public final void j(int i10, u2.g0 g0Var, u uVar, c0 c0Var) {
        a o10 = o(i10, g0Var);
        q(o10, 1002, new ig.g(o10, uVar, c0Var));
    }

    @Override // n2.k
    public final void k(int i10, u2.g0 g0Var, pa.d dVar) {
        a o10 = o(i10, g0Var);
        q(o10, 1023, new d(o10, dVar, 16));
    }

    public final a l() {
        return n((u2.g0) this.d.d);
    }

    public final a m(p1 p1Var, int i10, u2.g0 g0Var) {
        u2.g0 g0Var2 = p1Var.p() ? null : g0Var;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = p1Var.equals(this.h.y0()) && i10 == this.h.n0();
        long j10 = 0;
        if (g0Var2 == null || !g0Var2.b()) {
            if (z10) {
                j10 = this.h.a0();
            } else if (!p1Var.p()) {
                j10 = n0.h0(p1Var.m(i10, this.c, 0L).l);
            }
        } else if (z10 && this.h.m0() == g0Var2.b && this.h.N() == g0Var2.c) {
            j10 = this.h.M0();
        }
        return new a(elapsedRealtime, p1Var, i10, g0Var2, j10, this.h.y0(), this.h.n0(), (u2.g0) this.d.d, this.h.M0(), this.h.q());
    }

    public final a n(u2.g0 g0Var) {
        this.h.getClass();
        p1 p1Var = g0Var == null ? null : (p1) ((x1) this.d.c).get(g0Var);
        if (g0Var != null && p1Var != null) {
            return m(p1Var, p1Var.g(g0Var.a, this.b).c, g0Var);
        }
        int n02 = this.h.n0();
        p1 y02 = this.h.y0();
        if (n02 >= y02.o()) {
            y02 = p1.a;
        }
        return m(y02, n02, null);
    }

    public final a o(int i10, u2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            return ((p1) ((x1) this.d.c).get(g0Var)) != null ? n(g0Var) : m(p1.a, i10, g0Var);
        }
        p1 y02 = this.h.y0();
        if (i10 >= y02.o()) {
            y02 = p1.a;
        }
        return m(y02, i10, null);
    }

    @Override // b2.e1
    public final void onAudioAttributesChanged(b2.f fVar) {
        a p10 = p();
        q(p10, 20, new ig.g(p10, fVar, 5));
    }

    @Override // b2.e1
    public final void onAudioSessionIdChanged(int i10) {
        a p10 = p();
        q(p10, 21, new d(p10, i10, 4));
    }

    @Override // b2.e1
    public final void onAvailableCommandsChanged(c1 c1Var) {
        a l4 = l();
        q(l4, 13, new d(l4, c1Var, 22));
    }

    @Override // b2.e1
    public final void onCues(List list) {
        a l4 = l();
        q(l4, 27, new a0(l4, list));
    }

    @Override // b2.e1
    public final void onIsLoadingChanged(boolean z10) {
        a l4 = l();
        q(l4, 3, new d(l4, z10, 14));
    }

    @Override // b2.e1
    public final void onIsPlayingChanged(boolean z10) {
        a l4 = l();
        q(l4, 7, new ig.g(l4, z10));
    }

    @Override // b2.e1
    public final void onMediaItemTransition(p0 p0Var, int i10) {
        a l4 = l();
        q(l4, 1, new d(l4, p0Var, i10));
    }

    @Override // b2.e1
    public final void onMediaMetadataChanged(s0 s0Var) {
        a l4 = l();
        q(l4, 14, new d(l4, s0Var, 5));
    }

    @Override // b2.e1
    public final void onMetadata(u0 u0Var) {
        a l4 = l();
        q(l4, 28, new ig.g(l4, u0Var, 6));
    }

    @Override // b2.e1
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, 5, new ig.g(l4, z10, i10, 12));
    }

    @Override // b2.e1
    public final void onPlaybackParametersChanged(a1 a1Var) {
        a l4 = l();
        q(l4, 12, new ig.g(l4, a1Var, 1));
    }

    @Override // b2.e1
    public final void onPlaybackStateChanged(int i10) {
        a l4 = l();
        q(l4, 4, new ig.g(l4, i10, 15, (char) 0));
    }

    @Override // b2.e1
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a l4 = l();
        q(l4, 6, new ig.g(l4, i10, 9, (char) 0));
    }

    @Override // b2.e1
    public final void onPlayerError(z0 z0Var) {
        u2.g0 g0Var;
        a l4 = (!(z0Var instanceof m) || (g0Var = ((m) z0Var).E) == null) ? l() : n(g0Var);
        q(l4, 10, new e1.c(l4, z0Var, 24));
    }

    @Override // b2.e1
    public final void onPlayerErrorChanged(z0 z0Var) {
        u2.g0 g0Var;
        a l4 = (!(z0Var instanceof m) || (g0Var = ((m) z0Var).E) == null) ? l() : n(g0Var);
        q(l4, 10, new ig.g(l4, z0Var, 11));
    }

    @Override // b2.e1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a l4 = l();
        q(l4, -1, new ig.g(l4, z10, i10, 4));
    }

    @Override // b2.e1
    public final void onPlaylistMetadataChanged(s0 s0Var) {
        a l4 = l();
        q(l4, 15, new d(l4, s0Var, 18));
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override // b2.e1
    public final void onRepeatModeChanged(int i10) {
        a l4 = l();
        q(l4, 8, new ig.g(l4, i10, 17, (char) 0));
    }

    @Override // b2.e1
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a l4 = l();
        q(l4, 9, new d(l4, z10, 19));
    }

    @Override // b2.e1
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a p10 = p();
        q(p10, 23, new d(p10, z10, 12));
    }

    @Override // b2.e1
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a p10 = p();
        q(p10, 24, new ig.g(p10, i10, i11));
    }

    @Override // b2.e1
    public final void onTimelineChanged(p1 p1Var, int i10) {
        g1 g1Var = this.h;
        g1Var.getClass();
        m0 m0Var = this.d;
        m0Var.d = m0.n(g1Var, (f9.i0) m0Var.b, (u2.g0) m0Var.e, (m1) m0Var.a);
        m0Var.D(g1Var.y0());
        a l4 = l();
        q(l4, 0, new d(l4, i10, 23));
    }

    @Override // b2.e1
    public final void onTrackSelectionParametersChanged(u1 u1Var) {
        a l4 = l();
        q(l4, 19, new d(l4, u1Var, 11));
    }

    @Override // b2.e1
    public final void onTracksChanged(w1 w1Var) {
        a l4 = l();
        q(l4, 2, new ig.g(l4, w1Var, 16));
    }

    @Override // b2.e1
    public final void onVideoSizeChanged(b2 b2Var) {
        a p10 = p();
        q(p10, 25, new i2.c0(p10, b2Var));
    }

    @Override // b2.e1
    public final void onVolumeChanged(float f7) {
        a p10 = p();
        q(p10, 22, new ig.g(p10, f7));
    }

    public final a p() {
        return n((u2.g0) this.d.f);
    }

    public final void q(a aVar, int i10, o oVar) {
        this.e.put(i10, aVar);
        this.f.e(i10, oVar);
    }

    public final void r(j0 j0Var, Looper looper) {
        yb.p(this.h == null || ((f9.i0) this.d.b).isEmpty());
        j0Var.getClass();
        this.h = j0Var;
        this.n = this.a.a(looper, null);
        r rVar = this.f;
        f0 f0Var = new f0(18, this, j0Var);
        rVar.getClass();
        g0 g0Var = this.a;
        yb.p(g0Var != null);
        this.f = new r(rVar.d, looper, looper.getThread(), g0Var, f0Var, rVar.i);
    }

    @Override // b2.e1
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        if (i10 == 1) {
            this.r = false;
        }
        g1 g1Var = this.h;
        g1Var.getClass();
        m0 m0Var = this.d;
        m0Var.d = m0.n(g1Var, (f9.i0) m0Var.b, (u2.g0) m0Var.e, (m1) m0Var.a);
        a l4 = l();
        q(l4, 11, new i2.r(l4, i10, f1Var, f1Var2));
    }

    @Override // b2.e1
    public final void onCues(d2.c cVar) {
        a l4 = l();
        q(l4, 27, new ig.g(l4, cVar, 24));
    }

    @Override // b2.e1
    public final void onRenderedFirstFrame() {
    }

    @Override // b2.e1
    public final void onLoadingChanged(boolean z10) {
    }

    @Override // b2.e1
    public final void onEvents(g1 g1Var, d1 d1Var) {
    }
}
