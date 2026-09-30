package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class w7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ w7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.C0 = null;
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
                this.b.m0 = false;
                break;
            case 1:
                j8 j8Var = this.b;
                j8Var.i0.setVisibility(4);
                j8Var.j0.setImageBitmap(null);
                j8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
