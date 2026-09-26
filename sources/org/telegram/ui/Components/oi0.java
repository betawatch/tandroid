package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oi0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi0 b;

    public /* synthetic */ oi0(pi0 pi0Var, int i10) {
        this.a = i10;
        this.b = pi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                pi0 pi0Var = this.b;
                AnimatorSet animatorSet = pi0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pi0Var.s = null;
                    pi0Var.getClass();
                    break;
                }
                break;
            case 2:
                pi0 pi0Var2 = this.b;
                AnimatorSet animatorSet2 = pi0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pi0Var2.s = null;
                    pi0Var2.getClass();
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        pi0 pi0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = pi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = pi0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pi0Var.s = null;
                    if (pi0Var.w) {
                        pi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = pi0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    pi0Var.s = null;
                    AndroidUtilities.runOnUIThread(new ic0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
