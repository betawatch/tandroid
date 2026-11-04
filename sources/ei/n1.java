package ei;

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
import b8.be;
import b8.cg;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n1 implements cs, wf.a {
    public static final kt0 Y = new kt0(new d2.t1(15), new d2.t1(16));
    public static final kt0 Z = new kt0(new d2.t1(17), new d2.t1(18));
    public static final n1 a0;
    public y00 E;
    public boolean F;
    public boolean G;
    public View H;
    public boolean I;
    public ValueAnimator J;
    public int K;
    public int L;
    public uf.d M;
    public float N;
    public float O;
    public float P;
    public q1.g Q;
    public q1.g R;
    public Float S;
    public boolean T;
    public boolean U;
    public ci.d1 V;
    public gi.r3 W;
    public boolean X;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public l1 d;
    public k1 e;
    public gi.r3 f;
    public FrameLayout h;
    public org.telegram.ui.Components.k9 n;
    public sm r;
    public boolean s;
    public g1 w;
    public int x;
    public ScaleGestureDetector y;

    static {
        n1 n1Var = new n1();
        n1Var.a = 1.4f;
        n1Var.s = true;
        n1Var.N = 1.0f;
        n1Var.V = new ci.d1(n1Var, 23);
        a0 = n1Var;
    }

    public static void b() {
        a0.d(true);
    }

    public final void a() {
        g1 g1Var = this.w;
        if (g1Var != null) {
            g1Var.v(1.0f);
            gi.r3 r3Var = this.W;
            if (r3Var != null) {
                this.w.s(r3Var.getSink());
            } else {
                this.w.s(this.f.getSink());
            }
        }
        if (this.s) {
            this.r.animate().cancel();
            ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(150L);
            xq xqVar = xq.f;
            duration.setInterpolator(xqVar).start();
            this.n.animate().cancel();
            this.n.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.s = false;
        }
        if (this.K == h() * this.N && this.L == f() * this.N) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int h = (int) (h() * this.N);
        this.K = h;
        layoutParams.width = h;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int f10 = (int) (f() * this.N);
        this.L = f10;
        layoutParams2.height = f10;
        org.telegram.messenger.g0.T3(this.b, this.d, this.c);
        q1.g gVar = this.Q;
        float f11 = this.O;
        gVar.b = f11;
        gVar.c = true;
        gVar.m.i = a1.g.e(h(), this.N, 2.0f, f11) >= org.telegram.messenger.g0.q.x / 2.0f ? (r4 - (h() * this.N)) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        this.Q.h();
        q1.g gVar2 = this.R;
        gVar2.b = this.P;
        gVar2.c = true;
        gVar2.m.i = be.a(r1, org.telegram.messenger.g0.L(16.0f), (r3.y - (f() * this.N)) - org.telegram.messenger.g0.L(16.0f));
        this.R.h();
    }

    @Override // wf.a
    public final void c(cg cgVar) {
        a();
        this.X = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    public final void d(boolean z10) {
        if (this.T) {
            this.T = false;
            org.telegram.messenger.g0.i3(new ai.y1(9), 100L);
            hs.f(this.x).n(this, hs.G2);
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.U) {
                org.telegram.messenger.g0.r(this.V);
                this.U = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<l1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<l1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<l1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new dh.x(3, this, z10));
            animatorSet.start();
            uf.d dVar = this.M;
            if (dVar != null) {
                dVar.c();
                this.M = null;
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.D2) {
            b();
        } else if (i3 == hs.w2) {
            a();
        }
    }

    public final float e() {
        if (this.S == null) {
            this.S = Float.valueOf(1.7777778f);
            Point point = org.telegram.messenger.g0.q;
            this.a = (Math.min(point.x, point.y) - org.telegram.messenger.g0.L(32.0f)) / h();
        }
        return this.S.floatValue();
    }

    public final int f() {
        return (int) (e() * h());
    }

    @Override // wf.a
    public final Bitmap g() {
        gi.r3 r3Var = this.W;
        if (r3Var == null || !r3Var.a()) {
            return null;
        }
        return this.W.getBitmap();
    }

    public final int h() {
        float min;
        float f10;
        if (e() >= 1.0f) {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.g0.q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public final void j(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.J = duration;
        duration.setInterpolator(xq.f);
        this.J.addUpdateListener(new bh.f(this, 17));
        this.J.addListener(new ai.e1(this, 10));
        this.J.start();
    }

    @Override // wf.a
    public final Bitmap l() {
        gi.r3 r3Var = this.f;
        if (r3Var == null || !r3Var.a()) {
            return null;
        }
        return this.f.getBitmap();
    }

    @Override // wf.a
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // wf.a
    public final View q() {
        gi.r3 r3Var = new gi.r3(this.f.getContext(), this.x);
        this.W = r3Var;
        return r3Var;
    }

    @Override // wf.a
    public final void r(cg cgVar) {
        uf.d dVar = this.M;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.M.h.a).width();
            this.K = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.M.h.a).height();
            this.L = height;
            layoutParams2.height = height;
        }
        this.X = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        gi.r3 r3Var = this.W;
        if (r3Var != null) {
            r3Var.b();
            this.W = null;
        }
        a();
    }

    @Override // wf.a
    public final /* synthetic */ void i(Canvas canvas) {
    }

    @Override // wf.a
    public final /* synthetic */ void m(Canvas canvas) {
    }
}
