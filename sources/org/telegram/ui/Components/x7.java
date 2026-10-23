package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class x7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ x7(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.B0 = null;
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
                this.b.l0 = false;
                break;
            case 1:
                k8 k8Var = this.b;
                k8Var.h0.setVisibility(4);
                k8Var.i0.setImageBitmap(null);
                k8Var.l0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
