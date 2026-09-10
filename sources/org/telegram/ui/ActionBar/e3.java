package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                f3Var.G.containerView.setTranslationX(0.0f);
                f3Var.G.container.invalidate();
                break;
            case 1:
                f3Var.G.skipDismissAnimation = true;
                f3Var.G.containerView.setTranslationX(f3Var.getMeasuredWidth());
                f3Var.G.dismiss();
                f3Var.G.container.invalidate();
                break;
            case 2:
                f3Var.G.containerView.setTranslationY(0.0f);
                f3Var.G.onContainerViewTranslation();
                h3 h3Var = f3Var.G;
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
