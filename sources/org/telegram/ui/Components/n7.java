package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ n7(z7 z7Var, int i3) {
        this.a = i3;
        this.b = z7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.t2 = null;
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
                this.b.d2 = false;
                break;
            case 1:
                z7 z7Var = this.b;
                z7Var.Z1.setVisibility(4);
                z7Var.a2.setImageBitmap(null);
                z7Var.d2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
