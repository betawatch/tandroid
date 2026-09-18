package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
