package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l70 b;

    public /* synthetic */ k70(l70 l70Var, int i10) {
        this.a = i10;
        this.b = l70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l70 l70Var = this.b;
                l70Var.e.d0 = null;
                l70Var.requestLayout();
                break;
            default:
                l70 l70Var2 = this.b;
                l70Var2.e.d0 = null;
                l70Var2.a = false;
                break;
        }
    }
}
