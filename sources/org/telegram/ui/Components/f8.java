package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ f8(q8 q8Var, int i7) {
        this.a = i7;
        this.b = q8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                q8 q8Var = this.b;
                q8Var.n0(false, q8Var.G ? 1.0f : 0.0f);
                q8Var.G = false;
                break;
        }
    }
}
