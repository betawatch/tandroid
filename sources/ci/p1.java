package ci;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.un;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class p1 implements NotificationCenter.NotificationCenterDelegate, tf.a {
    public static final cw0 X = new cw0(new i1(0), new i1(1));
    public static final cw0 Y = new cw0(new i1(2), new i1(3));
    public static final p1 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public rf.d L;
    public float M;
    public float N;
    public float O;
    public o1.k P;
    public o1.k Q;
    public Float R;
    public boolean S;
    public boolean T;
    public androidx.fragment.app.d U;
    public ei.d4 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public n1 d;
    public m1 e;
    public ei.d4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.w9 n;
    public un r;
    public boolean s;
    public h1 v;
    public int w;
    public ScaleGestureDetector x;
    public k0.b y;

    static {
        p1 p1Var = new p1();
        p1Var.a = 1.4f;
        p1Var.s = true;
        p1Var.M = 1.0f;
        p1Var.U = new androidx.fragment.app.d(p1Var, 9);
        Z = p1Var;
    }

    public static void j() {
        Z.k(true);
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        i();
        this.W = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        rf.d dVar = this.L;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.L.h.a).width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.L.h.a).height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        ei.d4 d4Var = this.V;
        if (d4Var != null) {
            d4Var.b();
            this.V = null;
        }
        i();
    }

    @Override // tf.a
    public final Bitmap c() {
        ei.d4 d4Var = this.V;
        if (d4Var == null || !d4Var.a()) {
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

    @Override // tf.a
    public final Bitmap e() {
        ei.d4 d4Var = this.f;
        if (d4Var == null || !d4Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // tf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // tf.a
    public final View h() {
        ei.d4 d4Var = new ei.d4(this.f.getContext(), this.w);
        this.V = d4Var;
        return d4Var;
    }

    public final void i() {
        h1 h1Var = this.v;
        if (h1Var != null) {
            h1Var.v(1.0f);
            ei.d4 d4Var = this.V;
            if (d4Var != null) {
                this.v.s(d4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            bs bsVar = bs.f;
            duration.setInterpolator(bsVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
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
        kVar.u.i = a1.g.B(n(), this.M, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.M)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.P.h();
        o1.k kVar2 = this.Q;
        kVar2.b = this.O;
        kVar2.c = true;
        kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new ah.j(6), 100L);
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
            animatorSet.setInterpolator(bs.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<n1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<n1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<n1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new ah.p0(3, this, z10));
            animatorSet.start();
            rf.d dVar = this.L;
            if (dVar != null) {
                dVar.c();
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

    public final void o(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(bs.f);
        this.I.addUpdateListener(new ah.c0(this, 14));
        this.I.addListener(new ah.b(this, 8));
        this.I.start();
    }

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
