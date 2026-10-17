package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class c80 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((kh0) this.b).h = null;
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
                i80 i80Var = (i80) this.b;
                g80 g80Var = i80Var.x;
                if (g80Var != null) {
                    g80Var.setProgress(1.0f);
                    i80Var.x.invalidate();
                }
                i80Var.m0 = null;
                break;
            case 1:
                t00 t00Var = (t00) this.b;
                ((r80) t00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                e90 e90Var = (e90) this.b;
                if (!e90Var.f) {
                    e90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                m90 m90Var = (m90) this.b;
                FrameLayout frameLayout = m90Var.b;
                ei.g6 g6Var = (ei.g6) m90Var.c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) m90Var.d);
                break;
            case 4:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                le0 le0Var = (le0) this.b;
                le0Var.S = null;
                le0Var.r.setText("");
                ei.x8.a(le0Var.s, false);
                le0Var.setVisibility(8);
                le0Var.a0 = 0.0f;
                le0Var.g(0.0f);
                le0Var.setAlpha(0.0f);
                le0Var.i();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                hf hfVar = (hf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ph0 ph0Var = (ph0) this.b;
                ph0Var.f = false;
                ph0Var.F = null;
                break;
            case 11:
                ((ej0) this.b).b();
                break;
            case 12:
                ((mk0) this.b).h.setVisibility(8);
                break;
            case 13:
                im0 im0Var = (im0) this.b;
                View view = im0Var.a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (im0Var.b1()) {
                    im0Var.invalidate();
                    break;
                }
                break;
            case 14:
                gn0 gn0Var = (gn0) this.b;
                if (gn0Var.s != null) {
                    gn0Var.j();
                    gn0Var.s.invalidate();
                    gn0Var.e.invalidate();
                    gn0Var.invalidate();
                    gn0Var.s = null;
                    break;
                }
                break;
            case 15:
                ((kn0) this.b).d = false;
                break;
            case 16:
                ((vo0) this.b).M0.setVisibility(8);
                break;
            case 17:
                sp0 sp0Var = (sp0) this.b;
                if (animator == sp0Var.h) {
                    sp0Var.h = null;
                    break;
                }
                break;
            case 18:
                ((cr0) this.b).f = null;
                break;
            case 19:
                kr0 kr0Var = (kr0) this.b;
                if (kr0Var.getParent() != null) {
                    ((ViewGroup) kr0Var.getParent()).removeView(kr0Var);
                    break;
                }
                break;
            case 20:
                nt0 nt0Var = (nt0) this.b;
                View view2 = nt0Var.c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                nt0Var.a.removeView(view2);
                break;
            case 21:
                zv0 zv0Var = (zv0) this.b;
                if (zv0Var.f == animator) {
                    zv0Var.f = null;
                    break;
                }
                break;
            case 22:
                px0 px0Var = (px0) this.b;
                px0Var.setCategoriesShownT(((Float) px0Var.n3.getAnimatedValue()).floatValue());
                px0Var.n3 = null;
                break;
            case 23:
                oy0 oy0Var = (oy0) this.b;
                oy0Var.x.setVisibility(8);
                oy0Var.F.setImageDrawable(null);
                break;
            case 24:
                int i10 = 0;
                while (true) {
                    uy0[] uy0VarArr = (uy0[]) this.b;
                    if (i10 >= uy0VarArr.length) {
                        break;
                    } else {
                        uy0 uy0Var = uy0VarArr[i10];
                        if (uy0Var != null) {
                            uy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((vy0) this.b).H = null;
                break;
            case 26:
                ((yy0) this.b).e = false;
                break;
            case 27:
                ((k11) this.b).setVisibility(4);
                break;
            case 28:
                ((t21) this.b).setVisibility(8);
                break;
            default:
                ci.i3 i3Var = ((k31) this.b).f;
                i3Var.setScaleX(1.0f);
                i3Var.setScaleY(1.0f);
                i3Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 15:
                kn0 kn0Var = (kn0) this.b;
                kn0Var.d = true;
                if (kn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) kn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public c80(nt0 nt0Var, s4.n0 n0Var) {
        this.a = 20;
        this.b = nt0Var;
    }

    private final void a(Animator animator) {
    }
}
