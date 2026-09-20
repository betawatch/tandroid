package ki;

import b2.a1;
import b2.b1;
import b2.k1;
import b2.p0;
import b2.q1;
import b2.s1;
import b2.u0;
import b2.v0;
import b2.x0;
import b2.x1;
import b2.y0;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.z50;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class e0 implements z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioAttributesChanged(b2.e eVar) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onAudioSessionIdChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onAvailableCommandsChanged(x0 x0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(d2.d dVar) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onEvents(b1 b1Var, y0 y0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                if (o0Var.U == 5) {
                    o0Var.w(z10);
                    break;
                }
                break;
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onLoadingChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onMediaItemTransition(b2.k0 k0Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onMediaMetadataChanged(b2.n0 n0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onMetadata(p0 p0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackParametersChanged(v0 v0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final void onPlaybackStateChanged(int i10) {
        i2.e0 e0Var;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                o0Var.l.b("preview playback state=" + i10);
                if (o0Var.U == 5 && i10 == 4 && (e0Var = o0Var.Q) != null) {
                    e0Var.W0(5, o0Var.F);
                    o0Var.Q.i();
                    break;
                }
                break;
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final void onPlayerError(u0 u0Var) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                o0Var.l.b("preview player error: code=" + u0Var.a);
                o0Var.g(u0Var);
                break;
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlayerErrorChanged(u0 u0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 0:
                break;
            default:
                t71 t71Var = (t71) this.b;
                if (!t71Var.H && i10 == 3) {
                    t71Var.H = true;
                    if (t71Var.G && t71Var.I) {
                        t71Var.C();
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onPlaylistMetadataChanged(b2.n0 n0Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onPositionDiscontinuity(int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                if (o0Var.U == 5) {
                    z50.k((z50) o0Var.c.a);
                    break;
                }
                break;
        }
    }

    @Override // b2.z0
    public final /* synthetic */ void onRepeatModeChanged(int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onTimelineChanged(k1 k1Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onTrackSelectionParametersChanged(q1 q1Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onTracksChanged(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onVideoSizeChanged(x1 x1Var) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onVolumeChanged(float f7) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onCues(List list) {
        int i10 = this.a;
    }

    @Override // b2.z0
    public final /* synthetic */ void onPositionDiscontinuity(a1 a1Var, a1 a1Var2, int i10) {
        int i11 = this.a;
    }

    private final /* synthetic */ void A(v0 v0Var) {
    }

    private final /* synthetic */ void B(int i10) {
    }

    private final /* synthetic */ void C(int i10) {
    }

    private final /* synthetic */ void D(int i10) {
    }

    private final /* synthetic */ void E(u0 u0Var) {
    }

    private final /* synthetic */ void F(u0 u0Var) {
    }

    private final /* synthetic */ void G(u0 u0Var) {
    }

    private final /* synthetic */ void I(b2.n0 n0Var) {
    }

    private final /* synthetic */ void J(b2.n0 n0Var) {
    }

    private final /* synthetic */ void K(int i10) {
    }

    private final /* synthetic */ void M(int i10) {
    }

    private final /* synthetic */ void P(int i10) {
    }

    private final /* synthetic */ void Q(int i10) {
    }

    private final /* synthetic */ void R(boolean z10) {
    }

    private final /* synthetic */ void S(boolean z10) {
    }

    private final /* synthetic */ void T(boolean z10) {
    }

    private final /* synthetic */ void U(boolean z10) {
    }

    private final /* synthetic */ void Z(q1 q1Var) {
    }

    private final /* synthetic */ void a(b2.e eVar) {
    }

    private final /* synthetic */ void a0(q1 q1Var) {
    }

    private final /* synthetic */ void b(b2.e eVar) {
    }

    private final /* synthetic */ void b0(s1 s1Var) {
    }

    private final /* synthetic */ void c(int i10) {
    }

    private final /* synthetic */ void c0(s1 s1Var) {
    }

    private final /* synthetic */ void d(int i10) {
    }

    private final /* synthetic */ void d0(x1 x1Var) {
    }

    private final /* synthetic */ void e(x0 x0Var) {
    }

    private final /* synthetic */ void e0(x1 x1Var) {
    }

    private final /* synthetic */ void f(x0 x0Var) {
    }

    private final /* synthetic */ void f0(float f7) {
    }

    private final /* synthetic */ void g(d2.d dVar) {
    }

    private final /* synthetic */ void g0(float f7) {
    }

    private final /* synthetic */ void h(List list) {
    }

    private final /* synthetic */ void i(d2.d dVar) {
    }

    private final /* synthetic */ void j(List list) {
    }

    private final /* synthetic */ void m(boolean z10) {
    }

    private final /* synthetic */ void n(boolean z10) {
    }

    private final /* synthetic */ void o(boolean z10) {
    }

    private final /* synthetic */ void p(boolean z10) {
    }

    private final /* synthetic */ void q(boolean z10) {
    }

    private final /* synthetic */ void t(b2.n0 n0Var) {
    }

    private final /* synthetic */ void u(b2.n0 n0Var) {
    }

    private final /* synthetic */ void v(p0 p0Var) {
    }

    private final /* synthetic */ void w(p0 p0Var) {
    }

    private final /* synthetic */ void z(v0 v0Var) {
    }

    private final /* synthetic */ void O() {
    }

    private final /* synthetic */ void H(int i10, boolean z10) {
    }

    private final /* synthetic */ void V(int i10, int i11) {
    }

    private final /* synthetic */ void W(int i10, int i11) {
    }

    private final /* synthetic */ void X(k1 k1Var, int i10) {
    }

    private final /* synthetic */ void Y(k1 k1Var, int i10) {
    }

    private final /* synthetic */ void k(b1 b1Var, y0 y0Var) {
    }

    private final /* synthetic */ void l(b1 b1Var, y0 y0Var) {
    }

    private final /* synthetic */ void r(b2.k0 k0Var, int i10) {
    }

    private final /* synthetic */ void s(b2.k0 k0Var, int i10) {
    }

    private final /* synthetic */ void x(int i10, boolean z10) {
    }

    private final /* synthetic */ void y(int i10, boolean z10) {
    }

    private final /* synthetic */ void L(a1 a1Var, a1 a1Var2, int i10) {
    }

    private final /* synthetic */ void N(a1 a1Var, a1 a1Var2, int i10) {
    }
}
