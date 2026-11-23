package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class s60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((ff0) this.b).r1 = null;
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
                a70 a70Var = (a70) this.b;
                w60 w60Var = a70Var.x;
                if (w60Var != null) {
                    w60Var.setProgress(1.0f);
                    a70Var.x.invalidate();
                }
                a70Var.p0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.b;
                ((i70) x0Var.e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                v70 v70Var = (v70) this.b;
                if (!v70Var.f) {
                    v70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                c80 c80Var = (c80) this.b;
                FrameLayout frameLayout = c80Var.b;
                hi.l5 l5Var = (hi.l5) c80Var.c;
                if (l5Var.getParent() != null) {
                    frameLayout.removeView(l5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) c80Var.d);
                break;
            case 4:
                qa0 qa0Var = (qa0) this.b;
                qa0Var.d0.h = null;
                qa0Var.f(qa0Var.T, qa0Var.S);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                qc0 qc0Var = (qc0) this.b;
                qc0Var.T = null;
                qc0Var.r.setText("");
                hi.x7.a(qc0Var.s, false);
                qc0Var.setVisibility(8);
                qc0Var.b0 = 0.0f;
                qc0Var.h(0.0f);
                qc0Var.setAlpha(0.0f);
                qc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                we weVar = (we) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.x7) weVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.x7) weVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                kf0 kf0Var = (kf0) this.b;
                kf0Var.f = false;
                kf0Var.G = null;
                break;
            case 11:
                ((zg0) this.b).b();
                break;
            case 12:
                ((gi0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                ek0 ek0Var = (ek0) this.b;
                View view = ek0Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ek0Var.b1()) {
                    ek0Var.invalidate();
                    break;
                }
                break;
            case 15:
                gl0 gl0Var = (gl0) this.b;
                if (gl0Var.s != null) {
                    gl0Var.j();
                    gl0Var.s.invalidate();
                    gl0Var.e.invalidate();
                    gl0Var.invalidate();
                    gl0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((kl0) this.b).d = false;
                break;
            case 17:
                ((um0) this.b).P0.setVisibility(8);
                break;
            case 18:
                rn0 rn0Var = (rn0) this.b;
                if (animator == rn0Var.h) {
                    rn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((oo0) this.b).f = null;
                break;
            case 20:
                bi.t2 t2Var = (bi.t2) this.b;
                if (t2Var.getParent() != null) {
                    ((ViewGroup) t2Var.getParent()).removeView(t2Var);
                    break;
                }
                break;
            case 21:
                kr0 kr0Var = (kr0) this.b;
                View view2 = kr0Var.c;
                view2.setAlpha(1.0f);
                v4.p0.x0(view2);
                kr0Var.a.removeView(view2);
                break;
            case 22:
                ut0 ut0Var = (ut0) this.b;
                if (ut0Var.f == animator) {
                    ut0Var.f = null;
                    break;
                }
                break;
            case 23:
                lv0 lv0Var = (lv0) this.b;
                lv0Var.setCategoriesShownT(((Float) lv0Var.x3.getAnimatedValue()).floatValue());
                lv0Var.x3 = null;
                break;
            case 24:
                kw0 kw0Var = (kw0) this.b;
                kw0Var.x1.setVisibility(8);
                kw0Var.A1.setImageDrawable(null);
                break;
            case 25:
                int i7 = 0;
                while (true) {
                    qw0[] qw0VarArr = (qw0[]) this.b;
                    if (i7 >= qw0VarArr.length) {
                        break;
                    } else {
                        qw0 qw0Var = qw0VarArr[i7];
                        if (qw0Var != null) {
                            qw0Var.d = false;
                        }
                        i7++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((rw0) this.b).I = null;
                break;
            case 27:
                ((uw0) this.b).e = false;
                break;
            case 28:
                ((ez0) this.b).setVisibility(4);
                break;
            default:
                ((o01) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                kl0 kl0Var = (kl0) this.b;
                kl0Var.d = true;
                if (kl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) kl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public s60(kr0 kr0Var, v4.p0 p0Var) {
        this.a = 21;
        this.b = kr0Var;
    }

    private final void a(Animator animator) {
    }
}
