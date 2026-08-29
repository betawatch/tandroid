package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ p3 a;

    public o3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.a;
        if (p3Var.r) {
            p3Var.d.setVisibility(4);
        } else {
            p3Var.e.setVisibility(4);
        }
    }
}
