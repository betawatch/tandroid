package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ w2(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                f3 f3Var2 = this.b;
                AnimatorSet animatorSet2 = f3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    f3Var2.currentSheetAnimation = null;
                    f3Var2.currentSheetAnimationType = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.a;
        f3 f3Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    f3Var.onOpenAnimationEnd();
                    z2 z2Var = f3Var.delegate;
                    if (z2Var != null) {
                        z2Var.onOpenAnimationEnd();
                    }
                    if (f3Var.useHardwareLayer) {
                        f3Var.container.setLayerType(0, null);
                    }
                    if (f3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = f3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        f3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (f3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = f3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                break;
            default:
                AnimatorSet animatorSet2 = f3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new q(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
