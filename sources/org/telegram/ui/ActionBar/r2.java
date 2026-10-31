package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ r2(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                AnimatorSet animatorSet = z2Var.z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z2Var.z0 = null;
                    z2Var.A0 = 0;
                    break;
                }
                break;
            default:
                z2 z2Var2 = this.b;
                AnimatorSet animatorSet2 = z2Var2.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var2.z0 = null;
                    z2Var2.A0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        z2 z2Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = z2Var.z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z2Var.z0 = null;
                    z2Var.A0 = 0;
                    z2Var.w();
                    t2 t2Var = z2Var.y0;
                    if (t2Var != null) {
                        t2Var.w();
                    }
                    if (z2Var.J) {
                        z2Var.c.setLayerType(0, null);
                    }
                    if (z2Var.V) {
                        WindowManager.LayoutParams attributes = z2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        z2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (z2Var.K0) {
                    zs.e().k(99, 512);
                }
                z2Var.L0.e();
                break;
            default:
                AnimatorSet animatorSet2 = z2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.z0 = null;
                    z2Var.A0 = 0;
                    org.telegram.messenger.i0.g3(new lg.s(this, 22));
                }
                zs.e().k(99, 512);
                break;
        }
    }
}
