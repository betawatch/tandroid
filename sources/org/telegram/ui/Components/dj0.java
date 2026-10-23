package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class dj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;

    public /* synthetic */ dj0(ej0 ej0Var, int i10) {
        this.a = i10;
        this.b = ej0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ej0 ej0Var = this.b;
                AnimatorSet animatorSet = ej0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ej0Var.s = null;
                    ej0Var.getClass();
                    break;
                }
                break;
            case 2:
                ej0 ej0Var2 = this.b;
                AnimatorSet animatorSet2 = ej0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ej0Var2.s = null;
                    ej0Var2.getClass();
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
        ej0 ej0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ej0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ej0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ej0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ej0Var.s = null;
                    if (ej0Var.w) {
                        ej0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ej0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ej0Var.s = null;
                    AndroidUtilities.runOnUIThread(new yb0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
