package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
                ((lg0) this.b).h = null;
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
                f00 f00Var = (f00) this.b;
                f00Var.Q = f00Var.V;
                f00Var.U = f00Var.b0;
                f00Var.R = f00Var.W;
                f00Var.S = f00Var.a0;
                f00Var.V = -1;
                f00Var.W = -1;
                f00Var.a0 = -1;
                f00Var.b0 = -1;
                break;
            case 1:
                u00 u00Var = (u00) this.b;
                u00Var.s = 1.0f;
                u00Var.invalidate();
                break;
            case 2:
                j70 j70Var = (j70) this.b;
                h70 h70Var = j70Var.x;
                if (h70Var != null) {
                    h70Var.setProgress(1.0f);
                    j70Var.x.invalidate();
                }
                j70Var.m0 = null;
                break;
            case 3:
                g00 g00Var = (g00) this.b;
                ((t70) g00Var.e).A = false;
                TextView[] textViewArr = (TextView[]) g00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 4:
                g80 g80Var = (g80) this.b;
                if (!g80Var.f) {
                    g80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 5:
                n80 n80Var = (n80) this.b;
                FrameLayout frameLayout = n80Var.b;
                cg.i0 i0Var = (cg.i0) n80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.z9) n80Var.d);
                break;
            case 6:
                lb0 lb0Var = (lb0) this.b;
                lb0Var.V.h = null;
                lb0Var.e(lb0Var.O, lb0Var.N);
                break;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 8:
                nd0 nd0Var = (nd0) this.b;
                nd0Var.setVisibility(8);
                nd0Var.h();
                nd0Var.L = 0.0f;
                nd0Var.f(0.0f);
                nd0Var.setAlpha(0.0f);
                break;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 10:
                bf bfVar = (bf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((nh.l8) bfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((nh.l8) bfVar.c).e = null;
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                qg0 qg0Var = (qg0) this.b;
                qg0Var.f = false;
                qg0Var.B = null;
                break;
            case 13:
                ((ei0) this.b).b();
                break;
            case 14:
                ((pj0) this.b).h.setVisibility(8);
                break;
            case 15:
                jl0 jl0Var = (jl0) this.b;
                View view = jl0Var.Y0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (jl0Var.b1()) {
                    jl0Var.invalidate();
                    break;
                }
                break;
            case 16:
                fm0 fm0Var = (fm0) this.b;
                if (fm0Var.s != null) {
                    fm0Var.j();
                    fm0Var.s.invalidate();
                    fm0Var.e.invalidate();
                    fm0Var.invalidate();
                    fm0Var.s = null;
                    break;
                }
                break;
            case 17:
                ((km0) this.b).d = false;
                break;
            case 18:
                ((tn0) this.b).I0.setVisibility(8);
                break;
            case 19:
                qo0 qo0Var = (qo0) this.b;
                if (animator == qo0Var.h) {
                    qo0Var.h = null;
                    break;
                }
                break;
            case 20:
                ((cq0) this.b).e = null;
                break;
            case 21:
                kq0 kq0Var = (kq0) this.b;
                if (kq0Var.getParent() != null) {
                    ((ViewGroup) kq0Var.getParent()).removeView(kq0Var);
                    break;
                }
                break;
            case 22:
                ks0 ks0Var = (ks0) this.b;
                View view2 = ks0Var.c;
                view2.setAlpha(1.0f);
                f2.w0.x0(view2);
                ks0Var.a.removeView(view2);
                break;
            case 23:
                xu0 xu0Var = (xu0) this.b;
                if (xu0Var.f == animator) {
                    xu0Var.f = null;
                    break;
                }
                break;
            case 24:
                ow0 ow0Var = (ow0) this.b;
                ow0Var.setCategoriesShownT(((Float) ow0Var.l3.getAnimatedValue()).floatValue());
                ow0Var.l3 = null;
                break;
            case 25:
                nx0 nx0Var = (nx0) this.b;
                nx0Var.x.setVisibility(8);
                nx0Var.B.setImageDrawable(null);
                break;
            case 26:
                int i10 = 0;
                while (true) {
                    ux0[] ux0VarArr = (ux0[]) this.b;
                    if (i10 >= ux0VarArr.length) {
                        break;
                    } else {
                        ux0 ux0Var = ux0VarArr[i10];
                        if (ux0Var != null) {
                            ux0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((vx0) this.b).D = null;
                break;
            case 28:
                ((yx0) this.b).e = false;
                break;
            default:
                ((g01) this.b).setVisibility(4);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 17:
                km0 km0Var = (km0) this.b;
                km0Var.d = true;
                if (km0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) km0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public zz(ks0 ks0Var, f2.w0 w0Var) {
        this.a = 22;
        this.b = ks0Var;
    }

    private final void a(Animator animator) {
    }
}
