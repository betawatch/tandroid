package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class fd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd0(Object obj, int i10) {
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
                ce0 ce0Var = (ce0) this.b;
                ce0Var.setVisibility(8);
                ce0Var.h();
                ce0Var.P = 0.0f;
                ce0Var.f(0.0f);
                ce0Var.setAlpha(0.0f);
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
                if (wl0Var.b1()) {
                    wl0Var.invalidate();
                    break;
                }
                break;
            case 9:
                um0 um0Var = (um0) this.b;
                if (um0Var.s != null) {
                    um0Var.j();
                    um0Var.s.invalidate();
                    um0Var.e.invalidate();
                    um0Var.invalidate();
                    um0Var.s = null;
                    break;
                }
                break;
            case 10:
                ((ym0) this.b).d = false;
                break;
            case 11:
                ((lo0) this.b).M0.setVisibility(8);
                break;
            case 12:
                jp0 jp0Var = (jp0) this.b;
                if (animator == jp0Var.h) {
                    jp0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((tq0) this.b).e = null;
                break;
            case 14:
                br0 br0Var = (br0) this.b;
                if (br0Var.getParent() != null) {
                    ((ViewGroup) br0Var.getParent()).removeView(br0Var);
                    break;
                }
                break;
            case 15:
                et0 et0Var = (et0) this.b;
                View view2 = et0Var.c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                et0Var.a.removeView(view2);
                break;
            case 16:
                qv0 qv0Var = (qv0) this.b;
                if (qv0Var.f == animator) {
                    qv0Var.f = null;
                    break;
                }
                break;
            case 17:
                gx0 gx0Var = (gx0) this.b;
                gx0Var.setCategoriesShownT(((Float) gx0Var.p3.getAnimatedValue()).floatValue());
                gx0Var.p3 = null;
                break;
            case 18:
                fy0 fy0Var = (fy0) this.b;
                fy0Var.x.setVisibility(8);
                fy0Var.F.setImageDrawable(null);
                break;
            case 19:
                int i10 = 0;
                while (true) {
                    my0[] my0VarArr = (my0[]) this.b;
                    if (i10 >= my0VarArr.length) {
                        break;
                    } else {
                        my0 my0Var = my0VarArr[i10];
                        if (my0Var != null) {
                            my0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((ny0) this.b).H = null;
                break;
            case 21:
                ((qy0) this.b).e = false;
                break;
            case 22:
                ((a11) this.b).setVisibility(4);
                break;
            case 23:
                ((l21) this.b).setVisibility(8);
                break;
            case 24:
                ai.n4 n4Var = ((f31) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 25:
                j31 j31Var = (j31) this.b;
                j31Var.K = 1.0f;
                j31Var.h.invalidate();
                break;
            case 26:
                ((r51) this.b).L = null;
                break;
            case 27:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 28:
                y61 y61Var = (y61) this.b;
                if (y61Var.a.getTag() == null) {
                    y61Var.a.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                z61 z61Var = (z61) this.b;
                z61Var.b = 0.0f;
                z61Var.setTranslationY(0.0f);
                z61Var.a = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ym0 ym0Var = (ym0) this.b;
                ym0Var.d = true;
                if (ym0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) ym0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public fd0(et0 et0Var, s4.o0 o0Var) {
        this.a = 15;
        this.b = et0Var;
    }

    private final void a(Animator animator) {
    }
}
