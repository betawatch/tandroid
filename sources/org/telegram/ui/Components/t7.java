package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ t7(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
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
                f8 f8Var = this.b;
                f8Var.c2.setVisibility(4);
                f8Var.d2.setImageBitmap(null);
                f8Var.g2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
