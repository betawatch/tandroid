package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ b3(d3 d3Var, int i7) {
        this.a = i7;
        this.b = d3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                d3Var.r = 0;
                d3Var.invalidate();
                break;
            default:
                d3 d3Var2 = this.b;
                d3Var2.s = 0;
                d3Var2.invalidate();
                break;
        }
    }
}
