package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ef0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ ef0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.s = null;
                break;
            default:
                this.b.v = null;
                break;
        }
    }
}
