package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9 b;

    public /* synthetic */ q8(b9 b9Var, int i10) {
        this.a = i10;
        this.b = b9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                b9 b9Var = this.b;
                b9Var.i0(b9Var.B ? 1.0f : 0.0f, false);
                b9Var.B = false;
                break;
        }
    }
}
