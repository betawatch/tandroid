package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Dialog c;

    public /* synthetic */ b3(Dialog dialog, int i10, int i11) {
        this.a = i11;
        this.c = dialog;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.c;
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                AnimatorSet[] animatorSetArr = ((e2) this.c).F;
                int i10 = this.b;
                AnimatorSet animatorSet2 = animatorSetArr[i10];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        int i10 = this.a;
        int i11 = this.b;
        Dialog dialog = this.c;
        switch (i10) {
            case 0:
                k3 k3Var = (k3) dialog;
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    onClickListener = k3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = k3Var.onClickListener;
                        onClickListener2.onClick(k3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new q(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet[] animatorSetArr = ((e2) dialog).F;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
