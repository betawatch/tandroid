package i3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.firebase.messaging.m;
import d5.b0;
import d5.d0;
import d5.g0;
import d5.n;
import h3.a2;
import h3.b2;
import h3.c2;
import h3.e0;
import h3.f1;
import h3.h1;
import h3.p2;
import h3.q2;
import h3.r2;
import h3.s2;
import h3.u2;
import h3.v1;
import h3.x1;
import h3.y;
import h3.y1;
import h3.z1;
import j4.a0;
import j4.c0;
import j4.h0;
import j4.p;
import java.io.IOException;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import p8.l0;
import p8.q0;
import p8.x;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements a2, h0, l3.h {
    public final b0 a;
    public final p2 b;
    public final r2 c;
    public final m d;
    public final SparseArray e;
    public n f;
    public c2 h;
    public d0 n;
    public boolean r;

    public f(b0 b0Var) {
        b0Var.getClass();
        this.a = b0Var;
        int i10 = g0.a;
        Looper myLooper = Looper.myLooper();
        this.f = new n(myLooper == null ? Looper.getMainLooper() : myLooper, b0Var, new q2(26));
        p2 p2Var = new p2();
        this.b = p2Var;
        this.c = new r2();
        m mVar = new m();
        mVar.a = p2Var;
        x xVar = z.b;
        mVar.b = l0.e;
        mVar.c = q0.h;
        this.d = mVar;
        this.e = new SparseArray();
    }

    public final a a() {
        return i((c0) this.d.d);
    }

    @Override // j4.h0
    public final void b(int i10, c0 c0Var, j4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1004, new ag.h0(26, j10, xVar));
    }

    @Override // j4.h0
    public final void c(int i10, c0 c0Var, j4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1005, new d(j10, xVar, 8));
    }

    @Override // j4.h0
    public final void d(int i10, c0 c0Var, p pVar, j4.x xVar, IOException iOException, boolean z10) {
        a j10 = j(i10, c0Var);
        l(j10, 1003, new h3.x(j10, pVar, xVar, iOException, z10));
    }

    public final a e(s2 s2Var, int i10, c0 c0Var) {
        c0 c0Var2 = s2Var.p() ? null : c0Var;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = s2Var.equals(this.h.A()) && i10 == this.h.x();
        long j10 = 0;
        if (c0Var2 == null || !c0Var2.a()) {
            if (z10) {
                j10 = this.h.q();
            } else if (!s2Var.p()) {
                j10 = g0.S(s2Var.m(i10, this.c, 0L).x);
            }
        } else if (z10 && this.h.w() == c0Var2.b && this.h.m() == c0Var2.c) {
            j10 = this.h.D();
        }
        return new a(elapsedRealtime, s2Var, i10, c0Var2, j10, this.h.A(), this.h.x(), (c0) this.d.d, this.h.D(), this.h.d());
    }

    @Override // j4.h0
    public final void f(int i10, c0 c0Var, p pVar, j4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1002, new d(j10, pVar, xVar, 18));
    }

    @Override // j4.h0
    public final void g(int i10, c0 c0Var, p pVar, j4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, MediaDataController.MAX_STYLE_RUNS_COUNT, new d(j10, pVar, xVar, 2));
    }

    @Override // j4.h0
    public final void h(int i10, c0 c0Var, p pVar, j4.x xVar) {
        a j10 = j(i10, c0Var);
        l(j10, 1001, new q2(j10, pVar, xVar, 15));
    }

    public final a i(c0 c0Var) {
        this.h.getClass();
        s2 s2Var = c0Var == null ? null : (s2) ((q0) this.d.c).get(c0Var);
        if (c0Var != null && s2Var != null) {
            return e(s2Var, s2Var.g(c0Var.a, this.b).c, c0Var);
        }
        int x8 = this.h.x();
        s2 A = this.h.A();
        if (x8 >= A.o()) {
            A = s2.a;
        }
        return e(A, x8, null);
    }

    public final a j(int i10, c0 c0Var) {
        this.h.getClass();
        if (c0Var != null) {
            return ((s2) ((q0) this.d.c).get(c0Var)) != null ? i(c0Var) : e(s2.a, i10, c0Var);
        }
        s2 A = this.h.A();
        if (i10 >= A.o()) {
            A = s2.a;
        }
        return e(A, i10, null);
    }

    public final a k() {
        return i((c0) this.d.f);
    }

    public final void l(a aVar, int i10, d5.k kVar) {
        this.e.put(i10, aVar);
        this.f.e(i10, kVar);
    }

    public final void m(c2 c2Var, Looper looper) {
        d5.a.i(this.h == null || ((z) this.d.b).isEmpty());
        c2Var.getClass();
        this.h = c2Var;
        this.n = this.a.a(looper, null);
        n nVar = this.f;
        this.f = new n(nVar.d, looper, nVar.a, new ag.h0(25, this, c2Var));
    }

    @Override // h3.a2
    public final void onAudioAttributesChanged(j3.e eVar) {
        a k10 = k();
        l(k10, 20, new d(k10, eVar, 21));
    }

    @Override // h3.a2
    public final void onAvailableCommandsChanged(y1 y1Var) {
        a a2 = a();
        l(a2, 13, new q2(a2, y1Var, 21));
    }

    @Override // h3.a2
    public final void onCues(List list) {
        a a2 = a();
        l(a2, 27, new h3.d0(a2, list));
    }

    @Override // h3.a2
    public final void onDeviceInfoChanged(h3.m mVar) {
        a a2 = a();
        l(a2, 29, new d(a2, mVar, 13));
    }

    @Override // h3.a2
    public final void onDeviceVolumeChanged(int i10, boolean z10) {
        a a2 = a();
        l(a2, 30, new d(a2, i10, z10));
    }

    @Override // h3.a2
    public final void onIsLoadingChanged(boolean z10) {
        a a2 = a();
        l(a2, 3, new d(a2, z10, 12));
    }

    @Override // h3.a2
    public final void onIsPlayingChanged(boolean z10) {
        a a2 = a();
        l(a2, 7, new d(a2, z10, 20));
    }

    @Override // h3.a2
    public final void onMediaItemTransition(f1 f1Var, int i10) {
        a a2 = a();
        l(a2, 1, new q2(a2, f1Var, i10));
    }

    @Override // h3.a2
    public final void onMediaMetadataChanged(h1 h1Var) {
        a a2 = a();
        l(a2, 14, new q2(a2, h1Var, 13));
    }

    @Override // h3.a2
    public final void onMetadata(z3.c cVar) {
        a a2 = a();
        l(a2, 28, new d(a2, cVar, 15));
    }

    @Override // h3.a2
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a a2 = a();
        l(a2, 5, new q2(a2, z10, i10, 17));
    }

    @Override // h3.a2
    public final void onPlaybackParametersChanged(x1 x1Var) {
        a a2 = a();
        l(a2, 12, new q2(a2, x1Var, 14));
    }

    @Override // h3.a2
    public final void onPlaybackStateChanged(int i10) {
        a a2 = a();
        l(a2, 4, new q2(a2, i10, 24, (byte) 0));
    }

    @Override // h3.a2
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a a2 = a();
        l(a2, 6, new d(a2, i10, 5));
    }

    @Override // h3.a2
    public final void onPlayerError(v1 v1Var) {
        a0 a0Var;
        a a2 = (!(v1Var instanceof h3.n) || (a0Var = ((h3.n) v1Var).n) == null) ? a() : i(new c0(a0Var));
        l(a2, 10, new h3.x(a2, v1Var, 15));
    }

    @Override // h3.a2
    public final void onPlayerErrorChanged(v1 v1Var) {
        a0 a0Var;
        a a2 = (!(v1Var instanceof h3.n) || (a0Var = ((h3.n) v1Var).n) == null) ? a() : i(new c0(a0Var));
        l(a2, 10, new d(a2, v1Var, 4));
    }

    @Override // h3.a2
    public final void onPlayerStateChanged(boolean z10, int i10) {
        a a2 = a();
        l(a2, -1, new q2(a2, z10, i10, 16));
    }

    @Override // h3.a2
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override // h3.a2
    public final void onRepeatModeChanged(int i10) {
        a a2 = a();
        l(a2, 8, new q2(a2, i10, 29, (byte) 0));
    }

    @Override // h3.a2
    public final void onSeekProcessed() {
        a a2 = a();
        l(a2, -1, new c(a2, 1));
    }

    @Override // h3.a2
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a a2 = a();
        l(a2, 9, new q2(a2, z10));
    }

    @Override // h3.a2
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a k10 = k();
        l(k10, 23, new d(k10, z10, 19));
    }

    @Override // h3.a2
    public final void onSurfaceSizeChanged(int i10, int i11) {
        a k10 = k();
        l(k10, 24, new q2(k10, i10, i11));
    }

    @Override // h3.a2
    public final void onTimelineChanged(s2 s2Var, int i10) {
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.o(c2Var, (z) mVar.b, (c0) mVar.e, (p2) mVar.a);
        mVar.D(c2Var.A());
        a a2 = a();
        l(a2, 0, new d(a2, i10, 10));
    }

    @Override // h3.a2
    public final void onTracksChanged(u2 u2Var) {
        a a2 = a();
        l(a2, 2, new d(a2, u2Var, 1));
    }

    @Override // h3.a2
    public final void onVideoSizeChanged(e5.x xVar) {
        a k10 = k();
        l(k10, 25, new e0(k10, xVar));
    }

    @Override // h3.a2
    public final void onVolumeChanged(float f10) {
        a k10 = k();
        l(k10, 22, new d(k10, f10));
    }

    @Override // h3.a2
    public final void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i10) {
        if (i10 == 1) {
            this.r = false;
        }
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.o(c2Var, (z) mVar.b, (c0) mVar.e, (p2) mVar.a);
        a a2 = a();
        l(a2, 11, new y(a2, i10, b2Var, b2Var2));
    }

    @Override // h3.a2
    public final void onCues(r4.d dVar) {
        a a2 = a();
        l(a2, 27, new q2(a2, dVar, 20));
    }

    @Override // h3.a2
    public final void onRenderedFirstFrame() {
    }

    @Override // h3.a2
    public final void onLoadingChanged(boolean z10) {
    }

    @Override // h3.a2
    public final void onEvents(c2 c2Var, z1 z1Var) {
    }
}
