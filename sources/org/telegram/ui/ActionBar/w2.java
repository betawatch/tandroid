package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Dialog c;

    public /* synthetic */ w2(Dialog dialog, int i10, int i11) {
        this.a = i11;
        this.c = dialog;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.c;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                AnimatorSet[] animatorSetArr = ((b2) this.c).B;
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
                e3 e3Var = (e3) dialog;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    onClickListener = e3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = e3Var.onClickListener;
                        onClickListener2.onClick(e3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet[] animatorSetArr = ((b2) dialog).B;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
