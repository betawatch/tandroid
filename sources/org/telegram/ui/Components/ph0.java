package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ph0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ ph0(qh0 qh0Var, int i9) {
        this.a = i9;
        this.b = qh0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                qh0 qh0Var = this.b;
                AnimatorSet animatorSet = qh0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qh0Var.s = null;
                    qh0Var.getClass();
                    break;
                }
                break;
            case 2:
                qh0 qh0Var2 = this.b;
                AnimatorSet animatorSet2 = qh0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qh0Var2.s = null;
                    qh0Var2.getClass();
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
        int i9 = this.a;
        qh0 qh0Var = this.b;
        switch (i9) {
            case 0:
                AnimatorSet animatorSet = qh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qh0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = qh0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qh0Var.s = null;
                    if (qh0Var.w) {
                        qh0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = qh0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    qh0Var.s = null;
                    AndroidUtilities.runOnUIThread(new ib0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
