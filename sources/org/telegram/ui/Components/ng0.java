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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ng0 implements ef.a {
    public static final iv0 k0 = new iv0(new k2(26), new k2(27));
    public static final iv0 l0 = new iv0(new k2(28), new k2(29));
    public static final ng0 m0 = new ng0();
    public boolean B;
    public ValueAnimator C;
    public ai D;
    public int E;
    public int F;
    public float H;
    public float I;
    public o1.j J;
    public o1.j K;
    public Float L;
    public boolean M;
    public oo0 O;
    public int P;
    public int Q;
    public ru R;
    public PhotoViewer S;
    public cf.f T;
    public ImageView U;
    public boolean V;
    public float W;
    public float X;
    public oh.b3 Y;
    public boolean Z;
    public boolean a0;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.g d;
    public mg0 e;
    public View f;
    public boolean f0;
    public mg0 h;
    public View h0;
    public TextureView i0;
    public boolean j0;
    public boolean n;
    public xf0 r;
    public ScaleGestureDetector s;
    public ai v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float G = 1.0f;
    public final z61 N = new z61(false);
    public final gg0 b0 = new gg0(this, 1);
    public float[] d0 = new float[2];
    public final gg0 e0 = new gg0(this, 2);
    public final gg0 g0 = new gg0(this, 3);

    public static void j(boolean z4) {
        m0.k(z4, false);
    }

    public static sk0 o(float f10, boolean z4) {
        sk0 sk0Var = new sk0();
        float f11 = 1.0f / f10;
        ng0 ng0Var = m0;
        if (ng0Var.M && !z4) {
            sk0Var.a = ng0Var.H;
            sk0Var.b = ng0Var.I + AndroidUtilities.statusBarHeight;
            sk0Var.c = ng0Var.E;
            sk0Var.d = ng0Var.F;
            return sk0Var;
        }
        float f12 = ((SharedPreferences) ng0Var.n().b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) ng0Var.n().b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) ng0Var.n().b).getFloat("scale_factor", 1.0f);
        sk0Var.c = s(f11) * f14;
        sk0Var.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = sk0Var.c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            sk0Var.a = f16 >= f17 / 2.0f ? (f17 - f15) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            sk0Var.a = (AndroidUtilities.displaySize.x - sk0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            sk0Var.b = k7.o.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - sk0Var.d) + AndroidUtilities.statusBarHeight;
            return sk0Var;
        }
        sk0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return sk0Var;
    }

    public static cf.f p() {
        ng0 ng0Var = m0;
        if (ng0Var != null) {
            return ng0Var.T;
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

    public static void v(boolean z4) {
        ng0 ng0Var = m0;
        z61 z61Var = ng0Var.N;
        z61Var.e(false);
        z61Var.d(!z4);
        z61Var.f(true);
        oh.b3 b3Var = ng0Var.Y;
        if (b3Var != null) {
            b3Var.invalidate();
        }
        mg0 mg0Var = ng0Var.h;
        if (mg0Var != null) {
            mg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ng0 ng0Var = m0;
        ng0Var.S = photoViewer;
        j71 j71Var = photoViewer.C2;
        cf.f fVar = ng0Var.T;
        if (fVar != null) {
            fVar.c();
            ng0Var.T = null;
        }
        if (j71Var != null && ff.d.a(photoViewer.y) == 1) {
            cf.e eVar = new cf.e(photoViewer.y, ng0Var);
            eVar.c = "photo-viewer-pip-" + j71Var.a;
            eVar.e = 1;
            eVar.d = AndroidUtilities.dp(10.0f);
            eVar.j = ng0Var.d;
            eVar.k = ng0Var.h0;
            int i10 = ng0Var.P;
            int i11 = ng0Var.Q;
            eVar.h = i10;
            eVar.i = i11;
            eVar.g = j71Var.d;
            eVar.f = true;
            ng0Var.T = eVar.a();
        }
        ng0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z4, Activity activity, xf0 xf0Var, View view, int i10, int i11, boolean z10) {
        boolean z11;
        xf0 xf0Var2;
        final ng0 ng0Var = m0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z4) {
            ng0Var.getClass();
            if (ff.d.a(ApplicationLoader.applicationContext) != 1) {
                z11 = false;
                if (!ng0Var.M) {
                    return false;
                }
                ng0Var.M = true;
                ng0Var.P = i10;
                ng0Var.Q = i11;
                ng0Var.L = null;
                if (xf0Var == null || !xf0Var.x) {
                    ng0Var.r = null;
                } else {
                    ng0Var.r = xf0Var;
                }
                float f10 = ((SharedPreferences) ng0Var.n().b).getFloat("x", -1.0f);
                float f11 = ((SharedPreferences) ng0Var.n().b).getFloat("y", -1.0f);
                ng0Var.G = ((SharedPreferences) ng0Var.n().b).getFloat("scale_factor", 1.0f);
                ng0Var.E = (int) (ng0Var.t() * ng0Var.G);
                ng0Var.F = (int) (ng0Var.r() * ng0Var.G);
                ng0Var.B = false;
                o1.j jVar = new o1.j(ng0Var, k0);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.u = kVar;
                jVar.a(new o1.f(ng0Var) { // from class: org.telegram.ui.Components.hg0
                    public final /* synthetic */ ng0 b;

                    {
                        this.b = ng0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f12, float f13) {
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
                ng0Var.J = jVar;
                o1.j jVar2 = new o1.j(ng0Var, l0);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.u = kVar2;
                jVar2.a(new o1.f(ng0Var) { // from class: org.telegram.ui.Components.hg0
                    public final /* synthetic */ ng0 b;

                    {
                        this.b = ng0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f12, float f13) {
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
                ng0Var.K = jVar2;
                Context context = z11 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new jg0(ng0Var, i13));
                ng0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    ng0Var.s.setStylusScaleEnabled(false);
                }
                ng0Var.v = new ai(context, new lg0(ng0Var, scaledTouchSlop));
                ng0Var.e = new mg0(ng0Var, context, i13);
                org.telegram.ui.g gVar = new org.telegram.ui.g(ng0Var, context, i12);
                ng0Var.d = gVar;
                gVar.addView(ng0Var.e, k7.c6.c(-1.0f, -1));
                mg0 mg0Var = ng0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                hg.j1 j1Var = lf.q0.a;
                mg0Var.setOutlineProvider(new lf.p0(0, dp));
                ng0Var.e.setClipToOutline(true);
                ng0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gg, false));
                ng0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) ng0Var.f.getParent()).removeView(ng0Var.f);
                }
                ng0Var.e.addView(ng0Var.f, k7.c6.c(-1.0f, -1));
                View view2 = new View(context);
                ng0Var.h0 = view2;
                ng0Var.e.addView(view2, k7.c6.c(-1.0f, -1));
                ng0Var.N.n = new org.telegram.ui.Cells.f1(ng0Var, 5);
                ng0Var.h = new mg0(ng0Var, context, i12);
                mg0 mg0Var2 = ng0Var.h;
                Objects.requireNonNull(mg0Var2);
                ng0Var.O = new oo0(new ec0(mg0Var2, 11), true);
                ng0Var.h.setWillNotDraw(false);
                ng0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                ng0Var.h.addView(view3, k7.c6.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.k6.hg;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i15 = org.telegram.ui.ActionBar.k6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new eg.m(14));
                float f12 = 38;
                float f13 = 4;
                ng0Var.h.addView(imageView, k7.c6.d(38, f12, 5, 0.0f, f13, f13, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new oh.b2(6, ng0Var, z11));
                ng0Var.h.addView(imageView2, k7.c6.d(38, f12, 5, 0.0f, f13, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                ng0Var.U = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i14, false), mode);
                ng0Var.U.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                ng0Var.U.setOnClickListener(new b80(ng0Var, i16));
                View view4 = ng0Var.f;
                boolean z12 = (view4 instanceof WebView) || (view4 instanceof xf0);
                ng0Var.n = z12;
                ImageView imageView4 = ng0Var.U;
                if (!z12 || ((xf0Var2 = ng0Var.r) != null && xf0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                ng0Var.h.addView(ng0Var.U, k7.c6.e(38, 38, 17));
                oh.b3 b3Var = new oh.b3(ng0Var, context);
                ng0Var.Y = b3Var;
                ng0Var.h.addView(b3Var, k7.c6.c(-1.0f, -1));
                ng0Var.e.addView(ng0Var.h, k7.c6.c(-1.0f, -1));
                ng0Var.b = (WindowManager) (z11 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = ff.d.b(context, z11);
                ng0Var.c = b10;
                int i17 = ng0Var.E;
                b10.width = i17;
                b10.height = ng0Var.F;
                if (f10 != -1.0f) {
                    float f14 = (i17 / 2.0f) + f10;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f14 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    ng0Var.H = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    ng0Var.H = dp4;
                    b10.x = (int) dp4;
                }
                if (f11 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = ng0Var.c;
                    float a2 = k7.o.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - ng0Var.F);
                    ng0Var.I = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = ng0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    ng0Var.I = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = ng0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(ng0Var.b, ng0Var.d, layoutParams3);
                if (z10) {
                    ng0Var.b.addView(ng0Var.d, ng0Var.c);
                    return true;
                }
                ng0Var.d.setAlpha(0.0f);
                ng0Var.d.setScaleX(0.1f);
                ng0Var.d.setScaleY(0.1f);
                ng0Var.b.addView(ng0Var.d, ng0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(pr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(ng0Var.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(ng0Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(ng0Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z11 = true;
        if (!ng0Var.M) {
        }
    }

    @Override // ef.a
    public final void a(c2.p pVar) {
        cf.f fVar = this.T;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.T.h.a.width();
            this.E = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.T.h.a.height();
            this.F = height;
            layoutParams2.height = height;
        }
        this.b.addView(this.d, this.c);
        this.j0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.S;
        if ((photoViewer != null ? photoViewer.C2 : null) == null) {
            return;
        }
        photoViewer.M8 = pVar;
    }

    @Override // ef.a
    public final Bitmap b() {
        TextureView textureView = this.i0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.i0.getBitmap();
    }

    @Override // ef.a
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || (textureView = photoViewer.t3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.S.t3.getBitmap();
    }

    @Override // ef.a
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && photoViewer.C2 != null) {
            photoViewer.M8 = pVar;
        }
        this.b.removeView(this.d);
        this.j0 = true;
        this.d.invalidate();
    }

    @Override // ef.a
    public final boolean g() {
        PhotoViewer photoViewer = this.S;
        return photoViewer != null && photoViewer.g();
    }

    @Override // ef.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.i0 = textureView;
        textureView.setVisibility(4);
        this.i0.setOpaque(false);
        this.i0.setSurfaceTextureListener(new jh.h(this, 2));
        return this.i0;
    }

    public final void i() {
        org.telegram.ui.ws0 ws0Var;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || (ws0Var = photoViewer.Z3) == null) {
            return;
        }
        ws0Var.cancelRewind();
    }

    public final void k(boolean z4, boolean z10) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (this.f0) {
            AndroidUtilities.cancelRunOnUIThread(this.g0);
            this.f0 = false;
        }
        o1.j jVar = this.J;
        if (jVar != null) {
            jVar.c();
            this.K.c();
        }
        if (z4 || this.d == null) {
            if (z10) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new gg0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(pr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new ig0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        j71 j71Var = this.S.C2;
        if (j71Var == null) {
            return 0L;
        }
        return j71Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        j71 j71Var = this.S.C2;
        if (j71Var == null) {
            return 0L;
        }
        return j71Var.p();
    }

    public final ai n() {
        if (this.D == null) {
            Point point = AndroidUtilities.displaySize;
            this.D = new ai(point.x, point.y);
        }
        return this.D;
    }

    public final float q() {
        if (this.L == null) {
            this.L = Float.valueOf(this.Q / this.P);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f10 = this.L.floatValue() < 1.0f ? 0.6f : 0.45f;
            z61 z61Var = this.N;
            z61Var.q = f10;
            z61Var.a();
        }
        return this.L.floatValue();
    }

    public final int r() {
        return (int) (s(r0) * q());
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.Y = null;
        this.f = null;
        this.S = null;
        cf.f fVar = this.T;
        if (fVar != null) {
            fVar.c();
            this.T = null;
        }
        this.r = null;
        this.R = null;
        this.y = null;
        this.w = false;
        this.M = false;
        this.Z = false;
        this.c0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.e0);
    }

    public final void y(boolean z4) {
        ValueAnimator duration = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f).setDuration(200L);
        this.C = duration;
        duration.setInterpolator(pr.f);
        this.C.addUpdateListener(new k70(this, 3));
        this.C.addListener(new ig0(this, 0));
        this.C.start();
    }

    public final void z() {
        boolean y10;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || this.U == null) {
            return;
        }
        xf0 xf0Var = this.r;
        if (xf0Var != null) {
            y10 = xf0Var.D;
        } else {
            j71 j71Var = photoViewer.C2;
            if (j71Var == null) {
                return;
            } else {
                y10 = j71Var.y();
            }
        }
        gg0 gg0Var = this.b0;
        AndroidUtilities.cancelRunOnUIThread(gg0Var);
        if (y10) {
            this.U.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(gg0Var, 500L);
        } else if (this.V) {
            this.U.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.U.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // ef.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // ef.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
