package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class s8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ s8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                d9 d9Var = this.b;
                d9Var.i0(d9Var.F ? 1.0f : 0.0f, false);
                d9Var.F = false;
                break;
        }
    }
}
