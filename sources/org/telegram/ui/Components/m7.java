package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ m7(y7 y7Var, int i7) {
        this.a = i7;
        this.b = y7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.w2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.g2 = false;
                break;
            case 1:
                y7 y7Var = this.b;
                y7Var.c2.setVisibility(4);
                y7Var.d2.setImageBitmap(null);
                y7Var.g2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
