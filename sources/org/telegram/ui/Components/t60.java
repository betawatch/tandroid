package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((tf0) this.b).n1 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z60 z60Var = (z60) this.b;
                x60 x60Var = z60Var.x;
                if (x60Var != null) {
                    x60Var.setProgress(1.0f);
                    z60Var.x.invalidate();
                }
                z60Var.m0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.b;
                ((k70) u0Var.e).x1 = false;
                TextView[] textViewArr = (TextView[]) u0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                y70 y70Var = (y70) this.b;
                if (!y70Var.f) {
                    y70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                f80 f80Var = (f80) this.b;
                FrameLayout frameLayout = f80Var.b;
                kg.f0 f0Var = (kg.f0) f80Var.c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.l1) f80Var.d);
                break;
            case 4:
                ua0 ua0Var = (ua0) this.b;
                ua0Var.c0.h = null;
                ua0Var.f(ua0Var.S, ua0Var.R);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                zc0 zc0Var = (zc0) this.b;
                zc0Var.S = null;
                zc0Var.r.setText("");
                uc0.a(zc0Var.s, false);
                zc0Var.setVisibility(8);
                zc0Var.a0 = 0.0f;
                zc0Var.h(0.0f);
                zc0Var.setAlpha(0.0f);
                zc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                le leVar = (le) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((uc0) leVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((uc0) leVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                yf0 yf0Var = (yf0) this.b;
                yf0Var.f = false;
                yf0Var.F = null;
                break;
            case 11:
                ((nh0) this.b).b();
                break;
            case 12:
                ((wi0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                uk0 uk0Var = (uk0) this.b;
                View view = uk0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (uk0Var.b1()) {
                    uk0Var.invalidate();
                    break;
                }
                break;
            case 15:
                vl0 vl0Var = (vl0) this.b;
                if (vl0Var.s != null) {
                    vl0Var.j();
                    vl0Var.s.invalidate();
                    vl0Var.e.invalidate();
                    vl0Var.invalidate();
                    vl0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((zl0) this.b).d = false;
                break;
            case 17:
                ((hn0) this.b).O0.setVisibility(8);
                break;
            case 18:
                eo0 eo0Var = (eo0) this.b;
                if (animator == eo0Var.h) {
                    eo0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((dp0) this.b).f = null;
                break;
            case 20:
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.b;
                if (a5Var.getParent() != null) {
                    ((ViewGroup) a5Var.getParent()).removeView(a5Var);
                    break;
                }
                break;
            case 21:
                as0 as0Var = (as0) this.b;
                View view2 = as0Var.c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                as0Var.a.removeView(view2);
                break;
            case 22:
                mu0 mu0Var = (mu0) this.b;
                if (mu0Var.f == animator) {
                    mu0Var.f = null;
                    break;
                }
                break;
            case 23:
                cw0 cw0Var = (cw0) this.b;
                cw0Var.setCategoriesShownT(((Float) cw0Var.w3.getAnimatedValue()).floatValue());
                cw0Var.w3 = null;
                break;
            case 24:
                dx0 dx0Var = (dx0) this.b;
                dx0Var.t1.setVisibility(8);
                dx0Var.w1.setImageDrawable(null);
                break;
            case 25:
                int i10 = 0;
                while (true) {
                    jx0[] jx0VarArr = (jx0[]) this.b;
                    if (i10 >= jx0VarArr.length) {
                        break;
                    } else {
                        jx0 jx0Var = jx0VarArr[i10];
                        if (jx0Var != null) {
                            jx0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((kx0) this.b).H = null;
                break;
            case 27:
                ((nx0) this.b).e = false;
                break;
            case 28:
                ((yz0) this.b).setVisibility(4);
                break;
            default:
                ((j11) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                zl0 zl0Var = (zl0) this.b;
                zl0Var.d = true;
                if (zl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) zl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public t60(as0 as0Var, s4.n0 n0Var) {
        this.a = 21;
        this.b = as0Var;
    }

    private final void a(Animator animator) {
    }
}
