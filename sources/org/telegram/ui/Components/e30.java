package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k30 b;

    public /* synthetic */ e30(k30 k30Var, int i10) {
        this.a = i10;
        this.b = k30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k30 k30Var = this.b;
                k30Var.b.setVisibility(8);
                k30Var.y = false;
                k30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
