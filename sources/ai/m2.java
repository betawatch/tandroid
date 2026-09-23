package ai;

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
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class m2 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final iv0 X = new iv0(new w1(1), new w1(2));
    public static final iv0 Y = new iv0(new w1(3), new w1(4));
    public static final m2 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public pf.e L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public a3.d U;
    public ci.k4 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public j2 d;
    public f0 e;
    public ci.k4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.w9 n;
    public ln r;
    public boolean s;
    public d2 v;
    public int w;
    public ScaleGestureDetector x;
    public k2.u y;

    static {
        m2 m2Var = new m2();
        m2Var.a = 1.4f;
        m2Var.s = true;
        m2Var.M = 1.0f;
        m2Var.U = new a3.d(m2Var, 5);
        Z = m2Var;
    }

    public static void j() {
        Z.k(true);
    }

    public static void o(Activity activity, d2 d2Var) {
        m2 m2Var = Z;
        if (d2Var == null || m2Var.S) {
            return;
        }
        m2Var.S = true;
        m2Var.v = d2Var;
        int i10 = d2Var.e;
        m2Var.w = i10;
        NotificationCenter.getInstance(i10).addObserver(m2Var, NotificationCenter.liveStoryUpdated);
        m2Var.J = m2Var.n();
        m2Var.K = m2Var.m();
        m2Var.M = 1.0f;
        int i11 = 0;
        m2Var.H = false;
        o1.k kVar = new o1.k(m2Var, X);
        o1.l lVar = new o1.l();
        lVar.a(0.75f);
        lVar.b(650.0f);
        kVar.u = lVar;
        m2Var.P = kVar;
        o1.k kVar2 = new o1.k(m2Var, Y);
        o1.l lVar2 = new o1.l();
        lVar2.a(0.75f);
        lVar2.b(650.0f);
        kVar2.u = lVar2;
        m2Var.Q = kVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new h2());
        m2Var.x = scaleGestureDetector;
        int i12 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i12 >= 23) {
            m2Var.x.setStylusScaleEnabled(false);
        }
        m2Var.y = new k2.u(context, new i2(scaledTouchSlop));
        f0 f0Var = new f0(context, 1);
        f0Var.b = new Path();
        m2Var.e = f0Var;
        j2 j2Var = new j2(context);
        m2Var.d = j2Var;
        j2Var.addView(m2Var.e, w7.x5.c(-1.0f, -1));
        m2Var.e.setOutlineProvider(new k2(i11));
        m2Var.e.setClipToOutline(true);
        m2Var.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gg, false));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        m2Var.n = w9Var;
        m2Var.e.addView(w9Var, w7.x5.c(-1.0f, -1));
        ci.k4 k4Var = new ci.k4(context, m2Var.w);
        m2Var.f = k4Var;
        k4Var.setAlpha(0.0f);
        m2Var.e.addView(m2Var.f, w7.x5.c(-1.0f, -1));
        ln lnVar = new ln(context, 1);
        m2Var.r = lnVar;
        m2Var.e.addView(lnVar, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        m2Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        m2Var.h.addView(view, w7.x5.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i13 = org.telegram.ui.ActionBar.h6.hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.h6.i6;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e2(i11));
        float f7 = 38;
        float f10 = 4;
        m2Var.h.addView(imageView, w7.x5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i14, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new f2(i11, d2Var, context));
        m2Var.h.addView(imageView2, w7.x5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
        m2Var.e.addView(m2Var.h, w7.x5.c(-1.0f, -1));
        m2Var.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams b10 = sf.c.b(context, false);
        m2Var.c = b10;
        int i15 = m2Var.J;
        b10.width = i15;
        b10.height = m2Var.K;
        float dp2 = (AndroidUtilities.displaySize.x - i15) - AndroidUtilities.dp(16.0f);
        m2Var.N = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = m2Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f);
        m2Var.O = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = m2Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        m2Var.d.setAlpha(0.0f);
        m2Var.d.setScaleX(0.1f);
        m2Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(m2Var.b, m2Var.d, m2Var.c);
        m2Var.b.addView(m2Var.d, m2Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(rr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(m2Var.d, (Property<j2, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(m2Var.d, (Property<j2, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(m2Var.d, (Property<j2, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new l2(0));
        animatorSet.start();
        m2Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        pf.e eVar = m2Var.L;
        if (eVar != null) {
            eVar.c();
            m2Var.L = null;
        }
        if (activity == null || sf.c.a(activity) != 1) {
            return;
        }
        pf.d dVar = new pf.d(activity, m2Var);
        dVar.c = "pip-live-story";
        dVar.e = 1;
        dVar.d = AndroidUtilities.dp(10.0f);
        dVar.j = m2Var.d;
        dVar.k = m2Var.f.getPlaceholderView();
        m2Var.L = dVar.a();
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        pf.e eVar = this.L;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.L.h.a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.L.h.a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        ci.k4 k4Var = this.V;
        if (k4Var != null) {
            k4Var.b();
            this.V = null;
        }
        i();
    }

    @Override // rf.a
    public final Bitmap c() {
        ci.k4 k4Var = this.V;
        if (k4Var == null || !k4Var.a()) {
            return null;
        }
        return this.V.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override // rf.a
    public final Bitmap e() {
        ci.k4 k4Var = this.f;
        if (k4Var == null || !k4Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // rf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // rf.a
    public final View h() {
        ci.k4 k4Var = new ci.k4(this.f.getContext(), this.w);
        this.V = k4Var;
        return k4Var;
    }

    public final void i() {
        d2 d2Var = this.v;
        if (d2Var != null) {
            d2Var.v(1.0f);
            ci.k4 k4Var = this.V;
            if (k4Var != null) {
                this.v.s(k4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            rr rrVar = rr.f;
            duration.setInterpolator(rrVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
            this.s = false;
        }
        if (this.J == n() * this.M && this.K == m() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int n10 = (int) (n() * this.M);
        this.J = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int m10 = (int) (m() * this.M);
        this.K = m10;
        layoutParams2.height = m10;
        AndroidUtilities.updateViewLayout(this.b, this.d, this.c);
        o1.k kVar = this.P;
        float f7 = this.N;
        kVar.b = f7;
        kVar.c = true;
        kVar.u.i = a4.a.B(n(), this.M, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.M)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.P.f();
        o1.k kVar2 = this.Q;
        kVar2.b = this.O;
        kVar2.c = true;
        kVar2.u.i = w7.p.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.f();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new f(1), 100L);
            NotificationCenter.getInstance(this.w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.T) {
                AndroidUtilities.cancelRunOnUIThread(this.U);
                this.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(rr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<j2, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<j2, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<j2, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new n(2, this, z10));
            animatorSet.start();
            pf.e eVar = this.L;
            if (eVar != null) {
                eVar.c();
                this.L = null;
            }
        }
    }

    public final float l() {
        if (this.R == null) {
            this.R = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.R.floatValue();
    }

    public final int m() {
        return (int) (l() * n());
    }

    public final int n() {
        float min;
        float f7;
        if (l() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void p(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(rr.f);
        this.I.addUpdateListener(new a(this, 6));
        this.I.addListener(new b(this, 3));
        this.I.start();
    }

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
