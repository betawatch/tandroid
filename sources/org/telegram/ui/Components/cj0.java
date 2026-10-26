package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    public /* synthetic */ cj0(dj0 dj0Var, int i10) {
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                dj0 dj0Var = this.b;
                AnimatorSet animatorSet = dj0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dj0Var.s = null;
                    dj0Var.getClass();
                    break;
                }
                break;
            case 2:
                dj0 dj0Var2 = this.b;
                AnimatorSet animatorSet2 = dj0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dj0Var2.s = null;
                    dj0Var2.getClass();
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
        dj0 dj0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = dj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = dj0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dj0Var.s = null;
                    if (dj0Var.w) {
                        dj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = dj0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dj0Var.s = null;
                    AndroidUtilities.runOnUIThread(new wa0(this, 16));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
