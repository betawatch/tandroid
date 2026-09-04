package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                k8 k8Var = this.b;
                k8Var.i0.setVisibility(4);
                k8Var.j0.setImageBitmap(null);
                k8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
