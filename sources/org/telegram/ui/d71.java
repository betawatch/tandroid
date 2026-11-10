package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d71 extends AnimatorListenerAdapter {
    public final /* synthetic */ x71 a;

    public d71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.a;
        x71Var.K0[x71Var.X0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
