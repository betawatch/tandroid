package jh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.zm;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i1 implements NotificationCenter.NotificationCenterDelegate, af.a {
    public static final su0 T = new su0(new ia.l(11), new ia.l(12));
    public static final su0 U = new su0(new ia.l(13), new ia.l(14));
    public static final i1 V;
    public boolean A;
    public boolean B;
    public View C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public ye.d H;
    public float I;
    public float J;
    public float K;
    public o1.j L;
    public o1.j M;
    public Float N;
    public boolean O;
    public boolean P;
    public y9 Q;
    public lh.c4 R;
    public boolean S;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public h1 d;
    public ag.p1 e;
    public lh.c4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.n9 n;
    public zm r;
    public boolean s;
    public d1 v;
    public int w;
    public ScaleGestureDetector x;
    public m5.o y;

    static {
        i1 i1Var = new i1();
        i1Var.a = 1.4f;
        i1Var.s = true;
        i1Var.I = 1.0f;
        i1Var.Q = new y9(i1Var, 10);
        V = i1Var;
    }

    public static void j() {
        V.k(true);
    }

    public static void o(Activity activity, d1 d1Var) {
        i1 i1Var = V;
        if (d1Var == null || i1Var.O) {
            return;
        }
        i1Var.O = true;
        i1Var.v = d1Var;
        int i10 = d1Var.e;
        i1Var.w = i10;
        NotificationCenter.getInstance(i10).addObserver(i1Var, NotificationCenter.liveStoryUpdated);
        i1Var.F = i1Var.n();
        i1Var.G = i1Var.m();
        i1Var.I = 1.0f;
        i1Var.D = false;
        o1.j jVar = new o1.j(i1Var, T);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.u = kVar;
        i1Var.L = jVar;
        o1.j jVar2 = new o1.j(i1Var, U);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.u = kVar2;
        i1Var.M = jVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new f1());
        i1Var.x = scaleGestureDetector;
        int i11 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i11 >= 23) {
            i1Var.x.setStylusScaleEnabled(false);
        }
        i1Var.y = new m5.o(context, new g1(scaledTouchSlop));
        ag.p1 p1Var = new ag.p1(context, 8);
        p1Var.b = new Path();
        i1Var.e = p1Var;
        h1 h1Var = new h1(context);
        i1Var.d = h1Var;
        h1Var.addView(i1Var.e, h7.z5.c(-1.0f, -1));
        i1Var.e.setOutlineProvider(new cg.l1(4));
        i1Var.e.setClipToOutline(true);
        i1Var.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        i1Var.n = n9Var;
        i1Var.e.addView(n9Var, h7.z5.c(-1.0f, -1));
        lh.c4 c4Var = new lh.c4(context, i1Var.w);
        i1Var.f = c4Var;
        c4Var.setAlpha(0.0f);
        i1Var.e.addView(i1Var.f, h7.z5.c(-1.0f, -1));
        zm zmVar = new zm(context, 4);
        i1Var.r = zmVar;
        i1Var.e.addView(zmVar, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        i1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        i1Var.h.addView(view, h7.z5.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = org.telegram.ui.ActionBar.g6.hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.g6.i6;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new ag.l2(6));
        float f10 = 38;
        float f11 = 4;
        i1Var.h.addView(imageView, h7.z5.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new ag.q0(22, d1Var, context));
        i1Var.h.addView(imageView2, h7.z5.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        i1Var.e.addView(i1Var.h, h7.z5.c(-1.0f, -1));
        i1Var.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams b10 = bf.d.b(context, false);
        i1Var.c = b10;
        int i14 = i1Var.F;
        b10.width = i14;
        b10.height = i1Var.G;
        float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        i1Var.J = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = i1Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f);
        i1Var.K = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = i1Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        i1Var.d.setAlpha(0.0f);
        i1Var.d.setScaleX(0.1f);
        i1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(i1Var.b, i1Var.d, i1Var.c);
        i1Var.b.addView(i1Var.d, i1Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, (Property<h1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<h1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<h1, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new ig.r(1));
        animatorSet.start();
        i1Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        ye.d dVar = i1Var.H;
        if (dVar != null) {
            dVar.c();
            i1Var.H = null;
        }
        if (activity == null || bf.d.a(activity) != 1) {
            return;
        }
        ye.c cVar = new ye.c(activity, i1Var);
        cVar.c = "pip-live-story";
        cVar.e = 1;
        cVar.d = AndroidUtilities.dp(10.0f);
        cVar.j = i1Var.d;
        cVar.k = i1Var.f.getPlaceholderView();
        i1Var.H = cVar.a();
    }

    @Override // af.a
    public final Bitmap a() {
        lh.c4 c4Var = this.R;
        if (c4Var == null || !c4Var.a()) {
            return null;
        }
        return this.R.getBitmap();
    }

    @Override // af.a
    public final Bitmap c() {
        lh.c4 c4Var = this.f;
        if (c4Var == null || !c4Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // af.a
    public final void d(bf.e eVar) {
        i();
        this.S = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override // af.a
    public final void f(bf.e eVar) {
        ye.d dVar = this.H;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.H.h.a.width();
            this.F = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.H.h.a.height();
            this.G = height;
            layoutParams2.height = height;
        }
        this.S = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        lh.c4 c4Var = this.R;
        if (c4Var != null) {
            c4Var.b();
            this.R = null;
        }
        i();
    }

    @Override // af.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // af.a
    public final View h() {
        lh.c4 c4Var = new lh.c4(this.f.getContext(), this.w);
        this.R = c4Var;
        return c4Var;
    }

    public final void i() {
        d1 d1Var = this.v;
        if (d1Var != null) {
            d1Var.v(1.0f);
            lh.c4 c4Var = this.R;
            if (c4Var != null) {
                this.v.s(c4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            er erVar = er.f;
            duration.setInterpolator(erVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
            this.s = false;
        }
        if (this.F == n() * this.I && this.G == m() * this.I) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int n10 = (int) (n() * this.I);
        this.F = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int m10 = (int) (m() * this.I);
        this.G = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.b, this.d, this.c);
        o1.j jVar = this.L;
        float f10 = this.J;
        jVar.b = f10;
        jVar.c = true;
        jVar.u.i = a9.p.d(n(), this.I, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.I)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.L.f();
        o1.j jVar2 = this.M;
        jVar2.b = this.K;
        jVar2.c = true;
        jVar2.u.i = h7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.I)) - AndroidUtilities.dp(16.0f));
        this.M.f();
    }

    public final void k(boolean z10) {
        if (this.O) {
            this.O = false;
            AndroidUtilities.runOnUIThread(new ag.l3(10), 100L);
            NotificationCenter.getInstance(this.w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.P) {
                AndroidUtilities.cancelRunOnUIThread(this.Q);
                this.P = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(er.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<h1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<h1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<h1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ag.x(5, this, z10));
            animatorSet.start();
            ye.d dVar = this.H;
            if (dVar != null) {
                dVar.c();
                this.H = null;
            }
        }
    }

    public final float l() {
        if (this.N == null) {
            this.N = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.N.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f10;
        if (l() >= 1.0f) {
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

    public final void p(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.E = duration;
        duration.setInterpolator(er.f);
        this.E.addUpdateListener(new ag.u(this, 19));
        this.E.addListener(new ag.r1(this, 14));
        this.E.start();
    }

    @Override // af.a
    public final /* synthetic */ void b(Canvas canvas) {
    }

    @Override // af.a
    public final /* synthetic */ void e(Canvas canvas) {
    }
}
