package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
