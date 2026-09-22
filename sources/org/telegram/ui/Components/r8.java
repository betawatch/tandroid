package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ r8(c9 c9Var, int i10) {
        this.a = i10;
        this.b = c9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                c9 c9Var = this.b;
                c9Var.i0(c9Var.F ? 1.0f : 0.0f, false);
                c9Var.F = false;
                break;
        }
    }
}
