package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ e3(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        f3 f3Var = this.b;
        switch (i10) {
            case 0:
                f3Var.y = 0.0f;
                f3Var.D.containerView.setTranslationX(0.0f);
                f3Var.D.container.invalidate();
                break;
            case 1:
                f3Var.D.skipDismissAnimation = true;
                f3Var.D.containerView.setTranslationX(f3Var.getMeasuredWidth());
                f3Var.D.dismiss();
                f3Var.D.container.invalidate();
                break;
            case 2:
                f3Var.D.containerView.setTranslationY(0.0f);
                f3Var.D.onContainerViewTranslation();
                h3 h3Var = f3Var.D;
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                f3Var.invalidate();
                break;
            default:
                AnimatorSet animatorSet = f3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
