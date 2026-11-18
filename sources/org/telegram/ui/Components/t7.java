package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ t7(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.w2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.g2 = false;
                break;
            case 1:
                g8 g8Var = this.b;
                g8Var.c2.setVisibility(4);
                g8Var.d2.setImageBitmap(null);
                g8Var.g2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
