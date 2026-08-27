package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;

    public /* synthetic */ rh0(sh0 sh0Var, int i10) {
        this.a = i10;
        this.b = sh0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                sh0 sh0Var = this.b;
                AnimatorSet animatorSet = sh0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sh0Var.s = null;
                    sh0Var.getClass();
                    break;
                }
                break;
            case 2:
                sh0 sh0Var2 = this.b;
                AnimatorSet animatorSet2 = sh0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sh0Var2.s = null;
                    sh0Var2.getClass();
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
        sh0 sh0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = sh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sh0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = sh0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sh0Var.s = null;
                    if (sh0Var.w) {
                        sh0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = sh0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    sh0Var.s = null;
                    AndroidUtilities.runOnUIThread(new mb0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
