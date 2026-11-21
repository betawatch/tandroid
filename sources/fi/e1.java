package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e1 implements wi.l {
    public static e1 w;
    public wi.n a;
    public c1 b;
    public f9 c;
    public org.telegram.ui.Components.voip.t0 e;
    public hi.q3 f;
    public VideoSink h;
    public LaunchActivity r;
    public boolean s;
    public final d1 d = new d1(this);
    public final f2.a n = new f2.a(this, 5);

    public static boolean a(c1 c1Var) {
        wi.n nVar;
        e1 e1Var = w;
        return (c1Var == null || e1Var == null || e1Var.b != c1Var || (nVar = e1Var.a) == null || !nVar.d() || e1Var.a.c == 0) ? false : true;
    }

    @Override // wi.l
    public final void B(View view) {
        hi.q3 q3Var;
        c1 c1Var = this.b;
        if (c1Var == null || view != (q3Var = this.f)) {
            return;
        }
        this.h = c1Var.P;
        this.d.a = q3Var.getSink();
        this.b.s(this.d);
        this.b.v(1.0f);
        g(true);
    }

    @Override // wi.l
    public final void D(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.t0 t0Var = this.e;
        this.e = null;
        this.d.a = null;
        c1 c1Var = this.b;
        if (c1Var != null && (videoSink = this.h) != null) {
            c1Var.s(videoSink);
        }
        this.h = null;
        if (t0Var != null) {
            t0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // wi.l
    public final /* synthetic */ View E() {
        return null;
    }

    @Override // wi.l
    public final boolean G() {
        c1 c1Var;
        f9 f9Var = this.c;
        return (f9Var == null || f9Var.H0 || (c1Var = this.b) == null || f9Var.B0 != c1Var) ? false : true;
    }

    @Override // wi.l
    public final int J() {
        int i7;
        hi.q3 q3Var;
        if (this.d.b > 0) {
            return this.d.b;
        }
        f9 f9Var = this.c;
        TextureViewRenderer textureViewRenderer = (f9Var == null || (q3Var = f9Var.E0) == null) ? null : q3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    @Override // wi.l
    public final boolean N() {
        c1 c1Var = this.b;
        return (c1Var == null || c1Var.x) ? false : true;
    }

    @Override // wi.l
    public final boolean O() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 Q() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // wi.l
    public final void U() {
        VideoSink videoSink;
        this.s = false;
        c1 c1Var = this.b;
        f9 f9Var = this.c;
        boolean z10 = (this.f == null && this.h == null) ? false : true;
        this.a = null;
        this.b = null;
        this.d.a = null;
        org.telegram.ui.Components.voip.t0 t0Var = this.e;
        if (t0Var != null) {
            t0Var.a();
            this.e = null;
        }
        if (z10 && f9Var != null) {
            g(false);
            if (c1Var != null && (videoSink = this.h) != null) {
                c1Var.s(videoSink);
            }
            this.h = null;
            this.c = null;
            f9Var.u(false);
            return;
        }
        this.c = null;
        if (c1Var == null || c1Var.x) {
            return;
        }
        if (f9Var == null || f9Var.B0 != c1Var) {
            if (c1Var.n || c1Var == c1.X) {
                c1Var.s(null);
            } else {
                c1Var.e();
            }
        }
    }

    @Override // wi.l
    public final /* synthetic */ boolean V(boolean z10, float f10, fn0 fn0Var) {
        return false;
    }

    @Override // wi.l
    public final void X(View view) {
        this.f = (hi.q3) view;
    }

    @Override // wi.l
    public final void Z() {
        LaunchActivity launchActivity;
        c1 c1Var = this.b;
        if (c1Var != null) {
            int i7 = c1Var.e;
            if (!c1Var.x) {
                if (i7 != j10.t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = mp.u1(i7).R1().u(c1Var.c, c1Var.b);
                if (u10 == null) {
                    u10 = c1Var.a;
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
    public final int a0() {
        int i7;
        hi.q3 q3Var;
        if (this.d.c > 0) {
            return this.d.c;
        }
        f9 f9Var = this.c;
        TextureViewRenderer textureViewRenderer = (f9Var == null || (q3Var = f9Var.E0) == null) ? null : q3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i7;
    }

    @Override // wi.l
    public final void b() {
        if (this.s) {
            return;
        }
        this.s = true;
        c1 c1Var = this.b;
        if (c1Var != null) {
            c1Var.v(0.0f);
        }
    }

    @Override // wi.l
    public final float b0() {
        return 0.0f;
    }

    @Override // wi.l
    public final void d(View view) {
        VideoSink videoSink;
        g(false);
        if (view == this.f) {
            this.d.a = null;
            c1 c1Var = this.b;
            if (c1Var != null && (videoSink = this.h) != null) {
                c1Var.s(videoSink);
            }
            this.h = null;
            this.f = null;
        }
    }

    @Override // wi.l
    public final /* synthetic */ int e() {
        return 0;
    }

    @Override // wi.l
    public final void f() {
        if (this.s) {
            this.s = false;
            c1 c1Var = this.b;
            if (c1Var != null) {
                c1Var.v(1.0f);
            }
        }
    }

    public final void g(boolean z10) {
        t8 t8Var;
        f9 f9Var = this.c;
        if (f9Var == null || (t8Var = f9Var.s) == null) {
            return;
        }
        t8Var.setVisibility(z10 ? 8 : 0);
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
    public final void i(wi.o oVar) {
        if (this.b == null) {
            return;
        }
        org.telegram.ui.Components.voip.t0 t0Var = new org.telegram.ui.Components.voip.t0(oVar);
        this.e = t0Var;
        this.d.a = t0Var;
        c1 c1Var = this.b;
        this.h = c1Var.P;
        c1Var.s(this.d);
    }

    @Override // wi.l
    public final long l() {
        return 0L;
    }

    @Override // wi.l
    public final boolean o0() {
        return false;
    }

    @Override // wi.l
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // wi.l
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final View v(LaunchActivity launchActivity) {
        c1 c1Var = this.b;
        return new hi.q3(launchActivity, c1Var != null ? c1Var.e : j10.t0);
    }

    @Override // wi.l
    public final void w(View view) {
        if (view == this.f) {
            this.d.a = null;
            this.f = null;
        }
        hi.q3 q3Var = (hi.q3) view;
        TextureViewRenderer textureViewRenderer = q3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = q3Var.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        q3Var.r = false;
        q3Var.c(false, false);
    }

    @Override // wi.l
    public final /* synthetic */ void H() {
    }

    @Override // wi.l
    public final /* synthetic */ void L(float f10) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void p0(int i7) {
    }

    @Override // wi.l
    public final /* synthetic */ void h0(int i7, ArrayList arrayList) {
    }

    @Override // wi.l
    public final /* synthetic */ void j0(Canvas canvas, int i7, int i10) {
    }
}
