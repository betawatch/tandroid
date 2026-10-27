package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ig0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                actionBarLayout.j1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.n1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.P0)) {
                    tiVar.P0 = null;
                    break;
                }
                break;
            case 4:
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ig0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        li liVar;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                b6[] b6VarArr = kVar.n;
                b6 b6Var = b6VarArr[1];
                if (b6Var != null && b6Var.getParent() != null) {
                    ((ViewGroup) b6VarArr[1].getParent()).removeView(b6VarArr[1]);
                }
                b6VarArr[1] = null;
                kVar.x0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.j1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.n1 = null;
                    break;
                }
                break;
            case 2:
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.b;
                g9Var.j0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    z8 z8Var = g9Var.a;
                    z8Var.w = -1.0f;
                    z8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.P0)) {
                    if (!z11) {
                        if (!tiVar.N) {
                            tiVar.G0.setVisibility(4);
                        }
                        tiVar.K0.setVisibility(4);
                    } else if (tiVar.V0 && ((liVar = tiVar.B0) == null || liVar.L())) {
                        tiVar.A1.setVisibility(4);
                    }
                    if (this.c) {
                        tiVar.j2();
                        tiVar.R0.setVisibility(z11 ? 0 : 8);
                    }
                    tiVar.P0 = null;
                    break;
                }
                break;
            default:
                ig0 ig0Var = (ig0) this.d;
                AnimatorSet[] animatorSetArr = ig0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && ig0Var.M.getAlpha() != 1.0f) {
                    ig0Var.M.setAlpha(1.0f);
                    ig0Var.M.setScaleX(1.0f);
                    ig0Var.M.setScaleY(1.0f);
                    ig0Var.M.setVisibility(0);
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
