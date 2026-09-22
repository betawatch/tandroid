package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rw0 b;

    public /* synthetic */ qw0(rw0 rw0Var, int i10) {
        this.a = i10;
        this.b = rw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rw0 rw0Var = this.b;
                rw0Var.y = 1.0f;
                rw0Var.invalidate();
                rw0Var.G = null;
                break;
            case 1:
                rw0 rw0Var2 = this.b;
                rw0Var2.m(((Float) rw0Var2.v.getAnimatedValue()).floatValue());
                rw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
