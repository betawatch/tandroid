package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w20 b;

    public /* synthetic */ q20(w20 w20Var, int i10) {
        this.a = i10;
        this.b = w20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w20 w20Var = this.b;
                w20Var.b.setVisibility(8);
                w20Var.y = false;
                w20Var.A = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
