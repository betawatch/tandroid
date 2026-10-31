package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ h81(i81 i81Var, int i10) {
        this.a = i10;
        this.b = i81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.D = null;
                break;
            default:
                this.b.D = null;
                break;
        }
    }
}
