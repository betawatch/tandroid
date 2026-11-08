package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b71 extends AnimatorListenerAdapter {
    public final /* synthetic */ v71 a;

    public b71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.a;
        v71Var.K0[v71Var.X0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
