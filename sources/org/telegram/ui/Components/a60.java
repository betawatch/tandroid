package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a60(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((se0) this.b).o1 = null;
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
                f60 f60Var = (f60) this.b;
                d60 d60Var = f60Var.x;
                if (d60Var != null) {
                    d60Var.setProgress(1.0f);
                    f60Var.x.invalidate();
                }
                f60Var.m0 = null;
                break;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                ((o60) v0Var.e).y1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 2:
                b70 b70Var = (b70) this.b;
                if (!b70Var.f) {
                    b70Var.c.setVisibility(8);
                    break;
                }
                break;
            case 3:
                i70 i70Var = (i70) this.b;
                FrameLayout frameLayout = i70Var.b;
                gi.n5 n5Var = (gi.n5) i70Var.c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.g1) i70Var.d);
                break;
            case 4:
                x90 x90Var = (x90) this.b;
                x90Var.d0.h = null;
                x90Var.f(x90Var.T, x90Var.S);
                break;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 6:
                zb0 zb0Var = (zb0) this.b;
                zb0Var.T = null;
                zb0Var.r.setText("");
                gi.z7.a(zb0Var.s, false);
                zb0Var.setVisibility(8);
                zb0Var.b0 = 0.0f;
                zb0Var.h(0.0f);
                zb0Var.setAlpha(0.0f);
                zb0Var.j();
                break;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 8:
                oe oeVar = (oe) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((gi.z7) oeVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((gi.z7) oeVar.c).e = null;
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                xe0 xe0Var = (xe0) this.b;
                xe0Var.f = false;
                xe0Var.G = null;
                break;
            case 11:
                ((ng0) this.b).b();
                break;
            case 12:
                ((uh0) this.b).h.setVisibility(8);
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 14:
                tj0 tj0Var = (tj0) this.b;
                View view = tj0Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (tj0Var.b1()) {
                    tj0Var.invalidate();
                    break;
                }
                break;
            case 15:
                vk0 vk0Var = (vk0) this.b;
                if (vk0Var.s != null) {
                    vk0Var.j();
                    vk0Var.s.invalidate();
                    vk0Var.e.invalidate();
                    vk0Var.invalidate();
                    vk0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((zk0) this.b).d = false;
                break;
            case 17:
                ((im0) this.b).P0.setVisibility(8);
                break;
            case 18:
                fn0 fn0Var = (fn0) this.b;
                if (animator == fn0Var.h) {
                    fn0Var.h = null;
                    break;
                }
                break;
            case 19:
                ((co0) this.b).f = null;
                break;
            case 20:
                ai.d2 d2Var = (ai.d2) this.b;
                if (d2Var.getParent() != null) {
                    ((ViewGroup) d2Var.getParent()).removeView(d2Var);
                    break;
                }
                break;
            case 21:
                yq0 yq0Var = (yq0) this.b;
                View view2 = yq0Var.c;
                view2.setAlpha(1.0f);
                u4.o0.x0(view2);
                yq0Var.a.removeView(view2);
                break;
            case 22:
                ht0 ht0Var = (ht0) this.b;
                if (ht0Var.f == animator) {
                    ht0Var.f = null;
                    break;
                }
                break;
            case 23:
                xu0 xu0Var = (xu0) this.b;
                xu0Var.setCategoriesShownT(((Float) xu0Var.x3.getAnimatedValue()).floatValue());
                xu0Var.x3 = null;
                break;
            case 24:
                xv0 xv0Var = (xv0) this.b;
                xv0Var.u1.setVisibility(8);
                xv0Var.x1.setImageDrawable(null);
                break;
            case 25:
                int i3 = 0;
                while (true) {
                    dw0[] dw0VarArr = (dw0[]) this.b;
                    if (i3 >= dw0VarArr.length) {
                        break;
                    } else {
                        dw0 dw0Var = dw0VarArr[i3];
                        if (dw0Var != null) {
                            dw0Var.d = false;
                        }
                        i3++;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((ew0) this.b).I = null;
                break;
            case 27:
                ((hw0) this.b).e = false;
                break;
            case 28:
                ((sy0) this.b).setVisibility(4);
                break;
            default:
                ((c01) this.b).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                zk0 zk0Var = (zk0) this.b;
                zk0Var.d = true;
                if (zk0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) zk0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public a60(yq0 yq0Var, u4.o0 o0Var) {
        this.a = 21;
        this.b = yq0Var;
    }

    private final void a(Animator animator) {
    }
}
