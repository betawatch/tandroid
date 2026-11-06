package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ i8(t8 t8Var, int i7) {
        this.a = i7;
        this.b = t8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                t8 t8Var = this.b;
                t8Var.n0(false, t8Var.F ? 1.0f : 0.0f);
                t8Var.F = false;
                break;
        }
    }
}
