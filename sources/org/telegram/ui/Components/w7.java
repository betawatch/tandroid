package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
