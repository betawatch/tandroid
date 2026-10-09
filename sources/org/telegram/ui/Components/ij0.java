package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ij0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj0 b;

    public /* synthetic */ ij0(jj0 jj0Var, int i10) {
        this.a = i10;
        this.b = jj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                jj0 jj0Var = this.b;
                AnimatorSet animatorSet = jj0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jj0Var.s = null;
                    jj0Var.getClass();
                    break;
                }
                break;
            case 2:
                jj0 jj0Var2 = this.b;
                AnimatorSet animatorSet2 = jj0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jj0Var2.s = null;
                    jj0Var2.getClass();
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
        jj0 jj0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = jj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = jj0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jj0Var.s = null;
                    if (jj0Var.w) {
                        jj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = jj0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    jj0Var.s = null;
                    AndroidUtilities.runOnUIThread(new bd0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
