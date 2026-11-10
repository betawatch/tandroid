package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ h8(s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                s8 s8Var = this.b;
                s8Var.n0(false, s8Var.F ? 1.0f : 0.0f);
                s8Var.F = false;
                break;
        }
    }
}
