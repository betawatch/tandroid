package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ c0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.b;
                l0Var.G0 = null;
                l0Var.F0 = 0.0f;
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.y0 = null;
                l0Var2.v0 = 1.0f;
                l0Var2.o0 = 0.0f;
                l0Var2.p0 = 0.0f;
                l0Var2.invalidate();
                break;
        }
    }
}
