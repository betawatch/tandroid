package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ z7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.B0 = null;
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
                this.b.l0 = false;
                break;
            case 1:
                m8 m8Var = this.b;
                m8Var.h0.setVisibility(4);
                m8Var.i0.setImageBitmap(null);
                m8Var.l0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
