package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mi0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;

    public /* synthetic */ mi0(ni0 ni0Var, int i10) {
        this.a = i10;
        this.b = ni0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ni0 ni0Var = this.b;
                AnimatorSet animatorSet = ni0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ni0Var.s = null;
                    ni0Var.getClass();
                    break;
                }
                break;
            case 2:
                ni0 ni0Var2 = this.b;
                AnimatorSet animatorSet2 = ni0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ni0Var2.s = null;
                    ni0Var2.getClass();
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
        ni0 ni0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ni0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ni0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ni0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ni0Var.s = null;
                    if (ni0Var.w) {
                        ni0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ni0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ni0Var.s = null;
                    AndroidUtilities.runOnUIThread(new ec0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
