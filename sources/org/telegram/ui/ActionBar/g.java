package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.yi;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.d1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.h1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.M0)) {
                    yiVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ((ia0) this.d).f2 = null;
                break;
            case 5:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    xg0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qi qiVar;
        w0 w0Var;
        switch (this.a) {
            case 0:
                l lVar = (l) this.d;
                l5 l5Var = lVar.n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) lVar.n[1].getParent()).removeView(lVar.n[1]);
                }
                lVar.n[1] = null;
                lVar.x0 = false;
                if (this.b && this.c) {
                    lVar.r.setVisibility(8);
                }
                lVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.d1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.h1 = null;
                    break;
                }
                break;
            case 2:
                d9 d9Var = (d9) this.d;
                d9Var.G = null;
                boolean z10 = this.b;
                d9Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    w8 w8Var = d9Var.a;
                    w8Var.w = -1.0f;
                    w8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.M0)) {
                    if (!z11) {
                        if (!yiVar.N) {
                            yiVar.D0.setVisibility(4);
                        }
                        yiVar.H0.setVisibility(4);
                    } else if (yiVar.S0 && ((qiVar = yiVar.y0) == null || qiVar.J())) {
                        yiVar.x1.setVisibility(4);
                    }
                    if (this.c) {
                        yiVar.b2();
                        yiVar.O0.setVisibility(z11 ? 0 : 8);
                    }
                    yiVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ia0 ia0Var = (ia0) this.d;
                la0 la0Var = ia0Var.i2;
                if (ia0Var.f2 != null) {
                    ia0Var.f2 = null;
                    if (!this.b) {
                        la0Var.F.setVisibility(4);
                        FrameLayout frameLayout = la0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = la0Var.H;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.c && (w0Var = la0Var.G) != null) {
                            w0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        la0Var.s.setVisibility(4);
                        w0 w0Var3 = la0Var.G;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                xg0 xg0Var = (xg0) this.d;
                AnimatorSet[] animatorSetArr = xg0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && xg0Var.M.getAlpha() != 1.0f) {
                    xg0Var.M.setAlpha(1.0f);
                    xg0Var.M.setScaleX(1.0f);
                    xg0Var.M.setScaleY(1.0f);
                    xg0Var.M.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z10;
    }
}
