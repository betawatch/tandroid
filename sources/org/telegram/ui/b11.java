package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d11 b;

    public /* synthetic */ b11(d11 d11Var, int i7) {
        this.a = i7;
        this.b = d11Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                d11 d11Var = this.b;
                d11Var.N = 0.0f;
                d11Var.I = null;
                d11Var.M = false;
                d11Var.d(true, false);
                break;
        }
    }
}
