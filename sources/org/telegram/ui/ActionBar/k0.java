package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ k0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                u0Var.s.setVisibility(4);
                u0Var.v = null;
                break;
            default:
                this.b.v = null;
                break;
        }
    }
}
