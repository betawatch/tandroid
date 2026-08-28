package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ p7(c8 c8Var, int i9) {
        this.a = i9;
        this.b = c8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.y0 = null;
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
                this.b.i0 = false;
                break;
            case 1:
                c8 c8Var = this.b;
                c8Var.e0.setVisibility(4);
                c8Var.f0.setImageBitmap(null);
                c8Var.i0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
