package nh;

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
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j1 implements NotificationCenter.NotificationCenterDelegate, df.a {
    public static final iv0 U = new iv0(new m.j0(3), new m.j0(4));
    public static final iv0 V = new iv0(new m.j0(5), new m.j0(6));
    public static final j1 W;
    public boolean B;
    public boolean C;
    public View D;
    public boolean E;
    public ValueAnimator F;
    public int G;
    public int H;
    public bf.f I;
    public float J;
    public float K;
    public float L;
    public o1.j M;
    public o1.j N;
    public Float O;
    public boolean P;
    public boolean Q;
    public lh.b R;
    public ph.k3 S;
    public boolean T;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public i1 d;
    public dg.u2 e;
    public ph.k3 f;
    public FrameLayout h;
    public org.telegram.ui.Components.p9 n;
    public gn r;
    public boolean s;
    public e1 v;
    public int w;
    public ScaleGestureDetector x;
    public zz y;

    static {
        j1 j1Var = new j1();
        j1Var.a = 1.4f;
        j1Var.s = true;
        j1Var.J = 1.0f;
        j1Var.R = new lh.b(j1Var, 24);
        W = j1Var;
    }

    public static void j() {
        W.k(true);
    }

    public static void o(Activity activity, e1 e1Var) {
        j1 j1Var = W;
        if (e1Var == null || j1Var.P) {
            return;
        }
        j1Var.P = true;
        j1Var.v = e1Var;
        int i10 = e1Var.e;
        j1Var.w = i10;
        NotificationCenter.getInstance(i10).addObserver(j1Var, NotificationCenter.liveStoryUpdated);
        j1Var.G = j1Var.n();
        j1Var.H = j1Var.m();
        j1Var.J = 1.0f;
        j1Var.E = false;
        o1.j jVar = new o1.j(j1Var, U);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.u = kVar;
        j1Var.M = jVar;
        o1.j jVar2 = new o1.j(j1Var, V);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.u = kVar2;
        j1Var.N = jVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new g1());
        j1Var.x = scaleGestureDetector;
        int i11 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i11 >= 23) {
            j1Var.x.setStylusScaleEnabled(false);
        }
        j1Var.y = new zz(context, new h1(scaledTouchSlop));
        dg.u2 u2Var = new dg.u2(context, 11);
        u2Var.b = new Path();
        j1Var.e = u2Var;
        i1 i1Var = new i1(context);
        j1Var.d = i1Var;
        i1Var.addView(j1Var.e, k7.b6.c(-1.0f, -1));
        j1Var.e.setOutlineProvider(new gg.j1(4));
        j1Var.e.setClipToOutline(true);
        j1Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        j1Var.n = p9Var;
        j1Var.e.addView(p9Var, k7.b6.c(-1.0f, -1));
        ph.k3 k3Var = new ph.k3(context, j1Var.w);
        j1Var.f = k3Var;
        k3Var.setAlpha(0.0f);
        j1Var.e.addView(j1Var.f, k7.b6.c(-1.0f, -1));
        gn gnVar = new gn(context, 4);
        j1Var.r = gnVar;
        j1Var.e.addView(gnVar, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        j1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        j1Var.h.addView(view, k7.b6.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = org.telegram.ui.ActionBar.j6.hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.j6.i6;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new dg.m(7));
        float f10 = 38;
        float f11 = 4;
        j1Var.h.addView(imageView, k7.b6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new cg.n(25, e1Var, context));
        j1Var.h.addView(imageView2, k7.b6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        j1Var.e.addView(j1Var.h, k7.b6.c(-1.0f, -1));
        j1Var.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams b10 = ef.d.b(context, false);
        j1Var.c = b10;
        int i14 = j1Var.G;
        b10.width = i14;
        b10.height = j1Var.H;
        float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        j1Var.K = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = j1Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f);
        j1Var.L = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = j1Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        j1Var.d.setAlpha(0.0f);
        j1Var.d.setScaleX(0.1f);
        j1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(j1Var.b, j1Var.d, j1Var.c);
        j1Var.b.addView(j1Var.d, j1Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(mr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(j1Var.d, (Property<i1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(j1Var.d, (Property<i1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(j1Var.d, (Property<i1, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new mg.r(1));
        animatorSet.start();
        j1Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        bf.f fVar = j1Var.I;
        if (fVar != null) {
            fVar.c();
            j1Var.I = null;
        }
        if (activity == null || ef.d.a(activity) != 1) {
            return;
        }
        bf.e eVar = new bf.e(activity, j1Var);
        eVar.c = "pip-live-story";
        eVar.e = 1;
        eVar.d = AndroidUtilities.dp(10.0f);
        eVar.j = j1Var.d;
        eVar.k = j1Var.f.getPlaceholderView();
        j1Var.I = eVar.a();
    }

    @Override // df.a
    public final void a(c2.p pVar) {
        bf.f fVar = this.I;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.I.h.a.width();
            this.G = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.I.h.a.height();
            this.H = height;
            layoutParams2.height = height;
        }
        this.T = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        ph.k3 k3Var = this.S;
        if (k3Var != null) {
            k3Var.b();
            this.S = null;
        }
        i();
    }

    @Override // df.a
    public final Bitmap b() {
        ph.k3 k3Var = this.S;
        if (k3Var == null || !k3Var.a()) {
            return null;
        }
        return this.S.getBitmap();
    }

    @Override // df.a
    public final Bitmap d() {
        ph.k3 k3Var = this.f;
        if (k3Var == null || !k3Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i();
        }
    }

    @Override // df.a
    public final void e(c2.p pVar) {
        i();
        this.T = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // df.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // df.a
    public final View h() {
        ph.k3 k3Var = new ph.k3(this.f.getContext(), this.w);
        this.S = k3Var;
        return k3Var;
    }

    public final void i() {
        e1 e1Var = this.v;
        if (e1Var != null) {
            e1Var.v(1.0f);
            ph.k3 k3Var = this.S;
            if (k3Var != null) {
                this.v.s(k3Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            mr mrVar = mr.f;
            duration.setInterpolator(mrVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
            this.s = false;
        }
        if (this.G == n() * this.J && this.H == m() * this.J) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int n10 = (int) (n() * this.J);
        this.G = n10;
        layoutParams.width = n10;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int m9 = (int) (m() * this.J);
        this.H = m9;
        layoutParams2.height = m9;
        AndroidUtilities.updateViewLayout(this.b, this.d, this.c);
        o1.j jVar = this.M;
        float f10 = this.K;
        jVar.b = f10;
        jVar.c = true;
        jVar.u.i = android.support.v4.media.a.d(n(), this.J, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.M.f();
        o1.j jVar2 = this.N;
        jVar2.b = this.L;
        jVar2.c = true;
        jVar2.u.i = k7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.J)) - AndroidUtilities.dp(16.0f));
        this.N.f();
    }

    public final void k(boolean z4) {
        if (this.P) {
            this.P = false;
            AndroidUtilities.runOnUIThread(new cg.n0(14), 100L);
            NotificationCenter.getInstance(this.w).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.Q) {
                AndroidUtilities.cancelRunOnUIThread(this.R);
                this.Q = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(mr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<i1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<i1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<i1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new dg.w2(6, this, z4));
            animatorSet.start();
            bf.f fVar = this.I;
            if (fVar != null) {
                fVar.c();
                this.I = null;
            }
        }
    }

    public final float l() {
        if (this.O == null) {
            this.O = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / n();
        }
        return this.O.floatValue();
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

    public final void p(boolean z4) {
        ValueAnimator duration = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f).setDuration(200L);
        this.F = duration;
        duration.setInterpolator(mr.f);
        this.F.addUpdateListener(new dg.o1(this, 25));
        this.F.addListener(new cg.l0(this, 18));
        this.F.start();
    }

    @Override // df.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // df.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
