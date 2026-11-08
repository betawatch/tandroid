package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ g0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                r0Var.s.setVisibility(4);
                r0Var.w = null;
                break;
            default:
                this.b.w = null;
                break;
        }
    }
}
