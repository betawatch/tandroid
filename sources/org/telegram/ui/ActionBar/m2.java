package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ m2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                AnimatorSet animatorSet = u2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    break;
                }
                break;
            default:
                u2 u2Var2 = this.b;
                AnimatorSet animatorSet2 = u2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var2.A0 = null;
                    u2Var2.B0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        u2 u2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = u2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    u2Var.v();
                    o2 o2Var = u2Var.z0;
                    if (o2Var != null) {
                        o2Var.v();
                    }
                    if (u2Var.K) {
                        u2Var.c.setLayerType(0, null);
                    }
                    if (u2Var.W) {
                        WindowManager.LayoutParams attributes = u2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        u2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (u2Var.L0) {
                    ns.e().k(99, 512);
                }
                u2Var.M0.e();
                break;
            default:
                AnimatorSet animatorSet2 = u2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    org.telegram.messenger.g0.h3(new r0(this, 5));
                }
                ns.e().k(99, 512);
                break;
        }
    }
}
