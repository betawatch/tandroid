package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qi0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri0 b;

    public /* synthetic */ qi0(ri0 ri0Var, int i10) {
        this.a = i10;
        this.b = ri0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ri0 ri0Var = this.b;
                AnimatorSet animatorSet = ri0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ri0Var.s = null;
                    ri0Var.getClass();
                    break;
                }
                break;
            case 2:
                ri0 ri0Var2 = this.b;
                AnimatorSet animatorSet2 = ri0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ri0Var2.s = null;
                    ri0Var2.getClass();
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
        ri0 ri0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ri0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ri0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ri0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ri0Var.s = null;
                    if (ri0Var.w) {
                        ri0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ri0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ri0Var.s = null;
                    AndroidUtilities.runOnUIThread(new jc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
