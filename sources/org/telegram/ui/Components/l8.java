package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ l8(w8 w8Var, int i9) {
        this.a = i9;
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
                w8Var.h0(w8Var.B ? 1.0f : 0.0f, false);
                w8Var.B = false;
                break;
        }
    }
}
