package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((ef0) this.b).r1 = null;
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
                x60 x60Var = (x60) this.b;
                t60 t60Var = x60Var.x;
                if (t60Var != null) {
                    t60Var.setProgress(1.0f);
                    x60Var.x.invalidate();
                }
                x60Var.p0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.b;
                ((f70) x0Var.e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                s70 s70Var = (s70) this.b;
                if (!s70Var.f) {
                    s70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                z70 z70Var = (z70) this.b;
                FrameLayout frameLayout = z70Var.b;
                hi.w5 w5Var = (hi.w5) z70Var.c;
                if (w5Var.getParent() != null) {
                    frameLayout.removeView(w5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) z70Var.d);
                break;
            case 4:
                na0 na0Var = (na0) this.b;
                na0Var.d0.h = null;
                na0Var.f(na0Var.T, na0Var.S);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                oc0 oc0Var = (oc0) this.b;
                oc0Var.T = null;
                oc0Var.r.setText("");
                hi.s8.a(oc0Var.s, false);
                oc0Var.setVisibility(8);
                oc0Var.b0 = 0.0f;
                oc0Var.h(0.0f);
                oc0Var.setAlpha(0.0f);
                oc0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                xe xeVar = (xe) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.s8) xeVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.s8) xeVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                jf0 jf0Var = (jf0) this.b;
                jf0Var.f = false;
                jf0Var.G = null;
                break;
            case 11:
                ((yg0) this.b).b();
                break;
            case 12:
                ((gi0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                ek0 ek0Var = (ek0) this.b;
                View view = ek0Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ek0Var.b1()) {
                    ek0Var.invalidate();
                    break;
                }
                break;
            case 15:
                gl0 gl0Var = (gl0) this.b;
                if (gl0Var.s != null) {
                    gl0Var.j();
                    gl0Var.s.invalidate();
                    gl0Var.e.invalidate();
                    gl0Var.invalidate();
                    gl0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((kl0) this.b).d = false;
                break;
            case 17:
                ((tm0) this.b).P0.setVisibility(8);
                break;
            case 18:
                qn0 qn0Var = (qn0) this.b;
                if (animator == qn0Var.h) {
                    qn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((no0) this.b).f = null;
                break;
            case 20:
                bi.v2 v2Var = (bi.v2) this.b;
                if (v2Var.getParent() != null) {
                    ((ViewGroup) v2Var.getParent()).removeView(v2Var);
                    break;
                }
                break;
            case 21:
                jr0 jr0Var = (jr0) this.b;
                View view2 = jr0Var.c;
                view2.setAlpha(1.0f);
                v4.p0.x0(view2);
                jr0Var.a.removeView(view2);
                break;
            case 22:
                tt0 tt0Var = (tt0) this.b;
                if (tt0Var.f == animator) {
                    tt0Var.f = null;
                    break;
                }
                break;
            case 23:
                kv0 kv0Var = (kv0) this.b;
                kv0Var.setCategoriesShownT(((Float) kv0Var.x3.getAnimatedValue()).floatValue());
                kv0Var.x3 = null;
                break;
            case 24:
                jw0 jw0Var = (jw0) this.b;
                jw0Var.x1.setVisibility(8);
                jw0Var.A1.setImageDrawable(null);
                break;
            case 25:
                int i7 = 0;
                while (true) {
                    pw0[] pw0VarArr = (pw0[]) this.b;
                    if (i7 >= pw0VarArr.length) {
                        break;
                    } else {
                        pw0 pw0Var = pw0VarArr[i7];
                        if (pw0Var != null) {
                            pw0Var.d = false;
                        }
                        i7++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((qw0) this.b).I = null;
                break;
            case 27:
                ((tw0) this.b).e = false;
                break;
            case 28:
                ((dz0) this.b).setVisibility(4);
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
                kl0 kl0Var = (kl0) this.b;
                kl0Var.d = true;
                if (kl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) kl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public p60(jr0 jr0Var, v4.p0 p0Var) {
        this.a = 21;
        this.b = jr0Var;
    }

    private final void a(Animator animator) {
    }
}
