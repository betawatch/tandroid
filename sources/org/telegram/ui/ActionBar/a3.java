package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ a3(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                k3 k3Var2 = this.b;
                AnimatorSet animatorSet2 = k3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    k3Var2.currentSheetAnimation = null;
                    k3Var2.currentSheetAnimationType = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.a;
        k3 k3Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    k3Var.onOpenAnimationEnd();
                    d3 d3Var = k3Var.delegate;
                    if (d3Var != null) {
                        d3Var.onOpenAnimationEnd();
                    }
                    if (k3Var.useHardwareLayer) {
                        k3Var.container.setLayerType(0, null);
                    }
                    if (k3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = k3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        k3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (k3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = k3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                break;
            default:
                AnimatorSet animatorSet2 = k3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new q(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
