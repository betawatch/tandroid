package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    public /* synthetic */ o7(a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.v2 = null;
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
                this.b.f2 = false;
                break;
            case 1:
                a8 a8Var = this.b;
                a8Var.b2.setVisibility(4);
                a8Var.c2.setImageBitmap(null);
                a8Var.f2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
