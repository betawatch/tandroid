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
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pf0 implements ze.a {
    public static final pu0 j0 = new pu0(new g2(27), new g2(28));
    public static final pu0 k0 = new pu0(new g2(29), new if0(0));
    public static final pf0 l0 = new pf0();
    public boolean A;
    public ValueAnimator B;
    public n5.e0 C;
    public int D;
    public int E;
    public float G;
    public float H;
    public o1.j I;
    public o1.j J;
    public Float K;
    public boolean L;
    public tn0 N;
    public int O;
    public int P;
    public gu Q;
    public PhotoViewer R;
    public xe.d S;
    public ImageView T;
    public boolean U;
    public float V;
    public float W;
    public ih.b3 X;
    public boolean Y;
    public boolean Z;
    public WindowManager b;
    public boolean b0;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.f d;
    public of0 e;
    public boolean e0;
    public View f;
    public View g0;
    public of0 h;
    public TextureView h0;
    public boolean i0;
    public boolean n;
    public ze0 r;
    public ScaleGestureDetector s;
    public n5.e0 v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float F = 1.0f;
    public final a61 M = new a61(false);
    public final jf0 a0 = new jf0(this, 1);
    public float[] c0 = new float[2];
    public final jf0 d0 = new jf0(this, 2);
    public final jf0 f0 = new jf0(this, 3);

    public static void j(boolean z10) {
        l0.k(z10, false);
    }

    public static wj0 o(float f10, boolean z10) {
        wj0 wj0Var = new wj0();
        float f11 = 1.0f / f10;
        pf0 pf0Var = l0;
        if (pf0Var.L && !z10) {
            wj0Var.a = pf0Var.G;
            wj0Var.b = pf0Var.H + AndroidUtilities.statusBarHeight;
            wj0Var.c = pf0Var.D;
            wj0Var.d = pf0Var.E;
            return wj0Var;
        }
        float f12 = ((SharedPreferences) pf0Var.n().b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) pf0Var.n().b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) pf0Var.n().b).getFloat("scale_factor", 1.0f);
        wj0Var.c = s(f11) * f14;
        wj0Var.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = wj0Var.c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            wj0Var.a = f16 >= f17 / 2.0f ? (f17 - f15) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            wj0Var.a = (AndroidUtilities.displaySize.x - wj0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            wj0Var.b = g7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - wj0Var.d) + AndroidUtilities.statusBarHeight;
            return wj0Var;
        }
        wj0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return wj0Var;
    }

    public static xe.d p() {
        pf0 pf0Var = l0;
        if (pf0Var != null) {
            return pf0Var.S;
        }
        return null;
    }

    public static int s(float f10) {
        float min;
        float f11;
        if (f10 >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f11 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f11 = 0.6f;
        }
        return (int) (min * f11);
    }

    public static void v(boolean z10) {
        pf0 pf0Var = l0;
        a61 a61Var = pf0Var.M;
        a61Var.e(false);
        a61Var.d(!z10);
        a61Var.f(true);
        ih.b3 b3Var = pf0Var.X;
        if (b3Var != null) {
            b3Var.invalidate();
        }
        of0 of0Var = pf0Var.h;
        if (of0Var != null) {
            of0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        pf0 pf0Var = l0;
        pf0Var.R = photoViewer;
        k61 k61Var = photoViewer.B2;
        xe.d dVar = pf0Var.S;
        if (dVar != null) {
            dVar.c();
            pf0Var.S = null;
        }
        if (k61Var != null && af.d.a(photoViewer.y) == 1) {
            xe.c cVar = new xe.c(photoViewer.y, pf0Var);
            cVar.c = "photo-viewer-pip-" + k61Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = pf0Var.d;
            cVar.k = pf0Var.g0;
            int i9 = pf0Var.O;
            int i10 = pf0Var.P;
            cVar.h = i9;
            cVar.i = i10;
            cVar.g = k61Var.d;
            cVar.f = true;
            pf0Var.S = cVar.a();
        }
        pf0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, ze0 ze0Var, View view, int i9, int i10, boolean z11) {
        boolean z12;
        ze0 ze0Var2;
        final pf0 pf0Var = l0;
        final int i11 = 1;
        final int i12 = 0;
        if (!z10) {
            pf0Var.getClass();
            if (af.d.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!pf0Var.L) {
                    return false;
                }
                pf0Var.L = true;
                pf0Var.O = i9;
                pf0Var.P = i10;
                pf0Var.K = null;
                if (ze0Var == null || !ze0Var.x) {
                    pf0Var.r = null;
                } else {
                    pf0Var.r = ze0Var;
                }
                float f10 = ((SharedPreferences) pf0Var.n().b).getFloat("x", -1.0f);
                float f11 = ((SharedPreferences) pf0Var.n().b).getFloat("y", -1.0f);
                pf0Var.F = ((SharedPreferences) pf0Var.n().b).getFloat("scale_factor", 1.0f);
                pf0Var.D = (int) (pf0Var.t() * pf0Var.F);
                pf0Var.E = (int) (pf0Var.r() * pf0Var.F);
                pf0Var.A = false;
                o1.j jVar = new o1.j(pf0Var, j0);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.u = kVar;
                jVar.a(new o1.f(pf0Var) { // from class: org.telegram.ui.Components.kf0
                    public final /* synthetic */ pf0 b;

                    {
                        this.b = pf0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f12, float f13) {
                        switch (i12) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f12).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f12).apply();
                                break;
                        }
                    }
                });
                pf0Var.I = jVar;
                o1.j jVar2 = new o1.j(pf0Var, k0);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.u = kVar2;
                jVar2.a(new o1.f(pf0Var) { // from class: org.telegram.ui.Components.kf0
                    public final /* synthetic */ pf0 b;

                    {
                        this.b = pf0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f12, float f13) {
                        switch (i11) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f12).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f12).apply();
                                break;
                        }
                    }
                });
                pf0Var.J = jVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new mf0(pf0Var, i12));
                pf0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    pf0Var.s.setStylusScaleEnabled(false);
                }
                pf0Var.v = new n5.e0(context, new nf0(pf0Var, scaledTouchSlop));
                pf0Var.e = new of0(pf0Var, context, i12);
                org.telegram.ui.f fVar = new org.telegram.ui.f(pf0Var, context, i11);
                pf0Var.d = fVar;
                fVar.addView(pf0Var.e, g7.e6.c(-1.0f, -1));
                of0 of0Var = pf0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                bg.q1 q1Var = ff.r0.a;
                of0Var.setOutlineProvider(new ff.q0(0, dp));
                pf0Var.e.setClipToOutline(true);
                pf0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false));
                pf0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) pf0Var.f.getParent()).removeView(pf0Var.f);
                }
                pf0Var.e.addView(pf0Var.f, g7.e6.c(-1.0f, -1));
                View view2 = new View(context);
                pf0Var.g0 = view2;
                pf0Var.e.addView(view2, g7.e6.c(-1.0f, -1));
                int i13 = 15;
                pf0Var.M.n = new m5.c0(pf0Var, i13);
                pf0Var.h = new of0(pf0Var, context, i11);
                of0 of0Var2 = pf0Var.h;
                Objects.requireNonNull(of0Var2);
                pf0Var.N = new tn0(new ib0(of0Var2, 11), true);
                pf0Var.h.setWillNotDraw(false);
                pf0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                pf0Var.h.addView(view3, g7.e6.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.f6.hg;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i15 = org.telegram.ui.ActionBar.f6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new fh.n(i13));
                float f12 = 38;
                float f13 = 4;
                pf0Var.h.addView(imageView, g7.e6.d(38, f12, 5, 0.0f, f13, f13, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ih.b2(6, pf0Var, z12));
                pf0Var.h.addView(imageView2, g7.e6.d(38, f12, 5, 0.0f, f13, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                pf0Var.T = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i14, false), mode);
                pf0Var.T.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                pf0Var.T.setOnClickListener(new h70(pf0Var, i16));
                View view4 = pf0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof ze0);
                pf0Var.n = z13;
                ImageView imageView4 = pf0Var.T;
                if (!z13 || ((ze0Var2 = pf0Var.r) != null && ze0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                pf0Var.h.addView(pf0Var.T, g7.e6.e(38, 38, 17));
                ih.b3 b3Var = new ih.b3(pf0Var, context);
                pf0Var.X = b3Var;
                pf0Var.h.addView(b3Var, g7.e6.c(-1.0f, -1));
                pf0Var.e.addView(pf0Var.h, g7.e6.c(-1.0f, -1));
                pf0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = af.d.b(context, z12);
                pf0Var.c = b10;
                int i17 = pf0Var.D;
                b10.width = i17;
                b10.height = pf0Var.E;
                if (f10 != -1.0f) {
                    float f14 = (i17 / 2.0f) + f10;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f14 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    pf0Var.G = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    pf0Var.G = dp4;
                    b10.x = (int) dp4;
                }
                if (f11 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = pf0Var.c;
                    float a2 = g7.n.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - pf0Var.E);
                    pf0Var.H = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = pf0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    pf0Var.H = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = pf0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(pf0Var.b, pf0Var.d, layoutParams3);
                if (z11) {
                    pf0Var.b.addView(pf0Var.d, pf0Var.c);
                    return true;
                }
                pf0Var.d.setAlpha(0.0f);
                pf0Var.d.setScaleX(0.1f);
                pf0Var.d.setScaleY(0.1f);
                pf0Var.b.addView(pf0Var.d, pf0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(gr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(pf0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(pf0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(pf0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!pf0Var.L) {
        }
    }

    @Override // ze.a
    public final Bitmap a() {
        TextureView textureView = this.h0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.h0.getBitmap();
    }

    @Override // ze.a
    public final Bitmap c() {
        TextureView textureView;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (textureView = photoViewer.s3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.R.s3.getBitmap();
    }

    @Override // ze.a
    public final void e(af.f fVar) {
        xe.d dVar = this.S;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.S.h.a.width();
            this.D = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.S.h.a.height();
            this.E = height;
            layoutParams2.height = height;
        }
        this.b.addView(this.d, this.c);
        this.i0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.R;
        if ((photoViewer != null ? photoViewer.B2 : null) == null) {
            return;
        }
        photoViewer.L8 = fVar;
    }

    @Override // ze.a
    public final boolean f() {
        PhotoViewer photoViewer = this.R;
        return photoViewer != null && photoViewer.f();
    }

    @Override // ze.a
    public final void g(af.f fVar) {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.B2 != null) {
            photoViewer.L8 = fVar;
        }
        this.b.removeView(this.d);
        this.i0 = true;
        this.d.invalidate();
    }

    @Override // ze.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.h0 = textureView;
        textureView.setVisibility(4);
        this.h0.setOpaque(false);
        this.h0.setSurfaceTextureListener(new dh.i(this, 2));
        return this.h0;
    }

    public final void i() {
        org.telegram.ui.hs0 hs0Var;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (hs0Var = photoViewer.Y3) == null) {
            return;
        }
        hs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i9 = 0;
        if (this.e0) {
            AndroidUtilities.cancelRunOnUIThread(this.f0);
            this.e0 = false;
        }
        o1.j jVar = this.I;
        if (jVar != null) {
            jVar.c();
            this.J.c();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new jf0(this, i9), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new lf0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        k61 k61Var = this.R.B2;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.o();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        k61 k61Var = this.R.B2;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.q();
    }

    public final n5.e0 n() {
        if (this.C == null) {
            Point point = AndroidUtilities.displaySize;
            this.C = new n5.e0(point.x, point.y);
        }
        return this.C;
    }

    public final float q() {
        if (this.K == null) {
            this.K = Float.valueOf(this.P / this.O);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f10 = this.K.floatValue() < 1.0f ? 0.6f : 0.45f;
            a61 a61Var = this.M;
            a61Var.q = f10;
            a61Var.a();
        }
        return this.K.floatValue();
    }

    public final int r() {
        return (int) (s(r0) * q());
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.f fVar = this.d;
            if (fVar != null && fVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.X = null;
        this.f = null;
        this.R = null;
        xe.d dVar = this.S;
        if (dVar != null) {
            dVar.c();
            this.S = null;
        }
        this.r = null;
        this.Q = null;
        this.y = null;
        this.w = false;
        this.L = false;
        this.Y = false;
        this.b0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.d0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.B = duration;
        duration.setInterpolator(gr.f);
        this.B.addUpdateListener(new q60(this, 3));
        this.B.addListener(new lf0(this, 0));
        this.B.start();
    }

    public final void z() {
        boolean z10;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || this.T == null) {
            return;
        }
        ze0 ze0Var = this.r;
        if (ze0Var != null) {
            z10 = ze0Var.C;
        } else {
            k61 k61Var = photoViewer.B2;
            if (k61Var == null) {
                return;
            } else {
                z10 = k61Var.z();
            }
        }
        jf0 jf0Var = this.a0;
        AndroidUtilities.cancelRunOnUIThread(jf0Var);
        if (z10) {
            this.T.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(jf0Var, 500L);
        } else if (this.U) {
            this.T.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.T.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // ze.a
    public final /* synthetic */ void b(Canvas canvas) {
    }

    @Override // ze.a
    public final /* synthetic */ void d(Canvas canvas) {
    }
}
