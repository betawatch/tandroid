package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
