package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d71 extends AnimatorListenerAdapter {
    public final /* synthetic */ x71 a;

    public d71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.a;
        if (x71Var.Y0 == null) {
            x71Var.L0[0].setVisibility(4);
        }
    }
}
