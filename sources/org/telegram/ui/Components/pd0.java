package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((xg0) this.b).h = null;
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
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 1:
                ye yeVar = (ye) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((td0) yeVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((td0) yeVar.c).e = null;
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ch0 ch0Var = (ch0) this.b;
                ch0Var.f = false;
                ch0Var.C = null;
                break;
            case 4:
                ((ri0) this.b).b();
                break;
            case 5:
                ((ak0) this.b).h.setVisibility(8);
                break;
            case 6:
                tl0 tl0Var = (tl0) this.b;
                View view = tl0Var.Z0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (tl0Var.b1()) {
                    tl0Var.invalidate();
                    break;
                }
                break;
            case 7:
                qm0 qm0Var = (qm0) this.b;
                if (qm0Var.s != null) {
                    qm0Var.j();
                    qm0Var.s.invalidate();
                    qm0Var.e.invalidate();
                    qm0Var.invalidate();
                    qm0Var.s = null;
                    break;
                }
                break;
            case 8:
                ((vm0) this.b).d = false;
                break;
            case 9:
                ((eo0) this.b).J0.setVisibility(8);
                break;
            case 10:
                bp0 bp0Var = (bp0) this.b;
                if (animator == bp0Var.h) {
                    bp0Var.h = null;
                    break;
                }
                break;
            case 11:
                ((lq0) this.b).e = null;
                break;
            case 12:
                tq0 tq0Var = (tq0) this.b;
                if (tq0Var.getParent() != null) {
                    ((ViewGroup) tq0Var.getParent()).removeView(tq0Var);
                    break;
                }
                break;
            case 13:
                ts0 ts0Var = (ts0) this.b;
                View view2 = ts0Var.c;
                view2.setAlpha(1.0f);
                f2.w0.x0(view2);
                ts0Var.a.removeView(view2);
                break;
            case 14:
                gv0 gv0Var = (gv0) this.b;
                if (gv0Var.f == animator) {
                    gv0Var.f = null;
                    break;
                }
                break;
            case 15:
                yw0 yw0Var = (yw0) this.b;
                yw0Var.setCategoriesShownT(((Float) yw0Var.m3.getAnimatedValue()).floatValue());
                yw0Var.m3 = null;
                break;
            case 16:
                yx0 yx0Var = (yx0) this.b;
                yx0Var.x.setVisibility(8);
                yx0Var.C.setImageDrawable(null);
                break;
            case 17:
                int i10 = 0;
                while (true) {
                    fy0[] fy0VarArr = (fy0[]) this.b;
                    if (i10 >= fy0VarArr.length) {
                        break;
                    } else {
                        fy0 fy0Var = fy0VarArr[i10];
                        if (fy0Var != null) {
                            fy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 18:
                super.onAnimationEnd(animator);
                ((gy0) this.b).E = null;
                break;
            case 19:
                ((jy0) this.b).e = false;
                break;
            case 20:
                ((s01) this.b).setVisibility(4);
                break;
            case 21:
                ((b21) this.b).setVisibility(8);
                break;
            case 22:
                oh.b3 b3Var = ((s21) this.b).f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                break;
            case 23:
                w21 w21Var = (w21) this.b;
                w21Var.H = 1.0f;
                w21Var.h.invalidate();
                break;
            case 24:
                ((f51) this.b).I = null;
                break;
            case 25:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 26:
                p61 p61Var = (p61) this.b;
                if (p61Var.a.getTag() == null) {
                    p61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 27:
                super.onAnimationEnd(animator);
                q61 q61Var = (q61) this.b;
                q61Var.b = 0.0f;
                q61Var.setTranslationY(0.0f);
                q61Var.a = null;
                break;
            case 28:
                l81 l81Var = (l81) this.b;
                l81Var.G = false;
                l81Var.setEnabled(true);
                k81 k81Var = l81Var.y;
                if (k81Var != null) {
                    ((oh.h4) k81Var).f0(1.0f);
                }
                l81Var.invalidate();
                break;
            default:
                ((f91) this.b).b0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                vm0 vm0Var = (vm0) this.b;
                vm0Var.d = true;
                if (vm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) vm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public pd0(ts0 ts0Var, f2.w0 w0Var) {
        this.a = 13;
        this.b = ts0Var;
    }

    private final void a(Animator animator) {
    }
}
