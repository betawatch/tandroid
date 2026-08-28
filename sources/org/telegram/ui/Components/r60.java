package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r60(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((ag0) this.b).h = null;
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
                v60 v60Var = x60Var.x;
                if (v60Var != null) {
                    v60Var.setProgress(1.0f);
                    x60Var.x.invalidate();
                }
                x60Var.m0 = null;
                break;
            case 1:
                wz wzVar = (wz) this.b;
                ((g70) wzVar.e).A = false;
                TextView[] textViewArr = (TextView[]) wzVar.d;
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
                kh.h6 h6Var = (kh.h6) a80Var.c;
                if (h6Var.getParent() != null) {
                    frameLayout.removeView(h6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) a80Var.d);
                break;
            case 4:
                wa0 wa0Var = (wa0) this.b;
                wa0Var.V.h = null;
                wa0Var.e(wa0Var.O, wa0Var.N);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                yc0 yc0Var = (yc0) this.b;
                yc0Var.setVisibility(8);
                yc0Var.h();
                yc0Var.L = 0.0f;
                yc0Var.f(0.0f);
                yc0Var.setAlpha(0.0f);
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                ye yeVar = (ye) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((kh.z8) yeVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((kh.z8) yeVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                fg0 fg0Var = (fg0) this.b;
                fg0Var.f = false;
                fg0Var.B = null;
                break;
            case 11:
                ((uh0) this.b).b();
                break;
            case 12:
                ((ej0) this.b).h.setVisibility(8);
                break;
            case 13:
                wk0 wk0Var = (wk0) this.b;
                View view = wk0Var.Y0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (wk0Var.b1()) {
                    wk0Var.invalidate();
                    break;
                }
                break;
            case 14:
                sl0 sl0Var = (sl0) this.b;
                if (sl0Var.s != null) {
                    sl0Var.j();
                    sl0Var.s.invalidate();
                    sl0Var.e.invalidate();
                    sl0Var.invalidate();
                    sl0Var.s = null;
                    break;
                }
                break;
            case 15:
                ((xl0) this.b).d = false;
                break;
            case 16:
                ((hn0) this.b).I0.setVisibility(8);
                break;
            case 17:
                fo0 fo0Var = (fo0) this.b;
                if (animator == fo0Var.h) {
                    fo0Var.h = null;
                    break;
                }
                break;
            case 18:
                ((qp0) this.b).e = null;
                break;
            case 19:
                yp0 yp0Var = (yp0) this.b;
                if (yp0Var.getParent() != null) {
                    ((ViewGroup) yp0Var.getParent()).removeView(yp0Var);
                    break;
                }
                break;
            case 20:
                zr0 zr0Var = (zr0) this.b;
                View view2 = zr0Var.c;
                view2.setAlpha(1.0f);
                f2.z0.x0(view2);
                zr0Var.a.removeView(view2);
                break;
            case 21:
                mu0 mu0Var = (mu0) this.b;
                if (mu0Var.f == animator) {
                    mu0Var.f = null;
                    break;
                }
                break;
            case 22:
                ew0 ew0Var = (ew0) this.b;
                ew0Var.setCategoriesShownT(((Float) ew0Var.l3.getAnimatedValue()).floatValue());
                ew0Var.l3 = null;
                break;
            case 23:
                cx0 cx0Var = (cx0) this.b;
                cx0Var.x.setVisibility(8);
                cx0Var.B.setImageDrawable(null);
                break;
            case 24:
                int i9 = 0;
                while (true) {
                    jx0[] jx0VarArr = (jx0[]) this.b;
                    if (i9 >= jx0VarArr.length) {
                        break;
                    } else {
                        jx0 jx0Var = jx0VarArr[i9];
                        if (jx0Var != null) {
                            jx0Var.d = false;
                        }
                        i9++;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((kx0) this.b).D = null;
                break;
            case 26:
                ((nx0) this.b).e = false;
                break;
            case 27:
                ((uz0) this.b).setVisibility(4);
                break;
            case 28:
                ((e11) this.b).setVisibility(8);
                break;
            default:
                ih.b3 b3Var = ((v11) this.b).f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 15:
                xl0 xl0Var = (xl0) this.b;
                xl0Var.d = true;
                if (xl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) xl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public r60(zr0 zr0Var, f2.z0 z0Var) {
        this.a = 20;
        this.b = zr0Var;
    }

    private final void a(Animator animator) {
    }
}
