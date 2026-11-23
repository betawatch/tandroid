package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.en0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e1 implements wi.l {
    public static e1 w;
    public wi.n a;
    public c1 b;
    public f9 c;
    public org.telegram.ui.Components.voip.u0 e;
    public hi.z3 f;
    public VideoSink h;
    public LaunchActivity r;
    public boolean s;
    public final d1 d = new d1(this);
    public final f2.a n = new f2.a(this, 4);

    public static boolean a(c1 c1Var) {
        wi.n nVar;
        e1 e1Var = w;
        return (c1Var == null || e1Var == null || e1Var.b != c1Var || (nVar = e1Var.a) == null || !nVar.d() || e1Var.a.c == 0) ? false : true;
    }

    @Override // wi.l
    public final /* synthetic */ boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override // wi.l
    public final void B0(View view) {
        hi.z3 z3Var;
        c1 c1Var = this.b;
        if (c1Var == null || view != (z3Var = this.f)) {
            return;
        }
        this.h = c1Var.P;
        this.d.a = z3Var.getSink();
        this.b.s(this.d);
        this.b.v(1.0f);
        d(true);
    }

    @Override // wi.l
    public final boolean C2() {
        return false;
    }

    @Override // wi.l
    public final void D1(View view) {
        this.f = (hi.z3) view;
    }

    @Override // wi.l
    public final void E0(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.u0 u0Var = this.e;
        this.e = null;
        this.d.a = null;
        c1 c1Var = this.b;
        if (c1Var != null && (videoSink = this.h) != null) {
            c1Var.s(videoSink);
        }
        this.h = null;
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override // wi.l
    public final void I(wi.o oVar) {
        if (this.b == null) {
            return;
        }
        org.telegram.ui.Components.voip.u0 u0Var = new org.telegram.ui.Components.voip.u0(oVar);
        this.e = u0Var;
        this.d.a = u0Var;
        c1 c1Var = this.b;
        this.h = c1Var.P;
        c1Var.s(this.d);
    }

    @Override // wi.l
    public final /* synthetic */ View K0() {
        return null;
    }

    @Override // wi.l
    public final boolean O0() {
        c1 c1Var;
        f9 f9Var = this.c;
        return (f9Var == null || f9Var.H0 || (c1Var = this.b) == null || f9Var.B0 != c1Var) ? false : true;
    }

    @Override // wi.l
    public final void P1() {
        LaunchActivity launchActivity;
        c1 c1Var = this.b;
        if (c1Var != null) {
            int i7 = c1Var.e;
            if (!c1Var.x) {
                if (i7 != i10.t0 && (launchActivity = LaunchActivity.H1) != null) {
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
    public final int V1() {
        int i7;
        hi.z3 z3Var;
        if (this.d.c > 0) {
            return this.d.c;
        }
        f9 f9Var = this.c;
        TextureViewRenderer textureViewRenderer = (f9Var == null || (z3Var = f9Var.E0) == null) ? null : z3Var.d;
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
    public final int b1() {
        int i7;
        hi.z3 z3Var;
        if (this.d.b > 0) {
            return this.d.b;
        }
        f9 f9Var = this.c;
        TextureViewRenderer textureViewRenderer = (f9Var == null || (z3Var = f9Var.E0) == null) ? null : z3Var.d;
        if (textureViewRenderer == null || (i7 = textureViewRenderer.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i7;
    }

    public final void d(boolean z10) {
        t8 t8Var;
        f9 f9Var = this.c;
        if (f9Var == null || (t8Var = f9Var.s) == null) {
            return;
        }
        t8Var.setVisibility(z10 ? 8 : 0);
    }

    @Override // wi.l
    public final float d2() {
        return 0.0f;
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

    @Override // wi.l
    public final /* synthetic */ boolean f0() {
        return true;
    }

    @Override // wi.l
    public final long getDuration() {
        return 0L;
    }

    @Override // wi.l
    public final boolean h1() {
        c1 c1Var = this.b;
        return (c1Var == null || c1Var.x) ? false : true;
    }

    @Override // wi.l
    public final boolean i1() {
        return true;
    }

    @Override // wi.l
    public final boolean j() {
        return !this.s;
    }

    @Override // wi.l
    public final void l(View view) {
        VideoSink videoSink;
        d(false);
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
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // wi.l
    public final long n() {
        return 0L;
    }

    @Override // wi.l
    public final /* synthetic */ e2.c1 n1() {
        return null;
    }

    @Override // wi.l
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // wi.l
    public final void v1() {
        VideoSink videoSink;
        this.s = false;
        c1 c1Var = this.b;
        f9 f9Var = this.c;
        boolean z10 = (this.f == null && this.h == null) ? false : true;
        this.a = null;
        this.b = null;
        this.d.a = null;
        org.telegram.ui.Components.voip.u0 u0Var = this.e;
        if (u0Var != null) {
            u0Var.a();
            this.e = null;
        }
        if (z10 && f9Var != null) {
            d(false);
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
    public final void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override // wi.l
    public final /* synthetic */ int y() {
        return 0;
    }

    @Override // wi.l
    public final View y0(LaunchActivity launchActivity) {
        c1 c1Var = this.b;
        return new hi.z3(launchActivity, c1Var != null ? c1Var.e : i10.t0);
    }

    @Override // wi.l
    public final void z0(View view) {
        if (view == this.f) {
            this.d.a = null;
            this.f = null;
        }
        hi.z3 z3Var = (hi.z3) view;
        TextureViewRenderer textureViewRenderer = z3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = z3Var.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        z3Var.r = false;
        z3Var.c(false, false);
    }

    @Override // wi.l
    public final /* synthetic */ void T0() {
    }

    @Override // wi.l
    public final /* synthetic */ void D2(int i7) {
    }

    @Override // wi.l
    public final void c(long j3) {
    }

    @Override // wi.l
    public final /* synthetic */ void d1(float f10) {
    }

    @Override // wi.l
    public final /* synthetic */ void n2(int i7, ArrayList arrayList) {
    }

    @Override // wi.l
    public final /* synthetic */ void t2(Canvas canvas, int i7, int i10) {
    }
}
