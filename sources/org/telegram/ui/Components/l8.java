package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ l8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                w8 w8Var = this.b;
                w8Var.i0(w8Var.C ? 1.0f : 0.0f, false);
                w8Var.C = false;
                break;
        }
    }
}
