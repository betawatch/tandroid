package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((re0) this.b).n1 = null;
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
                l60 l60Var = (l60) this.b;
                j60 j60Var = l60Var.x;
                if (j60Var != null) {
                    j60Var.setProgress(1.0f);
                    l60Var.x.invalidate();
                }
                l60Var.m0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                ((u60) v0Var.e).x1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                g70 g70Var = (g70) this.b;
                if (!g70Var.f) {
                    g70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                n70 n70Var = (n70) this.b;
                FrameLayout frameLayout = n70Var.b;
                fi.p5 p5Var = (fi.p5) n70Var.c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) n70Var.d);
                break;
            case 4:
                da0 da0Var = (da0) this.b;
                da0Var.c0.h = null;
                da0Var.f(da0Var.S, da0Var.R);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                fc0 fc0Var = (fc0) this.b;
                fc0Var.S = null;
                fc0Var.r.setText("");
                fi.a8.a(fc0Var.s, false);
                fc0Var.setVisibility(8);
                fc0Var.a0 = 0.0f;
                fc0Var.h(0.0f);
                fc0Var.setAlpha(0.0f);
                fc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                qe qeVar = (qe) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.a8) qeVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.a8) qeVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                we0 we0Var = (we0) this.b;
                we0Var.f = false;
                we0Var.F = null;
                break;
            case 11:
                ((lg0) this.b).b();
                break;
            case 12:
                ((sh0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                qj0 qj0Var = (qj0) this.b;
                View view = qj0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (qj0Var.b1()) {
                    qj0Var.invalidate();
                    break;
                }
                break;
            case 15:
                sk0 sk0Var = (sk0) this.b;
                if (sk0Var.s != null) {
                    sk0Var.j();
                    sk0Var.s.invalidate();
                    sk0Var.e.invalidate();
                    sk0Var.invalidate();
                    sk0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((wk0) this.b).d = false;
                break;
            case 17:
                ((gm0) this.b).O0.setVisibility(8);
                break;
            case 18:
                dn0 dn0Var = (dn0) this.b;
                if (animator == dn0Var.h) {
                    dn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((bo0) this.b).f = null;
                break;
            case 20:
                di.b4 b4Var = (di.b4) this.b;
                if (b4Var.getParent() != null) {
                    ((ViewGroup) b4Var.getParent()).removeView(b4Var);
                    break;
                }
                break;
            case 21:
                ar0 ar0Var = (ar0) this.b;
                View view2 = ar0Var.c;
                view2.setAlpha(1.0f);
                v4.n0.x0(view2);
                ar0Var.a.removeView(view2);
                break;
            case 22:
                kt0 kt0Var = (kt0) this.b;
                if (kt0Var.f == animator) {
                    kt0Var.f = null;
                    break;
                }
                break;
            case 23:
                av0 av0Var = (av0) this.b;
                av0Var.setCategoriesShownT(((Float) av0Var.w3.getAnimatedValue()).floatValue());
                av0Var.w3 = null;
                break;
            case 24:
                zv0 zv0Var = (zv0) this.b;
                zv0Var.t1.setVisibility(8);
                zv0Var.w1.setImageDrawable(null);
                break;
            case 25:
                int i7 = 0;
                while (true) {
                    fw0[] fw0VarArr = (fw0[]) this.b;
                    if (i7 >= fw0VarArr.length) {
                        break;
                    } else {
                        fw0 fw0Var = fw0VarArr[i7];
                        if (fw0Var != null) {
                            fw0Var.d = false;
                        }
                        i7++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((gw0) this.b).H = null;
                break;
            case 27:
                ((jw0) this.b).e = false;
                break;
            case 28:
                ((uy0) this.b).setVisibility(4);
                break;
            default:
                ((e01) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.d = true;
                if (wk0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) wk0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public f60(ar0 ar0Var, v4.n0 n0Var) {
        this.a = 21;
        this.b = ar0Var;
    }

    private final void a(Animator animator) {
    }
}
