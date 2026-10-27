package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ g3(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        h3 h3Var = this.b;
        switch (i10) {
            case 0:
                h3Var.y = 0.0f;
                h3Var.G.containerView.setTranslationX(0.0f);
                h3Var.G.container.invalidate();
                break;
            case 1:
                h3Var.G.skipDismissAnimation = true;
                h3Var.G.containerView.setTranslationX(h3Var.getMeasuredWidth());
                h3Var.G.dismiss();
                h3Var.G.container.invalidate();
                break;
            case 2:
                h3Var.G.containerView.setTranslationY(0.0f);
                h3Var.G.onContainerViewTranslation();
                k3 k3Var = h3Var.G;
                k3Var.onSmoothContainerViewLayout(k3Var.containerView.getTranslationY());
                h3Var.invalidate();
                break;
            default:
                AnimatorSet animatorSet = h3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
