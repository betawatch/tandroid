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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mg0 implements df.a {
    public static final iv0 k0 = new iv0(new k2(26), new k2(27));
    public static final iv0 l0 = new iv0(new k2(28), new k2(29));
    public static final mg0 m0 = new mg0();
    public boolean B;
    public ValueAnimator C;
    public o2.i D;
    public int E;
    public int F;
    public float H;
    public float I;
    public o1.j J;
    public o1.j K;
    public Float L;
    public boolean M;
    public no0 O;
    public int P;
    public int Q;
    public ou R;
    public PhotoViewer S;
    public bf.f T;
    public ImageView U;
    public boolean V;
    public float W;
    public float X;
    public nh.a3 Y;
    public boolean Z;
    public boolean a0;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.g d;
    public lg0 e;
    public View f;
    public boolean f0;
    public lg0 h;
    public View h0;
    public TextureView i0;
    public boolean j0;
    public boolean n;
    public wf0 r;
    public ScaleGestureDetector s;
    public o2.i v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float G = 1.0f;
    public final y61 N = new y61(false);
    public final fg0 b0 = new fg0(this, 1);
    public float[] d0 = new float[2];
    public final fg0 e0 = new fg0(this, 2);
    public final fg0 g0 = new fg0(this, 3);

    public static void j(boolean z4) {
        m0.k(z4, false);
    }

    public static rk0 o(float f10, boolean z4) {
        rk0 rk0Var = new rk0();
        float f11 = 1.0f / f10;
        mg0 mg0Var = m0;
        if (mg0Var.M && !z4) {
            rk0Var.a = mg0Var.H;
            rk0Var.b = mg0Var.I + AndroidUtilities.statusBarHeight;
            rk0Var.c = mg0Var.E;
            rk0Var.d = mg0Var.F;
            return rk0Var;
        }
        float f12 = ((SharedPreferences) mg0Var.n().b).getFloat("x", -1.0f);
        float f13 = ((SharedPreferences) mg0Var.n().b).getFloat("y", -1.0f);
        float f14 = ((SharedPreferences) mg0Var.n().b).getFloat("scale_factor", 1.0f);
        rk0Var.c = s(f11) * f14;
        rk0Var.d = ((int) (s(f11) * f11)) * f14;
        if (f12 != -1.0f) {
            float f15 = rk0Var.c;
            float f16 = (f15 / 2.0f) + f12;
            float f17 = AndroidUtilities.displaySize.x;
            rk0Var.a = f16 >= f17 / 2.0f ? (f17 - f15) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            rk0Var.a = (AndroidUtilities.displaySize.x - rk0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f13 != -1.0f) {
            rk0Var.b = k7.n.a(f13, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - rk0Var.d) + AndroidUtilities.statusBarHeight;
            return rk0Var;
        }
        rk0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return rk0Var;
    }

    public static bf.f p() {
        mg0 mg0Var = m0;
        if (mg0Var != null) {
            return mg0Var.T;
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
        mg0 mg0Var = m0;
        y61 y61Var = mg0Var.N;
        y61Var.e(false);
        y61Var.d(!z4);
        y61Var.f(true);
        nh.a3 a3Var = mg0Var.Y;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        lg0 lg0Var = mg0Var.h;
        if (lg0Var != null) {
            lg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        mg0 mg0Var = m0;
        mg0Var.S = photoViewer;
        i71 i71Var = photoViewer.C2;
        bf.f fVar = mg0Var.T;
        if (fVar != null) {
            fVar.c();
            mg0Var.T = null;
        }
        if (i71Var != null && ef.d.a(photoViewer.y) == 1) {
            bf.e eVar = new bf.e(photoViewer.y, mg0Var);
            eVar.c = "photo-viewer-pip-" + i71Var.a;
            eVar.e = 1;
            eVar.d = AndroidUtilities.dp(10.0f);
            eVar.j = mg0Var.d;
            eVar.k = mg0Var.h0;
            int i10 = mg0Var.P;
            int i11 = mg0Var.Q;
            eVar.h = i10;
            eVar.i = i11;
            eVar.g = i71Var.d;
            eVar.f = true;
            mg0Var.T = eVar.a();
        }
        mg0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z4, Activity activity, wf0 wf0Var, View view, int i10, int i11, boolean z10) {
        boolean z11;
        wf0 wf0Var2;
        final mg0 mg0Var = m0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z4) {
            mg0Var.getClass();
            if (ef.d.a(ApplicationLoader.applicationContext) != 1) {
                z11 = false;
                if (!mg0Var.M) {
                    return false;
                }
                mg0Var.M = true;
                mg0Var.P = i10;
                mg0Var.Q = i11;
                mg0Var.L = null;
                if (wf0Var == null || !wf0Var.x) {
                    mg0Var.r = null;
                } else {
                    mg0Var.r = wf0Var;
                }
                float f10 = ((SharedPreferences) mg0Var.n().b).getFloat("x", -1.0f);
                float f11 = ((SharedPreferences) mg0Var.n().b).getFloat("y", -1.0f);
                mg0Var.G = ((SharedPreferences) mg0Var.n().b).getFloat("scale_factor", 1.0f);
                mg0Var.E = (int) (mg0Var.t() * mg0Var.G);
                mg0Var.F = (int) (mg0Var.r() * mg0Var.G);
                mg0Var.B = false;
                o1.j jVar = new o1.j(mg0Var, k0);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.u = kVar;
                jVar.a(new o1.f(mg0Var) { // from class: org.telegram.ui.Components.gg0
                    public final /* synthetic */ mg0 b;

                    {
                        this.b = mg0Var;
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
                mg0Var.J = jVar;
                o1.j jVar2 = new o1.j(mg0Var, l0);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.u = kVar2;
                jVar2.a(new o1.f(mg0Var) { // from class: org.telegram.ui.Components.gg0
                    public final /* synthetic */ mg0 b;

                    {
                        this.b = mg0Var;
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
                mg0Var.K = jVar2;
                Context context = z11 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new ig0(mg0Var, i13));
                mg0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    mg0Var.s.setStylusScaleEnabled(false);
                }
                mg0Var.v = new o2.i(context, new kg0(mg0Var, scaledTouchSlop));
                mg0Var.e = new lg0(mg0Var, context, i13);
                org.telegram.ui.g gVar = new org.telegram.ui.g(mg0Var, context, i12);
                mg0Var.d = gVar;
                gVar.addView(mg0Var.e, k7.b6.c(-1.0f, -1));
                lg0 lg0Var = mg0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                gg.j1 j1Var = kf.r0.a;
                lg0Var.setOutlineProvider(new kf.q0(0, dp));
                mg0Var.e.setClipToOutline(true);
                mg0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
                mg0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) mg0Var.f.getParent()).removeView(mg0Var.f);
                }
                mg0Var.e.addView(mg0Var.f, k7.b6.c(-1.0f, -1));
                View view2 = new View(context);
                mg0Var.h0 = view2;
                mg0Var.e.addView(view2, k7.b6.c(-1.0f, -1));
                mg0Var.N.n = new zz(mg0Var, i12);
                mg0Var.h = new lg0(mg0Var, context, i12);
                lg0 lg0Var2 = mg0Var.h;
                Objects.requireNonNull(lg0Var2);
                mg0Var.O = new no0(new dc0(lg0Var2, 11), true);
                mg0Var.h.setWillNotDraw(false);
                mg0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                mg0Var.h.addView(view3, k7.b6.c(-1.0f, -1));
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
                imageView.setOnClickListener(new dg.m(14));
                float f12 = 38;
                float f13 = 4;
                mg0Var.h.addView(imageView, k7.b6.d(38, f12, 5, 0.0f, f13, f13, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new nh.a2(6, mg0Var, z11));
                mg0Var.h.addView(imageView2, k7.b6.d(38, f12, 5, 0.0f, f13, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                mg0Var.U = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode);
                mg0Var.U.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                mg0Var.U.setOnClickListener(new a80(mg0Var, i16));
                View view4 = mg0Var.f;
                boolean z12 = (view4 instanceof WebView) || (view4 instanceof wf0);
                mg0Var.n = z12;
                ImageView imageView4 = mg0Var.U;
                if (!z12 || ((wf0Var2 = mg0Var.r) != null && wf0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                mg0Var.h.addView(mg0Var.U, k7.b6.e(38, 38, 17));
                nh.a3 a3Var = new nh.a3(mg0Var, context);
                mg0Var.Y = a3Var;
                mg0Var.h.addView(a3Var, k7.b6.c(-1.0f, -1));
                mg0Var.e.addView(mg0Var.h, k7.b6.c(-1.0f, -1));
                mg0Var.b = (WindowManager) (z11 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = ef.d.b(context, z11);
                mg0Var.c = b10;
                int i17 = mg0Var.E;
                b10.width = i17;
                b10.height = mg0Var.F;
                if (f10 != -1.0f) {
                    float f14 = (i17 / 2.0f) + f10;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f14 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    mg0Var.H = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    mg0Var.H = dp4;
                    b10.x = (int) dp4;
                }
                if (f11 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = mg0Var.c;
                    float a2 = k7.n.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - mg0Var.F);
                    mg0Var.I = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = mg0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    mg0Var.I = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = mg0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(mg0Var.b, mg0Var.d, layoutParams3);
                if (z10) {
                    mg0Var.b.addView(mg0Var.d, mg0Var.c);
                    return true;
                }
                mg0Var.d.setAlpha(0.0f);
                mg0Var.d.setScaleX(0.1f);
                mg0Var.d.setScaleY(0.1f);
                mg0Var.b.addView(mg0Var.d, mg0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(mr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(mg0Var.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(mg0Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(mg0Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z11 = true;
        if (!mg0Var.M) {
        }
    }

    @Override // df.a
    public final void a(c2.p pVar) {
        bf.f fVar = this.T;
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

    @Override // df.a
    public final Bitmap b() {
        TextureView textureView = this.i0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.i0.getBitmap();
    }

    @Override // df.a
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || (textureView = photoViewer.t3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.S.t3.getBitmap();
    }

    @Override // df.a
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.S;
        if (photoViewer != null && photoViewer.C2 != null) {
            photoViewer.M8 = pVar;
        }
        this.b.removeView(this.d);
        this.j0 = true;
        this.d.invalidate();
    }

    @Override // df.a
    public final boolean g() {
        PhotoViewer photoViewer = this.S;
        return photoViewer != null && photoViewer.g();
    }

    @Override // df.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.i0 = textureView;
        textureView.setVisibility(4);
        this.i0.setOpaque(false);
        this.i0.setSurfaceTextureListener(new ih.h(this, 2));
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
                AndroidUtilities.runOnUIThread(new fg0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(mr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new hg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        i71 i71Var = this.S.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        i71 i71Var = this.S.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.p();
    }

    public final o2.i n() {
        if (this.D == null) {
            Point point = AndroidUtilities.displaySize;
            this.D = new o2.i(point.x, point.y);
        }
        return this.D;
    }

    public final float q() {
        if (this.L == null) {
            this.L = Float.valueOf(this.Q / this.P);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f10 = this.L.floatValue() < 1.0f ? 0.6f : 0.45f;
            y61 y61Var = this.N;
            y61Var.q = f10;
            y61Var.a();
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
        bf.f fVar = this.T;
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
        duration.setInterpolator(mr.f);
        this.C.addUpdateListener(new j70(this, 3));
        this.C.addListener(new hg0(this, 0));
        this.C.start();
    }

    public final void z() {
        boolean y10;
        PhotoViewer photoViewer = this.S;
        if (photoViewer == null || this.U == null) {
            return;
        }
        wf0 wf0Var = this.r;
        if (wf0Var != null) {
            y10 = wf0Var.D;
        } else {
            i71 i71Var = photoViewer.C2;
            if (i71Var == null) {
                return;
            } else {
                y10 = i71Var.y();
            }
        }
        fg0 fg0Var = this.b0;
        AndroidUtilities.cancelRunOnUIThread(fg0Var);
        if (y10) {
            this.U.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(fg0Var, 500L);
        } else if (this.V) {
            this.U.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.U.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // df.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // df.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
