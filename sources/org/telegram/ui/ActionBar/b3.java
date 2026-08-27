package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ b3(c3 c3Var, int i10) {
        this.a = i10;
        this.b = c3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        c3 c3Var = this.b;
        switch (i10) {
            case 0:
                c3Var.y = 0.0f;
                c3Var.C.containerView.setTranslationX(0.0f);
                c3Var.C.container.invalidate();
                break;
            case 1:
                c3Var.C.skipDismissAnimation = true;
                c3Var.C.containerView.setTranslationX(c3Var.getMeasuredWidth());
                c3Var.C.dismiss();
                c3Var.C.container.invalidate();
                break;
            case 2:
                c3Var.C.containerView.setTranslationY(0.0f);
                c3Var.C.onContainerViewTranslation();
                e3 e3Var = c3Var.C;
                e3Var.onSmoothContainerViewLayout(e3Var.containerView.getTranslationY());
                c3Var.invalidate();
                break;
            default:
                AnimatorSet animatorSet = c3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    c3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
