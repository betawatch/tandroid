package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class l1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ l1(r1 r1Var, int i7) {
        this.a = i7;
        this.b = r1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b;
                r1Var.Q5.O0 = true;
                r1Var.invalidate();
                break;
            default:
                this.b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
