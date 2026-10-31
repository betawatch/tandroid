package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ op0 c;

    public /* synthetic */ zo0(op0 op0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = op0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.c.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                op0 op0Var = this.c;
                if (animator.equals(op0Var.v1)) {
                    op0Var.v1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                op0 op0Var = this.c;
                AnimatorSet[] animatorSetArr = op0Var.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        op0Var.K1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                op0 op0Var2 = this.c;
                FrameLayout frameLayout = op0Var2.n1;
                if (animator.equals(op0Var2.v1)) {
                    if (!this.b) {
                        op0Var2.j1.setVisibility(4);
                        FrameLayout frameLayout2 = op0Var2.U1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        op0Var2.m1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    op0Var2.v1 = null;
                    break;
                }
                break;
        }
    }
}
