package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class cv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dv0 b;

    public /* synthetic */ cv0(dv0 dv0Var, int i7) {
        this.a = i7;
        this.b = dv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dv0 dv0Var = this.b;
                dv0Var.E = 1.0f;
                dv0Var.invalidate();
                dv0Var.H = null;
                break;
            case 1:
                dv0 dv0Var2 = this.b;
                dv0Var2.m(((Float) dv0Var2.w.getAnimatedValue()).floatValue());
                dv0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.G = null;
                break;
        }
    }
}
