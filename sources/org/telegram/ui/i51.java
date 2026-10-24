package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ i51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                k51 k51Var = this.b;
                k51Var.N = 0.0f;
                k51Var.I = null;
                k51Var.M = false;
                k51Var.d(true, false);
                break;
        }
    }
}
