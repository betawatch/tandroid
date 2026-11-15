package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.um0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g1 implements wi.l {
    public static g1 w;
    public wi.n a;
    public e1 b;
    public i9 c;
    public org.telegram.ui.Components.voip.u0 e;
    public hi.r3 f;
    public VideoSink h;
    public LaunchActivity r;
    public boolean s;
    public final f1 d = new f1(this);
    public final c1 n = new c1(this, 1);

    public static boolean e(e1 e1Var) {
        wi.n nVar;
        g1 g1Var = w;
        return (e1Var == null || g1Var == null || g1Var.b != e1Var || (nVar = g1Var.a) == null || !nVar.d() || g1Var.a.c == 0) ? false : true;
    }

    @Override // wi.l
    public final void A(View view) {
        hi.r3 r3Var;
        e1 e1Var = this.b;
        if (e1Var == null || view != (r3Var = this.f)) {
            return;
        }
        this.h = e1Var.P;
        this.d.a = r3Var.getSink();
        this.b.s(this.d);
        this.b.v(1.0f);
        g(true);
    }

    @Override // wi.l
    public final void C(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.u0 u0Var = this.e;
        this.e = null;
        this.d.a = null;
        e1 e1Var = this.b;
        if (e1Var != null && (videoSink = this.h) != null) {
            e1Var.s(videoSink);
        }
        this.h = null;
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View D() {
        return null;
    }

    @Override // wi.l
    public final boolean F() {
        e1 e1Var;
        i9 i9Var = this.c;
        return (i9Var == null || i9Var.H0 || (e1Var = this.b) == null || i9Var.B0 != e1Var) ? false : true;
    }

    @Override // wi.l
    public final int L() {
        int i7;
        hi.r3 r3Var;
        if (this.d.b > 0) {
            return this.d.b;
        }
        i9 i9Var = this.c;
        TextureViewRenderer textureViewRenderer = (i9Var == null || (r3Var = i9Var.E0) == null) ? null : r3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    @Override // wi.l
    public final boolean N() {
        e1 e1Var = this.b;
        return (e1Var == null || e1Var.x) ? false : true;
    }

    @Override // wi.l
    public final boolean P() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 R() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // wi.l
    public final void V() {
        VideoSink videoSink;
        this.s = false;
        e1 e1Var = this.b;
        i9 i9Var = this.c;
        boolean z10 = (this.f == null && this.h == null) ? false : true;
        this.a = null;
        this.b = null;
        this.d.a = null;
        org.telegram.ui.Components.voip.u0 u0Var = this.e;
        if (u0Var != null) {
            u0Var.a();
            this.e = null;
        }
        if (z10 && i9Var != null) {
            g(false);
            if (e1Var != null && (videoSink = this.h) != null) {
                e1Var.s(videoSink);
            }
            this.h = null;
            this.c = null;
            i9Var.u(false);
            return;
        }
        this.c = null;
        if (e1Var == null || e1Var.x) {
            return;
        }
        if (i9Var == null || i9Var.B0 != e1Var) {
            if (e1Var.n || e1Var == e1.X) {
                e1Var.s(null);
            } else {
                e1Var.e();
            }
        }
    }

    @Override // wi.l
    public final /* synthetic */ boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override // wi.l
    public final void Y(View view) {
        this.f = (hi.r3) view;
    }

    @Override // wi.l
    public final void Z() {
        LaunchActivity launchActivity;
        e1 e1Var = this.b;
        if (e1Var != null) {
            int i7 = e1Var.e;
            if (!e1Var.x) {
                if (i7 != m10.t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = np.s1(i7).P1().u(e1Var.c, e1Var.b);
                if (u10 == null) {
                    u10 = e1Var.a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                wi.n nVar = this.a;
                if (nVar != null) {
                    nVar.b();
                    return;
                }
                return;
            }
        }
        wi.n nVar2 = this.a;
        if (nVar2 != null) {
            nVar2.b();
        }
    }

    @Override // wi.l
    public final void a(View view) {
        VideoSink videoSink;
        g(false);
        if (view == this.f) {
            this.d.a = null;
            e1 e1Var = this.b;
            if (e1Var != null && (videoSink = this.h) != null) {
                e1Var.s(videoSink);
            }
            this.h = null;
            this.f = null;
        }
    }

    @Override // wi.l
    public final void b() {
        if (this.s) {
            return;
        }
        this.s = true;
        e1 e1Var = this.b;
        if (e1Var != null) {
            e1Var.v(0.0f);
        }
    }

    @Override // wi.l
    public final int b0() {
        int i7;
        hi.r3 r3Var;
        if (this.d.c > 0) {
            return this.d.c;
        }
        i9 i9Var = this.c;
        TextureViewRenderer textureViewRenderer = (i9Var == null || (r3Var = i9Var.E0) == null) ? null : r3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    @Override // wi.l
    public final float c0() {
        return 0.0f;
    }

    @Override // wi.l
    public final /* synthetic */ int d() {
        return 0;
    }

    @Override // wi.l
    public final void f() {
        if (this.s) {
            this.s = false;
            e1 e1Var = this.b;
            if (e1Var != null) {
                e1Var.v(1.0f);
            }
        }
    }

    public final void g(boolean z10) {
        w8 w8Var;
        i9 i9Var = this.c;
        if (i9Var == null || (w8Var = i9Var.s) == null) {
            return;
        }
        w8Var.setVisibility(z10 ? 8 : 0);
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    @Override // wi.l
    public final boolean h() {
        return !this.s;
    }

    @Override // wi.l
    public final void j(wi.o oVar) {
        if (this.b == null) {
            return;
        }
        org.telegram.ui.Components.voip.u0 u0Var = new org.telegram.ui.Components.voip.u0(oVar);
        this.e = u0Var;
        this.d.a = u0Var;
        e1 e1Var = this.b;
        this.h = e1Var.P;
        e1Var.s(this.d);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // wi.l
    public final boolean t0() {
        return false;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final View w(LaunchActivity launchActivity) {
        e1 e1Var = this.b;
        return new hi.r3(launchActivity, e1Var != null ? e1Var.e : m10.t0);
    }

    @Override // wi.l
    public final void x(View view) {
        if (view == this.f) {
            this.d.a = null;
            this.f = null;
        }
        hi.r3 r3Var = (hi.r3) view;
        TextureViewRenderer textureViewRenderer = r3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = r3Var.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        r3Var.r = false;
        r3Var.c(false, false);
    }

    @Override // wi.l
    public final /* synthetic */ void M(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void u0(int i7) {
    }

    @Override // wi.l
    public final /* synthetic */ void G() {
    }

    @Override // wi.l
    public final /* synthetic */ void j0(int i7, ArrayList arrayList) {
    }

    @Override // wi.l
    public final /* synthetic */ void o0(Canvas canvas, int i7, int i10) {
    }
}
