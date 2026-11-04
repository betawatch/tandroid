package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;

    public /* synthetic */ yh0(li0 li0Var, int i3) {
        this.a = i3;
        this.b = li0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                li0 li0Var = this.b;
                li0Var.R = null;
                li0Var.o0 = 0.0f;
                li0Var.m0 = null;
                li0Var.invalidate();
                break;
        }
    }
}
