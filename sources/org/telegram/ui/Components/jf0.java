package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jf0 implements lf.a {
    public static final ou0 n0 = new ou0(new au(12), new au(13));
    public static final ou0 o0 = new ou0(new au(14), new au(15));
    public static final jf0 p0 = new jf0();
    public View D;
    public boolean E;
    public ValueAnimator F;
    public k2.m0 G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.j M;
    public o1.j N;
    public Float O;
    public boolean P;
    public rn0 R;
    public int S;
    public int T;
    public hu U;
    public PhotoViewer V;
    public jf.f W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public ih.c b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public jf.g d;
    public boolean d0;
    public if0 e;
    public View f;
    public boolean f0;
    public if0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public ve0 r;
    public ScaleGestureDetector s;
    public m2.t w;
    public boolean x;
    public boolean y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final m61 Q = new m61(false);
    public final cf0 e0 = new cf0(this, 1);
    public float[] g0 = new float[2];
    public final cf0 h0 = new cf0(this, 2);
    public final cf0 j0 = new cf0(this, 3);

    public static void b(boolean z10) {
        p0.d(z10, false);
    }

    public static oj0 j(boolean z10, float f7) {
        oj0 oj0Var = new oj0();
        float f10 = 1.0f / f7;
        jf0 jf0Var = p0;
        if (jf0Var.P && !z10) {
            oj0Var.a = jf0Var.K;
            oj0Var.b = jf0Var.L + org.telegram.messenger.i0.m;
            oj0Var.c = jf0Var.H;
            oj0Var.d = jf0Var.I;
            return oj0Var;
        }
        float f11 = ((SharedPreferences) jf0Var.h().a).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) jf0Var.h().a).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) jf0Var.h().a).getFloat("scale_factor", 1.0f);
        oj0Var.c = s(f10) * f13;
        oj0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = oj0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = org.telegram.messenger.i0.q.x;
            oj0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        } else {
            oj0Var.a = (org.telegram.messenger.i0.q.x - oj0Var.c) - org.telegram.messenger.i0.L(16.0f);
        }
        if (f12 != -1.0f) {
            oj0Var.b = w7.u.a(f12, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.L(16.0f)) - oj0Var.d) + org.telegram.messenger.i0.m;
            return oj0Var;
        }
        oj0Var.b = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.m;
        return oj0Var;
    }

    public static jf.f k() {
        jf0 jf0Var = p0;
        if (jf0Var != null) {
            return jf0Var.W;
        }
        return null;
    }

    public static int s(float f7) {
        float min;
        float f10;
        if (f7 >= 1.0f) {
            Point point = org.telegram.messenger.i0.q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public static void v(boolean z10) {
        jf0 jf0Var = p0;
        m61 m61Var = jf0Var.Q;
        m61Var.e(false);
        m61Var.d(!z10);
        m61Var.f(true);
        ih.c cVar = jf0Var.b0;
        if (cVar != null) {
            cVar.invalidate();
        }
        if0 if0Var = jf0Var.h;
        if (if0Var != null) {
            if0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        jf0 jf0Var = p0;
        jf0Var.V = photoViewer;
        u61 u61Var = photoViewer.F2;
        jf.f fVar = jf0Var.W;
        if (fVar != null) {
            fVar.c();
            jf0Var.W = null;
        }
        if (u61Var != null && mf.b.a(photoViewer.D) == 1) {
            jf.e eVar = new jf.e(photoViewer.D, jf0Var);
            eVar.c = "photo-viewer-pip-" + u61Var.a;
            eVar.e = 1;
            eVar.d = org.telegram.messenger.i0.L(10.0f);
            eVar.j = jf0Var.d;
            eVar.k = jf0Var.k0;
            int i10 = jf0Var.S;
            int i11 = jf0Var.T;
            eVar.h = i10;
            eVar.i = i11;
            eVar.g = u61Var.d;
            eVar.f = true;
            jf0Var.W = eVar.a();
        }
        jf0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, ve0 ve0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        ve0 ve0Var2;
        final jf0 jf0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            jf0Var.getClass();
            if (mf.b.a(org.telegram.messenger.w0.b) != 1) {
                z12 = false;
                if (!jf0Var.P) {
                    return false;
                }
                jf0Var.P = true;
                jf0Var.S = i10;
                jf0Var.T = i11;
                jf0Var.O = null;
                if (ve0Var == null || !ve0Var.y) {
                    jf0Var.r = null;
                } else {
                    jf0Var.r = ve0Var;
                }
                float f7 = ((SharedPreferences) jf0Var.h().a).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) jf0Var.h().a).getFloat("y", -1.0f);
                jf0Var.J = ((SharedPreferences) jf0Var.h().a).getFloat("scale_factor", 1.0f);
                jf0Var.H = (int) (jf0Var.t() * jf0Var.J);
                jf0Var.I = (int) (jf0Var.p() * jf0Var.J);
                jf0Var.E = false;
                o1.j jVar = new o1.j(jf0Var, n0);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.m = kVar;
                jVar.a(new o1.f(jf0Var) { // from class: org.telegram.ui.Components.df0
                    public final /* synthetic */ jf0 b;

                    {
                        this.b = jf0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.j jVar2, boolean z13, float f11, float f12) {
                        switch (i13) {
                            case 0:
                                ((SharedPreferences) this.b.h().a).edit().putFloat("x", f11).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.h().a).edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                jf0Var.M = jVar;
                o1.j jVar2 = new o1.j(jf0Var, o0);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.m = kVar2;
                jVar2.a(new o1.f(jf0Var) { // from class: org.telegram.ui.Components.df0
                    public final /* synthetic */ jf0 b;

                    {
                        this.b = jf0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.j jVar22, boolean z13, float f11, float f12) {
                        switch (i12) {
                            case 0:
                                ((SharedPreferences) this.b.h().a).edit().putFloat("x", f11).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.h().a).edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                jf0Var.N = jVar2;
                Context context = z12 ? activity : org.telegram.messenger.w0.b;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new eg.b(jf0Var, i12));
                jf0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                jf0Var.s.setStylusScaleEnabled(false);
                jf0Var.w = new m2.t(context, (r10) new hf0(jf0Var, scaledTouchSlop));
                jf0Var.e = new if0(jf0Var, context, i13);
                jf.g gVar = new jf.g(jf0Var, context, 2);
                jf0Var.d = gVar;
                gVar.addView(jf0Var.e, w7.b6.c(-1.0f, -1));
                if0 if0Var = jf0Var.e;
                float L = org.telegram.messenger.i0.L(10.0f);
                bi.d2 d2Var = rf.e0.a;
                if0Var.setOutlineProvider(new rf.c0(0, L));
                jf0Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Ug, jf0Var.e, null);
                jf0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) jf0Var.f.getParent()).removeView(jf0Var.f);
                }
                jf0Var.e.addView(jf0Var.f, w7.b6.c(-1.0f, -1));
                View view2 = new View(context);
                jf0Var.k0 = view2;
                jf0Var.e.addView(view2, w7.b6.c(-1.0f, -1));
                jf0Var.Q.n = new n2.u(jf0Var, 12);
                jf0Var.h = new if0(jf0Var, context, i12);
                if0 if0Var2 = jf0Var.h;
                Objects.requireNonNull(if0Var2);
                jf0Var.R = new rn0(new eb0(if0Var2, 11), true);
                jf0Var.h.setWillNotDraw(false);
                jf0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                jf0Var.h.addView(view3, w7.b6.c(-1.0f, -1));
                int L2 = org.telegram.messenger.i0.L(8.0f);
                ImageView e = org.telegram.messenger.z20.e(context, R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.t6.Vg;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.a7.t(e, i14, null, mode);
                int i15 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                e.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(e, h02, null, N, null);
                e.setPadding(L2, L2, L2, L2);
                e.setOnClickListener(new bh.c(9));
                float f11 = 38;
                float f12 = 4;
                jf0Var.h.addView(e, w7.b6.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.a7.t(imageView, i14, null, mode);
                org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 1, -1);
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
                imageView.setBackground(h03);
                org.telegram.ui.ActionBar.a7.k(imageView, h03, null, N2, null);
                imageView.setPadding(L2, L2, L2, L2);
                imageView.setOnClickListener(new org.telegram.ui.ActionBar.c0(4, jf0Var, z12));
                jf0Var.h.addView(imageView, w7.b6.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView2 = new ImageView(context);
                jf0Var.X = imageView2;
                org.telegram.ui.ActionBar.a7.t(imageView2, i14, null, mode);
                org.telegram.ui.ActionBar.a7.R(jf0Var.X, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i15), null);
                jf0Var.X.setOnClickListener(new db0(jf0Var, 5));
                View view4 = jf0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof ve0);
                jf0Var.n = z13;
                jf0Var.X.setVisibility((!z13 || ((ve0Var2 = jf0Var.r) != null && ve0Var2.y)) ? 0 : 8);
                jf0Var.h.addView(jf0Var.X, w7.b6.e(38, 38, 17));
                ih.c cVar = new ih.c(jf0Var, context);
                jf0Var.b0 = cVar;
                jf0Var.h.addView(cVar, w7.b6.c(-1.0f, -1));
                jf0Var.e.addView(jf0Var.h, w7.b6.c(-1.0f, -1));
                jf0Var.b = (WindowManager) (z12 ? activity : org.telegram.messenger.w0.b).getSystemService("window");
                WindowManager.LayoutParams b10 = mf.b.b(context, z12);
                jf0Var.c = b10;
                int i16 = jf0Var.H;
                b10.width = i16;
                b10.height = jf0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i16 / 2.0f) + f7;
                    int i17 = org.telegram.messenger.i0.q.x;
                    float L3 = f13 >= ((float) i17) / 2.0f ? (i17 - i16) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
                    jf0Var.K = L3;
                    b10.x = (int) L3;
                } else {
                    float L4 = (org.telegram.messenger.i0.q.x - i16) - org.telegram.messenger.i0.L(16.0f);
                    jf0Var.K = L4;
                    b10.x = (int) L4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = jf0Var.c;
                    float a2 = w7.u.a(f10, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.L(16.0f)) - jf0Var.I);
                    jf0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = jf0Var.c;
                    float L5 = org.telegram.messenger.i0.L(16.0f);
                    jf0Var.L = L5;
                    layoutParams2.y = (int) L5;
                }
                WindowManager.LayoutParams layoutParams3 = jf0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                org.telegram.messenger.i0.x3(jf0Var.b, jf0Var.d, layoutParams3);
                if (z11) {
                    jf0Var.b.addView(jf0Var.d, jf0Var.c);
                    return true;
                }
                jf0Var.d.setAlpha(0.0f);
                jf0Var.d.setScaleX(0.1f);
                jf0Var.d.setScaleY(0.1f);
                jf0Var.b.addView(jf0Var.d, jf0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(gr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(jf0Var.d, (Property<jf.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(jf0Var.d, (Property<jf.g, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(jf0Var.d, (Property<jf.g, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!jf0Var.P) {
        }
    }

    public final void a() {
        org.telegram.ui.rq0 rq0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (rq0Var = photoViewer.c4) == null) {
            return;
        }
        rq0Var.cancelRewind();
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = oVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (this.i0) {
            org.telegram.messenger.i0.r(this.j0);
            this.i0 = false;
        }
        o1.j jVar = this.M;
        if (jVar != null) {
            jVar.d();
            this.N.d();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                org.telegram.messenger.i0.h3(new cf0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<jf.g, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<jf.g, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<jf.g, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new ef0(this, 1));
        animatorSet.start();
    }

    public final long e() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        u61 u61Var = this.V.F2;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.S();
    }

    public final long f() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        u61 u61Var = this.V.F2;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.U();
    }

    @Override // lf.a
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        jf.f fVar = this.W;
        if (fVar != null && fVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.W.h.a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.W.h.a).height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.b.addView(this.d, this.c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if ((photoViewer != null ? photoViewer.F2 : null) == null) {
            return;
        }
        photoViewer.Q8 = oVar;
    }

    public final k2.m0 h() {
        if (this.G == null) {
            Point point = org.telegram.messenger.i0.q;
            int i10 = point.x;
            int i11 = point.y;
            k2.m0 m0Var = new k2.m0();
            m0Var.a = org.telegram.messenger.w0.b.getSharedPreferences(a1.g.j(i10, i11, "pip_layout_", "_"), 0);
            this.G = m0Var;
        }
        return this.G;
    }

    @Override // lf.a
    public final Bitmap i() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // lf.a
    public final Bitmap m() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    public final float o() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = org.telegram.messenger.i0.q;
            this.a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            m61 m61Var = this.Q;
            m61Var.q = f7;
            m61Var.a();
        }
        return this.O.floatValue();
    }

    public final int p() {
        return (int) (s(r0) * o());
    }

    @Override // lf.a
    public final boolean q() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.q();
    }

    @Override // lf.a
    public final View r() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new li.e(this, 3));
        return this.l0;
    }

    public final int t() {
        return s(o());
    }

    public final void u() {
        try {
            jf.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.b0 = null;
        this.f = null;
        this.V = null;
        jf.f fVar = this.W;
        if (fVar != null) {
            fVar.c();
            this.W = null;
        }
        this.r = null;
        this.U = null;
        this.D = null;
        this.x = false;
        this.P = false;
        this.c0 = false;
        this.f0 = false;
        a();
        org.telegram.messenger.i0.r(this.h0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.F = duration;
        duration.setInterpolator(gr.f);
        this.F.addUpdateListener(new r60(this, 3));
        this.F.addListener(new ef0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean d02;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        ve0 ve0Var = this.r;
        if (ve0Var != null) {
            d02 = ve0Var.G;
        } else {
            u61 u61Var = photoViewer.F2;
            if (u61Var == null) {
                return;
            } else {
                d02 = u61Var.d0();
            }
        }
        cf0 cf0Var = this.e0;
        org.telegram.messenger.i0.r(cf0Var);
        if (d02) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            org.telegram.messenger.i0.h3(cf0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // lf.a
    public final /* synthetic */ void l(Canvas canvas) {
    }

    @Override // lf.a
    public final /* synthetic */ void n(Canvas canvas) {
    }
}
