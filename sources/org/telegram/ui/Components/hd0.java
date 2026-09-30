package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class hd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((ch0) this.b).h = null;
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
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 1:
                ee0 ee0Var = (ee0) this.b;
                ee0Var.setVisibility(8);
                ee0Var.h();
                ee0Var.P = 0.0f;
                ee0Var.f(0.0f);
                ee0Var.setAlpha(0.0f);
                break;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 3:
                jf jfVar = (jf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) jfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) jfVar.c).e = null;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                hh0 hh0Var = (hh0) this.b;
                hh0Var.f = false;
                hh0Var.F = null;
                break;
            case 6:
                ((vi0) this.b).b();
                break;
            case 7:
                ((ck0) this.b).h.setVisibility(8);
                break;
            case 8:
                yl0 yl0Var = (yl0) this.b;
                View view = yl0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (yl0Var.b1()) {
                    yl0Var.invalidate();
                    break;
                }
                break;
            case 9:
                wm0 wm0Var = (wm0) this.b;
                if (wm0Var.s != null) {
                    wm0Var.j();
                    wm0Var.s.invalidate();
                    wm0Var.e.invalidate();
                    wm0Var.invalidate();
                    wm0Var.s = null;
                    break;
                }
                break;
            case 10:
                ((an0) this.b).d = false;
                break;
            case 11:
                ((no0) this.b).M0.setVisibility(8);
                break;
            case 12:
                lp0 lp0Var = (lp0) this.b;
                if (animator == lp0Var.h) {
                    lp0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((vq0) this.b).e = null;
                break;
            case 14:
                dr0 dr0Var = (dr0) this.b;
                if (dr0Var.getParent() != null) {
                    ((ViewGroup) dr0Var.getParent()).removeView(dr0Var);
                    break;
                }
                break;
            case 15:
                gt0 gt0Var = (gt0) this.b;
                View view2 = gt0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                gt0Var.a.removeView(view2);
                break;
            case 16:
                sv0 sv0Var = (sv0) this.b;
                if (sv0Var.f == animator) {
                    sv0Var.f = null;
                    break;
                }
                break;
            case 17:
                ix0 ix0Var = (ix0) this.b;
                ix0Var.setCategoriesShownT(((Float) ix0Var.p3.getAnimatedValue()).floatValue());
                ix0Var.p3 = null;
                break;
            case 18:
                hy0 hy0Var = (hy0) this.b;
                hy0Var.x.setVisibility(8);
                hy0Var.F.setImageDrawable(null);
                break;
            case 19:
                int i10 = 0;
                while (true) {
                    oy0[] oy0VarArr = (oy0[]) this.b;
                    if (i10 >= oy0VarArr.length) {
                        break;
                    } else {
                        oy0 oy0Var = oy0VarArr[i10];
                        if (oy0Var != null) {
                            oy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((py0) this.b).H = null;
                break;
            case 21:
                ((sy0) this.b).e = false;
                break;
            case 22:
                ((c11) this.b).setVisibility(4);
                break;
            case 23:
                ((n21) this.b).setVisibility(8);
                break;
            case 24:
                ai.n4 n4Var = ((h31) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 25:
                l31 l31Var = (l31) this.b;
                l31Var.K = 1.0f;
                l31Var.h.invalidate();
                break;
            case 26:
                ((t51) this.b).L = null;
                break;
            case 27:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 28:
                a71 a71Var = (a71) this.b;
                if (a71Var.a.getTag() == null) {
                    a71Var.a.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                b71 b71Var = (b71) this.b;
                b71Var.b = 0.0f;
                b71Var.setTranslationY(0.0f);
                b71Var.a = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                an0 an0Var = (an0) this.b;
                an0Var.d = true;
                if (an0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) an0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public hd0(gt0 gt0Var, s4.o0 o0Var) {
        this.a = 15;
        this.b = gt0Var;
    }

    private final void a(Animator animator) {
    }
}
