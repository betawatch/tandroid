package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Dialog c;

    public /* synthetic */ y2(Dialog dialog, int i10, int i11) {
        this.a = i11;
        this.c = dialog;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                g3 g3Var = (g3) this.c;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                AnimatorSet[] animatorSetArr = ((d2) this.c).C;
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
                g3 g3Var = (g3) dialog;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    onClickListener = g3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = g3Var.onClickListener;
                        onClickListener2.onClick(g3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet[] animatorSetArr = ((d2) dialog).C;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
