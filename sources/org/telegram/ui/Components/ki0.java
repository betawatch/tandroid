package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ki0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ ki0(xi0 xi0Var, int i7) {
        this.a = i7;
        this.b = xi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                xi0 xi0Var = this.b;
                xi0Var.R = null;
                xi0Var.o0 = 0.0f;
                xi0Var.m0 = null;
                xi0Var.invalidate();
                break;
        }
    }
}
