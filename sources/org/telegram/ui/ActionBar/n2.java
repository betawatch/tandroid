package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ n2(v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                AnimatorSet animatorSet = v2Var.z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    v2Var.z0 = null;
                    v2Var.A0 = 0;
                    break;
                }
                break;
            default:
                v2 v2Var2 = this.b;
                AnimatorSet animatorSet2 = v2Var2.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v2Var2.z0 = null;
                    v2Var2.A0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        v2 v2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = v2Var.z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    v2Var.z0 = null;
                    v2Var.A0 = 0;
                    v2Var.v();
                    p2 p2Var = v2Var.y0;
                    if (p2Var != null) {
                        p2Var.v();
                    }
                    if (v2Var.J) {
                        v2Var.c.setLayerType(0, null);
                    }
                    if (v2Var.V) {
                        WindowManager.LayoutParams attributes = v2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        v2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (v2Var.K0) {
                    qs.e().k(99, 512);
                }
                v2Var.L0.e();
                break;
            default:
                AnimatorSet animatorSet2 = v2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v2Var.z0 = null;
                    v2Var.A0 = 0;
                    org.telegram.messenger.g0.h3(new l2.w(this, 23));
                }
                qs.e().k(99, 512);
                break;
        }
    }
}
