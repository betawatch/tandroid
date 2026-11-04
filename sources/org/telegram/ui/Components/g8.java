package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ g8(r8 r8Var, int i3) {
        this.a = i3;
        this.b = r8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                r8 r8Var = this.b;
                r8Var.n0(false, r8Var.G ? 1.0f : 0.0f);
                r8Var.G = false;
                break;
        }
    }
}
