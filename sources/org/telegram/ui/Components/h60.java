package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((te0) this.b).r1 = null;
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
                m60 m60Var = (m60) this.b;
                k60 k60Var = m60Var.x;
                if (k60Var != null) {
                    k60Var.setProgress(1.0f);
                    m60Var.x.invalidate();
                }
                m60Var.m0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                ((v60) v0Var.e).B1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                i70 i70Var = (i70) this.b;
                if (!i70Var.f) {
                    i70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                p70 p70Var = (p70) this.b;
                FrameLayout frameLayout = p70Var.b;
                hi.n5 n5Var = (hi.n5) p70Var.c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) p70Var.d);
                break;
            case 4:
                da0 da0Var = (da0) this.b;
                da0Var.d0.h = null;
                da0Var.f(da0Var.T, da0Var.S);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                fc0 fc0Var = (fc0) this.b;
                fc0Var.T = null;
                fc0Var.r.setText("");
                hi.y7.a(fc0Var.s, false);
                fc0Var.setVisibility(8);
                fc0Var.b0 = 0.0f;
                fc0Var.h(0.0f);
                fc0Var.setAlpha(0.0f);
                fc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                ne neVar = (ne) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.y7) neVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.y7) neVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ye0 ye0Var = (ye0) this.b;
                ye0Var.f = false;
                ye0Var.G = null;
                break;
            case 11:
                ((ng0) this.b).b();
                break;
            case 12:
                ((vh0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                uj0 uj0Var = (uj0) this.b;
                View view = uj0Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (uj0Var.b1()) {
                    uj0Var.invalidate();
                    break;
                }
                break;
            case 15:
                wk0 wk0Var = (wk0) this.b;
                if (wk0Var.s != null) {
                    wk0Var.j();
                    wk0Var.s.invalidate();
                    wk0Var.e.invalidate();
                    wk0Var.invalidate();
                    wk0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((al0) this.b).d = false;
                break;
            case 17:
                ((jm0) this.b).P0.setVisibility(8);
                break;
            case 18:
                gn0 gn0Var = (gn0) this.b;
                if (animator == gn0Var.h) {
                    gn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((do0) this.b).f = null;
                break;
            case 20:
                bi.v1 v1Var = (bi.v1) this.b;
                if (v1Var.getParent() != null) {
                    ((ViewGroup) v1Var.getParent()).removeView(v1Var);
                    break;
                }
                break;
            case 21:
                ar0 ar0Var = (ar0) this.b;
                View view2 = ar0Var.c;
                view2.setAlpha(1.0f);
                v4.o0.x0(view2);
                ar0Var.a.removeView(view2);
                break;
            case 22:
                jt0 jt0Var = (jt0) this.b;
                if (jt0Var.f == animator) {
                    jt0Var.f = null;
                    break;
                }
                break;
            case 23:
                av0 av0Var = (av0) this.b;
                av0Var.setCategoriesShownT(((Float) av0Var.x3.getAnimatedValue()).floatValue());
                av0Var.x3 = null;
                break;
            case 24:
                bw0 bw0Var = (bw0) this.b;
                bw0Var.x1.setVisibility(8);
                bw0Var.A1.setImageDrawable(null);
                break;
            case 25:
                int i7 = 0;
                while (true) {
                    hw0[] hw0VarArr = (hw0[]) this.b;
                    if (i7 >= hw0VarArr.length) {
                        break;
                    } else {
                        hw0 hw0Var = hw0VarArr[i7];
                        if (hw0Var != null) {
                            hw0Var.d = false;
                        }
                        i7++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((iw0) this.b).I = null;
                break;
            case 27:
                ((lw0) this.b).e = false;
                break;
            case 28:
                ((vy0) this.b).setVisibility(4);
                break;
            default:
                ((f01) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                al0 al0Var = (al0) this.b;
                al0Var.d = true;
                if (al0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) al0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public h60(ar0 ar0Var, v4.o0 o0Var) {
        this.a = 21;
        this.b = ar0Var;
    }

    private final void a(Animator animator) {
    }
}
