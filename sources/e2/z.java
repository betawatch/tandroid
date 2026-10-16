package e2;

import android.os.Handler;
import b2.a1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.g1;
import b2.p0;
import b2.p1;
import b2.s0;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.o60;
import ri.r0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class z implements e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // b2.e1
    public final /* synthetic */ void onAudioAttributesChanged(b2.f fVar) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onAvailableCommandsChanged(c1 c1Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onCues(d2.c cVar) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final void onEvents(g1 g1Var, d1 d1Var) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                e0Var.g.a();
                e0Var.h.a();
                e0Var.i.a();
                e0Var.j.a();
                break;
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                qi.q qVar = (qi.q) this.b;
                qi.h hVar = qVar.e;
                qi.f fVar = qVar.E;
                Handler handler = qVar.h;
                if (qVar.u != z10) {
                    qVar.u = z10;
                    handler.removeCallbacks(fVar);
                    if (z10) {
                        handler.post(fVar);
                    }
                    hVar.onPreviewPlaybackChanged(z10);
                    hVar.onStateChanged(qVar.e());
                    break;
                }
                break;
            default:
                r0 r0Var = (r0) this.b;
                if (r0Var.W == 5) {
                    r0Var.x(z10);
                    break;
                }
                break;
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onMediaItemTransition(p0 p0Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onMediaMetadataChanged(s0 s0Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onMetadata(u0 u0Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlaybackParametersChanged(a1 a1Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final void onPlaybackStateChanged(int i10) {
        i2.h0 h0Var;
        i2.h0 h0Var2;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                qi.q qVar = (qi.q) this.b;
                if (i10 == 4 && qVar.m == qi.o.e && (h0Var = qVar.A) != null) {
                    h0Var.Z0(5, qVar.r);
                    qVar.A.e();
                    break;
                }
                break;
            default:
                r0 r0Var = (r0) this.b;
                r0Var.m.b("preview playback state=" + i10);
                if (r0Var.W == 5 && i10 == 4 && (h0Var2 = r0Var.S) != null) {
                    h0Var2.Z0(5, r0Var.G);
                    r0Var.S.i();
                    break;
                }
                break;
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final void onPlayerError(z0 z0Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ((qi.q) this.b).g(z0Var);
                break;
            default:
                r0 r0Var = (r0) this.b;
                r0Var.m.b("preview player error: code=" + z0Var.a);
                r0Var.h(z0Var);
                break;
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlayerErrorChanged(z0 z0Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 1:
                i81 i81Var = (i81) this.b;
                if (!i81Var.H && i10 == 3) {
                    i81Var.H = true;
                    if (i81Var.G && i81Var.I) {
                        i81Var.C();
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onPlaylistMetadataChanged(s0 s0Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                r0 r0Var = (r0) this.b;
                if (r0Var.W == 5) {
                    o60.m((o60) r0Var.d.b);
                    break;
                }
                break;
        }
    }

    @Override // b2.e1
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onTimelineChanged(p1 p1Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onTrackSelectionParametersChanged(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onTracksChanged(w1 w1Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onVideoSizeChanged(b2 b2Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onVolumeChanged(float f7) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onCues(List list) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        int i11 = this.a;
    }

    private final /* synthetic */ void C0() {
    }

    private final /* synthetic */ void D0() {
    }

    private final /* synthetic */ void E0() {
    }

    private final /* synthetic */ void A(boolean z10) {
    }

    private final /* synthetic */ void A0(int i10) {
    }

    private final /* synthetic */ void B(boolean z10) {
    }

    private final /* synthetic */ void C(boolean z10) {
    }

    private final /* synthetic */ void D(boolean z10) {
    }

    private final /* synthetic */ void E(boolean z10) {
    }

    private final /* synthetic */ void F(boolean z10) {
    }

    private final /* synthetic */ void F0(int i10) {
    }

    private final /* synthetic */ void G(boolean z10) {
    }

    private final /* synthetic */ void G0(int i10) {
    }

    private final /* synthetic */ void H0(int i10) {
    }

    private final /* synthetic */ void I0(int i10) {
    }

    private final /* synthetic */ void J0(boolean z10) {
    }

    private final /* synthetic */ void K0(boolean z10) {
    }

    private final /* synthetic */ void L(s0 s0Var) {
    }

    private final /* synthetic */ void L0(boolean z10) {
    }

    private final /* synthetic */ void M(s0 s0Var) {
    }

    private final /* synthetic */ void M0(boolean z10) {
    }

    private final /* synthetic */ void N(s0 s0Var) {
    }

    private final /* synthetic */ void N0(boolean z10) {
    }

    private final /* synthetic */ void O(s0 s0Var) {
    }

    private final /* synthetic */ void O0(boolean z10) {
    }

    private final /* synthetic */ void P(u0 u0Var) {
    }

    private final /* synthetic */ void P0(boolean z10) {
    }

    private final /* synthetic */ void Q(u0 u0Var) {
    }

    private final /* synthetic */ void Q0(boolean z10) {
    }

    private final /* synthetic */ void R(u0 u0Var) {
    }

    private final /* synthetic */ void S(u0 u0Var) {
    }

    private final /* synthetic */ void X(a1 a1Var) {
    }

    private final /* synthetic */ void Y(a1 a1Var) {
    }

    private final /* synthetic */ void Z(a1 a1Var) {
    }

    private final /* synthetic */ void Z0(u1 u1Var) {
    }

    private final /* synthetic */ void a(b2.f fVar) {
    }

    private final /* synthetic */ void a0(a1 a1Var) {
    }

    private final /* synthetic */ void a1(u1 u1Var) {
    }

    private final /* synthetic */ void b(b2.f fVar) {
    }

    private final /* synthetic */ void b0(int i10) {
    }

    private final /* synthetic */ void b1(u1 u1Var) {
    }

    private final /* synthetic */ void c(b2.f fVar) {
    }

    private final /* synthetic */ void c0(int i10) {
    }

    private final /* synthetic */ void c1(u1 u1Var) {
    }

    private final /* synthetic */ void d(b2.f fVar) {
    }

    private final /* synthetic */ void d0(int i10) {
    }

    private final /* synthetic */ void d1(w1 w1Var) {
    }

    private final /* synthetic */ void e(int i10) {
    }

    private final /* synthetic */ void e0(int i10) {
    }

    private final /* synthetic */ void e1(w1 w1Var) {
    }

    private final /* synthetic */ void f(int i10) {
    }

    private final /* synthetic */ void f0(int i10) {
    }

    private final /* synthetic */ void f1(w1 w1Var) {
    }

    private final /* synthetic */ void g(int i10) {
    }

    private final /* synthetic */ void g0(int i10) {
    }

    private final /* synthetic */ void g1(w1 w1Var) {
    }

    private final /* synthetic */ void h(int i10) {
    }

    private final /* synthetic */ void h0(z0 z0Var) {
    }

    private final /* synthetic */ void h1(b2 b2Var) {
    }

    private final /* synthetic */ void i(c1 c1Var) {
    }

    private final /* synthetic */ void i0(z0 z0Var) {
    }

    private final /* synthetic */ void i1(b2 b2Var) {
    }

    private final /* synthetic */ void j(c1 c1Var) {
    }

    private final /* synthetic */ void j0(z0 z0Var) {
    }

    private final /* synthetic */ void j1(b2 b2Var) {
    }

    private final /* synthetic */ void k(c1 c1Var) {
    }

    private final /* synthetic */ void k0(z0 z0Var) {
    }

    private final /* synthetic */ void k1(b2 b2Var) {
    }

    private final /* synthetic */ void l(c1 c1Var) {
    }

    private final /* synthetic */ void l0(z0 z0Var) {
    }

    private final /* synthetic */ void l1(float f7) {
    }

    private final /* synthetic */ void m(d2.c cVar) {
    }

    private final /* synthetic */ void m0(z0 z0Var) {
    }

    private final /* synthetic */ void m1(float f7) {
    }

    private final /* synthetic */ void n(List list) {
    }

    private final /* synthetic */ void n1(float f7) {
    }

    private final /* synthetic */ void o(d2.c cVar) {
    }

    private final /* synthetic */ void o1(float f7) {
    }

    private final /* synthetic */ void p(List list) {
    }

    private final /* synthetic */ void q(d2.c cVar) {
    }

    private final /* synthetic */ void q0(s0 s0Var) {
    }

    private final /* synthetic */ void r(List list) {
    }

    private final /* synthetic */ void r0(s0 s0Var) {
    }

    private final /* synthetic */ void s(d2.c cVar) {
    }

    private final /* synthetic */ void s0(s0 s0Var) {
    }

    private final /* synthetic */ void t(List list) {
    }

    private final /* synthetic */ void t0(s0 s0Var) {
    }

    private final /* synthetic */ void u0(int i10) {
    }

    private final /* synthetic */ void w0(int i10) {
    }

    private final /* synthetic */ void x(boolean z10) {
    }

    private final /* synthetic */ void y(boolean z10) {
    }

    private final /* synthetic */ void y0(int i10) {
    }

    private final /* synthetic */ void z(boolean z10) {
    }

    private final /* synthetic */ void H(p0 p0Var, int i10) {
    }

    private final /* synthetic */ void I(p0 p0Var, int i10) {
    }

    private final /* synthetic */ void J(p0 p0Var, int i10) {
    }

    private final /* synthetic */ void K(p0 p0Var, int i10) {
    }

    private final /* synthetic */ void R0(int i10, int i11) {
    }

    private final /* synthetic */ void S0(int i10, int i11) {
    }

    private final /* synthetic */ void T(int i10, boolean z10) {
    }

    private final /* synthetic */ void T0(int i10, int i11) {
    }

    private final /* synthetic */ void U(int i10, boolean z10) {
    }

    private final /* synthetic */ void U0(int i10, int i11) {
    }

    private final /* synthetic */ void V(int i10, boolean z10) {
    }

    private final /* synthetic */ void V0(p1 p1Var, int i10) {
    }

    private final /* synthetic */ void W(int i10, boolean z10) {
    }

    private final /* synthetic */ void W0(p1 p1Var, int i10) {
    }

    private final /* synthetic */ void X0(p1 p1Var, int i10) {
    }

    private final /* synthetic */ void Y0(p1 p1Var, int i10) {
    }

    private final /* synthetic */ void n0(int i10, boolean z10) {
    }

    private final /* synthetic */ void o0(int i10, boolean z10) {
    }

    private final /* synthetic */ void p0(int i10, boolean z10) {
    }

    private final /* synthetic */ void u(g1 g1Var, d1 d1Var) {
    }

    private final /* synthetic */ void v(g1 g1Var, d1 d1Var) {
    }

    private final /* synthetic */ void w(g1 g1Var, d1 d1Var) {
    }

    private final /* synthetic */ void B0(f1 f1Var, f1 f1Var2, int i10) {
    }

    private final /* synthetic */ void v0(f1 f1Var, f1 f1Var2, int i10) {
    }

    private final /* synthetic */ void x0(f1 f1Var, f1 f1Var2, int i10) {
    }

    private final /* synthetic */ void z0(f1 f1Var, f1 f1Var2, int i10) {
    }
}
