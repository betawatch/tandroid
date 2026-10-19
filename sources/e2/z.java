package e2;

import android.os.Handler;
import b2.a2;
import b2.b1;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.o1;
import b2.r0;
import b2.t0;
import b2.t1;
import b2.v1;
import b2.y0;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.l60;
import si.s0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class z implements d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // b2.d1
    public final /* synthetic */ void onAudioAttributesChanged(b2.f fVar) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onAvailableCommandsChanged(b1 b1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onCues(d2.c cVar) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void onEvents(f1 f1Var, c1 c1Var) {
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

    @Override // b2.d1
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ri.p pVar = (ri.p) this.b;
                ri.g gVar = pVar.e;
                ri.e eVar = pVar.E;
                Handler handler = pVar.h;
                if (pVar.u != z10) {
                    pVar.u = z10;
                    handler.removeCallbacks(eVar);
                    if (z10) {
                        handler.post(eVar);
                    }
                    gVar.onPreviewPlaybackChanged(z10);
                    gVar.onStateChanged(pVar.e());
                    break;
                }
                break;
            default:
                s0 s0Var = (s0) this.b;
                if (s0Var.W == 5) {
                    s0Var.x(z10);
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onMediaItemTransition(b2.o0 o0Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onMediaMetadataChanged(r0 r0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onMetadata(t0 t0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlaybackParametersChanged(z0 z0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void onPlaybackStateChanged(int i10) {
        i2.i0 i0Var;
        i2.i0 i0Var2;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ri.p pVar = (ri.p) this.b;
                if (i10 == 4 && pVar.m == ri.n.e && (i0Var = pVar.A) != null) {
                    i0Var.Z0(5, pVar.r);
                    pVar.A.e();
                    break;
                }
                break;
            default:
                s0 s0Var = (s0) this.b;
                s0Var.m.b("preview playback state=" + i10);
                if (s0Var.W == 5 && i10 == 4 && (i0Var2 = s0Var.S) != null) {
                    i0Var2.Z0(5, s0Var.G);
                    s0Var.S.i();
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void onPlayerError(y0 y0Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ((ri.p) this.b).g(y0Var);
                break;
            default:
                s0 s0Var = (s0) this.b;
                s0Var.m.b("preview player error: code=" + y0Var.a);
                s0Var.h(y0Var);
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlayerErrorChanged(y0 y0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 1:
                b81 b81Var = (b81) this.b;
                if (!b81Var.H && i10 == 3) {
                    b81Var.H = true;
                    if (b81Var.G && b81Var.I) {
                        b81Var.C();
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onPlaylistMetadataChanged(r0 r0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                s0 s0Var = (s0) this.b;
                if (s0Var.W == 5) {
                    l60.m((l60) s0Var.d.b);
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onTimelineChanged(o1 o1Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onTrackSelectionParametersChanged(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onTracksChanged(v1 v1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onVideoSizeChanged(a2 a2Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onVolumeChanged(float f7) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onCues(List list) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void onPositionDiscontinuity(e1 e1Var, e1 e1Var2, int i10) {
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

    private final /* synthetic */ void L(r0 r0Var) {
    }

    private final /* synthetic */ void L0(boolean z10) {
    }

    private final /* synthetic */ void M(r0 r0Var) {
    }

    private final /* synthetic */ void M0(boolean z10) {
    }

    private final /* synthetic */ void N(r0 r0Var) {
    }

    private final /* synthetic */ void N0(boolean z10) {
    }

    private final /* synthetic */ void O(r0 r0Var) {
    }

    private final /* synthetic */ void O0(boolean z10) {
    }

    private final /* synthetic */ void P(t0 t0Var) {
    }

    private final /* synthetic */ void P0(boolean z10) {
    }

    private final /* synthetic */ void Q(t0 t0Var) {
    }

    private final /* synthetic */ void Q0(boolean z10) {
    }

    private final /* synthetic */ void R(t0 t0Var) {
    }

    private final /* synthetic */ void S(t0 t0Var) {
    }

    private final /* synthetic */ void X(z0 z0Var) {
    }

    private final /* synthetic */ void Y(z0 z0Var) {
    }

    private final /* synthetic */ void Z(z0 z0Var) {
    }

    private final /* synthetic */ void Z0(t1 t1Var) {
    }

    private final /* synthetic */ void a(b2.f fVar) {
    }

    private final /* synthetic */ void a0(z0 z0Var) {
    }

    private final /* synthetic */ void a1(t1 t1Var) {
    }

    private final /* synthetic */ void b(b2.f fVar) {
    }

    private final /* synthetic */ void b0(int i10) {
    }

    private final /* synthetic */ void b1(t1 t1Var) {
    }

    private final /* synthetic */ void c(b2.f fVar) {
    }

    private final /* synthetic */ void c0(int i10) {
    }

    private final /* synthetic */ void c1(t1 t1Var) {
    }

    private final /* synthetic */ void d(b2.f fVar) {
    }

    private final /* synthetic */ void d0(int i10) {
    }

    private final /* synthetic */ void d1(v1 v1Var) {
    }

    private final /* synthetic */ void e(int i10) {
    }

    private final /* synthetic */ void e0(int i10) {
    }

    private final /* synthetic */ void e1(v1 v1Var) {
    }

    private final /* synthetic */ void f(int i10) {
    }

    private final /* synthetic */ void f0(int i10) {
    }

    private final /* synthetic */ void f1(v1 v1Var) {
    }

    private final /* synthetic */ void g(int i10) {
    }

    private final /* synthetic */ void g0(int i10) {
    }

    private final /* synthetic */ void g1(v1 v1Var) {
    }

    private final /* synthetic */ void h(int i10) {
    }

    private final /* synthetic */ void h0(y0 y0Var) {
    }

    private final /* synthetic */ void h1(a2 a2Var) {
    }

    private final /* synthetic */ void i(b1 b1Var) {
    }

    private final /* synthetic */ void i0(y0 y0Var) {
    }

    private final /* synthetic */ void i1(a2 a2Var) {
    }

    private final /* synthetic */ void j(b1 b1Var) {
    }

    private final /* synthetic */ void j0(y0 y0Var) {
    }

    private final /* synthetic */ void j1(a2 a2Var) {
    }

    private final /* synthetic */ void k(b1 b1Var) {
    }

    private final /* synthetic */ void k0(y0 y0Var) {
    }

    private final /* synthetic */ void k1(a2 a2Var) {
    }

    private final /* synthetic */ void l(b1 b1Var) {
    }

    private final /* synthetic */ void l0(y0 y0Var) {
    }

    private final /* synthetic */ void l1(float f7) {
    }

    private final /* synthetic */ void m(d2.c cVar) {
    }

    private final /* synthetic */ void m0(y0 y0Var) {
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

    private final /* synthetic */ void q0(r0 r0Var) {
    }

    private final /* synthetic */ void r(List list) {
    }

    private final /* synthetic */ void r0(r0 r0Var) {
    }

    private final /* synthetic */ void s(d2.c cVar) {
    }

    private final /* synthetic */ void s0(r0 r0Var) {
    }

    private final /* synthetic */ void t(List list) {
    }

    private final /* synthetic */ void t0(r0 r0Var) {
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

    private final /* synthetic */ void H(b2.o0 o0Var, int i10) {
    }

    private final /* synthetic */ void I(b2.o0 o0Var, int i10) {
    }

    private final /* synthetic */ void J(b2.o0 o0Var, int i10) {
    }

    private final /* synthetic */ void K(b2.o0 o0Var, int i10) {
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

    private final /* synthetic */ void V0(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void W(int i10, boolean z10) {
    }

    private final /* synthetic */ void W0(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void X0(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void Y0(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void n0(int i10, boolean z10) {
    }

    private final /* synthetic */ void o0(int i10, boolean z10) {
    }

    private final /* synthetic */ void p0(int i10, boolean z10) {
    }

    private final /* synthetic */ void u(f1 f1Var, c1 c1Var) {
    }

    private final /* synthetic */ void v(f1 f1Var, c1 c1Var) {
    }

    private final /* synthetic */ void w(f1 f1Var, c1 c1Var) {
    }

    private final /* synthetic */ void B0(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final /* synthetic */ void v0(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final /* synthetic */ void x0(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final /* synthetic */ void z0(e1 e1Var, e1 e1Var2, int i10) {
    }
}
