package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ed0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((ah0) this.b).h = null;
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
                be0 be0Var = (be0) this.b;
                be0Var.setVisibility(8);
                be0Var.h();
                be0Var.P = 0.0f;
                be0Var.f(0.0f);
                be0Var.setAlpha(0.0f);
                break;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 3:
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) hfVar.c).e = null;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                fh0 fh0Var = (fh0) this.b;
                fh0Var.f = false;
                fh0Var.F = null;
                break;
            case 6:
                ((ti0) this.b).b();
                break;
            case 7:
                ((ak0) this.b).h.setVisibility(8);
                break;
            case 8:
                wl0 wl0Var = (wl0) this.b;
                View view = wl0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (wl0Var.c1()) {
                    wl0Var.invalidate();
                    break;
                }
                break;
            case 9:
                vm0 vm0Var = (vm0) this.b;
                if (vm0Var.s != null) {
                    vm0Var.j();
                    vm0Var.s.invalidate();
                    vm0Var.e.invalidate();
                    vm0Var.invalidate();
                    vm0Var.s = null;
                    break;
                }
                break;
            case 10:
                ((zm0) this.b).d = false;
                break;
            case 11:
                ((lo0) this.b).N0.setVisibility(8);
                break;
            case 12:
                kp0 kp0Var = (kp0) this.b;
                if (animator == kp0Var.h) {
                    kp0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((uq0) this.b).e = null;
                break;
            case 14:
                cr0 cr0Var = (cr0) this.b;
                if (cr0Var.getParent() != null) {
                    ((ViewGroup) cr0Var.getParent()).removeView(cr0Var);
                    break;
                }
                break;
            case 15:
                ft0 ft0Var = (ft0) this.b;
                View view2 = ft0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ft0Var.a.removeView(view2);
                break;
            case 16:
                rv0 rv0Var = (rv0) this.b;
                if (rv0Var.f == animator) {
                    rv0Var.f = null;
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
                zm0 zm0Var = (zm0) this.b;
                zm0Var.d = true;
                if (zm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) zm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ed0(ft0 ft0Var, s4.o0 o0Var) {
        this.a = 15;
        this.b = ft0Var;
    }

    private final void a(Animator animator) {
    }
}
