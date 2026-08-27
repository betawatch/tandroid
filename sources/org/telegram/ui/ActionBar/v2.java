package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ v2(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                e3 e3Var2 = this.b;
                AnimatorSet animatorSet2 = e3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e3Var2.currentSheetAnimation = null;
                    e3Var2.currentSheetAnimationType = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.a;
        e3 e3Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    e3Var.onOpenAnimationEnd();
                    y2 y2Var = e3Var.delegate;
                    if (y2Var != null) {
                        y2Var.onOpenAnimationEnd();
                    }
                    if (e3Var.useHardwareLayer) {
                        e3Var.container.setLayerType(0, null);
                    }
                    if (e3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = e3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        e3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (e3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = e3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                break;
            default:
                AnimatorSet animatorSet2 = e3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new p(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
