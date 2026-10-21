package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class aj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ aj0(bj0 bj0Var, int i10) {
        this.a = i10;
        this.b = bj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                bj0 bj0Var = this.b;
                AnimatorSet animatorSet = bj0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bj0Var.s = null;
                    bj0Var.getClass();
                    break;
                }
                break;
            case 2:
                bj0 bj0Var2 = this.b;
                AnimatorSet animatorSet2 = bj0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bj0Var2.s = null;
                    bj0Var2.getClass();
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
        bj0 bj0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = bj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = bj0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bj0Var.s = null;
                    if (bj0Var.w) {
                        bj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = bj0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bj0Var.s = null;
                    AndroidUtilities.runOnUIThread(new rc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
