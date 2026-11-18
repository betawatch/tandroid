package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ u10(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z10 z10Var = this.b;
                z10Var.b.setVisibility(8);
                z10Var.F = false;
                z10Var.G = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
