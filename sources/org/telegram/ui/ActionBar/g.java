package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.z90;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((z90) this.d).f2 = null;
                break;
            case 5:
                rg0 rg0Var = (rg0) this.d;
                AnimatorSet[] animatorSetArr = rg0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    rg0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oi oiVar;
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
                z90 z90Var = (z90) this.d;
                ca0 ca0Var = z90Var.i2;
                if (z90Var.f2 != null) {
                    z90Var.f2 = null;
                    if (!this.b) {
                        ca0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ca0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = ca0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.c && (v0Var = ca0Var.G) != null) {
                            v0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        ca0Var.s.setVisibility(4);
                        v0 v0Var3 = ca0Var.G;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                rg0 rg0Var = (rg0) this.d;
                AnimatorSet[] animatorSetArr = rg0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && rg0Var.M.getAlpha() != 1.0f) {
                    rg0Var.M.setAlpha(1.0f);
                    rg0Var.M.setScaleX(1.0f);
                    rg0Var.M.setScaleY(1.0f);
                    rg0Var.M.setVisibility(0);
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
