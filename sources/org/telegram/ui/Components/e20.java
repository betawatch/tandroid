package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j20 b;

    public /* synthetic */ e20(j20 j20Var, int i9) {
        this.a = i9;
        this.b = j20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j20 j20Var = this.b;
                j20Var.b.setVisibility(8);
                j20Var.y = false;
                j20Var.A = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
