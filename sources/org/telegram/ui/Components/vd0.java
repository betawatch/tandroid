package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((sh0) this.b).h = null;
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
                te0 te0Var = (te0) this.b;
                te0Var.O = null;
                te0Var.r.setText("");
                ci.j9.a(te0Var.s, false);
                te0Var.setVisibility(8);
                te0Var.T = 0.0f;
                te0Var.g(0.0f);
                te0Var.setAlpha(0.0f);
                te0Var.i();
                break;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 3:
                lf lfVar = (lf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) lfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) lfVar.c).e = null;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                xh0 xh0Var = (xh0) this.b;
                xh0Var.f = false;
                xh0Var.F = null;
                break;
            case 6:
                ((nj0) this.b).b();
                break;
            case 7:
                ((uk0) this.b).h.setVisibility(8);
                break;
            case 8:
                qm0 qm0Var = (qm0) this.b;
                View view = qm0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (qm0Var.b1()) {
                    qm0Var.invalidate();
                    break;
                }
                break;
            case 9:
                on0 on0Var = (on0) this.b;
                if (on0Var.s != null) {
                    on0Var.j();
                    on0Var.s.invalidate();
                    on0Var.e.invalidate();
                    on0Var.invalidate();
                    on0Var.s = null;
                    break;
                }
                break;
            case 10:
                ((sn0) this.b).d = false;
                break;
            case 11:
                ((dp0) this.b).M0.setVisibility(8);
                break;
            case 12:
                bq0 bq0Var = (bq0) this.b;
                if (animator == bq0Var.h) {
                    bq0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((lr0) this.b).f = null;
                break;
            case 14:
                tr0 tr0Var = (tr0) this.b;
                if (tr0Var.getParent() != null) {
                    ((ViewGroup) tr0Var.getParent()).removeView(tr0Var);
                    break;
                }
                break;
            case 15:
                wt0 wt0Var = (wt0) this.b;
                View view2 = wt0Var.c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                wt0Var.a.removeView(view2);
                break;
            case 16:
                iw0 iw0Var = (iw0) this.b;
                if (iw0Var.f == animator) {
                    iw0Var.f = null;
                    break;
                }
                break;
            case 17:
                yx0 yx0Var = (yx0) this.b;
                yx0Var.setCategoriesShownT(((Float) yx0Var.n3.getAnimatedValue()).floatValue());
                yx0Var.n3 = null;
                break;
            case 18:
                xy0 xy0Var = (xy0) this.b;
                xy0Var.x.setVisibility(8);
                xy0Var.F.setImageDrawable(null);
                break;
            case 19:
                int i10 = 0;
                while (true) {
                    dz0[] dz0VarArr = (dz0[]) this.b;
                    if (i10 >= dz0VarArr.length) {
                        break;
                    } else {
                        dz0 dz0Var = dz0VarArr[i10];
                        if (dz0Var != null) {
                            dz0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((ez0) this.b).H = null;
                break;
            case 21:
                ((hz0) this.b).e = false;
                break;
            case 22:
                ((s11) this.b).setVisibility(4);
                break;
            case 23:
                ((d31) this.b).setVisibility(8);
                break;
            case 24:
                ai.o4 o4Var = ((x31) this.b).f;
                o4Var.setScaleX(1.0f);
                o4Var.setScaleY(1.0f);
                o4Var.invalidate();
                break;
            case 25:
                b41 b41Var = (b41) this.b;
                b41Var.K = 1.0f;
                b41Var.h.invalidate();
                break;
            case 26:
                ((l61) this.b).L = null;
                break;
            case 27:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 28:
                q71 q71Var = (q71) this.b;
                if (q71Var.a.getTag() == null) {
                    q71Var.a.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                r71 r71Var = (r71) this.b;
                r71Var.b = 0.0f;
                r71Var.setTranslationY(0.0f);
                r71Var.a = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                sn0 sn0Var = (sn0) this.b;
                sn0Var.d = true;
                if (sn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) sn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public vd0(wt0 wt0Var, s4.p0 p0Var) {
        this.a = 15;
        this.b = wt0Var;
    }

    private final void a(Animator animator) {
    }
}
