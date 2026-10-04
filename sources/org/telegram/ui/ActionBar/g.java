package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xi;
import org.telegram.ui.ug0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                xi xiVar = (xi) this.d;
                if (animator.equals(xiVar.M0)) {
                    xiVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ((ma0) this.d).f2 = null;
                break;
            case 5:
                ug0 ug0Var = (ug0) this.d;
                AnimatorSet[] animatorSetArr = ug0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ug0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pi piVar;
        v0 v0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                i5 i5Var = kVar.n[1];
                if (i5Var != null && i5Var.getParent() != null) {
                    ((ViewGroup) kVar.n[1].getParent()).removeView(kVar.n[1]);
                }
                kVar.n[1] = null;
                kVar.x0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
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
                e9 e9Var = (e9) this.d;
                e9Var.G = null;
                boolean z10 = this.b;
                e9Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    x8 x8Var = e9Var.a;
                    x8Var.w = -1.0f;
                    x8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                xi xiVar = (xi) this.d;
                if (animator.equals(xiVar.M0)) {
                    if (!z11) {
                        if (!xiVar.N) {
                            xiVar.D0.setVisibility(4);
                        }
                        xiVar.H0.setVisibility(4);
                    } else if (xiVar.S0 && ((piVar = xiVar.y0) == null || piVar.H())) {
                        xiVar.x1.setVisibility(4);
                    }
                    if (this.c) {
                        xiVar.Y1();
                        xiVar.O0.setVisibility(z11 ? 0 : 8);
                    }
                    xiVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ma0 ma0Var = (ma0) this.d;
                pa0 pa0Var = ma0Var.i2;
                if (ma0Var.f2 != null) {
                    ma0Var.f2 = null;
                    if (!this.b) {
                        pa0Var.F.setVisibility(4);
                        FrameLayout frameLayout = pa0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = pa0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.c && (v0Var = pa0Var.G) != null) {
                            v0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        pa0Var.s.setVisibility(4);
                        v0 v0Var3 = pa0Var.G;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                ug0 ug0Var = (ug0) this.d;
                AnimatorSet[] animatorSetArr = ug0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && ug0Var.M.getAlpha() != 1.0f) {
                    ug0Var.M.setAlpha(1.0f);
                    ug0Var.M.setScaleX(1.0f);
                    ug0Var.M.setScaleY(1.0f);
                    ug0Var.M.setVisibility(0);
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
