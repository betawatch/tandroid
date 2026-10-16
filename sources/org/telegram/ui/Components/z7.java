package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ z7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
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
                m8 m8Var = this.b;
                m8Var.i0.setVisibility(4);
                m8Var.j0.setImageBitmap(null);
                m8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
