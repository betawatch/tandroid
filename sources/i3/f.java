package i3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.firebase.messaging.m;
import d5.a0;
import d5.c0;
import d5.f0;
import d5.n;
import gh.i3;
import h3.a2;
import h3.b2;
import h3.c2;
import h3.f1;
import h3.h1;
import h3.p2;
import h3.q2;
import h3.r2;
import h3.t2;
import h3.v1;
import h3.x1;
import h3.y1;
import h3.z1;
import j4.b0;
import j4.d0;
import j4.i0;
import j4.q;
import j4.y;
import java.io.IOException;
import java.util.List;
import o8.l0;
import o8.q0;
import o8.x;
import o8.z;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements a2, i0, l3.g {
    public final a0 a;
    public final p2 b;
    public final q2 c;
    public final m d;
    public final SparseArray e;
    public n f;
    public c2 h;
    public c0 n;
    public boolean r;

    public f(a0 a0Var) {
        a0Var.getClass();
        this.a = a0Var;
        int i9 = f0.a;
        Looper myLooper = Looper.myLooper();
        this.f = new n(myLooper == null ? Looper.getMainLooper() : myLooper, a0Var, new d());
        p2 p2Var = new p2();
        this.b = p2Var;
        this.c = new q2();
        m mVar = new m();
        mVar.a = p2Var;
        x xVar = z.b;
        mVar.b = l0.e;
        mVar.c = q0.h;
        this.d = mVar;
        this.e = new SparseArray();
    }

    public final a a() {
        return i((d0) this.d.d);
    }

    @Override // j4.i0
    public final void b(int i9, d0 d0Var, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1004, new b5.d(26, j10, yVar));
    }

    @Override // j4.i0
    public final void c(int i9, d0 d0Var, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1005, new d(j10, yVar, 15));
    }

    @Override // j4.i0
    public final void d(int i9, d0 d0Var, q qVar, y yVar, IOException iOException, boolean z10) {
        a j10 = j(i9, d0Var);
        l(j10, 1003, new i3(j10, qVar, yVar, iOException, z10));
    }

    @Override // j4.i0
    public final void e(int i9, d0 d0Var, q qVar, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1002, new d(j10, qVar, yVar, 25));
    }

    @Override // j4.i0
    public final void f(int i9, d0 d0Var, q qVar, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, MediaDataController.MAX_STYLE_RUNS_COUNT, new d(j10, qVar, yVar, 9));
    }

    @Override // j4.i0
    public final void g(int i9, d0 d0Var, q qVar, y yVar) {
        a j10 = j(i9, d0Var);
        l(j10, 1001, new h9.a(j10, qVar, yVar, 22));
    }

    public final a h(r2 r2Var, int i9, d0 d0Var) {
        d0 d0Var2 = r2Var.p() ? null : d0Var;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = r2Var.equals(this.h.A()) && i9 == this.h.x();
        long j10 = 0;
        if (d0Var2 == null || !d0Var2.a()) {
            if (z10) {
                j10 = this.h.q();
            } else if (!r2Var.p()) {
                j10 = f0.S(r2Var.m(i9, this.c, 0L).x);
            }
        } else if (z10 && this.h.w() == d0Var2.b && this.h.m() == d0Var2.c) {
            j10 = this.h.D();
        }
        return new a(elapsedRealtime, r2Var, i9, d0Var2, j10, this.h.A(), this.h.x(), (d0) this.d.d, this.h.D(), this.h.d());
    }

    public final a i(d0 d0Var) {
        this.h.getClass();
        r2 r2Var = d0Var == null ? null : (r2) ((q0) this.d.c).get(d0Var);
        if (d0Var != null && r2Var != null) {
            return h(r2Var, r2Var.g(d0Var.a, this.b).c, d0Var);
        }
        int x10 = this.h.x();
        r2 A = this.h.A();
        if (x10 >= A.o()) {
            A = r2.a;
        }
        return h(A, x10, null);
    }

    public final a j(int i9, d0 d0Var) {
        this.h.getClass();
        if (d0Var != null) {
            return ((r2) ((q0) this.d.c).get(d0Var)) != null ? i(d0Var) : h(r2.a, i9, d0Var);
        }
        r2 A = this.h.A();
        if (i9 >= A.o()) {
            A = r2.a;
        }
        return h(A, i9, null);
    }

    public final a k() {
        return i((d0) this.d.f);
    }

    public final void l(a aVar, int i9, d5.k kVar) {
        this.e.put(i9, aVar);
        this.f.e(i9, kVar);
    }

    public final void m(c2 c2Var, Looper looper) {
        d5.a.i(this.h == null || ((z) this.d.b).isEmpty());
        c2Var.getClass();
        this.h = c2Var;
        this.n = this.a.a(looper, null);
        n nVar = this.f;
        this.f = new n(nVar.d, looper, nVar.a, new b5.d(25, this, c2Var));
    }

    @Override // h3.a2
    public final void onAudioAttributesChanged(j3.e eVar) {
        a k10 = k();
        l(k10, 20, new d(k10, eVar, 28));
    }

    @Override // h3.a2
    public final void onAvailableCommandsChanged(y1 y1Var) {
        a a2 = a();
        l(a2, 13, new h9.a(a2, y1Var, 28));
    }

    @Override // h3.a2
    public final void onCues(List list) {
        a a2 = a();
        l(a2, 27, new h3.c0(a2, list));
    }

    @Override // h3.a2
    public final void onDeviceInfoChanged(h3.m mVar) {
        a a2 = a();
        l(a2, 29, new d(a2, mVar, 20));
    }

    @Override // h3.a2
    public final void onDeviceVolumeChanged(int i9, boolean z10) {
        a a2 = a();
        l(a2, 30, new d(a2, i9, z10));
    }

    @Override // h3.a2
    public final void onIsLoadingChanged(boolean z10) {
        a a2 = a();
        l(a2, 3, new d(a2, z10, 19));
    }

    @Override // h3.a2
    public final void onIsPlayingChanged(boolean z10) {
        a a2 = a();
        l(a2, 7, new d(a2, z10, 27));
    }

    @Override // h3.a2
    public final void onMediaItemTransition(f1 f1Var, int i9) {
        a a2 = a();
        l(a2, 1, new h9.a(a2, f1Var, i9));
    }

    @Override // h3.a2
    public final void onMediaMetadataChanged(h1 h1Var) {
        a a2 = a();
        l(a2, 14, new h9.a(a2, h1Var, 20));
    }

    @Override // h3.a2
    public final void onMetadata(z3.c cVar) {
        a a2 = a();
        l(a2, 28, new d(a2, cVar, 22));
    }

    @Override // h3.a2
    public final void onPlayWhenReadyChanged(boolean z10, int i9) {
        a a2 = a();
        l(a2, 5, new h9.a(a2, z10, i9, 24));
    }

    @Override // h3.a2
    public final void onPlaybackParametersChanged(x1 x1Var) {
        a a2 = a();
        l(a2, 12, new h9.a(a2, x1Var, 21));
    }

    @Override // h3.a2
    public final void onPlaybackStateChanged(int i9) {
        a a2 = a();
        l(a2, 4, new d(a2, i9, 1));
    }

    @Override // h3.a2
    public final void onPlaybackSuppressionReasonChanged(int i9) {
        a a2 = a();
        l(a2, 6, new d(a2, i9, 12));
    }

    @Override // h3.a2
    public final void onPlayerError(v1 v1Var) {
        b0 b0Var;
        a a2 = (!(v1Var instanceof h3.n) || (b0Var = ((h3.n) v1Var).n) == null) ? a() : i(new d0(b0Var));
        l(a2, 10, new i3(a2, v1Var, 16));
    }

    @Override // h3.a2
    public final void onPlayerErrorChanged(v1 v1Var) {
        b0 b0Var;
        a a2 = (!(v1Var instanceof h3.n) || (b0Var = ((h3.n) v1Var).n) == null) ? a() : i(new d0(b0Var));
        l(a2, 10, new d(a2, v1Var, 11));
    }

    @Override // h3.a2
    public final void onPlayerStateChanged(boolean z10, int i9) {
        a a2 = a();
        l(a2, -1, new h9.a(a2, z10, i9, 23));
    }

    @Override // h3.a2
    public final void onPositionDiscontinuity(int i9) {
    }

    @Override // h3.a2
    public final void onRepeatModeChanged(int i9) {
        a a2 = a();
        l(a2, 8, new d(a2, i9, 6));
    }

    @Override // h3.a2
    public final void onSeekProcessed() {
        a a2 = a();
        l(a2, -1, new c(a2, 1));
    }

    @Override // h3.a2
    public final void onShuffleModeEnabledChanged(boolean z10) {
        a a2 = a();
        l(a2, 9, new h9.a(a2, z10));
    }

    @Override // h3.a2
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        a k10 = k();
        l(k10, 23, new d(k10, z10, 26));
    }

    @Override // h3.a2
    public final void onSurfaceSizeChanged(int i9, int i10) {
        a k10 = k();
        l(k10, 24, new h9.a(k10, i9, i10));
    }

    @Override // h3.a2
    public final void onTimelineChanged(r2 r2Var, int i9) {
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.n(c2Var, (z) mVar.b, (d0) mVar.e, (p2) mVar.a);
        mVar.D(c2Var.A());
        a a2 = a();
        l(a2, 0, new d(a2, i9, 17));
    }

    @Override // h3.a2
    public final void onTracksChanged(t2 t2Var) {
        a a2 = a();
        l(a2, 2, new d(a2, t2Var, 8));
    }

    @Override // h3.a2
    public final void onVideoSizeChanged(e5.z zVar) {
        a k10 = k();
        l(k10, 25, new h3.d0(k10, zVar));
    }

    @Override // h3.a2
    public final void onVolumeChanged(float f10) {
        a k10 = k();
        l(k10, 22, new d(k10, f10));
    }

    @Override // h3.a2
    public final void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i9) {
        if (i9 == 1) {
            this.r = false;
        }
        c2 c2Var = this.h;
        c2Var.getClass();
        m mVar = this.d;
        mVar.d = m.n(c2Var, (z) mVar.b, (d0) mVar.e, (p2) mVar.a);
        a a2 = a();
        l(a2, 11, new h3.x(a2, i9, b2Var, b2Var2));
    }

    @Override // h3.a2
    public final void onCues(r4.c cVar) {
        a a2 = a();
        l(a2, 27, new h9.a(a2, cVar, 27));
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
