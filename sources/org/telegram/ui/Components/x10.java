package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ x10(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c20 c20Var = this.b;
                c20Var.b.setVisibility(8);
                c20Var.F = false;
                c20Var.G = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
