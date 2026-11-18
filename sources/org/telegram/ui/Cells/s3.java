package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
