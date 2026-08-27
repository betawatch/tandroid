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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sf0 implements af.a {
    public static final su0 j0 = new su0(new pc0(2), new pc0(3));
    public static final su0 k0 = new su0(new pc0(4), new pc0(5));
    public static final sf0 l0 = new sf0();
    public boolean A;
    public ValueAnimator B;
    public n1.d C;
    public int D;
    public int E;
    public float G;
    public float H;
    public o1.j I;
    public o1.j J;
    public Float K;
    public boolean L;
    public un0 N;
    public int O;
    public int P;
    public fu Q;
    public PhotoViewer R;
    public ye.d S;
    public ImageView T;
    public boolean U;
    public float V;
    public float W;
    public jh.a3 X;
    public boolean Y;
    public boolean Z;
    public WindowManager b;
    public boolean b0;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.f d;
    public rf0 e;
    public boolean e0;
    public View f;
    public View g0;
    public rf0 h;
    public TextureView h0;
    public boolean i0;
    public boolean n;
    public df0 r;
    public ScaleGestureDetector s;
    public n1.d v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float F = 1.0f;
    public final c61 M = new c61(false);
    public final mf0 a0 = new mf0(this, 1);
    public float[] c0 = new float[2];
    public final mf0 d0 = new mf0(this, 2);
    public final mf0 f0 = new mf0(this, 3);

    public static void j(boolean z10) {
        l0.k(z10, false);
    }

    public static yj0 o(float f10, boolean z10) {
        yj0 yj0Var = new yj0();
        float f11 = 1.0f / f10;
        sf0 sf0Var = l0;
        if (sf0Var.L && !z10) {
            yj0Var.a = sf0Var.G;
            yj0Var.b = sf0Var.H + AndroidUtilities.statusBarHeight;
            yj0Var.c = sf0Var.D;
            yj0Var.d = sf0Var.E;
            return yj0Var;
        }
        float f12 = ((SharedPreferences) sf0Var.n().b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) sf0Var.n().b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) sf0Var.n().b).getFloat("scale_factor", 1.0f);
        yj0Var.c = s(f11) * f14;
        yj0Var.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = yj0Var.c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            yj0Var.a = f16 >= f17 / 2.0f ? (f17 - f15) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            yj0Var.a = (AndroidUtilities.displaySize.x - yj0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            yj0Var.b = h7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - yj0Var.d) + AndroidUtilities.statusBarHeight;
            return yj0Var;
        }
        yj0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return yj0Var;
    }

    public static ye.d p() {
        sf0 sf0Var = l0;
        if (sf0Var != null) {
            return sf0Var.S;
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
        sf0 sf0Var = l0;
        c61 c61Var = sf0Var.M;
        c61Var.e(false);
        c61Var.d(!z10);
        c61Var.f(true);
        jh.a3 a3Var = sf0Var.X;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        rf0 rf0Var = sf0Var.h;
        if (rf0Var != null) {
            rf0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        sf0 sf0Var = l0;
        sf0Var.R = photoViewer;
        m61 m61Var = photoViewer.B2;
        ye.d dVar = sf0Var.S;
        if (dVar != null) {
            dVar.c();
            sf0Var.S = null;
        }
        if (m61Var != null && bf.d.a(photoViewer.y) == 1) {
            ye.c cVar = new ye.c(photoViewer.y, sf0Var);
            cVar.c = "photo-viewer-pip-" + m61Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = sf0Var.d;
            cVar.k = sf0Var.g0;
            int i10 = sf0Var.O;
            int i11 = sf0Var.P;
            cVar.h = i10;
            cVar.i = i11;
            cVar.g = m61Var.d;
            cVar.f = true;
            sf0Var.S = cVar.a();
        }
        sf0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, df0 df0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        df0 df0Var2;
        final sf0 sf0Var = l0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            sf0Var.getClass();
            if (bf.d.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!sf0Var.L) {
                    return false;
                }
                sf0Var.L = true;
                sf0Var.O = i10;
                sf0Var.P = i11;
                sf0Var.K = null;
                if (df0Var == null || !df0Var.x) {
                    sf0Var.r = null;
                } else {
                    sf0Var.r = df0Var;
                }
                float f10 = ((SharedPreferences) sf0Var.n().b).getFloat("x", -1.0f);
                float f11 = ((SharedPreferences) sf0Var.n().b).getFloat("y", -1.0f);
                sf0Var.F = ((SharedPreferences) sf0Var.n().b).getFloat("scale_factor", 1.0f);
                sf0Var.D = (int) (sf0Var.t() * sf0Var.F);
                sf0Var.E = (int) (sf0Var.r() * sf0Var.F);
                sf0Var.A = false;
                o1.j jVar = new o1.j(sf0Var, j0);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.u = kVar;
                jVar.a(new o1.f(sf0Var) { // from class: org.telegram.ui.Components.nf0
                    public final /* synthetic */ sf0 b;

                    {
                        this.b = sf0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f12, float f13) {
                        switch (i13) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f12).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f12).apply();
                                break;
                        }
                    }
                });
                sf0Var.I = jVar;
                o1.j jVar2 = new o1.j(sf0Var, k0);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.u = kVar2;
                jVar2.a(new o1.f(sf0Var) { // from class: org.telegram.ui.Components.nf0
                    public final /* synthetic */ sf0 b;

                    {
                        this.b = sf0Var;
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
                sf0Var.J = jVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new pf0(sf0Var, i13));
                sf0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    sf0Var.s.setStylusScaleEnabled(false);
                }
                sf0Var.v = new n1.d(context, new qf0(sf0Var, scaledTouchSlop));
                sf0Var.e = new rf0(sf0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(sf0Var, context, i12);
                sf0Var.d = fVar;
                fVar.addView(sf0Var.e, h7.z5.c(-1.0f, -1));
                rf0 rf0Var = sf0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                cg.l1 l1Var = gf.r0.a;
                rf0Var.setOutlineProvider(new gf.q0(0, dp));
                sf0Var.e.setClipToOutline(true);
                sf0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false));
                sf0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) sf0Var.f.getParent()).removeView(sf0Var.f);
                }
                sf0Var.e.addView(sf0Var.f, h7.z5.c(-1.0f, -1));
                View view2 = new View(context);
                sf0Var.g0 = view2;
                sf0Var.e.addView(view2, h7.z5.c(-1.0f, -1));
                sf0Var.M.n = new o0.b(sf0Var, 8);
                sf0Var.h = new rf0(sf0Var, context, i12);
                rf0 rf0Var2 = sf0Var.h;
                Objects.requireNonNull(rf0Var2);
                sf0Var.N = new un0(new mb0(rf0Var2, 11), true);
                sf0Var.h.setWillNotDraw(false);
                sf0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                sf0Var.h.addView(view3, h7.z5.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.g6.hg;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i15 = org.telegram.ui.ActionBar.g6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ag.l2(16));
                float f12 = 38;
                float f13 = 4;
                sf0Var.h.addView(imageView, h7.z5.d(38, f12, 5, 0.0f, f13, f13, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new jh.a2(6, sf0Var, z12));
                sf0Var.h.addView(imageView2, h7.z5.d(38, f12, 5, 0.0f, f13, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                sf0Var.T = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode);
                sf0Var.T.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                sf0Var.T.setOnClickListener(new l70(sf0Var, i16));
                View view4 = sf0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof df0);
                sf0Var.n = z13;
                ImageView imageView4 = sf0Var.T;
                if (!z13 || ((df0Var2 = sf0Var.r) != null && df0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                sf0Var.h.addView(sf0Var.T, h7.z5.e(38, 38, 17));
                jh.a3 a3Var = new jh.a3(sf0Var, context);
                sf0Var.X = a3Var;
                sf0Var.h.addView(a3Var, h7.z5.c(-1.0f, -1));
                sf0Var.e.addView(sf0Var.h, h7.z5.c(-1.0f, -1));
                sf0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = bf.d.b(context, z12);
                sf0Var.c = b10;
                int i17 = sf0Var.D;
                b10.width = i17;
                b10.height = sf0Var.E;
                if (f10 != -1.0f) {
                    float f14 = (i17 / 2.0f) + f10;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f14 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    sf0Var.G = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    sf0Var.G = dp4;
                    b10.x = (int) dp4;
                }
                if (f11 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = sf0Var.c;
                    float a2 = h7.n.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - sf0Var.E);
                    sf0Var.H = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = sf0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    sf0Var.H = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = sf0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(sf0Var.b, sf0Var.d, layoutParams3);
                if (z11) {
                    sf0Var.b.addView(sf0Var.d, sf0Var.c);
                    return true;
                }
                sf0Var.d.setAlpha(0.0f);
                sf0Var.d.setScaleX(0.1f);
                sf0Var.d.setScaleY(0.1f);
                sf0Var.b.addView(sf0Var.d, sf0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(er.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(sf0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(sf0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(sf0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!sf0Var.L) {
        }
    }

    @Override // af.a
    public final Bitmap a() {
        TextureView textureView = this.h0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.h0.getBitmap();
    }

    @Override // af.a
    public final Bitmap c() {
        TextureView textureView;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (textureView = photoViewer.s3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.R.s3.getBitmap();
    }

    @Override // af.a
    public final void d(bf.e eVar) {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.B2 != null) {
            photoViewer.L8 = eVar;
        }
        this.b.removeView(this.d);
        this.i0 = true;
        this.d.invalidate();
    }

    @Override // af.a
    public final void f(bf.e eVar) {
        ye.d dVar = this.S;
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
        photoViewer.L8 = eVar;
    }

    @Override // af.a
    public final boolean g() {
        PhotoViewer photoViewer = this.R;
        return photoViewer != null && photoViewer.g();
    }

    @Override // af.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.h0 = textureView;
        textureView.setVisibility(4);
        this.h0.setOpaque(false);
        this.h0.setSurfaceTextureListener(new eh.h(this, 2));
        return this.h0;
    }

    public final void i() {
        org.telegram.ui.is0 is0Var;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (is0Var = photoViewer.Y3) == null) {
            return;
        }
        is0Var.cancelRewind();
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
        int i10 = 0;
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
                AndroidUtilities.runOnUIThread(new mf0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new of0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        m61 m61Var = this.R.B2;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.o();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        m61 m61Var = this.R.B2;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.q();
    }

    public final n1.d n() {
        if (this.C == null) {
            Point point = AndroidUtilities.displaySize;
            this.C = new n1.d(point.x, point.y);
        }
        return this.C;
    }

    public final float q() {
        if (this.K == null) {
            this.K = Float.valueOf(this.P / this.O);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f10 = this.K.floatValue() < 1.0f ? 0.6f : 0.45f;
            c61 c61Var = this.M;
            c61Var.q = f10;
            c61Var.a();
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
        ye.d dVar = this.S;
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
        duration.setInterpolator(er.f);
        this.B.addUpdateListener(new v60(this, 3));
        this.B.addListener(new of0(this, 0));
        this.B.start();
    }

    public final void z() {
        boolean z10;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || this.T == null) {
            return;
        }
        df0 df0Var = this.r;
        if (df0Var != null) {
            z10 = df0Var.C;
        } else {
            m61 m61Var = photoViewer.B2;
            if (m61Var == null) {
                return;
            } else {
                z10 = m61Var.z();
            }
        }
        mf0 mf0Var = this.a0;
        AndroidUtilities.cancelRunOnUIThread(mf0Var);
        if (z10) {
            this.T.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(mf0Var, 500L);
        } else if (this.U) {
            this.T.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.T.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // af.a
    public final /* synthetic */ void b(Canvas canvas) {
    }

    @Override // af.a
    public final /* synthetic */ void e(Canvas canvas) {
    }
}
