package e2;

import android.os.Handler;
import b2.a1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.g1;
import b2.p1;
import b2.s0;
import b2.u1;
import b2.w1;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.t81;
import vi.u0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ui.o oVar = (ui.o) this.b;
                ui.f fVar = oVar.f;
                ui.d dVar = oVar.F;
                Handler handler = oVar.i;
                if (oVar.v != z10) {
                    oVar.v = z10;
                    handler.removeCallbacks(dVar);
                    if (z10) {
                        handler.post(dVar);
                    }
                    fVar.onPreviewPlaybackChanged(z10);
                    fVar.onStateChanged(oVar.e());
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) this.b;
                if (u0Var.Z == 5) {
                    u0Var.y(z10);
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
    public final /* synthetic */ void onMediaItemTransition(b2.p0 p0Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onMediaMetadataChanged(s0 s0Var) {
        int i10 = this.a;
    }

    @Override // b2.e1
    public final /* synthetic */ void onMetadata(b2.u0 u0Var) {
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
        i2.j0 j0Var;
        i2.j0 j0Var2;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ui.o oVar = (ui.o) this.b;
                if (i10 == 4 && oVar.n == ui.m.e && (j0Var = oVar.B) != null) {
                    j0Var.Z0(5, oVar.s);
                    oVar.B.e();
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) this.b;
                u0Var.m.b("preview playback state=" + i10);
                if (u0Var.Z == 5 && i10 == 4 && (j0Var2 = u0Var.V) != null) {
                    j0Var2.Z0(5, u0Var.J);
                    u0Var.V.i();
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
                ((ui.o) this.b).g(z0Var);
                break;
            default:
                u0 u0Var = (u0) this.b;
                u0Var.m.b("preview player error: code=" + z0Var.a);
                u0Var.h(z0Var);
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
                t81 t81Var = (t81) this.b;
                if (!t81Var.H && i10 == 3) {
                    t81Var.H = true;
                    if (t81Var.G && t81Var.I) {
                        t81Var.C();
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
                u0 u0Var = (u0) this.b;
                if (u0Var.Z == 5) {
                    o60.n((o60) u0Var.d.b);
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

    private final /* synthetic */ void P(b2.u0 u0Var) {
    }

    private final /* synthetic */ void P0(boolean z10) {
    }

    private final /* synthetic */ void Q(b2.u0 u0Var) {
    }

    private final /* synthetic */ void Q0(boolean z10) {
    }

    private final /* synthetic */ void R(b2.u0 u0Var) {
    }

    private final /* synthetic */ void S(b2.u0 u0Var) {
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

    private final /* synthetic */ void H(b2.p0 p0Var, int i10) {
    }

    private final /* synthetic */ void I(b2.p0 p0Var, int i10) {
    }

    private final /* synthetic */ void J(b2.p0 p0Var, int i10) {
    }

    private final /* synthetic */ void K(b2.p0 p0Var, int i10) {
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
