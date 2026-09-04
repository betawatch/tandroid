package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class r80 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
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
                s80 s80Var = (s80) this.b;
                FrameLayout frameLayout = s80Var.b;
                di.r6 r6Var = (di.r6) s80Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) s80Var.d);
                break;
            case 1:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.c0.h = null;
                qb0Var.e(qb0Var.S, qb0Var.R);
                break;
            case 2:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 3:
                sd0 sd0Var = (sd0) this.b;
                sd0Var.setVisibility(8);
                sd0Var.h();
                sd0Var.P = 0.0f;
                sd0Var.f(0.0f);
                sd0Var.setAlpha(0.0f);
                break;
            case 4:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 5:
                jf jfVar = (jf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((di.l9) jfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((di.l9) jfVar.c).e = null;
                    break;
                }
                break;
            case 6:
                break;
            case 7:
                ug0 ug0Var = (ug0) this.b;
                ug0Var.f = false;
                ug0Var.F = null;
                break;
            case 8:
                ((ii0) this.b).b();
                break;
            case 9:
                ((pj0) this.b).h.setVisibility(8);
                break;
            case 10:
                ll0 ll0Var = (ll0) this.b;
                View view = ll0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ll0Var.a1()) {
                    ll0Var.invalidate();
                    break;
                }
                break;
            case 11:
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
            case 12:
                ((mm0) this.b).d = false;
                break;
            case 13:
                ((yn0) this.b).M0.setVisibility(8);
                break;
            case 14:
                xo0 xo0Var = (xo0) this.b;
                if (animator == xo0Var.h) {
                    xo0Var.h = null;
                    break;
                }
                break;
            case 15:
                ((gq0) this.b).e = null;
                break;
            case 16:
                oq0 oq0Var = (oq0) this.b;
                if (oq0Var.getParent() != null) {
                    ((ViewGroup) oq0Var.getParent()).removeView(oq0Var);
                    break;
                }
                break;
            case 17:
                ss0 ss0Var = (ss0) this.b;
                View view2 = ss0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                ss0Var.a.removeView(view2);
                break;
            case 18:
                ev0 ev0Var = (ev0) this.b;
                if (ev0Var.f == animator) {
                    ev0Var.f = null;
                    break;
                }
                break;
            case 19:
                vw0 vw0Var = (vw0) this.b;
                vw0Var.setCategoriesShownT(((Float) vw0Var.p3.getAnimatedValue()).floatValue());
                vw0Var.p3 = null;
                break;
            case 20:
                ux0 ux0Var = (ux0) this.b;
                ux0Var.x.setVisibility(8);
                ux0Var.F.setImageDrawable(null);
                break;
            case 21:
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
            case 22:
                super.onAnimationEnd(animator);
                ((cy0) this.b).H = null;
                break;
            case 23:
                ((fy0) this.b).e = false;
                break;
            case 24:
                ((m01) this.b).setVisibility(4);
                break;
            case 25:
                ((x11) this.b).setVisibility(8);
                break;
            case 26:
                bi.a4 a4Var = ((r21) this.b).f;
                a4Var.setScaleX(1.0f);
                a4Var.setScaleY(1.0f);
                a4Var.invalidate();
                break;
            case 27:
                v21 v21Var = (v21) this.b;
                v21Var.K = 1.0f;
                v21Var.h.invalidate();
                break;
            case 28:
                ((d51) this.b).L = null;
                break;
            default:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
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

    public r80(ss0 ss0Var, s4.o0 o0Var) {
        this.a = 17;
        this.b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
