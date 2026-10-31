package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import jg.f2;
import kg.w0;
import kg.x0;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.t0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xn;
import org.telegram.ui.a5;
import org.telegram.ui.h4;
import org.telegram.ui.hd;
import org.telegram.ui.kd;
import org.telegram.ui.la;
import org.telegram.ui.oo;
import org.telegram.ui.r4;
import org.telegram.ui.un;
import org.telegram.ui.x4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ m(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                h2 h2Var = (h2) this.c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    break;
                }
                break;
            case 9:
                v5 v5Var = (v5) this.c;
                AnimatorSet animatorSet2 = v5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v5Var.J = null;
                    break;
                }
                break;
            case 10:
            case 12:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            default:
                super.onAnimationCancel(animator);
                break;
            case 11:
                ta taVar = (ta) this.c;
                AnimatorSet animatorSet3 = taVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f = null;
                    break;
                }
                break;
            case 13:
                ((kd) this.c).r = null;
                break;
            case 14:
                un unVar = (un) this.c;
                AnimatorSet animatorSet4 = unVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    unVar.V0 = null;
                    break;
                }
                break;
            case 15:
                ((oo) this.c).h = null;
                break;
            case 16:
                o9 o9Var = (o9) this.c;
                AnimatorSet animatorSet5 = o9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o9Var.h = null;
                    break;
                }
                break;
            case 18:
                ((bi) this.c).S2 = null;
                break;
            case 19:
                this.b = true;
                break;
            case 24:
                uz uzVar = (uz) this.c;
                AnimatorSet animatorSet6 = uzVar.m1;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    uzVar.m1 = null;
                    break;
                }
                break;
            case 28:
                c60 c60Var = (c60) this.c;
                AnimatorSet animatorSet7 = c60Var.O1;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    c60Var.O1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hd hdVar;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((q) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 1:
                f2 f2Var = (f2) this.c;
                ((ig.j) f2Var).D.o1.c();
                if (this.b) {
                    f2Var.x.accept(Integer.valueOf(f2Var.s));
                }
                if (f2Var.getParent() != null) {
                    ((ViewGroup) f2Var.getParent()).removeView(f2Var);
                    break;
                }
                break;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.c;
                if (this.b) {
                    limitPreviewView.j0 = false;
                }
                Runnable runnable = limitPreviewView.k0;
                if (runnable != null) {
                    i0.r(runnable);
                    limitPreviewView.k0.run();
                    break;
                }
                break;
            case 3:
                x0 x0Var = (x0) this.c;
                x0Var.O = this.b ? 1.0f : 0.0f;
                x0Var.f.invalidate();
                w0 w0Var = x0Var.h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    break;
                }
                break;
            case 4:
                b1 b1Var = (b1) this.c;
                float f7 = this.b ? 1.0f : 0.0f;
                b1Var.setTextColor(i0.b.f(f7, -1, -9194260));
                b1Var.setIconColor(i0.b.f(f7, -1, -9194260));
                break;
            case 5:
                h4 h4Var = (h4) this.c;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                h4Var.Z0 = f10;
                h4Var.q0.setTranslationY(((1.0f - f10) * i0.L(51.0f)) + h4Var.p0);
                if (!z10) {
                    h4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 6:
                a5 a5Var = (a5) this.c;
                if (!this.b) {
                    a5Var.setVisibility(4);
                    ac.a aVar = ((r4) a5Var).G;
                    if (aVar.a) {
                        aVar.a = false;
                        if (((r4) aVar.d).getParent() != null) {
                            ((WindowManager) aVar.c).removeView((r4) aVar.d);
                        }
                        r4 r4Var = (r4) aVar.d;
                        r4Var.E = true;
                        x4 x4Var = r4Var.D;
                        if (x4Var != null) {
                            if (x4Var.g) {
                                x4Var.g = false;
                                x4Var.b.n(x4Var.a, x4Var.e);
                            }
                            r4Var.D = null;
                        }
                        aVar.d = null;
                        ((ViewGroup) aVar.b).requestDisallowInterceptTouchEvent(false);
                        aVar.b = null;
                        aVar.c = null;
                        break;
                    }
                }
                break;
            case 7:
                q1 q1Var = (q1) this.c;
                x1 x1Var = q1Var.gb;
                int b10 = x1Var.b();
                int i10 = q1Var.ob;
                if (i10 == b10) {
                    q1Var.rb = false;
                    x1Var.b2 = i10;
                    break;
                } else {
                    q1Var.A0(i10, b10, this.b);
                    break;
                }
            case 8:
                h2 h2Var = (h2) this.c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    if (!this.b) {
                        h2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 9:
                v5 v5Var = (v5) this.c;
                AnimatorSet animatorSet2 = v5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v5Var.J = null;
                    if (!this.b) {
                        v5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 10:
                s7 s7Var = (s7) this.c;
                ValueAnimator valueAnimator = s7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    s7Var.B0 = this.b ? 1.0f : 0.0f;
                    s7Var.A0 = null;
                    break;
                }
                break;
            case 11:
                ta taVar = (ta) this.c;
                AnimatorSet animatorSet3 = taVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f = null;
                    if (!this.b) {
                        taVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 12:
                ((la) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 13:
                kd kdVar = (kd) this.c;
                if (kdVar.r != null && (hdVar = kdVar.n) != null) {
                    if (this.b) {
                        hdVar.setVisibility(4);
                    } else {
                        kdVar.s.setVisibility(4);
                    }
                    kdVar.r = null;
                    break;
                }
                break;
            case 14:
                un unVar = (un) this.c;
                AnimatorSet animatorSet4 = unVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        unVar.I0.setVisibility(4);
                        break;
                    } else {
                        (unVar.E0 ? unVar.F0 : unVar.D0).setVisibility(4);
                        break;
                    }
                }
                break;
            case 15:
                oo ooVar = (oo) this.c;
                if (ooVar.h != null && (radialProgressView = ooVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        ooVar.f.setVisibility(4);
                    }
                    ooVar.h = null;
                    break;
                }
                break;
            case 16:
                o9 o9Var = (o9) this.c;
                AnimatorSet animatorSet5 = o9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        o9Var.c.setVisibility(4);
                        break;
                    } else {
                        o9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 17:
                dc dcVar = (dc) this.c;
                if (animator == dcVar.g) {
                    dcVar.g = null;
                    dcVar.j = this.b ? 1.0f : 0.0f;
                    dcVar.b();
                    break;
                }
                break;
            case 18:
                bi biVar = (bi) this.c;
                if (biVar.S2 != null) {
                    if (!this.b) {
                        t0 t0Var = biVar.Y2;
                        if (t0Var != null) {
                            t0Var.setVisibility(4);
                        }
                        if (biVar.K2 != 0 || !biVar.k3) {
                            biVar.U2.setVisibility(4);
                            break;
                        }
                    } else if (biVar.M2) {
                        uh uhVar = biVar.s2;
                        if (uhVar == null || uhVar.L()) {
                            biVar.r3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 19:
                xn xnVar = (xn) this.c;
                if (!this.b) {
                    g9 g9Var = xnVar.h;
                    xnVar.h = xnVar.n;
                    xnVar.n = g9Var;
                    g9Var.setVisibility(8);
                    xnVar.n.setAlpha(0.0f);
                    xnVar.h.setVisibility(0);
                    xnVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 20:
                boolean z11 = this.b;
                lo loVar = (lo) this.c;
                if (animator == loVar.e) {
                    float f11 = z11 ? 1.0f : 0.0f;
                    loVar.d = f11;
                    loVar.setShown(f11);
                    if (!z11) {
                        loVar.setVisibility(8);
                    }
                    loVar.a(true);
                    break;
                }
                break;
            case 21:
                dp dpVar = (dp) this.c;
                dpVar.W1 = this.b ? 1.0f : 0.0f;
                dpVar.z1.setTranslationY((-i0.L(7.0f)) * dpVar.W1);
                break;
            case 22:
                if (!this.b) {
                    ((cq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 23:
                iv ivVar = (iv) this.c;
                mv mvVar = ivVar.N;
                if (mvVar.U && !ivVar.h) {
                    if (!this.b && !ivVar.n) {
                        ivVar.setBackground(null);
                        break;
                    } else if (ivVar.getBackground() == null) {
                        ivVar.setBackground(t6.a0(mvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 24:
                uz uzVar = (uz) this.c;
                AnimatorSet animatorSet6 = uzVar.m1;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    if (!this.b) {
                        uzVar.n1.setVisibility(4);
                    }
                    uzVar.m1 = null;
                    break;
                }
                break;
            case 25:
                f00 f00Var = (f00) this.c;
                f00Var.n = this.b ? 1.0f : 0.0f;
                f00Var.invalidate();
                break;
            case 26:
                g20 g20Var = (g20) this.c;
                e20 e20Var = g20Var.a;
                if (!g20Var.F) {
                    float f12 = this.b ? 1.0f : 0.0f;
                    g20Var.b0 = f12;
                    g20Var.U.setPinnedProgress(f12);
                    e20Var.setScaleX(1.0f - (g20Var.b0 * 0.6f));
                    e20Var.setScaleY(1.0f - (g20Var.b0 * 0.6f));
                    if (g20Var.W) {
                        g20Var.i();
                        break;
                    }
                }
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 28:
                c60 c60Var = (c60) this.c;
                AnimatorSet animatorSet7 = c60Var.O1;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    if (!this.b) {
                        c60Var.P1.setVisibility(4);
                    }
                    c60Var.O1 = null;
                    break;
                }
                break;
            default:
                m60 m60Var = (m60) this.c;
                boolean z12 = this.b;
                m60Var.Y1 = z12 ? 1.0f : 0.0f;
                m60Var.b.invalidate();
                if (!z12) {
                    m60Var.M1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    public m(View view) {
        this.a = 27;
        this.c = view;
        this.b = true;
    }

    public m(View view, boolean z10) {
        this.a = 27;
        this.c = view;
        this.b = z10;
    }

    public m(xn xnVar) {
        this.a = 19;
        this.c = xnVar;
    }
}
