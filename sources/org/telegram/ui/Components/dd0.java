package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class dd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((zg0) this.b).h = null;
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
                ae0 ae0Var = (ae0) this.b;
                ae0Var.setVisibility(8);
                ae0Var.h();
                ae0Var.P = 0.0f;
                ae0Var.f(0.0f);
                ae0Var.setAlpha(0.0f);
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
                eh0 eh0Var = (eh0) this.b;
                eh0Var.f = false;
                eh0Var.F = null;
                break;
            case 6:
                ((si0) this.b).b();
                break;
            case 7:
                ((zj0) this.b).h.setVisibility(8);
                break;
            case 8:
                vl0 vl0Var = (vl0) this.b;
                View view = vl0Var.c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (vl0Var.c1()) {
                    vl0Var.invalidate();
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
                ((lo0) this.b).N0.setVisibility(8);
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
                hx0 hx0Var = (hx0) this.b;
                hx0Var.setCategoriesShownT(((Float) hx0Var.p3.getAnimatedValue()).floatValue());
                hx0Var.p3 = null;
                break;
            case 18:
                gy0 gy0Var = (gy0) this.b;
                gy0Var.x.setVisibility(8);
                gy0Var.F.setImageDrawable(null);
                break;
            case 19:
                int i10 = 0;
                while (true) {
                    ny0[] ny0VarArr = (ny0[]) this.b;
                    if (i10 >= ny0VarArr.length) {
                        break;
                    } else {
                        ny0 ny0Var = ny0VarArr[i10];
                        if (ny0Var != null) {
                            ny0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((oy0) this.b).H = null;
                break;
            case 21:
                ((ry0) this.b).e = false;
                break;
            case 22:
                ((b11) this.b).setVisibility(4);
                break;
            case 23:
                ((m21) this.b).setVisibility(8);
                break;
            case 24:
                ai.n4 n4Var = ((g31) this.b).f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                break;
            case 25:
                k31 k31Var = (k31) this.b;
                k31Var.K = 1.0f;
                k31Var.h.invalidate();
                break;
            case 26:
                ((s51) this.b).L = null;
                break;
            case 27:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 28:
                z61 z61Var = (z61) this.b;
                if (z61Var.a.getTag() == null) {
                    z61Var.a.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                a71 a71Var = (a71) this.b;
                a71Var.b = 0.0f;
                a71Var.setTranslationY(0.0f);
                a71Var.a = null;
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

    public dd0(et0 et0Var, s4.o0 o0Var) {
        this.a = 15;
        this.b = et0Var;
    }

    private final void a(Animator animator) {
    }
}
