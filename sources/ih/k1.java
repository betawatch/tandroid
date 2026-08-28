package ih;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k1 implements NotificationCenter.NotificationCenterDelegate, ze.a {
    public static final pu0 T = new pu0(new i3.i(2), new i3.i(3));
    public static final pu0 U = new pu0(new i3.i(4), new i3.i(5));
    public static final k1 V;
    public boolean A;
    public boolean B;
    public View C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public xe.d H;
    public float I;
    public float J;
    public float K;
    public o1.j L;
    public o1.j M;
    public Float N;
    public boolean O;
    public boolean P;
    public g Q;
    public kh.d4 R;
    public boolean S;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public j1 d;
    public fh.d2 e;
    public kh.d4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.o9 n;
    public an r;
    public boolean s;
    public f1 v;
    public int w;
    public ScaleGestureDetector x;
    public m5.c0 y;

    static {
        k1 k1Var = new k1();
        k1Var.a = 1.4f;
        k1Var.s = true;
        k1Var.I = 1.0f;
        k1Var.Q = new g(k1Var, 3);
        V = k1Var;
    }

    public static void j() {
        V.k(true);
    }

    public static void o(Activity activity, f1 f1Var) {
        k1 k1Var = V;
        if (f1Var == null || k1Var.O) {
            return;
        }
        k1Var.O = true;
        k1Var.v = f1Var;
        int i9 = f1Var.e;
        k1Var.w = i9;
        NotificationCenter.getInstance(i9).addObserver(k1Var, NotificationCenter.liveStoryUpdated);
        k1Var.F = k1Var.n();
        k1Var.G = k1Var.m();
        k1Var.I = 1.0f;
        k1Var.D = false;
        o1.j jVar = new o1.j(k1Var, T);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.u = kVar;
        k1Var.L = jVar;
        o1.j jVar2 = new o1.j(k1Var, U);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.u = kVar2;
        k1Var.M = jVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new h1());
        k1Var.x = scaleGestureDetector;
        int i10 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i10 >= 23) {
            k1Var.x.setStylusScaleEnabled(false);
        }
        k1Var.y = new m5.c0(context, new i1(scaledTouchSlop));
        int i11 = 5;
        fh.d2 d2Var = new fh.d2(context, i11);
        d2Var.b = new Path();
        k1Var.e = d2Var;
        j1 j1Var = new j1(context);
        k1Var.d = j1Var;
        j1Var.addView(k1Var.e, g7.e6.c(-1.0f, -1));
        k1Var.e.setOutlineProvider(new bg.q1(4));
        k1Var.e.setClipToOutline(true);
        k1Var.e.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        k1Var.n = o9Var;
        k1Var.e.addView(o9Var, g7.e6.c(-1.0f, -1));
        kh.d4 d4Var = new kh.d4(context, k1Var.w);
        k1Var.f = d4Var;
        d4Var.setAlpha(0.0f);
        k1Var.e.addView(k1Var.f, g7.e6.c(-1.0f, -1));
        an anVar = new an(context, 2);
        k1Var.r = anVar;
        k1Var.e.addView(anVar, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        k1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        k1Var.h.addView(view, g7.e6.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = org.telegram.ui.ActionBar.f6.hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.f6.i6;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new fh.n(i11));
        float f10 = 38;
        float f11 = 4;
        k1Var.h.addView(imageView, g7.e6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new bg.u1(21, f1Var, context));
        k1Var.h.addView(imageView2, g7.e6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        k1Var.e.addView(k1Var.h, g7.e6.c(-1.0f, -1));
        k1Var.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams b10 = af.d.b(context, false);
        k1Var.c = b10;
        int i14 = k1Var.F;
        b10.width = i14;
        b10.height = k1Var.G;
        float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        k1Var.J = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = k1Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f);
        k1Var.K = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = k1Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        k1Var.d.setAlpha(0.0f);
        k1Var.d.setScaleX(0.1f);
        k1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(k1Var.b, k1Var.d, k1Var.c);
        k1Var.b.addView(k1Var.d, k1Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(k1Var.d, (Property<j1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(k1Var.d, (Property<j1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(k1Var.d, (Property<j1, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new hg.r(1));
        animatorSet.start();
        k1Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        xe.d dVar = k1Var.H;
        if (dVar != null) {
            dVar.c();
            k1Var.H = null;
        }
        if (activity == null || af.d.a(activity) != 1) {
            return;
        }
        xe.c cVar = new xe.c(activity, k1Var);
        cVar.c = "pip-live-story";
        cVar.e = 1;
        cVar.d = AndroidUtilities.dp(10.0f);
        cVar.j = k1Var.d;
        cVar.k = k1Var.f.getPlaceholderView();
        k1Var.H = cVar.a();
    }

    @Override // ze.a
    public final Bitmap a() {
        kh.d4 d4Var = this.R;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.R.getBitmap();
    }

    @Override // ze.a
    public final Bitmap c() {
        kh.d4 d4Var = this.f;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didEndCall) {
            j();
        } else if (i9 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override // ze.a
    public final void e(af.f fVar) {
        xe.d dVar = this.H;
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
        kh.d4 d4Var = this.R;
        if (d4Var != null) {
            d4Var.b();
            this.R = null;
        }
        i();
    }

    @Override // ze.a
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // ze.a
    public final void g(af.f fVar) {
        i();
        this.S = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // ze.a
    public final View h() {
        kh.d4 d4Var = new kh.d4(this.f.getContext(), this.w);
        this.R = d4Var;
        return d4Var;
    }

    public final void i() {
        f1 f1Var = this.v;
        if (f1Var != null) {
            f1Var.v(1.0f);
            kh.d4 d4Var = this.R;
            if (d4Var != null) {
                this.v.s(d4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            gr grVar = gr.f;
            duration.setInterpolator(grVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
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
        jVar.u.i = aa.d.d(n(), this.I, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.I)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.L.f();
        o1.j jVar2 = this.M;
        jVar2.b = this.K;
        jVar2.c = true;
        jVar2.u.i = g7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.I)) - AndroidUtilities.dp(16.0f));
        this.M.f();
    }

    public final void k(boolean z10) {
        if (this.O) {
            this.O = false;
            AndroidUtilities.runOnUIThread(new bg.d2(9), 100L);
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
            animatorSet.setInterpolator(gr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<j1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<j1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<j1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new hg.b0(3, this, z10));
            animatorSet.start();
            xe.d dVar = this.H;
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
        duration.setInterpolator(gr.f);
        this.E.addUpdateListener(new bg.b(this, 16));
        this.E.addListener(new ag.e(this, 12));
        this.E.start();
    }

    @Override // ze.a
    public final /* synthetic */ void b(Canvas canvas) {
    }

    @Override // ze.a
    public final /* synthetic */ void d(Canvas canvas) {
    }
}
