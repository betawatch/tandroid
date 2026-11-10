package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ o2(w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                AnimatorSet animatorSet = w2Var.z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.z0 = null;
                    w2Var.A0 = 0;
                    break;
                }
                break;
            default:
                w2 w2Var2 = this.b;
                AnimatorSet animatorSet2 = w2Var2.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var2.z0 = null;
                    w2Var2.A0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        w2 w2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = w2Var.z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.z0 = null;
                    w2Var.A0 = 0;
                    w2Var.v();
                    q2 q2Var = w2Var.y0;
                    if (q2Var != null) {
                        q2Var.v();
                    }
                    if (w2Var.J) {
                        w2Var.c.setLayerType(0, null);
                    }
                    if (w2Var.V) {
                        WindowManager.LayoutParams attributes = w2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        w2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (w2Var.K0) {
                    qs.e().k(99, 512);
                }
                w2Var.L0.e();
                break;
            default:
                AnimatorSet animatorSet2 = w2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.z0 = null;
                    w2Var.A0 = 0;
                    org.telegram.messenger.g0.h3(new l2.a0(this, 22));
                }
                qs.e().k(99, 512);
                break;
        }
    }
}
