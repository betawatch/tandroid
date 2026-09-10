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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class og0 implements rf.a {
    public static final sv0 n0 = new sv0(new q2(23), new q2(24));
    public static final sv0 o0 = new sv0(new q2(25), new q2(26));
    public static final og0 p0 = new og0();
    public boolean E;
    public ValueAnimator F;
    public com.google.firebase.messaging.u G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public to0 R;
    public int S;
    public int T;
    public zu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public org.telegram.ui.u7 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.f d;
    public boolean d0;
    public ng0 e;
    public View f;
    public boolean f0;
    public ng0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public zf0 r;
    public ScaleGestureDetector s;
    public l2.g v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final j71 Q = new j71(false);
    public final ig0 e0 = new ig0(this, 1);
    public float[] g0 = new float[2];
    public final ig0 h0 = new ig0(this, 2);
    public final ig0 j0 = new ig0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static rk0 o(float f7, boolean z10) {
        rk0 rk0Var = new rk0();
        float f10 = 1.0f / f7;
        og0 og0Var = p0;
        if (og0Var.P && !z10) {
            rk0Var.a = og0Var.K;
            rk0Var.b = og0Var.L + AndroidUtilities.statusBarHeight;
            rk0Var.c = og0Var.H;
            rk0Var.d = og0Var.I;
            return rk0Var;
        }
        float f11 = og0Var.n().a.getFloat("x", -1.0f);
        float f12 = og0Var.n().a.getFloat("y", -1.0f);
        float f13 = og0Var.n().a.getFloat("scale_factor", 1.0f);
        rk0Var.c = s(f10) * f13;
        rk0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = rk0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            rk0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            rk0Var.a = (AndroidUtilities.displaySize.x - rk0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            rk0Var.b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - rk0Var.d) + AndroidUtilities.statusBarHeight;
            return rk0Var;
        }
        rk0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return rk0Var;
    }

    public static pf.e p() {
        og0 og0Var = p0;
        if (og0Var != null) {
            return og0Var.W;
        }
        return null;
    }

    public static int s(float f7) {
        float min;
        float f10;
        if (f7 >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public static void v(boolean z10) {
        og0 og0Var = p0;
        j71 j71Var = og0Var.Q;
        j71Var.e(false);
        j71Var.d(!z10);
        j71Var.f(true);
        org.telegram.ui.u7 u7Var = og0Var.b0;
        if (u7Var != null) {
            u7Var.invalidate();
        }
        ng0 ng0Var = og0Var.h;
        if (ng0Var != null) {
            ng0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        og0 og0Var = p0;
        og0Var.V = photoViewer;
        t71 t71Var = photoViewer.F2;
        pf.e eVar = og0Var.W;
        if (eVar != null) {
            eVar.c();
            og0Var.W = null;
        }
        if (t71Var != null && sf.c.a(photoViewer.y) == 1) {
            pf.d dVar = new pf.d(photoViewer.y, og0Var);
            dVar.c = "photo-viewer-pip-" + t71Var.a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.j = og0Var.d;
            dVar.k = og0Var.k0;
            int i10 = og0Var.S;
            int i11 = og0Var.T;
            dVar.h = i10;
            dVar.i = i11;
            dVar.g = t71Var.d;
            dVar.f = true;
            og0Var.W = dVar.a();
        }
        og0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, zf0 zf0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        zf0 zf0Var2;
        final og0 og0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            og0Var.getClass();
            if (sf.c.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!og0Var.P) {
                    return false;
                }
                og0Var.P = true;
                og0Var.S = i10;
                og0Var.T = i11;
                og0Var.O = null;
                if (zf0Var == null || !zf0Var.x) {
                    og0Var.r = null;
                } else {
                    og0Var.r = zf0Var;
                }
                float f7 = og0Var.n().a.getFloat("x", -1.0f);
                float f10 = og0Var.n().a.getFloat("y", -1.0f);
                og0Var.J = og0Var.n().a.getFloat("scale_factor", 1.0f);
                og0Var.H = (int) (og0Var.t() * og0Var.J);
                og0Var.I = (int) (og0Var.r() * og0Var.J);
                og0Var.E = false;
                o1.k kVar = new o1.k(og0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(og0Var) { // from class: org.telegram.ui.Components.jg0
                    public final /* synthetic */ og0 b;

                    {
                        this.b = og0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
                        switch (i13) {
                            case 0:
                                this.b.n().a.edit().putFloat("x", f11).apply();
                                break;
                            default:
                                this.b.n().a.edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                og0Var.M = kVar;
                o1.k kVar2 = new o1.k(og0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(og0Var) { // from class: org.telegram.ui.Components.jg0
                    public final /* synthetic */ og0 b;

                    {
                        this.b = og0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
                        switch (i12) {
                            case 0:
                                this.b.n().a.edit().putFloat("x", f11).apply();
                                break;
                            default:
                                this.b.n().a.edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                og0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new kg.b(og0Var, i12));
                og0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    og0Var.s.setStylusScaleEnabled(false);
                }
                og0Var.v = new l2.g(context, new mg0(og0Var, scaledTouchSlop));
                og0Var.e = new ng0(og0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(og0Var, context, i12);
                og0Var.d = fVar;
                fVar.addView(og0Var.e, w7.a6.c(-1.0f, -1));
                ng0 ng0Var = og0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                bi.g gVar = xf.k0.a;
                ng0Var.setOutlineProvider(new xf.j0(0, dp));
                og0Var.e.setClipToOutline(true);
                og0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
                og0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) og0Var.f.getParent()).removeView(og0Var.f);
                }
                og0Var.e.addView(og0Var.f, w7.a6.c(-1.0f, -1));
                View view2 = new View(context);
                og0Var.k0 = view2;
                og0Var.e.addView(view2, w7.a6.c(-1.0f, -1));
                og0Var.Q.n = new l2.g(og0Var, 9);
                og0Var.h = new ng0(og0Var, context, i12);
                ng0 ng0Var2 = og0Var.h;
                Objects.requireNonNull(ng0Var2);
                int i14 = 11;
                og0Var.R = new to0(new kc0(ng0Var2, i14), true);
                og0Var.h.setWillNotDraw(false);
                og0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                og0Var.h.addView(view3, w7.a6.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i15 = org.telegram.ui.ActionBar.j6.hg;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i16 = org.telegram.ui.ActionBar.j6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new bi.d5(i14));
                float f11 = 38;
                float f12 = 4;
                og0Var.h.addView(imageView, w7.a6.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new org.telegram.ui.ActionBar.e0(4, og0Var, z12));
                og0Var.h.addView(imageView2, w7.a6.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                og0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), mode);
                og0Var.X.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 1, -1));
                int i17 = 8;
                og0Var.X.setOnClickListener(new g80(og0Var, i17));
                View view4 = og0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof zf0);
                og0Var.n = z13;
                ImageView imageView4 = og0Var.X;
                if (!z13 || ((zf0Var2 = og0Var.r) != null && zf0Var2.x)) {
                    i17 = 0;
                }
                imageView4.setVisibility(i17);
                og0Var.h.addView(og0Var.X, w7.a6.e(38, 38, 17));
                org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(og0Var, context);
                og0Var.b0 = u7Var;
                og0Var.h.addView(u7Var, w7.a6.c(-1.0f, -1));
                og0Var.e.addView(og0Var.h, w7.a6.c(-1.0f, -1));
                og0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = sf.c.b(context, z12);
                og0Var.c = b10;
                int i18 = og0Var.H;
                b10.width = i18;
                b10.height = og0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i18 / 2.0f) + f7;
                    int i19 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i19) / 2.0f ? (i19 - i18) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    og0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i18) - AndroidUtilities.dp(16.0f);
                    og0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = og0Var.c;
                    float a2 = w7.q.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - og0Var.I);
                    og0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = og0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    og0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = og0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(og0Var.b, og0Var.d, layoutParams3);
                if (z11) {
                    og0Var.b.addView(og0Var.d, og0Var.c);
                    return true;
                }
                og0Var.d.setAlpha(0.0f);
                og0Var.d.setScaleX(0.1f);
                og0Var.d.setScaleY(0.1f);
                og0Var.b.addView(og0Var.d, og0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(wr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(og0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(og0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(og0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!og0Var.P) {
        }
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.P8 = pVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        pf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.W.h.a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.W.h.a.height();
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
        photoViewer.P8 = pVar;
    }

    @Override // rf.a
    public final Bitmap c() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // rf.a
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    @Override // rf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.g();
    }

    @Override // rf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new t50(this, 1));
        return this.l0;
    }

    public final void i() {
        org.telegram.ui.jt0 jt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (jt0Var = photoViewer.c4) == null) {
            return;
        }
        jt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
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
            AndroidUtilities.cancelRunOnUIThread(this.j0);
            this.i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new ig0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(wr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new kg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        t71 t71Var = this.V.F2;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
    }

    public final com.google.firebase.messaging.u n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new com.google.firebase.messaging.u(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            j71 j71Var = this.Q;
            j71Var.q = f7;
            j71Var.a();
        }
        return this.O.floatValue();
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
        this.b0 = null;
        this.f = null;
        this.V = null;
        pf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.r = null;
        this.U = null;
        this.y = null;
        this.w = false;
        this.P = false;
        this.c0 = false;
        this.f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.h0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.F = duration;
        duration.setInterpolator(wr.f);
        this.F.addUpdateListener(new q70(this, 3));
        this.F.addListener(new kg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        zf0 zf0Var = this.r;
        if (zf0Var != null) {
            y3 = zf0Var.G;
        } else {
            t71 t71Var = photoViewer.F2;
            if (t71Var == null) {
                return;
            } else {
                y3 = t71Var.y();
            }
        }
        ig0 ig0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(ig0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(ig0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
