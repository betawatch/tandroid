package di;

import a8.ee;
import a8.fg;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.vn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o1 implements NotificationCenter.NotificationCenterDelegate, uf.a {
    public static final qw0 X = new qw0(new c2.i(11), new c2.i(12));
    public static final qw0 Y = new qw0(new c2.i(13), new c2.i(14));
    public static final o1 Z;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public sf.d L;
    public float M;
    public float N;
    public float O;
    public o1.j P;
    public o1.j Q;
    public Float R;
    public boolean S;
    public boolean T;
    public bi.u6 U;
    public fi.b4 V;
    public boolean W;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public m1 d;
    public l1 e;
    public fi.b4 f;
    public FrameLayout h;
    public org.telegram.ui.Components.y9 n;
    public vn r;
    public boolean s;
    public h1 v;
    public int w;
    public ScaleGestureDetector x;
    public jg.s0 y;

    static {
        o1 o1Var = new o1();
        o1Var.a = 1.4f;
        o1Var.s = true;
        o1Var.M = 1.0f;
        o1Var.U = new bi.u6(o1Var, 16);
        Z = o1Var;
    }

    public static void j() {
        Z.k(true);
    }

    @Override // uf.a
    public final void a(fg fgVar) {
        i();
        this.W = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // uf.a
    public final void b(fg fgVar) {
        sf.d dVar = this.L;
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
        fi.b4 b4Var = this.V;
        if (b4Var != null) {
            b4Var.b();
            this.V = null;
        }
        i();
    }

    @Override // uf.a
    public final Bitmap c() {
        fi.b4 b4Var = this.V;
        if (b4Var == null || !b4Var.a()) {
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

    @Override // uf.a
    public final Bitmap e() {
        fi.b4 b4Var = this.f;
        if (b4Var == null || !b4Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // uf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // uf.a
    public final View h() {
        fi.b4 b4Var = new fi.b4(this.f.getContext(), this.w);
        this.V = b4Var;
        return b4Var;
    }

    public final void i() {
        h1 h1Var = this.v;
        if (h1Var != null) {
            h1Var.v(1.0f);
            fi.b4 b4Var = this.V;
            if (b4Var != null) {
                this.v.s(b4Var.getSink());
            } else {
                this.v.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            ds dsVar = ds.f;
            duration.setInterpolator(dsVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
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
        o1.j jVar = this.P;
        float f7 = this.N;
        jVar.b = f7;
        jVar.c = true;
        jVar.u.i = a1.g.C(n(), this.M, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (n() * this.M)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.P.h();
        o1.j jVar2 = this.Q;
        jVar2.b = this.O;
        jVar2.c = true;
        jVar2.u.i = ee.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (m() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.h();
    }

    public final void k(boolean z10) {
        if (this.S) {
            this.S = false;
            AndroidUtilities.runOnUIThread(new ag.c(8), 100L);
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
            animatorSet.setInterpolator(ds.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<m1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<m1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<m1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new bh.f0(3, this, z10));
            animatorSet.start();
            sf.d dVar = this.L;
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
        duration.setInterpolator(ds.f);
        this.I.addUpdateListener(new ai.g0(this, 16));
        this.I.addListener(new bh.b(this, 9));
        this.I.start();
    }

    @Override // uf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // uf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
