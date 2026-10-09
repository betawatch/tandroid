package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.lw0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n2 implements NotificationCenter.NotificationCenterDelegate, sf.a {
    public static final lw0 X = new lw0(new w1(1), new w1(2));
    public static final lw0 Y = new lw0(new w1(3), new w1(4));
    public static final n2 Z;
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
    public a3.d U;
    public ci.j4 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public k2 d;
    public j2 e;
    public ci.j4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.y9 n;
    public ao r;
    public boolean s;
    public d2 v;
    public int w;
    public ScaleGestureDetector x;
    public m.f3 y;

    static {
        n2 n2Var = new n2();
        n2Var.a = 1.4f;
        n2Var.s = true;
        n2Var.M = 1.0f;
        n2Var.U = new a3.d(n2Var, 5);
        Z = n2Var;
    }

    public static void j() {
        Z.k(true);
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
        ci.j4 j4Var = this.V;
        if (j4Var != null) {
            j4Var.b();
            this.V = null;
        }
        i();
    }

    @Override // sf.a
    public final Bitmap c() {
        ci.j4 j4Var = this.V;
        if (j4Var == null || !j4Var.a()) {
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
        ci.j4 j4Var = this.f;
        if (j4Var == null || !j4Var.a()) {
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
        ci.j4 j4Var = new ci.j4(this.f.getContext(), this.w);
        this.V = j4Var;
        return j4Var;
    }

    public final void i() {
        d2 d2Var = this.v;
        if (d2Var != null) {
            d2Var.v(1.0f);
            ci.j4 j4Var = this.V;
            if (j4Var != null) {
                this.v.s(j4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            hs hsVar = hs.f;
            duration.setInterpolator(hsVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(hsVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(hsVar).start();
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
        kVar2.u.i = w7.o.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
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
            animatorSet.setInterpolator(hs.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<k2, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<k2, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<k2, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new n(2, this, z10));
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

    public final void o(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(hs.f);
        this.I.addUpdateListener(new a(this, 6));
        this.I.addListener(new b(this, 3));
        this.I.start();
    }

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
