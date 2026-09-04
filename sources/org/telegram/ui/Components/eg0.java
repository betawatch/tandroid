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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class eg0 implements sf.a {
    public static final hv0 n0 = new hv0(new p2(22), new p2(23));
    public static final hv0 o0 = new hv0(new p2(24), new p2(25));
    public static final eg0 p0 = new eg0();
    public boolean E;
    public ValueAnimator F;
    public mg.n G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public ko0 R;
    public int S;
    public int T;
    public tu U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public bi.a4 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.f d;
    public boolean d0;
    public dg0 e;
    public View f;
    public boolean f0;
    public dg0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public qf0 r;
    public ScaleGestureDetector s;
    public mg.n v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final w61 Q = new w61(false);
    public final zf0 e0 = new zf0(this, 1);
    public float[] g0 = new float[2];
    public final zf0 h0 = new zf0(this, 2);
    public final zf0 j0 = new zf0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static hk0 o(float f7, boolean z10) {
        hk0 hk0Var = new hk0();
        float f10 = 1.0f / f7;
        eg0 eg0Var = p0;
        if (eg0Var.P && !z10) {
            hk0Var.a = eg0Var.K;
            hk0Var.b = eg0Var.L + AndroidUtilities.statusBarHeight;
            hk0Var.c = eg0Var.H;
            hk0Var.d = eg0Var.I;
            return hk0Var;
        }
        float f11 = ((SharedPreferences) eg0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) eg0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) eg0Var.n().b).getFloat("scale_factor", 1.0f);
        hk0Var.c = s(f10) * f13;
        hk0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = hk0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            hk0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            hk0Var.a = (AndroidUtilities.displaySize.x - hk0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            hk0Var.b = w7.p.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - hk0Var.d) + AndroidUtilities.statusBarHeight;
            return hk0Var;
        }
        hk0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return hk0Var;
    }

    public static qf.e p() {
        eg0 eg0Var = p0;
        if (eg0Var != null) {
            return eg0Var.W;
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
        eg0 eg0Var = p0;
        w61 w61Var = eg0Var.Q;
        w61Var.e(false);
        w61Var.d(!z10);
        w61Var.f(true);
        bi.a4 a4Var = eg0Var.b0;
        if (a4Var != null) {
            a4Var.invalidate();
        }
        dg0 dg0Var = eg0Var.h;
        if (dg0Var != null) {
            dg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        eg0 eg0Var = p0;
        eg0Var.V = photoViewer;
        g71 g71Var = photoViewer.F2;
        qf.e eVar = eg0Var.W;
        if (eVar != null) {
            eVar.c();
            eg0Var.W = null;
        }
        if (g71Var != null && tf.c.a(photoViewer.y) == 1) {
            qf.d dVar = new qf.d(photoViewer.y, eg0Var);
            dVar.c = "photo-viewer-pip-" + g71Var.a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.j = eg0Var.d;
            dVar.k = eg0Var.k0;
            int i10 = eg0Var.S;
            int i11 = eg0Var.T;
            dVar.h = i10;
            dVar.i = i11;
            dVar.g = g71Var.d;
            dVar.f = true;
            eg0Var.W = dVar.a();
        }
        eg0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, qf0 qf0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        qf0 qf0Var2;
        final eg0 eg0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            eg0Var.getClass();
            if (tf.c.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!eg0Var.P) {
                    return false;
                }
                eg0Var.P = true;
                eg0Var.S = i10;
                eg0Var.T = i11;
                eg0Var.O = null;
                if (qf0Var == null || !qf0Var.x) {
                    eg0Var.r = null;
                } else {
                    eg0Var.r = qf0Var;
                }
                float f7 = ((SharedPreferences) eg0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) eg0Var.n().b).getFloat("y", -1.0f);
                eg0Var.J = ((SharedPreferences) eg0Var.n().b).getFloat("scale_factor", 1.0f);
                eg0Var.H = (int) (eg0Var.t() * eg0Var.J);
                eg0Var.I = (int) (eg0Var.r() * eg0Var.J);
                eg0Var.E = false;
                o1.k kVar = new o1.k(eg0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(eg0Var) { // from class: org.telegram.ui.Components.ag0
                    public final /* synthetic */ eg0 b;

                    {
                        this.b = eg0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
                        switch (i13) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f11).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                eg0Var.M = kVar;
                o1.k kVar2 = new o1.k(eg0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(eg0Var) { // from class: org.telegram.ui.Components.ag0
                    public final /* synthetic */ eg0 b;

                    {
                        this.b = eg0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
                        switch (i12) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f11).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                eg0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new mg.b(eg0Var, i12));
                eg0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    eg0Var.s.setStylusScaleEnabled(false);
                }
                eg0Var.v = new mg.n(context, new cg0(eg0Var, scaledTouchSlop));
                eg0Var.e = new dg0(eg0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(eg0Var, context, i12);
                eg0Var.d = fVar;
                fVar.addView(eg0Var.e, w7.x5.c(-1.0f, -1));
                dg0 dg0Var = eg0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                bi.z1 z1Var = yf.j0.a;
                dg0Var.setOutlineProvider(new yf.i0(0, dp));
                eg0Var.e.setClipToOutline(true);
                eg0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
                eg0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) eg0Var.f.getParent()).removeView(eg0Var.f);
                }
                eg0Var.e.addView(eg0Var.f, w7.x5.c(-1.0f, -1));
                View view2 = new View(context);
                eg0Var.k0 = view2;
                eg0Var.e.addView(view2, w7.x5.c(-1.0f, -1));
                eg0Var.Q.n = new l.d(eg0Var, 14);
                eg0Var.h = new dg0(eg0Var, context, i12);
                dg0 dg0Var2 = eg0Var.h;
                Objects.requireNonNull(dg0Var2);
                eg0Var.R = new ko0(new cc0(dg0Var2, 11), true);
                eg0Var.h.setWillNotDraw(false);
                eg0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                eg0Var.h.addView(view3, w7.x5.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.j6.hg;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i15 = org.telegram.ui.ActionBar.j6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ah.f(13));
                float f11 = 38;
                float f12 = 4;
                eg0Var.h.addView(imageView, w7.x5.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new bi.w2(6, eg0Var, z12));
                eg0Var.h.addView(imageView2, w7.x5.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                eg0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode);
                eg0Var.X.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                eg0Var.X.setOnClickListener(new x70(eg0Var, i16));
                View view4 = eg0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof qf0);
                eg0Var.n = z13;
                ImageView imageView4 = eg0Var.X;
                if (!z13 || ((qf0Var2 = eg0Var.r) != null && qf0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                eg0Var.h.addView(eg0Var.X, w7.x5.e(38, 38, 17));
                bi.a4 a4Var = new bi.a4(eg0Var, context);
                eg0Var.b0 = a4Var;
                eg0Var.h.addView(a4Var, w7.x5.c(-1.0f, -1));
                eg0Var.e.addView(eg0Var.h, w7.x5.c(-1.0f, -1));
                eg0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = tf.c.b(context, z12);
                eg0Var.c = b10;
                int i17 = eg0Var.H;
                b10.width = i17;
                b10.height = eg0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i17 / 2.0f) + f7;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    eg0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    eg0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = eg0Var.c;
                    float a2 = w7.p.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - eg0Var.I);
                    eg0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = eg0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    eg0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = eg0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(eg0Var.b, eg0Var.d, layoutParams3);
                if (z11) {
                    eg0Var.b.addView(eg0Var.d, eg0Var.c);
                    return true;
                }
                eg0Var.d.setAlpha(0.0f);
                eg0Var.d.setScaleX(0.1f);
                eg0Var.d.setScaleY(0.1f);
                eg0Var.b.addView(eg0Var.d, eg0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(pr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(eg0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(eg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(eg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!eg0Var.P) {
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.P8 = pVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        qf.e eVar = this.W;
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

    @Override // sf.a
    public final Bitmap c() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // sf.a
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    @Override // sf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.g();
    }

    @Override // sf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new j50(this, 1));
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
                AndroidUtilities.runOnUIThread(new zf0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(pr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new bg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        g71 g71Var = this.V.F2;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        g71 g71Var = this.V.F2;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.p();
    }

    public final mg.n n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new mg.n(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            w61 w61Var = this.Q;
            w61Var.q = f7;
            w61Var.a();
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
        qf.e eVar = this.W;
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
        duration.setInterpolator(pr.f);
        this.F.addUpdateListener(new h70(this, 3));
        this.F.addListener(new bg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        qf0 qf0Var = this.r;
        if (qf0Var != null) {
            y3 = qf0Var.G;
        } else {
            g71 g71Var = photoViewer.F2;
            if (g71Var == null) {
                return;
            } else {
                y3 = g71Var.y();
            }
        }
        zf0 zf0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(zf0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(zf0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
