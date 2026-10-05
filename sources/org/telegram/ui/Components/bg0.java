package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ bg0(cg0 cg0Var, int i10) {
        this.a = i10;
        this.b = cg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.a.n.setVisibility(8);
                break;
            default:
                this.b.a.h.setVisibility(8);
                break;
        }
    }
}
