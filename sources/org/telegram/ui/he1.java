package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class he1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ le1 b;

    public /* synthetic */ he1(le1 le1Var, int i10) {
        this.a = i10;
        this.b = le1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                le1 le1Var = this.b;
                le1Var.v = 0;
                le1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
