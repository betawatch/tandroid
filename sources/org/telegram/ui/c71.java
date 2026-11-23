package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c71 extends AnimatorListenerAdapter {
    public final /* synthetic */ x71 a;

    public c71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.a;
        x71Var.L0[x71Var.Y0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
