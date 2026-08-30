package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ki0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;

    public /* synthetic */ ki0(li0 li0Var, int i10) {
        this.a = i10;
        this.b = li0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                li0 li0Var = this.b;
                AnimatorSet animatorSet = li0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    li0Var.s = null;
                    li0Var.getClass();
                    break;
                }
                break;
            case 2:
                li0 li0Var2 = this.b;
                AnimatorSet animatorSet2 = li0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    li0Var2.s = null;
                    li0Var2.getClass();
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
        li0 li0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = li0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    li0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = li0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    li0Var.s = null;
                    if (li0Var.w) {
                        li0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = li0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    li0Var.s = null;
                    AndroidUtilities.runOnUIThread(new cc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
