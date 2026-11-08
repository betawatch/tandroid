package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import bi.ab;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i1 implements ti.m {
    public static i1 w;
    public ti.o a;
    public g1 b;
    public p9 c;
    public org.telegram.ui.Components.voip.q0 e;
    public fi.s3 f;
    public VideoSink h;
    public LaunchActivity r;
    public boolean s;
    public final h1 d = new h1(this);
    public final ab n = new ab(this, 17);

    public static boolean a(g1 g1Var) {
        ti.o oVar;
        i1 i1Var = w;
        return (g1Var == null || i1Var == null || i1Var.b != g1Var || (oVar = i1Var.a) == null || !oVar.d() || i1Var.a.c == 0) ? false : true;
    }

    @Override // ti.m
    public final void B(View view) {
        fi.s3 s3Var;
        g1 g1Var = this.b;
        if (g1Var == null || view != (s3Var = this.f)) {
            return;
        }
        this.h = g1Var.O;
        this.d.a = s3Var.getSink();
        this.b.s(this.d);
        this.b.v(1.0f);
        d(true);
    }

    @Override // ti.m
    public final void C(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.q0 q0Var = this.e;
        this.e = null;
        this.d.a = null;
        g1 g1Var = this.b;
        if (g1Var != null && (videoSink = this.h) != null) {
            g1Var.s(videoSink);
        }
        this.h = null;
        if (q0Var != null) {
            q0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // ti.m
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // ti.m
    public final boolean E() {
        g1 g1Var;
        p9 p9Var = this.c;
        return (p9Var == null || p9Var.G0 || (g1Var = this.b) == null || p9Var.A0 != g1Var) ? false : true;
    }

    @Override // ti.m
    public final int I() {
        int i7;
        fi.s3 s3Var;
        if (this.d.b > 0) {
            return this.d.b;
        }
        p9 p9Var = this.c;
        TextureViewRenderer textureViewRenderer = (p9Var == null || (s3Var = p9Var.D0) == null) ? null : s3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    @Override // ti.m
    public final boolean K() {
        g1 g1Var = this.b;
        return (g1Var == null || g1Var.x) ? false : true;
    }

    @Override // ti.m
    public final boolean L() {
        return true;
    }

    @Override // ti.m
    public final /* synthetic */ e2.c1 M() {
        return null;
    }

    @Override // ti.m
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // ti.m
    public final void Q() {
        VideoSink videoSink;
        this.s = false;
        g1 g1Var = this.b;
        p9 p9Var = this.c;
        boolean z9 = (this.f == null && this.h == null) ? false : true;
        this.a = null;
        this.b = null;
        this.d.a = null;
        org.telegram.ui.Components.voip.q0 q0Var = this.e;
        if (q0Var != null) {
            q0Var.a();
            this.e = null;
        }
        if (z9 && p9Var != null) {
            d(false);
            if (g1Var != null && (videoSink = this.h) != null) {
                g1Var.s(videoSink);
            }
            this.h = null;
            this.c = null;
            p9Var.u(false);
            return;
        }
        this.c = null;
        if (g1Var == null || g1Var.x) {
            return;
        }
        if (p9Var == null || p9Var.A0 != g1Var) {
            if (g1Var.n || g1Var == g1.W) {
                g1Var.s(null);
            } else {
                g1Var.e();
            }
        }
    }

    @Override // ti.m
    public final /* synthetic */ boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override // ti.m
    public final void S(View view) {
        this.f = (fi.s3) view;
    }

    @Override // ti.m
    public final void T() {
        LaunchActivity launchActivity;
        g1 g1Var = this.b;
        if (g1Var != null) {
            int i7 = g1Var.e;
            if (!g1Var.x) {
                if (i7 != p10.s0 && (launchActivity = LaunchActivity.G1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = qp.s1(i7).P1().u(g1Var.c, g1Var.b);
                if (u10 == null) {
                    u10 = g1Var.a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                ti.o oVar = this.a;
                if (oVar != null) {
                    oVar.b();
                    return;
                }
                return;
            }
        }
        ti.o oVar2 = this.a;
        if (oVar2 != null) {
            oVar2.b();
        }
    }

    @Override // ti.m
    public final int U() {
        int i7;
        fi.s3 s3Var;
        if (this.d.c > 0) {
            return this.d.c;
        }
        p9 p9Var = this.c;
        TextureViewRenderer textureViewRenderer = (p9Var == null || (s3Var = p9Var.D0) == null) ? null : s3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    @Override // ti.m
    public final float V() {
        return 0.0f;
    }

    @Override // ti.m
    public final void b() {
        if (this.s) {
            return;
        }
        this.s = true;
        g1 g1Var = this.b;
        if (g1Var != null) {
            g1Var.v(0.0f);
        }
    }

    public final void d(boolean z9) {
        d9 d9Var;
        p9 p9Var = this.c;
        if (p9Var == null || (d9Var = p9Var.s) == null) {
            return;
        }
        d9Var.setVisibility(z9 ? 8 : 0);
    }

    @Override // ti.m
    public final void e(View view) {
        VideoSink videoSink;
        d(false);
        if (view == this.f) {
            this.d.a = null;
            g1 g1Var = this.b;
            if (g1Var != null && (videoSink = this.h) != null) {
                g1Var.s(videoSink);
            }
            this.h = null;
            this.f = null;
        }
    }

    @Override // ti.m
    public final boolean e0() {
        return false;
    }

    @Override // ti.m
    public final void f() {
        if (this.s) {
            this.s = false;
            g1 g1Var = this.b;
            if (g1Var != null) {
                g1Var.v(1.0f);
            }
        }
    }

    @Override // ti.m
    public final void g(ti.p pVar) {
        if (this.b == null) {
            return;
        }
        org.telegram.ui.Components.voip.q0 q0Var = new org.telegram.ui.Components.voip.q0(pVar);
        this.e = q0Var;
        this.d.a = q0Var;
        g1 g1Var = this.b;
        this.h = g1Var.O;
        g1Var.s(this.d);
    }

    @Override // ti.m
    public final long getDuration() {
        return 0L;
    }

    @Override // ti.m
    public final boolean h() {
        return !this.s;
    }

    @Override // ti.m
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // ti.m
    public final long l() {
        return 0L;
    }

    @Override // ti.m
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // ti.m
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // ti.m
    public final void v(Rect rect) {
        rect.setEmpty();
    }

    @Override // ti.m
    public final View x(LaunchActivity launchActivity) {
        g1 g1Var = this.b;
        return new fi.s3(launchActivity, g1Var != null ? g1Var.e : p10.s0);
    }

    @Override // ti.m
    public final void y(View view) {
        if (view == this.f) {
            this.d.a = null;
            this.f = null;
        }
        fi.s3 s3Var = (fi.s3) view;
        TextureViewRenderer textureViewRenderer = s3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = s3Var.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        s3Var.r = false;
        s3Var.c(false, false);
    }

    @Override // ti.m
    public final /* synthetic */ void J(float f10) {
    }

    @Override // ti.m
    public final void c(long j3) {
    }

    @Override // ti.m
    public final /* synthetic */ void f0(int i7) {
    }

    @Override // ti.m
    public final /* synthetic */ void F() {
    }

    @Override // ti.m
    public final /* synthetic */ void Z(int i7, ArrayList arrayList) {
    }

    @Override // ti.m
    public final /* synthetic */ void c0(Canvas canvas, int i7, int i10) {
    }
}
