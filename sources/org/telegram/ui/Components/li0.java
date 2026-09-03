package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class li0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ li0(mi0 mi0Var, int i10) {
        this.a = i10;
        this.b = mi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                mi0 mi0Var = this.b;
                AnimatorSet animatorSet = mi0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mi0Var.s = null;
                    mi0Var.getClass();
                    break;
                }
                break;
            case 2:
                mi0 mi0Var2 = this.b;
                AnimatorSet animatorSet2 = mi0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mi0Var2.s = null;
                    mi0Var2.getClass();
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
        mi0 mi0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = mi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = mi0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mi0Var.s = null;
                    if (mi0Var.w) {
                        mi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = mi0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mi0Var.s = null;
                    AndroidUtilities.runOnUIThread(new dc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
