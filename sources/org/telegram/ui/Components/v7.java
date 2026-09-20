package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class v7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ v7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.C0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.m0 = false;
                break;
            case 1:
                i8 i8Var = this.b;
                i8Var.i0.setVisibility(4);
                i8Var.j0.setImageBitmap(null);
                i8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
