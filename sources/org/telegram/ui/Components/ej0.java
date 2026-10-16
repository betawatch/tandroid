package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ej0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj0 b;

    public /* synthetic */ ej0(fj0 fj0Var, int i10) {
        this.a = i10;
        this.b = fj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                fj0 fj0Var = this.b;
                AnimatorSet animatorSet = fj0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fj0Var.s = null;
                    fj0Var.getClass();
                    break;
                }
                break;
            case 2:
                fj0 fj0Var2 = this.b;
                AnimatorSet animatorSet2 = fj0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fj0Var2.s = null;
                    fj0Var2.getClass();
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
        fj0 fj0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = fj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = fj0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fj0Var.s = null;
                    if (fj0Var.w) {
                        fj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = fj0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fj0Var.s = null;
                    AndroidUtilities.runOnUIThread(new yc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
