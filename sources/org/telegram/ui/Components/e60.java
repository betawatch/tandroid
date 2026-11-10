package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((qe0) this.b).q1 = null;
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
                k60 k60Var = (k60) this.b;
                i60 i60Var = k60Var.x;
                if (i60Var != null) {
                    i60Var.setProgress(1.0f);
                    k60Var.x.invalidate();
                }
                k60Var.m0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                ((t60) v0Var.e).A1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                f70 f70Var = (f70) this.b;
                if (!f70Var.f) {
                    f70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                m70 m70Var = (m70) this.b;
                FrameLayout frameLayout = m70Var.b;
                fi.p5 p5Var = (fi.p5) m70Var.c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) m70Var.d);
                break;
            case 4:
                ca0 ca0Var = (ca0) this.b;
                ca0Var.c0.h = null;
                ca0Var.f(ca0Var.S, ca0Var.R);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                ec0 ec0Var = (ec0) this.b;
                ec0Var.S = null;
                ec0Var.r.setText("");
                fi.a8.a(ec0Var.s, false);
                ec0Var.setVisibility(8);
                ec0Var.a0 = 0.0f;
                ec0Var.h(0.0f);
                ec0Var.setAlpha(0.0f);
                ec0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                pe peVar = (pe) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.a8) peVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.a8) peVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ve0 ve0Var = (ve0) this.b;
                ve0Var.f = false;
                ve0Var.F = null;
                break;
            case 11:
                ((kg0) this.b).b();
                break;
            case 12:
                ((rh0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                pj0 pj0Var = (pj0) this.b;
                View view = pj0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (pj0Var.b1()) {
                    pj0Var.invalidate();
                    break;
                }
                break;
            case 15:
                rk0 rk0Var = (rk0) this.b;
                if (rk0Var.s != null) {
                    rk0Var.j();
                    rk0Var.s.invalidate();
                    rk0Var.e.invalidate();
                    rk0Var.invalidate();
                    rk0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((vk0) this.b).d = false;
                break;
            case 17:
                ((fm0) this.b).O0.setVisibility(8);
                break;
            case 18:
                cn0 cn0Var = (cn0) this.b;
                if (animator == cn0Var.h) {
                    cn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((ao0) this.b).f = null;
                break;
            case 20:
                di.b4 b4Var = (di.b4) this.b;
                if (b4Var.getParent() != null) {
                    ((ViewGroup) b4Var.getParent()).removeView(b4Var);
                    break;
                }
                break;
            case 21:
                zq0 zq0Var = (zq0) this.b;
                View view2 = zq0Var.c;
                view2.setAlpha(1.0f);
                v4.n0.x0(view2);
                zq0Var.a.removeView(view2);
                break;
            case 22:
                jt0 jt0Var = (jt0) this.b;
                if (jt0Var.f == animator) {
                    jt0Var.f = null;
                    break;
                }
                break;
            case 23:
                zu0 zu0Var = (zu0) this.b;
                zu0Var.setCategoriesShownT(((Float) zu0Var.w3.getAnimatedValue()).floatValue());
                zu0Var.w3 = null;
                break;
            case 24:
                yv0 yv0Var = (yv0) this.b;
                yv0Var.w1.setVisibility(8);
                yv0Var.z1.setImageDrawable(null);
                break;
            case 25:
                int i7 = 0;
                while (true) {
                    ew0[] ew0VarArr = (ew0[]) this.b;
                    if (i7 >= ew0VarArr.length) {
                        break;
                    } else {
                        ew0 ew0Var = ew0VarArr[i7];
                        if (ew0Var != null) {
                            ew0Var.d = false;
                        }
                        i7++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((fw0) this.b).H = null;
                break;
            case 27:
                ((iw0) this.b).e = false;
                break;
            case 28:
                ((ty0) this.b).setVisibility(4);
                break;
            default:
                ((d01) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                vk0 vk0Var = (vk0) this.b;
                vk0Var.d = true;
                if (vk0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) vk0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public e60(zq0 zq0Var, v4.n0 n0Var) {
        this.a = 21;
        this.b = zq0Var;
    }

    private final void a(Animator animator) {
    }
}
