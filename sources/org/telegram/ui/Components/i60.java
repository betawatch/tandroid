package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 10:
                ((oh0) this.b).h = null;
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
                m60 m60Var = (m60) this.b;
                if (animator == m60Var.W) {
                    m60Var.c(true);
                    m60Var.setVisibility(4);
                    break;
                }
                break;
            case 1:
                j80 j80Var = (j80) this.b;
                h80 h80Var = j80Var.x;
                if (h80Var != null) {
                    h80Var.setProgress(1.0f);
                    j80Var.x.invalidate();
                }
                j80Var.m0 = null;
                break;
            case 2:
                t00 t00Var = (t00) this.b;
                ((s80) t00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 3:
                f90 f90Var = (f90) this.b;
                if (!f90Var.f) {
                    f90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 4:
                n90 n90Var = (n90) this.b;
                FrameLayout frameLayout = n90Var.b;
                ei.g6 g6Var = (ei.g6) n90Var.c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) n90Var.d);
                break;
            case 5:
                lc0 lc0Var = (lc0) this.b;
                lc0Var.c0.h = null;
                lc0Var.f(lc0Var.S, lc0Var.R);
                break;
            case 6:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 7:
                pe0 pe0Var = (pe0) this.b;
                pe0Var.S = null;
                pe0Var.r.setText("");
                ei.x8.a(pe0Var.s, false);
                pe0Var.setVisibility(8);
                pe0Var.a0 = 0.0f;
                pe0Var.h(0.0f);
                pe0Var.setAlpha(0.0f);
                pe0Var.j();
                break;
            case 8:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 9:
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.c).e = null;
                    break;
                }
                break;
            case 10:
                break;
            case 11:
                th0 th0Var = (th0) this.b;
                th0Var.f = false;
                th0Var.F = null;
                break;
            case 12:
                ((ij0) this.b).b();
                break;
            case 13:
                ((qk0) this.b).h.setVisibility(8);
                break;
            case 14:
                mm0 mm0Var = (mm0) this.b;
                View view = mm0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (mm0Var.c1()) {
                    mm0Var.invalidate();
                    break;
                }
                break;
            case 15:
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
            case 16:
                ((on0) this.b).d = false;
                break;
            case 17:
                ((ap0) this.b).M0.setVisibility(8);
                break;
            case 18:
                xp0 xp0Var = (xp0) this.b;
                if (animator == xp0Var.h) {
                    xp0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((hr0) this.b).f = null;
                break;
            case 20:
                pr0 pr0Var = (pr0) this.b;
                if (pr0Var.getParent() != null) {
                    ((ViewGroup) pr0Var.getParent()).removeView(pr0Var);
                    break;
                }
                break;
            case 21:
                st0 st0Var = (st0) this.b;
                View view2 = st0Var.c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                st0Var.a.removeView(view2);
                break;
            case 22:
                ew0 ew0Var = (ew0) this.b;
                if (ew0Var.f == animator) {
                    ew0Var.f = null;
                    break;
                }
                break;
            case 23:
                ux0 ux0Var = (ux0) this.b;
                ux0Var.setCategoriesShownT(((Float) ux0Var.q3.getAnimatedValue()).floatValue());
                ux0Var.q3 = null;
                break;
            case 24:
                ty0 ty0Var = (ty0) this.b;
                ty0Var.x.setVisibility(8);
                ty0Var.F.setImageDrawable(null);
                break;
            case 25:
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
            case 26:
                super.onAnimationEnd(animator);
                ((az0) this.b).H = null;
                break;
            case 27:
                ((dz0) this.b).e = false;
                break;
            case 28:
                ((p11) this.b).setVisibility(4);
                break;
            default:
                ((z21) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
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

    public i60(st0 st0Var, s4.n0 n0Var) {
        this.a = 21;
        this.b = st0Var;
    }

    private final void a(Animator animator) {
    }
}
