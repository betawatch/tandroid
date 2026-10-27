package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ q3 a;

    public o3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.a;
        if (q3Var.r) {
            q3Var.d.setVisibility(4);
        } else {
            q3Var.e.setVisibility(4);
        }
    }
}
