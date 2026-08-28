package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ c3(d3 d3Var, int i9) {
        this.a = i9;
        this.b = d3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.a;
        d3 d3Var = this.b;
        switch (i9) {
            case 0:
                d3Var.y = 0.0f;
                d3Var.C.containerView.setTranslationX(0.0f);
                d3Var.C.container.invalidate();
                break;
            case 1:
                d3Var.C.skipDismissAnimation = true;
                d3Var.C.containerView.setTranslationX(d3Var.getMeasuredWidth());
                d3Var.C.dismiss();
                d3Var.C.container.invalidate();
                break;
            case 2:
                d3Var.C.containerView.setTranslationY(0.0f);
                d3Var.C.onContainerViewTranslation();
                f3 f3Var = d3Var.C;
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
