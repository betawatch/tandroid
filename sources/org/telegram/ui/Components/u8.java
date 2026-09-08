package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ u8(f9 f9Var, int i10) {
        this.a = i10;
        this.b = f9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                f9 f9Var = this.b;
                f9Var.i0(f9Var.F ? 1.0f : 0.0f, false);
                f9Var.F = false;
                break;
        }
    }
}
