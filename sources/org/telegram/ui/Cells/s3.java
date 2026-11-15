package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
