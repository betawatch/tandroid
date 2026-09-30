package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
