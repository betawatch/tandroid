package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                kf kfVar = (kf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.i9) kfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.i9) kfVar.c).e = null;
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
                zl0 zl0Var = (zl0) this.b;
                View view = zl0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (zl0Var.b1()) {
                    zl0Var.invalidate();
                    break;
                }
                break;
            case 9:
                an0 an0Var = (an0) this.b;
                if (an0Var.s != null) {
                    an0Var.j();
                    an0Var.s.invalidate();
                    an0Var.e.invalidate();
                    an0Var.invalidate();
                    an0Var.s = null;
                    break;
                }
                break;
            case 10:
                ((en0) this.b).d = false;
                break;
            case 11:
                ((qo0) this.b).O0.setVisibility(8);
                break;
            case 12:
                qp0 qp0Var = (qp0) this.b;
                if (animator == qp0Var.h) {
                    qp0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((ar0) this.b).e = null;
                break;
            case 14:
                hr0 hr0Var = (hr0) this.b;
                if (hr0Var.getParent() != null) {
                    ((ViewGroup) hr0Var.getParent()).removeView(hr0Var);
                    break;
                }
                break;
            case 15:
                lt0 lt0Var = (lt0) this.b;
                View view2 = lt0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                lt0Var.a.removeView(view2);
                break;
            case 16:
                cw0 cw0Var = (cw0) this.b;
                if (cw0Var.f == animator) {
                    cw0Var.f = null;
                    break;
                }
                break;
            case 17:
                sx0 sx0Var = (sx0) this.b;
                sx0Var.setCategoriesShownT(((Float) sx0Var.w3.getAnimatedValue()).floatValue());
                sx0Var.w3 = null;
                break;
            case 18:
                ry0 ry0Var = (ry0) this.b;
                ry0Var.x.setVisibility(8);
                ry0Var.F.setImageDrawable(null);
                break;
            case 19:
                int i10 = 0;
                while (true) {
                    yy0[] yy0VarArr = (yy0[]) this.b;
                    if (i10 >= yy0VarArr.length) {
                        break;
                    } else {
                        yy0 yy0Var = yy0VarArr[i10];
                        if (yy0Var != null) {
                            yy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((zy0) this.b).H = null;
                break;
            case 21:
                ((cz0) this.b).e = false;
                break;
            case 22:
                ((m11) this.b).setVisibility(4);
                break;
            case 23:
                ((x21) this.b).setVisibility(8);
                break;
            case 24:
                ai.n4 n4Var = ((r31) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 25:
                v31 v31Var = (v31) this.b;
                v31Var.K = 1.0f;
                v31Var.h.invalidate();
                break;
            case 26:
                ((d61) this.b).L = null;
                break;
            case 27:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 28:
                l71 l71Var = (l71) this.b;
                if (l71Var.a.getTag() == null) {
                    l71Var.a.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                m71 m71Var = (m71) this.b;
                m71Var.b = 0.0f;
                m71Var.setTranslationY(0.0f);
                m71Var.a = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                en0 en0Var = (en0) this.b;
                en0Var.d = true;
                if (en0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) en0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public hd0(lt0 lt0Var, s4.o0 o0Var) {
        this.a = 15;
        this.b = lt0Var;
    }

    private final void a(Animator animator) {
    }
}
