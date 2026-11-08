package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;

    public /* synthetic */ k10(p10 p10Var, int i7) {
        this.a = i7;
        this.b = p10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p10 p10Var = this.b;
                p10Var.b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
