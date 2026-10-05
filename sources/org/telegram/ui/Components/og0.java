package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class og0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    public /* synthetic */ og0(rg0 rg0Var, int i10) {
        this.a = i10;
        this.b = rg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.F = null;
                break;
            default:
                this.b.u();
                break;
        }
    }
}
