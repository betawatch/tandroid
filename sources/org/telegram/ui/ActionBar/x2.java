package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Dialog c;

    public /* synthetic */ x2(Dialog dialog, int i9, int i10) {
        this.a = i10;
        this.c = dialog;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.c;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                AnimatorSet[] animatorSetArr = ((c2) this.c).B;
                int i9 = this.b;
                AnimatorSet animatorSet2 = animatorSetArr[i9];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i9] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        int i9 = this.a;
        int i10 = this.b;
        Dialog dialog = this.c;
        switch (i9) {
            case 0:
                f3 f3Var = (f3) dialog;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    onClickListener = f3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = f3Var.onClickListener;
                        onClickListener2.onClick(f3Var, i10);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet[] animatorSetArr = ((c2) dialog).B;
                AnimatorSet animatorSet2 = animatorSetArr[i10];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
        }
    }
}
