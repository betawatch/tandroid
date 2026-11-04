package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ l2(t2 t2Var, int i3) {
        this.a = i3;
        this.b = t2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                AnimatorSet animatorSet = t2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    break;
                }
                break;
            default:
                t2 t2Var2 = this.b;
                AnimatorSet animatorSet2 = t2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var2.A0 = null;
                    t2Var2.B0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        t2 t2Var = this.b;
        switch (i3) {
            case 0:
                AnimatorSet animatorSet = t2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    t2Var.v();
                    n2 n2Var = t2Var.z0;
                    if (n2Var != null) {
                        n2Var.v();
                    }
                    if (t2Var.K) {
                        t2Var.c.setLayerType(0, null);
                    }
                    if (t2Var.W) {
                        WindowManager.LayoutParams attributes = t2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        t2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (t2Var.L0) {
                    hs.e().k(99, 512);
                }
                t2Var.M0.e();
                break;
            default:
                AnimatorSet animatorSet2 = t2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    org.telegram.messenger.g0.h3(new lg.n(this, 26));
                }
                hs.e().k(99, 512);
                break;
        }
    }
}
