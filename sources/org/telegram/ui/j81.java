package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n81 b;

    public /* synthetic */ j81(n81 n81Var, int i7) {
        this.a = i7;
        this.b = n81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n81 n81Var = this.b;
                n81Var.w = 0;
                n81Var.n.setVisibility(8);
                break;
            case 1:
                this.b.w = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
