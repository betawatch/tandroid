package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    public /* synthetic */ gr0(nr0 nr0Var, int i7) {
        this.a = i7;
        this.b = nr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.S.setTranslationY(0.0f);
                break;
            case 1:
                this.b.S.setTranslationY(0.0f);
                break;
            default:
                nr0 nr0Var = this.b;
                nr0Var.getClass();
                nr0Var.S.setTranslationY(0.0f);
                nr0Var.q0();
                break;
        }
    }
}
