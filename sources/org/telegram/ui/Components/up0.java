package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class up0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lq0 c;

    public /* synthetic */ up0(lq0 lq0Var, boolean z4, int i10) {
        this.a = i10;
        this.c = lq0Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.c.Q;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                lq0 lq0Var = this.c;
                if (animator.equals(lq0Var.y)) {
                    lq0Var.y = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.c;
                AnimatorSet[] animatorSetArr = lq0Var.Q;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        lq0Var.P[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                lq0 lq0Var2 = this.c;
                FrameLayout frameLayout = lq0Var2.h;
                if (animator.equals(lq0Var2.y)) {
                    if (!this.b) {
                        lq0Var2.c.setVisibility(4);
                        FrameLayout frameLayout2 = lq0Var2.Z;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        lq0Var2.f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    lq0Var2.y = null;
                    break;
                }
                break;
        }
    }
}
