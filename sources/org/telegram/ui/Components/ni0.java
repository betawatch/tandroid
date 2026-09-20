package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ni0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;

    public /* synthetic */ ni0(oi0 oi0Var, int i10) {
        this.a = i10;
        this.b = oi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                oi0 oi0Var = this.b;
                AnimatorSet animatorSet = oi0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oi0Var.s = null;
                    oi0Var.getClass();
                    break;
                }
                break;
            case 2:
                oi0 oi0Var2 = this.b;
                AnimatorSet animatorSet2 = oi0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oi0Var2.s = null;
                    oi0Var2.getClass();
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
        oi0 oi0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = oi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = oi0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oi0Var.s = null;
                    if (oi0Var.w) {
                        oi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = oi0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    oi0Var.s = null;
                    AndroidUtilities.runOnUIThread(new jc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
