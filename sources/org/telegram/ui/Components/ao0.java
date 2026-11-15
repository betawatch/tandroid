package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ao0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ po0 c;

    public /* synthetic */ ao0(po0 po0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = po0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                po0 po0Var = this.c;
                if (animator.equals(po0Var.z1)) {
                    po0Var.z1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                po0 po0Var = this.c;
                AnimatorSet[] animatorSetArr = po0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        po0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                po0 po0Var2 = this.c;
                FrameLayout frameLayout = po0Var2.r1;
                if (animator.equals(po0Var2.z1)) {
                    if (!this.b) {
                        po0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = po0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        po0Var2.q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    po0Var2.z1 = null;
                    break;
                }
                break;
        }
    }
}
