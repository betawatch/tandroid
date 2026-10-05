package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fe1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge1 b;

    public /* synthetic */ fe1(ge1 ge1Var, int i10) {
        this.a = i10;
        this.b = ge1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.h.s.setVisibility(8);
                break;
            default:
                this.b.h.a.setVisibility(8);
                break;
        }
    }
}
