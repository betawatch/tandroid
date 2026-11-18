package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ h0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                r0Var.s.setVisibility(4);
                r0Var.w = null;
                break;
            default:
                this.b.w = null;
                break;
        }
    }
}
