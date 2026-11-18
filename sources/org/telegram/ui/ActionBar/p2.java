package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ p2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                AnimatorSet animatorSet = x2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    break;
                }
                break;
            default:
                x2 x2Var2 = this.b;
                AnimatorSet animatorSet2 = x2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var2.A0 = null;
                    x2Var2.B0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        x2 x2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = x2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    x2Var.v();
                    r2 r2Var = x2Var.z0;
                    if (r2Var != null) {
                        r2Var.v();
                    }
                    if (x2Var.K) {
                        x2Var.c.setLayerType(0, null);
                    }
                    if (x2Var.W) {
                        WindowManager.LayoutParams attributes = x2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        x2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (x2Var.L0) {
                    ks.e().k(99, 512);
                }
                x2Var.M0.e();
                break;
            default:
                AnimatorSet animatorSet2 = x2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    org.telegram.messenger.g0.g3(new oi.a2(this, 9));
                }
                ks.e().k(99, 512);
                break;
        }
    }
}
