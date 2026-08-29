package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai0 b;

    public /* synthetic */ zh0(ai0 ai0Var, int i10) {
        this.a = i10;
        this.b = ai0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ai0 ai0Var = this.b;
                AnimatorSet animatorSet = ai0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ai0Var.s = null;
                    ai0Var.getClass();
                    break;
                }
                break;
            case 2:
                ai0 ai0Var2 = this.b;
                AnimatorSet animatorSet2 = ai0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ai0Var2.s = null;
                    ai0Var2.getClass();
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
        ai0 ai0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ai0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ai0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ai0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ai0Var.s = null;
                    if (ai0Var.w) {
                        ai0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ai0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ai0Var.s = null;
                    AndroidUtilities.runOnUIThread(new xb0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
