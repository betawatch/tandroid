package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zi0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj0 b;

    public /* synthetic */ zi0(aj0 aj0Var, int i10) {
        this.a = i10;
        this.b = aj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                aj0 aj0Var = this.b;
                AnimatorSet animatorSet = aj0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aj0Var.s = null;
                    aj0Var.getClass();
                    break;
                }
                break;
            case 2:
                aj0 aj0Var2 = this.b;
                AnimatorSet animatorSet2 = aj0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    aj0Var2.s = null;
                    aj0Var2.getClass();
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
        aj0 aj0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = aj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = aj0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    aj0Var.s = null;
                    if (aj0Var.w) {
                        aj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = aj0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    aj0Var.s = null;
                    AndroidUtilities.runOnUIThread(new rc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
