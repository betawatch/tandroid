package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ t8(e9 e9Var, int i10) {
        this.a = i10;
        this.b = e9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                e9 e9Var = this.b;
                e9Var.i0(e9Var.F ? 1.0f : 0.0f, false);
                e9Var.F = false;
                break;
        }
    }
}
