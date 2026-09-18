package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ d3(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        e3 e3Var = this.b;
        switch (i10) {
            case 0:
                e3Var.y = 0.0f;
                e3Var.G.containerView.setTranslationX(0.0f);
                e3Var.G.container.invalidate();
                break;
            case 1:
                e3Var.G.skipDismissAnimation = true;
                e3Var.G.containerView.setTranslationX(e3Var.getMeasuredWidth());
                e3Var.G.dismiss();
                e3Var.G.container.invalidate();
                break;
            case 2:
                e3Var.G.containerView.setTranslationY(0.0f);
                e3Var.G.onContainerViewTranslation();
                g3 g3Var = e3Var.G;
                g3Var.onSmoothContainerViewLayout(g3Var.containerView.getTranslationY());
                e3Var.invalidate();
                break;
            default:
                AnimatorSet animatorSet = e3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
