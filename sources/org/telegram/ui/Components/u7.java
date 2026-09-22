package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ u7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
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
                h8 h8Var = this.b;
                h8Var.i0.setVisibility(4);
                h8Var.j0.setImageBitmap(null);
                h8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
