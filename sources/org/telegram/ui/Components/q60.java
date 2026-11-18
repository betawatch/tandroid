package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((df0) this.b).r1 = null;
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
                y60 y60Var = (y60) this.b;
                u60 u60Var = y60Var.x;
                if (u60Var != null) {
                    u60Var.setProgress(1.0f);
                    y60Var.x.invalidate();
                }
                y60Var.p0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.b;
                ((g70) x0Var.e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                t70 t70Var = (t70) this.b;
                if (!t70Var.f) {
                    t70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                a80 a80Var = (a80) this.b;
                FrameLayout frameLayout = a80Var.b;
                hi.m5 m5Var = (hi.m5) a80Var.c;
                if (m5Var.getParent() != null) {
                    frameLayout.removeView(m5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.i1) a80Var.d);
                break;
            case 4:
                oa0 oa0Var = (oa0) this.b;
                oa0Var.d0.h = null;
                oa0Var.f(oa0Var.T, oa0Var.S);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.T = null;
                pc0Var.r.setText("");
                hi.y7.a(pc0Var.s, false);
                pc0Var.setVisibility(8);
                pc0Var.b0 = 0.0f;
                pc0Var.h(0.0f);
                pc0Var.setAlpha(0.0f);
                pc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                we weVar = (we) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.y7) weVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.y7) weVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                if0 if0Var = (if0) this.b;
                if0Var.f = false;
                if0Var.G = null;
                break;
            case 11:
                ((xg0) this.b).b();
                break;
            case 12:
                ((ei0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                ck0 ck0Var = (ck0) this.b;
                View view = ck0Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ck0Var.b1()) {
                    ck0Var.invalidate();
                    break;
                }
                break;
            case 15:
                el0 el0Var = (el0) this.b;
                if (el0Var.s != null) {
                    el0Var.j();
                    el0Var.s.invalidate();
                    el0Var.e.invalidate();
                    el0Var.invalidate();
                    el0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((il0) this.b).d = false;
                break;
            case 17:
                ((rm0) this.b).P0.setVisibility(8);
                break;
            case 18:
                pn0 pn0Var = (pn0) this.b;
                if (animator == pn0Var.h) {
                    pn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((mo0) this.b).f = null;
                break;
            case 20:
                bi.p2 p2Var = (bi.p2) this.b;
                if (p2Var.getParent() != null) {
                    ((ViewGroup) p2Var.getParent()).removeView(p2Var);
                    break;
                }
                break;
            case 21:
                ir0 ir0Var = (ir0) this.b;
                View view2 = ir0Var.c;
                view2.setAlpha(1.0f);
                v4.p0.x0(view2);
                ir0Var.a.removeView(view2);
                break;
            case 22:
                rt0 rt0Var = (rt0) this.b;
                if (rt0Var.f == animator) {
                    rt0Var.f = null;
                    break;
                }
                break;
            case 23:
                iv0 iv0Var = (iv0) this.b;
                iv0Var.setCategoriesShownT(((Float) iv0Var.x3.getAnimatedValue()).floatValue());
                iv0Var.x3 = null;
                break;
            case 24:
                iw0 iw0Var = (iw0) this.b;
                iw0Var.x1.setVisibility(8);
                iw0Var.A1.setImageDrawable(null);
                break;
            case 25:
                int i7 = 0;
                while (true) {
                    ow0[] ow0VarArr = (ow0[]) this.b;
                    if (i7 >= ow0VarArr.length) {
                        break;
                    } else {
                        ow0 ow0Var = ow0VarArr[i7];
                        if (ow0Var != null) {
                            ow0Var.d = false;
                        }
                        i7++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((pw0) this.b).I = null;
                break;
            case 27:
                ((sw0) this.b).e = false;
                break;
            case 28:
                ((cz0) this.b).setVisibility(4);
                break;
            default:
                ((n01) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                il0 il0Var = (il0) this.b;
                il0Var.d = true;
                if (il0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) il0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public q60(ir0 ir0Var, v4.p0 p0Var) {
        this.a = 21;
        this.b = ir0Var;
    }

    private final void a(Animator animator) {
    }
}
