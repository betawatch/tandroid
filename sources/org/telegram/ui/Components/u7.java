package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ u7(g8 g8Var, int i10) {
        this.a = i10;
        this.b = g8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.y0 = null;
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
                this.b.i0 = false;
                break;
            case 1:
                g8 g8Var = this.b;
                g8Var.e0.setVisibility(4);
                g8Var.f0.setImageBitmap(null);
                g8Var.i0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
