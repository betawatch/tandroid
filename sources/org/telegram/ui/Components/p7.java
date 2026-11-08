package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ p7(b8 b8Var, int i7) {
        this.a = i7;
        this.b = b8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.s2 = null;
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
                this.b.c2 = false;
                break;
            case 1:
                b8 b8Var = this.b;
                b8Var.Y1.setVisibility(4);
                b8Var.Z1.setImageBitmap(null);
                b8Var.c2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
