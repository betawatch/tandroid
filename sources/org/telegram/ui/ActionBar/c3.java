package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ c3(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        d3 d3Var = this.b;
        switch (i10) {
            case 0:
                d3Var.y = 0.0f;
                d3Var.G.containerView.setTranslationX(0.0f);
                d3Var.G.container.invalidate();
                break;
            case 1:
                d3Var.G.skipDismissAnimation = true;
                d3Var.G.containerView.setTranslationX(d3Var.getMeasuredWidth());
                d3Var.G.dismiss();
                d3Var.G.container.invalidate();
                break;
            case 2:
                d3Var.G.containerView.setTranslationY(0.0f);
                d3Var.G.onContainerViewTranslation();
                f3 f3Var = d3Var.G;
                f3Var.onSmoothContainerViewLayout(f3Var.containerView.getTranslationY());
                d3Var.invalidate();
                break;
            default:
                AnimatorSet animatorSet = d3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
