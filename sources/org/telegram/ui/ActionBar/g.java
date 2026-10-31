package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.uh;
import org.telegram.ui.hf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.G2)) {
                    biVar.G2 = null;
                    break;
                }
                break;
            case 4:
                hf0 hf0Var = (hf0) this.d;
                AnimatorSet[] animatorSetArr = hf0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    hf0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uh uhVar;
        switch (this.a) {
            case 0:
                l lVar = (l) this.d;
                u5[] u5VarArr = lVar.n;
                u5 u5Var = u5VarArr[1];
                if (u5Var != null && u5Var.getParent() != null) {
                    ((ViewGroup) u5VarArr[1].getParent()).removeView(u5VarArr[1]);
                }
                u5VarArr[1] = null;
                lVar.x0 = false;
                if (this.b && this.c) {
                    lVar.r.setVisibility(8);
                }
                lVar.requestLayout();
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
                o8 o8Var = (o8) this.d;
                o8Var.G = null;
                boolean z10 = this.b;
                o8Var.m0(false, z10 ? 1.0f : 0.0f);
                if (this.c) {
                    h8 h8Var = o8Var.a;
                    h8Var.x = -1.0f;
                    h8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.G2)) {
                    if (!z11) {
                        if (!biVar.E1) {
                            biVar.x2.setVisibility(4);
                        }
                        biVar.B2.setVisibility(4);
                    } else if (biVar.M2 && ((uhVar = biVar.s2) == null || uhVar.L())) {
                        biVar.r3.setVisibility(4);
                    }
                    if (this.c) {
                        biVar.P1();
                        biVar.I2.setVisibility(z11 ? 0 : 8);
                    }
                    biVar.G2 = null;
                    break;
                }
                break;
            default:
                hf0 hf0Var = (hf0) this.d;
                AnimatorSet[] animatorSetArr = hf0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && hf0Var.M.getAlpha() != 1.0f) {
                    hf0Var.M.setAlpha(1.0f);
                    hf0Var.M.setScaleX(1.0f);
                    hf0Var.M.setScaleY(1.0f);
                    hf0Var.M.setVisibility(0);
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
