package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
