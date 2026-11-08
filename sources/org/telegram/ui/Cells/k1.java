package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ k1(q1 q1Var, int i7) {
        this.a = i7;
        this.b = q1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q1 q1Var = this.b;
                q1Var.P5.M0 = true;
                q1Var.invalidate();
                break;
            default:
                this.b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
