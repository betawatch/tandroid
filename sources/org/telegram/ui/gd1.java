package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd1 b;

    public /* synthetic */ gd1(kd1 kd1Var, int i9) {
        this.a = i9;
        this.b = kd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kd1 kd1Var = this.b;
                kd1Var.v = 0;
                kd1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.B.setVisibility(8);
                break;
        }
    }
}
