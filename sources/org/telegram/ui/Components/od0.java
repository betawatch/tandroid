package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((wg0) this.b).h = null;
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
                AnimatorSet animatorSet2 = (AnimatorSet) ((sd0) yeVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((sd0) yeVar.c).e = null;
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                bh0 bh0Var = (bh0) this.b;
                bh0Var.f = false;
                bh0Var.C = null;
                break;
            case 4:
                ((qi0) this.b).b();
                break;
            case 5:
                ((yj0) this.b).h.setVisibility(8);
                break;
            case 6:
                rl0 rl0Var = (rl0) this.b;
                View view = rl0Var.Z0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (rl0Var.a1()) {
                    rl0Var.invalidate();
                    break;
                }
                break;
            case 7:
                om0 om0Var = (om0) this.b;
                if (om0Var.s != null) {
                    om0Var.j();
                    om0Var.s.invalidate();
                    om0Var.e.invalidate();
                    om0Var.invalidate();
                    om0Var.s = null;
                    break;
                }
                break;
            case 8:
                ((tm0) this.b).d = false;
                break;
            case 9:
                ((co0) this.b).J0.setVisibility(8);
                break;
            case 10:
                zo0 zo0Var = (zo0) this.b;
                if (animator == zo0Var.h) {
                    zo0Var.h = null;
                    break;
                }
                break;
            case 11:
                ((kq0) this.b).e = null;
                break;
            case 12:
                sq0 sq0Var = (sq0) this.b;
                if (sq0Var.getParent() != null) {
                    ((ViewGroup) sq0Var.getParent()).removeView(sq0Var);
                    break;
                }
                break;
            case 13:
                ss0 ss0Var = (ss0) this.b;
                View view2 = ss0Var.c;
                view2.setAlpha(1.0f);
                f2.v0.x0(view2);
                ss0Var.a.removeView(view2);
                break;
            case 14:
                fv0 fv0Var = (fv0) this.b;
                if (fv0Var.f == animator) {
                    fv0Var.f = null;
                    break;
                }
                break;
            case 15:
                xw0 xw0Var = (xw0) this.b;
                xw0Var.setCategoriesShownT(((Float) xw0Var.m3.getAnimatedValue()).floatValue());
                xw0Var.m3 = null;
                break;
            case 16:
                xx0 xx0Var = (xx0) this.b;
                xx0Var.x.setVisibility(8);
                xx0Var.C.setImageDrawable(null);
                break;
            case 17:
                int i10 = 0;
                while (true) {
                    ey0[] ey0VarArr = (ey0[]) this.b;
                    if (i10 >= ey0VarArr.length) {
                        break;
                    } else {
                        ey0 ey0Var = ey0VarArr[i10];
                        if (ey0Var != null) {
                            ey0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 18:
                super.onAnimationEnd(animator);
                ((fy0) this.b).E = null;
                break;
            case 19:
                ((iy0) this.b).e = false;
                break;
            case 20:
                ((r01) this.b).setVisibility(4);
                break;
            case 21:
                ((a21) this.b).setVisibility(8);
                break;
            case 22:
                nh.a3 a3Var = ((r21) this.b).f;
                a3Var.setScaleX(1.0f);
                a3Var.setScaleY(1.0f);
                a3Var.invalidate();
                break;
            case 23:
                v21 v21Var = (v21) this.b;
                v21Var.H = 1.0f;
                v21Var.h.invalidate();
                break;
            case 24:
                ((e51) this.b).I = null;
                break;
            case 25:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 26:
                n61 n61Var = (n61) this.b;
                if (n61Var.a.getTag() == null) {
                    n61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 27:
                super.onAnimationEnd(animator);
                o61 o61Var = (o61) this.b;
                o61Var.b = 0.0f;
                o61Var.setTranslationY(0.0f);
                o61Var.a = null;
                break;
            case 28:
                k81 k81Var = (k81) this.b;
                k81Var.G = false;
                k81Var.setEnabled(true);
                j81 j81Var = k81Var.y;
                if (j81Var != null) {
                    ((tp0) j81Var).n(1.0f);
                }
                k81Var.invalidate();
                break;
            default:
                ((e91) this.b).b0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                tm0 tm0Var = (tm0) this.b;
                tm0Var.d = true;
                if (tm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) tm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public od0(ss0 ss0Var, f2.v0 v0Var) {
        this.a = 13;
        this.b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
