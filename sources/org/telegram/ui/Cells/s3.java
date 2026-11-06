package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s3 extends AnimatorListenerAdapter {
    public final /* synthetic */ u3 a;

    public s3(u3 u3Var) {
        this.a = u3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.a;
        if (u3Var.r) {
            u3Var.d.setVisibility(4);
        } else {
            u3Var.e.setVisibility(4);
        }
    }
}
