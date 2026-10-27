package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9 b;

    public /* synthetic */ v8(g9 g9Var, int i10) {
        this.a = i10;
        this.b = g9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                g9 g9Var = this.b;
                g9Var.j0(g9Var.F ? 1.0f : 0.0f, false);
                g9Var.F = false;
                break;
        }
    }
}
