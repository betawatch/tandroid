package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                if (ml0Var.c1()) {
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
                ((zn0) this.b).N0.setVisibility(8);
                break;
            case 11:
                xo0 xo0Var = (xo0) this.b;
                if (animator == xo0Var.h) {
                    xo0Var.h = null;
                    break;
                }
                break;
            case 12:
                ((hq0) this.b).e = null;
                break;
            case 13:
                pq0 pq0Var = (pq0) this.b;
                if (pq0Var.getParent() != null) {
                    ((ViewGroup) pq0Var.getParent()).removeView(pq0Var);
                    break;
                }
                break;
            case 14:
                us0 us0Var = (us0) this.b;
                View view2 = us0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                us0Var.a.removeView(view2);
                break;
            case 15:
                gv0 gv0Var = (gv0) this.b;
                if (gv0Var.f == animator) {
                    gv0Var.f = null;
                    break;
                }
                break;
            case 16:
                xw0 xw0Var = (xw0) this.b;
                xw0Var.setCategoriesShownT(((Float) xw0Var.p3.getAnimatedValue()).floatValue());
                xw0Var.p3 = null;
                break;
            case 17:
                wx0 wx0Var = (wx0) this.b;
                wx0Var.x.setVisibility(8);
                wx0Var.F.setImageDrawable(null);
                break;
            case 18:
                int i10 = 0;
                while (true) {
                    dy0[] dy0VarArr = (dy0[]) this.b;
                    if (i10 >= dy0VarArr.length) {
                        break;
                    } else {
                        dy0 dy0Var = dy0VarArr[i10];
                        if (dy0Var != null) {
                            dy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 19:
                super.onAnimationEnd(animator);
                ((ey0) this.b).H = null;
                break;
            case 20:
                ((hy0) this.b).e = false;
                break;
            case 21:
                ((o01) this.b).setVisibility(4);
                break;
            case 22:
                ((z11) this.b).setVisibility(8);
                break;
            case 23:
                ai.n4 n4Var = ((t21) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 24:
                x21 x21Var = (x21) this.b;
                x21Var.K = 1.0f;
                x21Var.h.invalidate();
                break;
            case 25:
                ((f51) this.b).L = null;
                break;
            case 26:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 27:
                m61 m61Var = (m61) this.b;
                if (m61Var.a.getTag() == null) {
                    m61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                n61 n61Var = (n61) this.b;
                n61Var.b = 0.0f;
                n61Var.setTranslationY(0.0f);
                n61Var.a = null;
                break;
            default:
                i81 i81Var = (i81) this.b;
                i81Var.J = false;
                i81Var.setEnabled(true);
                h81 h81Var = i81Var.y;
                if (h81Var != null) {
                    ((ka.c) h81Var).h(1.0f);
                }
                i81Var.invalidate();
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

    public jd0(us0 us0Var, s4.o0 o0Var) {
        this.a = 14;
        this.b = us0Var;
    }

    private final void a(Animator animator) {
    }
}
