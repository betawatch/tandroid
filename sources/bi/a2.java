package bi;

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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class a2 implements NotificationCenter.NotificationCenterDelegate, sf.a {
    public static final hv0 X = new hv0(new androidx.emoji2.text.w(11), new androidx.emoji2.text.w(12));
    public static final hv0 Y = new hv0(new androidx.emoji2.text.w(13), new androidx.emoji2.text.w(14));
    public static final a2 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public qf.e L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public a3.c U;
    public di.l4 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public y1 d;
    public ah.y e;
    public di.l4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.x9 n;
    public jn r;
    public boolean s;
    public t1 v;
    public int w;
    public ScaleGestureDetector x;
    public l.d y;

    static {
        a2 a2Var = new a2();
        a2Var.a = 1.4f;
        a2Var.s = true;
        a2Var.M = 1.0f;
        a2Var.U = new a3.c(a2Var, 15);
        Z = a2Var;
    }

    public static void j() {
        Z.k(true);
    }

    public static void o(Activity activity, t1 t1Var) {
        a2 a2Var = Z;
        if (t1Var == null || a2Var.S) {
            return;
        }
        int i10 = 1;
        a2Var.S = true;
        a2Var.v = t1Var;
        int i11 = t1Var.e;
        a2Var.w = i11;
        NotificationCenter.getInstance(i11).addObserver(a2Var, NotificationCenter.liveStoryUpdated);
        a2Var.J = a2Var.n();
        a2Var.K = a2Var.m();
        a2Var.M = 1.0f;
        int i12 = 0;
        a2Var.H = false;
        o1.k kVar = new o1.k(a2Var, X);
        o1.l lVar = new o1.l();
        lVar.a(0.75f);
        lVar.b(650.0f);
        kVar.u = lVar;
        a2Var.P = kVar;
        o1.k kVar2 = new o1.k(a2Var, Y);
        o1.l lVar2 = new o1.l();
        lVar2.a(0.75f);
        lVar2.b(650.0f);
        kVar2.u = lVar2;
        a2Var.Q = kVar2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new w1());
        a2Var.x = scaleGestureDetector;
        int i13 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i13 >= 23) {
            a2Var.x.setStylusScaleEnabled(false);
        }
        a2Var.y = new l.d(context, new x1(scaledTouchSlop));
        ah.y yVar = new ah.y(context, 2);
        yVar.b = new Path();
        a2Var.e = yVar;
        y1 y1Var = new y1(context);
        a2Var.d = y1Var;
        y1Var.addView(a2Var.e, w7.x5.c(-1.0f, -1));
        a2Var.e.setOutlineProvider(new z1(i12));
        a2Var.e.setClipToOutline(true);
        a2Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        a2Var.n = x9Var;
        a2Var.e.addView(x9Var, w7.x5.c(-1.0f, -1));
        di.l4 l4Var = new di.l4(context, a2Var.w);
        a2Var.f = l4Var;
        l4Var.setAlpha(0.0f);
        a2Var.e.addView(a2Var.f, w7.x5.c(-1.0f, -1));
        jn jnVar = new jn(context, 1);
        a2Var.r = jnVar;
        a2Var.e.addView(jnVar, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        a2Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        a2Var.h.addView(view, w7.x5.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i14 = org.telegram.ui.ActionBar.j6.hg;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        int i15 = org.telegram.ui.ActionBar.j6.i6;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new ah.f(i10));
        float f7 = 38;
        float f10 = 4;
        a2Var.h.addView(imageView, w7.x5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new u1(i12, t1Var, context));
        a2Var.h.addView(imageView2, w7.x5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
        a2Var.e.addView(a2Var.h, w7.x5.c(-1.0f, -1));
        a2Var.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams b10 = tf.c.b(context, false);
        a2Var.c = b10;
        int i16 = a2Var.J;
        b10.width = i16;
        b10.height = a2Var.K;
        float dp2 = (AndroidUtilities.displaySize.x - i16) - AndroidUtilities.dp(16.0f);
        a2Var.N = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = a2Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f);
        a2Var.O = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = a2Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        a2Var.d.setAlpha(0.0f);
        a2Var.d.setScaleX(0.1f);
        a2Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(a2Var.b, a2Var.d, a2Var.c);
        a2Var.b.addView(a2Var.d, a2Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(pr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(a2Var.d, (Property<y1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(a2Var.d, (Property<y1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(a2Var.d, (Property<y1, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new ah.a0(1));
        animatorSet.start();
        a2Var.i();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        qf.e eVar = a2Var.L;
        if (eVar != null) {
            eVar.c();
            a2Var.L = null;
        }
        if (activity == null || tf.c.a(activity) != 1) {
            return;
        }
        qf.d dVar = new qf.d(activity, a2Var);
        dVar.c = "pip-live-story";
        dVar.e = 1;
        dVar.d = AndroidUtilities.dp(10.0f);
        dVar.j = a2Var.d;
        dVar.k = a2Var.f.getPlaceholderView();
        a2Var.L = dVar.a();
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        qf.e eVar = this.L;
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
        di.l4 l4Var = this.V;
        if (l4Var != null) {
            l4Var.b();
            this.V = null;
        }
        i();
    }

    @Override // sf.a
    public final Bitmap c() {
        di.l4 l4Var = this.V;
        if (l4Var == null || !l4Var.a()) {
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

    @Override // sf.a
    public final Bitmap e() {
        di.l4 l4Var = this.f;
        if (l4Var == null || !l4Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // sf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // sf.a
    public final View h() {
        di.l4 l4Var = new di.l4(this.f.getContext(), this.w);
        this.V = l4Var;
        return l4Var;
    }

    public final void i() {
        t1 t1Var = this.v;
        if (t1Var != null) {
            t1Var.v(1.0f);
            di.l4 l4Var = this.V;
            if (l4Var != null) {
                this.v.s(l4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            pr prVar = pr.f;
            duration.setInterpolator(prVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
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
        kVar.u.i = a4.a.A(n(), this.M, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.M)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
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
            AndroidUtilities.runOnUIThread(new ah.j(2), 100L);
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
            animatorSet.setInterpolator(pr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<y1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<y1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<y1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ah.q0(3, this, z10));
            animatorSet.start();
            qf.e eVar = this.L;
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
        duration.setInterpolator(pr.f);
        this.I.addUpdateListener(new ah.d0(this, 7));
        this.I.addListener(new ah.b(this, 6));
        this.I.start();
    }

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
