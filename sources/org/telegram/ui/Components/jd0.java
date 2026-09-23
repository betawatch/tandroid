package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((qg0) this.b).h = null;
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
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) hfVar.c).e = null;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                vg0 vg0Var = (vg0) this.b;
                vg0Var.f = false;
                vg0Var.F = null;
                break;
            case 5:
                ((ji0) this.b).b();
                break;
            case 6:
                ((qj0) this.b).h.setVisibility(8);
                break;
            case 7:
                ml0 ml0Var = (ml0) this.b;
                View view = ml0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ml0Var.b1()) {
                    ml0Var.invalidate();
                    break;
                }
                break;
            case 8:
                jm0 jm0Var = (jm0) this.b;
                if (jm0Var.s != null) {
                    jm0Var.j();
                    jm0Var.s.invalidate();
                    jm0Var.e.invalidate();
                    jm0Var.invalidate();
                    jm0Var.s = null;
                    break;
                }
                break;
            case 9:
                ((nm0) this.b).d = false;
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
                vw0 vw0Var = (vw0) this.b;
                vw0Var.setCategoriesShownT(((Float) vw0Var.p3.getAnimatedValue()).floatValue());
                vw0Var.p3 = null;
                break;
            case 17:
                ux0 ux0Var = (ux0) this.b;
                ux0Var.x.setVisibility(8);
                ux0Var.F.setImageDrawable(null);
                break;
            case 18:
                int i10 = 0;
                while (true) {
                    by0[] by0VarArr = (by0[]) this.b;
                    if (i10 >= by0VarArr.length) {
                        break;
                    } else {
                        by0 by0Var = by0VarArr[i10];
                        if (by0Var != null) {
                            by0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 19:
                super.onAnimationEnd(animator);
                ((cy0) this.b).H = null;
                break;
            case 20:
                ((fy0) this.b).e = false;
                break;
            case 21:
                ((m01) this.b).setVisibility(4);
                break;
            case 22:
                ((x11) this.b).setVisibility(8);
                break;
            case 23:
                ai.n4 n4Var = ((r21) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 24:
                v21 v21Var = (v21) this.b;
                v21Var.K = 1.0f;
                v21Var.h.invalidate();
                break;
            case 25:
                ((d51) this.b).L = null;
                break;
            case 26:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 27:
                k61 k61Var = (k61) this.b;
                if (k61Var.a.getTag() == null) {
                    k61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                l61 l61Var = (l61) this.b;
                l61Var.b = 0.0f;
                l61Var.setTranslationY(0.0f);
                l61Var.a = null;
                break;
            default:
                g81 g81Var = (g81) this.b;
                g81Var.J = false;
                g81Var.setEnabled(true);
                f81 f81Var = g81Var.y;
                if (f81Var != null) {
                    ((ka.c) f81Var).h(1.0f);
                }
                g81Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                nm0 nm0Var = (nm0) this.b;
                nm0Var.d = true;
                if (nm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) nm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
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
