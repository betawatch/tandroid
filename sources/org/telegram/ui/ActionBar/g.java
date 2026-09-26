package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                wi wiVar = (wi) this.d;
                if (animator.equals(wiVar.M0)) {
                    wiVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ((ka0) this.d).f2 = null;
                break;
            case 5:
                qg0 qg0Var = (qg0) this.d;
                AnimatorSet[] animatorSetArr = qg0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    qg0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oi oiVar;
        u0 u0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.n[1];
                if (h5Var != null && h5Var.getParent() != null) {
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
                wi wiVar = (wi) this.d;
                if (animator.equals(wiVar.M0)) {
                    if (!z11) {
                        if (!wiVar.N) {
                            wiVar.D0.setVisibility(4);
                        }
                        wiVar.H0.setVisibility(4);
                    } else if (wiVar.S0 && ((oiVar = wiVar.y0) == null || oiVar.J())) {
                        wiVar.x1.setVisibility(4);
                    }
                    if (this.c) {
                        wiVar.b2();
                        wiVar.O0.setVisibility(z11 ? 0 : 8);
                    }
                    wiVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ka0 ka0Var = (ka0) this.d;
                na0 na0Var = ka0Var.i2;
                if (ka0Var.f2 != null) {
                    ka0Var.f2 = null;
                    if (!this.b) {
                        na0Var.F.setVisibility(4);
                        FrameLayout frameLayout = na0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = na0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.c && (u0Var = na0Var.G) != null) {
                            u0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        na0Var.s.setVisibility(4);
                        u0 u0Var3 = na0Var.G;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                qg0 qg0Var = (qg0) this.d;
                AnimatorSet[] animatorSetArr = qg0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && qg0Var.M.getAlpha() != 1.0f) {
                    qg0Var.M.setAlpha(1.0f);
                    qg0Var.M.setScaleX(1.0f);
                    qg0Var.M.setScaleY(1.0f);
                    qg0Var.M.setVisibility(0);
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
