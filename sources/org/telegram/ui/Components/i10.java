package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
                ((nh0) this.b).h = null;
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
                j10 j10Var = (j10) this.b;
                j10Var.v = 1.0f;
                j10Var.invalidate();
                break;
            case 1:
                n60 n60Var = (n60) this.b;
                if (animator == n60Var.W) {
                    n60Var.c(true);
                    n60Var.setVisibility(4);
                    break;
                }
                break;
            case 2:
                k80 k80Var = (k80) this.b;
                i80 i80Var = k80Var.x;
                if (i80Var != null) {
                    i80Var.setProgress(1.0f);
                    k80Var.x.invalidate();
                }
                k80Var.m0 = null;
                break;
            case 3:
                t00 t00Var = (t00) this.b;
                ((t80) t00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 4:
                g90 g90Var = (g90) this.b;
                if (!g90Var.f) {
                    g90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 5:
                n90 n90Var = (n90) this.b;
                FrameLayout frameLayout = n90Var.b;
                fi.f6 f6Var = (fi.f6) n90Var.c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ha) n90Var.d);
                break;
            case 6:
                hc0 hc0Var = (hc0) this.b;
                hc0Var.c0.h = null;
                hc0Var.f(hc0Var.S, hc0Var.R);
                break;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 8:
                le0 le0Var = (le0) this.b;
                le0Var.S = null;
                le0Var.r.setText("");
                fi.t8.a(le0Var.s, false);
                le0Var.setVisibility(8);
                le0Var.a0 = 0.0f;
                le0Var.h(0.0f);
                le0Var.setAlpha(0.0f);
                le0Var.j();
                break;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 10:
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.t8) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.t8) hfVar.c).e = null;
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                sh0 sh0Var = (sh0) this.b;
                sh0Var.f = false;
                sh0Var.F = null;
                break;
            case 13:
                ((hj0) this.b).b();
                break;
            case 14:
                ((pk0) this.b).h.setVisibility(8);
                break;
            case 15:
                mm0 mm0Var = (mm0) this.b;
                View view = mm0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.b1()) {
                    mm0Var.invalidate();
                    break;
                }
                break;
            case 16:
                pn0 pn0Var = (pn0) this.b;
                if (pn0Var.s != null) {
                    pn0Var.j();
                    pn0Var.s.invalidate();
                    pn0Var.e.invalidate();
                    pn0Var.invalidate();
                    pn0Var.s = null;
                    break;
                }
                break;
            case 17:
                ((tn0) this.b).d = false;
                break;
            case 18:
                ((ep0) this.b).O0.setVisibility(8);
                break;
            case 19:
                cq0 cq0Var = (cq0) this.b;
                if (animator == cq0Var.h) {
                    cq0Var.h = null;
                    break;
                }
                break;
            case 20:
                ((lr0) this.b).f = null;
                break;
            case 21:
                sr0 sr0Var = (sr0) this.b;
                if (sr0Var.getParent() != null) {
                    ((ViewGroup) sr0Var.getParent()).removeView(sr0Var);
                    break;
                }
                break;
            case 22:
                zt0 zt0Var = (zt0) this.b;
                View view2 = zt0Var.c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                zt0Var.a.removeView(view2);
                break;
            case 23:
                mw0 mw0Var = (mw0) this.b;
                if (mw0Var.f == animator) {
                    mw0Var.f = null;
                    break;
                }
                break;
            case 24:
                by0 by0Var = (by0) this.b;
                by0Var.setCategoriesShownT(((Float) by0Var.x3.getAnimatedValue()).floatValue());
                by0Var.x3 = null;
                break;
            case 25:
                cz0 cz0Var = (cz0) this.b;
                cz0Var.x.setVisibility(8);
                cz0Var.F.setImageDrawable(null);
                break;
            case 26:
                int i10 = 0;
                while (true) {
                    iz0[] iz0VarArr = (iz0[]) this.b;
                    if (i10 >= iz0VarArr.length) {
                        break;
                    } else {
                        iz0 iz0Var = iz0VarArr[i10];
                        if (iz0Var != null) {
                            iz0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((jz0) this.b).H = null;
                break;
            case 28:
                ((mz0) this.b).e = false;
                break;
            default:
                ((x11) this.b).setVisibility(4);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 17:
                tn0 tn0Var = (tn0) this.b;
                tn0Var.d = true;
                if (tn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) tn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i10(zt0 zt0Var, s4.p0 p0Var) {
        this.a = 22;
        this.b = zt0Var;
    }

    private final void a(Animator animator) {
    }
}
