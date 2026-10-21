package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class c80 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((lh0) this.b).h = null;
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
                i80 i80Var = (i80) this.b;
                g80 g80Var = i80Var.x;
                if (g80Var != null) {
                    g80Var.setProgress(1.0f);
                    i80Var.x.invalidate();
                }
                i80Var.m0 = null;
                break;
            case 1:
                t00 t00Var = (t00) this.b;
                ((r80) t00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                e90 e90Var = (e90) this.b;
                if (!e90Var.f) {
                    e90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                m90 m90Var = (m90) this.b;
                FrameLayout frameLayout = m90Var.b;
                ei.g6 g6Var = (ei.g6) m90Var.c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) m90Var.d);
                break;
            case 4:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                me0 me0Var = (me0) this.b;
                me0Var.S = null;
                me0Var.r.setText("");
                ei.x8.a(me0Var.s, false);
                me0Var.setVisibility(8);
                me0Var.a0 = 0.0f;
                me0Var.h(0.0f);
                me0Var.setAlpha(0.0f);
                me0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                qh0 qh0Var = (qh0) this.b;
                qh0Var.f = false;
                qh0Var.F = null;
                break;
            case 11:
                ((fj0) this.b).b();
                break;
            case 12:
                ((nk0) this.b).h.setVisibility(8);
                break;
            case 13:
                jm0 jm0Var = (jm0) this.b;
                View view = jm0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (jm0Var.b1()) {
                    jm0Var.invalidate();
                    break;
                }
                break;
            case 14:
                hn0 hn0Var = (hn0) this.b;
                if (hn0Var.s != null) {
                    hn0Var.j();
                    hn0Var.s.invalidate();
                    hn0Var.e.invalidate();
                    hn0Var.invalidate();
                    hn0Var.s = null;
                    break;
                }
                break;
            case 15:
                ((ln0) this.b).d = false;
                break;
            case 16:
                ((wo0) this.b).M0.setVisibility(8);
                break;
            case 17:
                tp0 tp0Var = (tp0) this.b;
                if (animator == tp0Var.h) {
                    tp0Var.h = null;
                    break;
                }
                break;
            case 18:
                ((er0) this.b).f = null;
                break;
            case 19:
                mr0 mr0Var = (mr0) this.b;
                if (mr0Var.getParent() != null) {
                    ((ViewGroup) mr0Var.getParent()).removeView(mr0Var);
                    break;
                }
                break;
            case 20:
                pt0 pt0Var = (pt0) this.b;
                View view2 = pt0Var.c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                pt0Var.a.removeView(view2);
                break;
            case 21:
                bw0 bw0Var = (bw0) this.b;
                if (bw0Var.f == animator) {
                    bw0Var.f = null;
                    break;
                }
                break;
            case 22:
                rx0 rx0Var = (rx0) this.b;
                rx0Var.setCategoriesShownT(((Float) rx0Var.n3.getAnimatedValue()).floatValue());
                rx0Var.n3 = null;
                break;
            case 23:
                qy0 qy0Var = (qy0) this.b;
                qy0Var.x.setVisibility(8);
                qy0Var.F.setImageDrawable(null);
                break;
            case 24:
                int i10 = 0;
                while (true) {
                    wy0[] wy0VarArr = (wy0[]) this.b;
                    if (i10 >= wy0VarArr.length) {
                        break;
                    } else {
                        wy0 wy0Var = wy0VarArr[i10];
                        if (wy0Var != null) {
                            wy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((xy0) this.b).H = null;
                break;
            case 26:
                ((az0) this.b).e = false;
                break;
            case 27:
                ((m11) this.b).setVisibility(4);
                break;
            case 28:
                ((v21) this.b).setVisibility(8);
                break;
            default:
                ci.i3 i3Var = ((m31) this.b).f;
                i3Var.setScaleX(1.0f);
                i3Var.setScaleY(1.0f);
                i3Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 15:
                ln0 ln0Var = (ln0) this.b;
                ln0Var.d = true;
                if (ln0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) ln0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public c80(pt0 pt0Var, s4.n0 n0Var) {
        this.a = 20;
        this.b = pt0Var;
    }

    private final void a(Animator animator) {
    }
}
