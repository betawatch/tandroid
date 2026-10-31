package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((tf0) this.b).n1 = null;
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
                z60 z60Var = (z60) this.b;
                x60 x60Var = z60Var.x;
                if (x60Var != null) {
                    x60Var.setProgress(1.0f);
                    z60Var.x.invalidate();
                }
                z60Var.m0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.b;
                ((k70) u0Var.e).x1 = false;
                TextView[] textViewArr = (TextView[]) u0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                y70 y70Var = (y70) this.b;
                if (!y70Var.f) {
                    y70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                f80 f80Var = (f80) this.b;
                FrameLayout frameLayout = f80Var.b;
                kg.f0 f0Var = (kg.f0) f80Var.c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.l1) f80Var.d);
                break;
            case 4:
                ua0 ua0Var = (ua0) this.b;
                ua0Var.c0.h = null;
                ua0Var.f(ua0Var.S, ua0Var.R);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                zc0 zc0Var = (zc0) this.b;
                zc0Var.S = null;
                zc0Var.r.setText("");
                uc0.a(zc0Var.s, false);
                zc0Var.setVisibility(8);
                zc0Var.a0 = 0.0f;
                zc0Var.h(0.0f);
                zc0Var.setAlpha(0.0f);
                zc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                le leVar = (le) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((uc0) leVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((uc0) leVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                yf0 yf0Var = (yf0) this.b;
                yf0Var.f = false;
                yf0Var.F = null;
                break;
            case 11:
                ((mh0) this.b).b();
                break;
            case 12:
                ((vi0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                tk0 tk0Var = (tk0) this.b;
                View view = tk0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (tk0Var.b1()) {
                    tk0Var.invalidate();
                    break;
                }
                break;
            case 15:
                ul0 ul0Var = (ul0) this.b;
                if (ul0Var.s != null) {
                    ul0Var.j();
                    ul0Var.s.invalidate();
                    ul0Var.e.invalidate();
                    ul0Var.invalidate();
                    ul0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((yl0) this.b).d = false;
                break;
            case 17:
                ((gn0) this.b).O0.setVisibility(8);
                break;
            case 18:
                do0 do0Var = (do0) this.b;
                if (animator == do0Var.h) {
                    do0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((cp0) this.b).f = null;
                break;
            case 20:
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.b;
                if (a5Var.getParent() != null) {
                    ((ViewGroup) a5Var.getParent()).removeView(a5Var);
                    break;
                }
                break;
            case 21:
                zr0 zr0Var = (zr0) this.b;
                View view2 = zr0Var.c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                zr0Var.a.removeView(view2);
                break;
            case 22:
                lu0 lu0Var = (lu0) this.b;
                if (lu0Var.f == animator) {
                    lu0Var.f = null;
                    break;
                }
                break;
            case 23:
                bw0 bw0Var = (bw0) this.b;
                bw0Var.setCategoriesShownT(((Float) bw0Var.w3.getAnimatedValue()).floatValue());
                bw0Var.w3 = null;
                break;
            case 24:
                cx0 cx0Var = (cx0) this.b;
                cx0Var.t1.setVisibility(8);
                cx0Var.w1.setImageDrawable(null);
                break;
            case 25:
                int i10 = 0;
                while (true) {
                    ix0[] ix0VarArr = (ix0[]) this.b;
                    if (i10 >= ix0VarArr.length) {
                        break;
                    } else {
                        ix0 ix0Var = ix0VarArr[i10];
                        if (ix0Var != null) {
                            ix0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((jx0) this.b).H = null;
                break;
            case 27:
                ((mx0) this.b).e = false;
                break;
            case 28:
                ((xz0) this.b).setVisibility(4);
                break;
            default:
                ((i11) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                yl0 yl0Var = (yl0) this.b;
                yl0Var.d = true;
                if (yl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) yl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public t60(zr0 zr0Var, s4.n0 n0Var) {
        this.a = 21;
        this.b = zr0Var;
    }

    private final void a(Animator animator) {
    }
}
