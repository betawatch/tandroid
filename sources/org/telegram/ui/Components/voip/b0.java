package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ b0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                k0 k0Var = this.b;
                k0Var.G0 = null;
                k0Var.F0 = 0.0f;
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.y0 = null;
                k0Var2.v0 = 1.0f;
                k0Var2.o0 = 0.0f;
                k0Var2.p0 = 0.0f;
                k0Var2.invalidate();
                break;
        }
    }
}
