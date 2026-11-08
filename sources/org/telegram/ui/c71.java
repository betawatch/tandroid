package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c71 extends AnimatorListenerAdapter {
    public final /* synthetic */ v71 a;

    public c71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.a;
        if (v71Var.X0 == null) {
            v71Var.K0[0].setVisibility(4);
        }
    }
}
