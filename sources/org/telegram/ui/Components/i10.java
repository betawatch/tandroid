package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
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
                j10 j10Var = (j10) this.b;
                j10Var.v = 1.0f;
                j10Var.invalidate();
                break;
            case 1:
                o60 o60Var = (o60) this.b;
                if (animator == o60Var.W) {
                    o60Var.c(true);
                    o60Var.setVisibility(4);
                    break;
                }
                break;
            case 2:
                l80 l80Var = (l80) this.b;
                j80 j80Var = l80Var.x;
                if (j80Var != null) {
                    j80Var.setProgress(1.0f);
                    l80Var.x.invalidate();
                }
                l80Var.m0 = null;
                break;
            case 3:
                t00 t00Var = (t00) this.b;
                ((u80) t00Var.e).G = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 4:
                h90 h90Var = (h90) this.b;
                if (!h90Var.f) {
                    h90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 5:
                o90 o90Var = (o90) this.b;
                FrameLayout frameLayout = o90Var.b;
                fi.f6 f6Var = (fi.f6) o90Var.c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ha) o90Var.d);
                break;
            case 6:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                break;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 8:
                me0 me0Var = (me0) this.b;
                me0Var.S = null;
                me0Var.r.setText("");
                fi.t8.a(me0Var.s, false);
                me0Var.setVisibility(8);
                me0Var.a0 = 0.0f;
                me0Var.h(0.0f);
                me0Var.setAlpha(0.0f);
                me0Var.j();
                break;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 10:
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.t8) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.t8) hfVar.c).e = null;
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                th0 th0Var = (th0) this.b;
                th0Var.f = false;
                th0Var.F = null;
                break;
            case 13:
                ((ij0) this.b).b();
                break;
            case 14:
                ((qk0) this.b).h.setVisibility(8);
                break;
            case 15:
                nm0 nm0Var = (nm0) this.b;
                View view = nm0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (nm0Var.b1()) {
                    nm0Var.invalidate();
                    break;
                }
                break;
            case 16:
                qn0 qn0Var = (qn0) this.b;
                if (qn0Var.s != null) {
                    qn0Var.j();
                    qn0Var.s.invalidate();
                    qn0Var.e.invalidate();
                    qn0Var.invalidate();
                    qn0Var.s = null;
                    break;
                }
                break;
            case 17:
                ((un0) this.b).d = false;
                break;
            case 18:
                ((fp0) this.b).O0.setVisibility(8);
                break;
            case 19:
                dq0 dq0Var = (dq0) this.b;
                if (animator == dq0Var.h) {
                    dq0Var.h = null;
                    break;
                }
                break;
            case 20:
                ((mr0) this.b).f = null;
                break;
            case 21:
                tr0 tr0Var = (tr0) this.b;
                if (tr0Var.getParent() != null) {
                    ((ViewGroup) tr0Var.getParent()).removeView(tr0Var);
                    break;
                }
                break;
            case 22:
                au0 au0Var = (au0) this.b;
                View view2 = au0Var.c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                au0Var.a.removeView(view2);
                break;
            case 23:
                nw0 nw0Var = (nw0) this.b;
                if (nw0Var.f == animator) {
                    nw0Var.f = null;
                    break;
                }
                break;
            case 24:
                cy0 cy0Var = (cy0) this.b;
                cy0Var.setCategoriesShownT(((Float) cy0Var.x3.getAnimatedValue()).floatValue());
                cy0Var.x3 = null;
                break;
            case 25:
                dz0 dz0Var = (dz0) this.b;
                dz0Var.x.setVisibility(8);
                dz0Var.F.setImageDrawable(null);
                break;
            case 26:
                int i10 = 0;
                while (true) {
                    jz0[] jz0VarArr = (jz0[]) this.b;
                    if (i10 >= jz0VarArr.length) {
                        break;
                    } else {
                        jz0 jz0Var = jz0VarArr[i10];
                        if (jz0Var != null) {
                            jz0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((kz0) this.b).H = null;
                break;
            case 28:
                ((nz0) this.b).e = false;
                break;
            default:
                ((y11) this.b).setVisibility(4);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 17:
                un0 un0Var = (un0) this.b;
                un0Var.d = true;
                if (un0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) un0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i10(au0 au0Var, s4.p0 p0Var) {
        this.a = 22;
        this.b = au0Var;
    }

    private final void a(Animator animator) {
    }
}
