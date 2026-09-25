package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class dq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uq0 c;

    public /* synthetic */ dq0(uq0 uq0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = uq0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                uq0 uq0Var = this.c;
                if (animator.equals(uq0Var.y)) {
                    uq0Var.y = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                uq0 uq0Var = this.c;
                AnimatorSet[] animatorSetArr = uq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        uq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                uq0 uq0Var2 = this.c;
                FrameLayout frameLayout = uq0Var2.h;
                if (animator.equals(uq0Var2.y)) {
                    if (!this.b) {
                        uq0Var2.c.setVisibility(4);
                        FrameLayout frameLayout2 = uq0Var2.c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        uq0Var2.f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    uq0Var2.y = null;
                    break;
                }
                break;
        }
    }
}
