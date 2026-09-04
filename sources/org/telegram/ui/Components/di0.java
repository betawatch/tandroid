package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class di0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei0 b;

    public /* synthetic */ di0(ei0 ei0Var, int i10) {
        this.a = i10;
        this.b = ei0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ei0 ei0Var = this.b;
                AnimatorSet animatorSet = ei0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ei0Var.s = null;
                    ei0Var.getClass();
                    break;
                }
                break;
            case 2:
                ei0 ei0Var2 = this.b;
                AnimatorSet animatorSet2 = ei0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ei0Var2.s = null;
                    ei0Var2.getClass();
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
        ei0 ei0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ei0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ei0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ei0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ei0Var.s = null;
                    if (ei0Var.w) {
                        ei0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ei0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ei0Var.s = null;
                    AndroidUtilities.runOnUIThread(new cc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
