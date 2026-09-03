package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ x2(g3 g3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                g3 g3Var2 = this.b;
                AnimatorSet animatorSet2 = g3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    g3Var2.currentSheetAnimation = null;
                    g3Var2.currentSheetAnimationType = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.a;
        g3 g3Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    g3Var.onOpenAnimationEnd();
                    a3 a3Var = g3Var.delegate;
                    if (a3Var != null) {
                        a3Var.onOpenAnimationEnd();
                    }
                    if (g3Var.useHardwareLayer) {
                        g3Var.container.setLayerType(0, null);
                    }
                    if (g3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = g3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        g3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (g3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = g3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                break;
            default:
                AnimatorSet animatorSet2 = g3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new p(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
