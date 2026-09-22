package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((pg0) this.b).h = null;
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
                sd0 sd0Var = (sd0) this.b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                break;
            case 1:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 2:
                ff ffVar = (ff) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) ffVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) ffVar.c).e = null;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ug0 ug0Var = (ug0) this.b;
                ug0Var.f = false;
                ug0Var.F = null;
                break;
            case 5:
                ((ii0) this.b).b();
                break;
            case 6:
                ((pj0) this.b).h.setVisibility(8);
                break;
            case 7:
                ll0 ll0Var = (ll0) this.b;
                View view = ll0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ll0Var.b1()) {
                    ll0Var.invalidate();
                    break;
                }
                break;
            case 8:
                im0 im0Var = (im0) this.b;
                if (im0Var.s != null) {
                    im0Var.j();
                    im0Var.s.invalidate();
                    im0Var.e.invalidate();
                    im0Var.invalidate();
                    im0Var.s = null;
                    break;
                }
                break;
            case 9:
                ((mm0) this.b).d = false;
                break;
            case 10:
                ((yn0) this.b).M0.setVisibility(8);
                break;
            case 11:
                wo0 wo0Var = (wo0) this.b;
                if (animator == wo0Var.h) {
                    wo0Var.h = null;
                    break;
                }
                break;
            case 12:
                ((gq0) this.b).e = null;
                break;
            case 13:
                oq0 oq0Var = (oq0) this.b;
                if (oq0Var.getParent() != null) {
                    ((ViewGroup) oq0Var.getParent()).removeView(oq0Var);
                    break;
                }
                break;
            case 14:
                ts0 ts0Var = (ts0) this.b;
                View view2 = ts0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ts0Var.a.removeView(view2);
                break;
            case 15:
                fv0 fv0Var = (fv0) this.b;
                if (fv0Var.f == animator) {
                    fv0Var.f = null;
                    break;
                }
                break;
            case 16:
                ww0 ww0Var = (ww0) this.b;
                ww0Var.setCategoriesShownT(((Float) ww0Var.p3.getAnimatedValue()).floatValue());
                ww0Var.p3 = null;
                break;
            case 17:
                vx0 vx0Var = (vx0) this.b;
                vx0Var.x.setVisibility(8);
                vx0Var.F.setImageDrawable(null);
                break;
            case 18:
                int i10 = 0;
                while (true) {
                    cy0[] cy0VarArr = (cy0[]) this.b;
                    if (i10 >= cy0VarArr.length) {
                        break;
                    } else {
                        cy0 cy0Var = cy0VarArr[i10];
                        if (cy0Var != null) {
                            cy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 19:
                super.onAnimationEnd(animator);
                ((dy0) this.b).H = null;
                break;
            case 20:
                ((gy0) this.b).e = false;
                break;
            case 21:
                ((n01) this.b).setVisibility(4);
                break;
            case 22:
                ((y11) this.b).setVisibility(8);
                break;
            case 23:
                ai.n4 n4Var = ((s21) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 24:
                w21 w21Var = (w21) this.b;
                w21Var.K = 1.0f;
                w21Var.h.invalidate();
                break;
            case 25:
                ((e51) this.b).L = null;
                break;
            case 26:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 27:
                l61 l61Var = (l61) this.b;
                if (l61Var.a.getTag() == null) {
                    l61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                m61 m61Var = (m61) this.b;
                m61Var.b = 0.0f;
                m61Var.setTranslationY(0.0f);
                m61Var.a = null;
                break;
            default:
                h81 h81Var = (h81) this.b;
                h81Var.J = false;
                h81Var.setEnabled(true);
                g81 g81Var = h81Var.y;
                if (g81Var != null) {
                    ((ka.c) g81Var).h(1.0f);
                }
                h81Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                mm0 mm0Var = (mm0) this.b;
                mm0Var.d = true;
                if (mm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) mm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public jd0(ts0 ts0Var, s4.o0 o0Var) {
        this.a = 14;
        this.b = ts0Var;
    }

    private final void a(Animator animator) {
    }
}
