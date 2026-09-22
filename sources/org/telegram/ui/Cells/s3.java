package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s3 extends AnimatorListenerAdapter {
    public final /* synthetic */ t3 a;

    public s3(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t3 t3Var = this.a;
        if (t3Var.r) {
            t3Var.d.setVisibility(4);
        } else {
            t3Var.e.setVisibility(4);
        }
    }
}
