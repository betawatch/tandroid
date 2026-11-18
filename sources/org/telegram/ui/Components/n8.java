package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ n8(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                y8 y8Var = this.b;
                y8Var.n0(false, y8Var.G ? 1.0f : 0.0f);
                y8Var.G = false;
                break;
        }
    }
}
