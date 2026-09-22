package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r3 extends AnimatorListenerAdapter {
    public final /* synthetic */ s3 a;

    public r3(s3 s3Var) {
        this.a = s3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.a;
        if (s3Var.r) {
            s3Var.d.setVisibility(4);
        } else {
            s3Var.e.setVisibility(4);
        }
    }
}
