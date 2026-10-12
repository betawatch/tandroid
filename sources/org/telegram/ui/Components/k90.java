package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k90(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 7:
                ((qh0) this.b).h = null;
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
                l90 l90Var = (l90) this.b;
                if (!l90Var.f) {
                    l90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 1:
                s90 s90Var = (s90) this.b;
                FrameLayout frameLayout = s90Var.b;
                di.p6 p6Var = (di.p6) s90Var.c;
                if (p6Var.getParent() != null) {
                    frameLayout.removeView(p6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) s90Var.d);
                break;
            case 2:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.c0.h = null;
                pc0Var.e(pc0Var.S, pc0Var.R);
                break;
            case 3:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 4:
                re0 re0Var = (re0) this.b;
                re0Var.O = null;
                re0Var.r.setText("");
                di.i9.a(re0Var.s, false);
                re0Var.setVisibility(8);
                re0Var.T = 0.0f;
                re0Var.g(0.0f);
                re0Var.setAlpha(0.0f);
                re0Var.i();
                break;
            case 5:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 6:
                kf kfVar = (kf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((di.i9) kfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((di.i9) kfVar.c).e = null;
                    break;
                }
                break;
            case 7:
                break;
            case 8:
                vh0 vh0Var = (vh0) this.b;
                vh0Var.f = false;
                vh0Var.F = null;
                break;
            case 9:
                ((jj0) this.b).b();
                break;
            case 10:
                ((qk0) this.b).h.setVisibility(8);
                break;
            case 11:
                mm0 mm0Var = (mm0) this.b;
                View view = mm0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.b1()) {
                    mm0Var.invalidate();
                    break;
                }
                break;
            case 12:
                kn0 kn0Var = (kn0) this.b;
                if (kn0Var.s != null) {
                    kn0Var.j();
                    kn0Var.s.invalidate();
                    kn0Var.e.invalidate();
                    kn0Var.invalidate();
                    kn0Var.s = null;
                    break;
                }
                break;
            case 13:
                ((on0) this.b).d = false;
                break;
            case 14:
                ((zo0) this.b).M0.setVisibility(8);
                break;
            case 15:
                xp0 xp0Var = (xp0) this.b;
                if (animator == xp0Var.h) {
                    xp0Var.h = null;
                    break;
                }
                break;
            case 16:
                ((ir0) this.b).f = null;
                break;
            case 17:
                qr0 qr0Var = (qr0) this.b;
                if (qr0Var.getParent() != null) {
                    ((ViewGroup) qr0Var.getParent()).removeView(qr0Var);
                    break;
                }
                break;
            case 18:
                st0 st0Var = (st0) this.b;
                View view2 = st0Var.c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                st0Var.a.removeView(view2);
                break;
            case 19:
                ew0 ew0Var = (ew0) this.b;
                if (ew0Var.f == animator) {
                    ew0Var.f = null;
                    break;
                }
                break;
            case 20:
                ux0 ux0Var = (ux0) this.b;
                ux0Var.setCategoriesShownT(((Float) ux0Var.n3.getAnimatedValue()).floatValue());
                ux0Var.n3 = null;
                break;
            case 21:
                ty0 ty0Var = (ty0) this.b;
                ty0Var.x.setVisibility(8);
                ty0Var.F.setImageDrawable(null);
                break;
            case 22:
                int i10 = 0;
                while (true) {
                    zy0[] zy0VarArr = (zy0[]) this.b;
                    if (i10 >= zy0VarArr.length) {
                        break;
                    } else {
                        zy0 zy0Var = zy0VarArr[i10];
                        if (zy0Var != null) {
                            zy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 23:
                super.onAnimationEnd(animator);
                ((az0) this.b).H = null;
                break;
            case 24:
                ((dz0) this.b).e = false;
                break;
            case 25:
                ((o11) this.b).setVisibility(4);
                break;
            case 26:
                ((z21) this.b).setVisibility(8);
                break;
            case 27:
                bi.d4 d4Var = ((t31) this.b).f;
                d4Var.setScaleX(1.0f);
                d4Var.setScaleY(1.0f);
                d4Var.invalidate();
                break;
            case 28:
                x31 x31Var = (x31) this.b;
                x31Var.K = 1.0f;
                x31Var.h.invalidate();
                break;
            default:
                ((h61) this.b).L = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 13:
                on0 on0Var = (on0) this.b;
                on0Var.d = true;
                if (on0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) on0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k90(st0 st0Var, s4.n0 n0Var) {
        this.a = 18;
        this.b = st0Var;
    }

    private final void a(Animator animator) {
    }
}
