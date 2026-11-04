package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ie0 implements wf.a {
    public static final kt0 o0 = new kt0(new a3(26), new a3(27));
    public static final kt0 p0 = new kt0(new a3(28), new a3(29));
    public static final ie0 q0 = new ie0();
    public View E;
    public boolean F;
    public ValueAnimator G;
    public he0 H;
    public int I;
    public int J;
    public float L;
    public float M;
    public q1.g N;
    public q1.g O;
    public Float P;
    public boolean Q;
    public tm0 S;
    public int T;
    public int U;
    public ut V;
    public PhotoViewer W;
    public uf.d X;
    public ImageView Y;
    public boolean Z;
    public float a0;
    public WindowManager b;
    public float b0;
    public WindowManager.LayoutParams c;
    public ei.e3 c0;
    public org.telegram.ui.e d;
    public boolean d0;
    public ge0 e;
    public boolean e0;
    public View f;
    public boolean g0;
    public ge0 h;
    public boolean j0;
    public View l0;
    public TextureView m0;
    public boolean n;
    public boolean n0;
    public ud0 r;
    public ScaleGestureDetector s;
    public y00 w;
    public boolean x;
    public boolean y;
    public float a = 1.4f;
    public float K = 1.0f;
    public final d51 R = new d51(false);
    public final be0 f0 = new be0(this, 1);
    public float[] h0 = new float[2];
    public final be0 i0 = new be0(this, 2);
    public final be0 k0 = new be0(this, 3);

    public static void b(boolean z10) {
        q0.d(z10, false);
    }

    public static ni0 j(boolean z10, float f10) {
        ni0 ni0Var = new ni0();
        float f11 = 1.0f / f10;
        ie0 ie0Var = q0;
        if (ie0Var.Q && !z10) {
            ni0Var.a = ie0Var.L;
            ni0Var.b = ie0Var.M + org.telegram.messenger.g0.m;
            ni0Var.c = ie0Var.I;
            ni0Var.d = ie0Var.J;
            return ni0Var;
        }
        float f12 = ie0Var.h().a.getFloat("x", -1.0f);
        float f13 = ie0Var.h().a.getFloat("y", -1.0f);
        float f14 = ie0Var.h().a.getFloat("scale_factor", 1.0f);
        ni0Var.c = s(f11) * f14;
        ni0Var.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = ni0Var.c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = org.telegram.messenger.g0.q.x;
            ni0Var.a = f16 >= f17 / 2.0f ? (f17 - f15) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        } else {
            ni0Var.a = (org.telegram.messenger.g0.q.x - ni0Var.c) - org.telegram.messenger.g0.L(16.0f);
        }
        if (f13 != -1.0f) {
            ni0Var.b = b8.be.a(f13, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(16.0f)) - ni0Var.d) + org.telegram.messenger.g0.m;
            return ni0Var;
        }
        ni0Var.b = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m;
        return ni0Var;
    }

    public static uf.d k() {
        ie0 ie0Var = q0;
        if (ie0Var != null) {
            return ie0Var.X;
        }
        return null;
    }

    public static int s(float f10) {
        float min;
        float f11;
        if (f10 >= 1.0f) {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
            f11 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.g0.q;
            min = Math.min(point2.x, point2.y);
            f11 = 0.6f;
        }
        return (int) (min * f11);
    }

    public static void v(boolean z10) {
        ie0 ie0Var = q0;
        d51 d51Var = ie0Var.R;
        d51Var.e(false);
        d51Var.d(!z10);
        d51Var.f(true);
        ei.e3 e3Var = ie0Var.c0;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        ge0 ge0Var = ie0Var.h;
        if (ge0Var != null) {
            ge0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ie0 ie0Var = q0;
        ie0Var.W = photoViewer;
        m51 m51Var = photoViewer.G2;
        uf.d dVar = ie0Var.X;
        if (dVar != null) {
            dVar.c();
            ie0Var.X = null;
        }
        if (m51Var != null && xf.b.a(photoViewer.E) == 1) {
            uf.c cVar = new uf.c(photoViewer.E, ie0Var);
            cVar.c = "photo-viewer-pip-" + m51Var.a;
            cVar.e = 1;
            cVar.d = org.telegram.messenger.g0.L(10.0f);
            cVar.j = ie0Var.d;
            cVar.k = ie0Var.l0;
            int i3 = ie0Var.T;
            int i10 = ie0Var.U;
            cVar.h = i3;
            cVar.i = i10;
            cVar.g = m51Var.d;
            cVar.f = true;
            ie0Var.X = cVar.a();
        }
        ie0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, ud0 ud0Var, View view, int i3, int i10, boolean z11) {
        boolean z12;
        ud0 ud0Var2;
        final ie0 ie0Var = q0;
        final int i11 = 1;
        final int i12 = 0;
        if (!z10) {
            ie0Var.getClass();
            if (xf.b.a(org.telegram.messenger.t0.b) != 1) {
                z12 = false;
                if (!ie0Var.Q) {
                    return false;
                }
                ie0Var.Q = true;
                ie0Var.T = i3;
                ie0Var.U = i10;
                ie0Var.P = null;
                if (ud0Var == null || !ud0Var.y) {
                    ie0Var.r = null;
                } else {
                    ie0Var.r = ud0Var;
                }
                float f10 = ie0Var.h().a.getFloat("x", -1.0f);
                float f11 = ie0Var.h().a.getFloat("y", -1.0f);
                ie0Var.K = ie0Var.h().a.getFloat("scale_factor", 1.0f);
                ie0Var.I = (int) (ie0Var.t() * ie0Var.K);
                ie0Var.J = (int) (ie0Var.p() * ie0Var.K);
                ie0Var.F = false;
                q1.g gVar = new q1.g(ie0Var, o0);
                q1.h hVar = new q1.h();
                hVar.a(0.75f);
                hVar.b(650.0f);
                gVar.m = hVar;
                gVar.a(new q1.c(ie0Var) { // from class: org.telegram.ui.Components.ce0
                    public final /* synthetic */ ie0 b;

                    {
                        this.b = ie0Var;
                    }

                    @Override // q1.c
                    public final void a(q1.g gVar2, boolean z13, float f12, float f13) {
                        switch (i12) {
                            case 0:
                                this.b.h().a.edit().putFloat("x", f12).apply();
                                break;
                            default:
                                this.b.h().a.edit().putFloat("y", f12).apply();
                                break;
                        }
                    }
                });
                ie0Var.N = gVar;
                q1.g gVar2 = new q1.g(ie0Var, p0);
                q1.h hVar2 = new q1.h();
                hVar2.a(0.75f);
                hVar2.b(650.0f);
                gVar2.m = hVar2;
                gVar2.a(new q1.c(ie0Var) { // from class: org.telegram.ui.Components.ce0
                    public final /* synthetic */ ie0 b;

                    {
                        this.b = ie0Var;
                    }

                    @Override // q1.c
                    public final void a(q1.g gVar22, boolean z13, float f12, float f13) {
                        switch (i11) {
                            case 0:
                                this.b.h().a.edit().putFloat("x", f12).apply();
                                break;
                            default:
                                this.b.h().a.edit().putFloat("y", f12).apply();
                                break;
                        }
                    }
                });
                ie0Var.O = gVar2;
                Context context = z12 ? activity : org.telegram.messenger.t0.b;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new ee0(ie0Var, i12));
                ie0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                ie0Var.s.setStylusScaleEnabled(false);
                ie0Var.w = new y00(context, (x00) new fe0(ie0Var, scaledTouchSlop));
                ie0Var.e = new ge0(ie0Var, context, i12);
                org.telegram.ui.e eVar = new org.telegram.ui.e(i11, context, ie0Var);
                ie0Var.d = eVar;
                eVar.addView(ie0Var.e, b8.mf.c(-1.0f, -1));
                ge0 ge0Var = ie0Var.e;
                float L = org.telegram.messenger.g0.L(10.0f);
                cg.p0 p0Var = cg.t0.a;
                ge0Var.setOutlineProvider(new cg.r0(0, L));
                ie0Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Ug, ie0Var.e, null);
                ie0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) ie0Var.f.getParent()).removeView(ie0Var.f);
                }
                ie0Var.e.addView(ie0Var.f, b8.mf.c(-1.0f, -1));
                View view2 = new View(context);
                ie0Var.l0 = view2;
                ie0Var.e.addView(view2, b8.mf.c(-1.0f, -1));
                ie0Var.R.n = new y00(ie0Var);
                ie0Var.h = new ge0(ie0Var, context, i11);
                ge0 ge0Var2 = ie0Var.h;
                Objects.requireNonNull(ge0Var2);
                ie0Var.S = new tm0(new jb0(ge0Var2, 8), true);
                ie0Var.h.setWillNotDraw(false);
                ie0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                ie0Var.h.addView(view3, b8.mf.c(-1.0f, -1));
                int L2 = org.telegram.messenger.g0.L(8.0f);
                ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.pip_video_close);
                int i13 = org.telegram.ui.ActionBar.k6.Vg;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(e10, i13, null, mode);
                int i14 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                e10.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(e10, h02, null, N, null);
                e10.setPadding(L2, L2, L2, L2);
                e10.setOnClickListener(new ai.t(17));
                float f12 = 38;
                float f13 = 4;
                ie0Var.h.addView(e10, b8.mf.d(38, f12, 5, 0.0f, f13, f13, 0.0f));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.r6.t(imageView, i13, null, mode);
                org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                imageView.setBackground(h03);
                org.telegram.ui.ActionBar.r6.k(imageView, h03, null, N2, null);
                imageView.setPadding(L2, L2, L2, L2);
                imageView.setOnClickListener(new ei.e2(6, ie0Var, z12));
                ie0Var.h.addView(imageView, b8.mf.d(38, f12, 5, 0.0f, f13, 48, 0.0f));
                ImageView imageView2 = new ImageView(context);
                ie0Var.Y = imageView2;
                org.telegram.ui.ActionBar.r6.t(imageView2, i13, null, mode);
                org.telegram.ui.ActionBar.r6.R(ie0Var.Y, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i14), null);
                ie0Var.Y.setOnClickListener(new ga0(ie0Var, 5));
                View view4 = ie0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof ud0);
                ie0Var.n = z13;
                ie0Var.Y.setVisibility((!z13 || ((ud0Var2 = ie0Var.r) != null && ud0Var2.y)) ? 0 : 8);
                ie0Var.h.addView(ie0Var.Y, b8.mf.e(38, 38, 17));
                ei.e3 e3Var = new ei.e3(ie0Var, context);
                ie0Var.c0 = e3Var;
                ie0Var.h.addView(e3Var, b8.mf.c(-1.0f, -1));
                ie0Var.e.addView(ie0Var.h, b8.mf.c(-1.0f, -1));
                ie0Var.b = (WindowManager) (z12 ? activity : org.telegram.messenger.t0.b).getSystemService("window");
                WindowManager.LayoutParams b10 = xf.b.b(context, z12);
                ie0Var.c = b10;
                int i15 = ie0Var.I;
                b10.width = i15;
                b10.height = ie0Var.J;
                if (f10 != -1.0f) {
                    float f14 = (i15 / 2.0f) + f10;
                    int i16 = org.telegram.messenger.g0.q.x;
                    float L3 = f14 >= ((float) i16) / 2.0f ? (i16 - i15) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                    ie0Var.L = L3;
                    b10.x = (int) L3;
                } else {
                    float L4 = (org.telegram.messenger.g0.q.x - i15) - org.telegram.messenger.g0.L(16.0f);
                    ie0Var.L = L4;
                    b10.x = (int) L4;
                }
                if (f11 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = ie0Var.c;
                    float a10 = b8.be.a(f11, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(16.0f)) - ie0Var.J);
                    ie0Var.M = a10;
                    layoutParams.y = (int) a10;
                } else {
                    WindowManager.LayoutParams layoutParams2 = ie0Var.c;
                    float L5 = org.telegram.messenger.g0.L(16.0f);
                    ie0Var.M = L5;
                    layoutParams2.y = (int) L5;
                }
                WindowManager.LayoutParams layoutParams3 = ie0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                org.telegram.messenger.g0.y3(ie0Var.b, ie0Var.d, layoutParams3);
                if (z11) {
                    ie0Var.b.addView(ie0Var.d, ie0Var.c);
                    return true;
                }
                ie0Var.d.setAlpha(0.0f);
                ie0Var.d.setScaleX(0.1f);
                ie0Var.d.setScaleY(0.1f);
                ie0Var.b.addView(ie0Var.d, ie0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(xq.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(ie0Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(ie0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(ie0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!ie0Var.Q) {
        }
    }

    public final void a() {
        org.telegram.ui.yo0 yo0Var;
        PhotoViewer photoViewer = this.W;
        if (photoViewer == null || (yo0Var = photoViewer.d4) == null) {
            return;
        }
        yo0Var.cancelRewind();
    }

    @Override // wf.a
    public final void c(b8.cg cgVar) {
        PhotoViewer photoViewer = this.W;
        if (photoViewer != null && photoViewer.G2 != null) {
            photoViewer.R8 = cgVar;
        }
        this.b.removeView(this.d);
        this.n0 = true;
        this.d.invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.d0) {
            return;
        }
        this.d0 = true;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = 0;
        if (this.j0) {
            org.telegram.messenger.g0.r(this.k0);
            this.j0 = false;
        }
        q1.g gVar = this.N;
        if (gVar != null) {
            gVar.d();
            this.O.d();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                org.telegram.messenger.g0.i3(new be0(this, i3), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(xq.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new de0(this, 1));
        animatorSet.start();
    }

    public final long e() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        m51 m51Var = this.W.G2;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.S();
    }

    public final long f() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        m51 m51Var = this.W.G2;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.U();
    }

    @Override // wf.a
    public final Bitmap g() {
        TextureView textureView = this.m0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.m0.getBitmap();
    }

    public final he0 h() {
        if (this.H == null) {
            Point point = org.telegram.messenger.g0.q;
            this.H = new he0(point.x, point.y);
        }
        return this.H;
    }

    @Override // wf.a
    public final Bitmap l() {
        TextureView textureView;
        PhotoViewer photoViewer = this.W;
        if (photoViewer == null || (textureView = photoViewer.x3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.W.x3.getBitmap();
    }

    public final float n() {
        if (this.P == null) {
            this.P = Float.valueOf(this.U / this.T);
            Point point = org.telegram.messenger.g0.q;
            this.a = (Math.min(point.x, point.y) - org.telegram.messenger.g0.L(32.0f)) / t();
            float f10 = this.P.floatValue() < 1.0f ? 0.6f : 0.45f;
            d51 d51Var = this.R;
            d51Var.q = f10;
            d51Var.a();
        }
        return this.P.floatValue();
    }

    @Override // wf.a
    public final boolean o() {
        PhotoViewer photoViewer = this.W;
        return photoViewer != null && photoViewer.o();
    }

    public final int p() {
        return (int) (s(r0) * n());
    }

    @Override // wf.a
    public final View q() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.m0 = textureView;
        textureView.setVisibility(4);
        this.m0.setOpaque(false);
        this.m0.setSurfaceTextureListener(new s30(this, 1));
        return this.m0;
    }

    @Override // wf.a
    public final void r(b8.cg cgVar) {
        uf.d dVar = this.X;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.X.h.a).width();
            this.I = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.X.h.a).height();
            this.J = height;
            layoutParams2.height = height;
        }
        this.b.addView(this.d, this.c);
        this.n0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.W;
        if ((photoViewer != null ? photoViewer.G2 : null) == null) {
            return;
        }
        photoViewer.R8 = cgVar;
    }

    public final int t() {
        return s(n());
    }

    public final void u() {
        try {
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.c0 = null;
        this.f = null;
        this.W = null;
        uf.d dVar = this.X;
        if (dVar != null) {
            dVar.c();
            this.X = null;
        }
        this.r = null;
        this.V = null;
        this.E = null;
        this.x = false;
        this.Q = false;
        this.d0 = false;
        this.g0 = false;
        a();
        org.telegram.messenger.g0.r(this.i0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.G = duration;
        duration.setInterpolator(xq.f);
        this.G.addUpdateListener(new y50(this, 3));
        this.G.addListener(new de0(this, 0));
        this.G.start();
    }

    public final void z() {
        boolean d02;
        PhotoViewer photoViewer = this.W;
        if (photoViewer == null || this.Y == null) {
            return;
        }
        ud0 ud0Var = this.r;
        if (ud0Var != null) {
            d02 = ud0Var.H;
        } else {
            m51 m51Var = photoViewer.G2;
            if (m51Var == null) {
                return;
            } else {
                d02 = m51Var.d0();
            }
        }
        be0 be0Var = this.f0;
        org.telegram.messenger.g0.r(be0Var);
        if (d02) {
            this.Y.setImageResource(R.drawable.pip_pause_large);
            org.telegram.messenger.g0.i3(be0Var, 500L);
        } else if (this.Z) {
            this.Y.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.Y.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // wf.a
    public final /* synthetic */ void i(Canvas canvas) {
    }

    @Override // wf.a
    public final /* synthetic */ void m(Canvas canvas) {
    }
}
