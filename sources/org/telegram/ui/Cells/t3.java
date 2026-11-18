package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t3 extends AnimatorListenerAdapter {
    public final /* synthetic */ v3 a;

    public t3(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.a;
        if (v3Var.r) {
            v3Var.d.setVisibility(4);
        } else {
            v3Var.e.setVisibility(4);
        }
    }
}
