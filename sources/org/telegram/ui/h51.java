package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j51 b;

    public /* synthetic */ h51(j51 j51Var, int i10) {
        this.a = i10;
        this.b = j51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.E = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.E = null;
                break;
            default:
                super.onAnimationEnd(animator);
                j51 j51Var = this.b;
                j51Var.J = 0.0f;
                j51Var.E = null;
                j51Var.I = false;
                j51Var.d(true, false);
                break;
        }
    }
}
