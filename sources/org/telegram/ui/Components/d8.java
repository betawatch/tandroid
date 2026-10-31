package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ d8(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                o8 o8Var = this.b;
                o8Var.m0(false, o8Var.F ? 1.0f : 0.0f);
                o8Var.F = false;
                break;
        }
    }
}
