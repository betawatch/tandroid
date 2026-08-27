package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ k8(v8 v8Var, int i10) {
        this.a = i10;
        this.b = v8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                v8 v8Var = this.b;
                v8Var.i0(v8Var.B ? 1.0f : 0.0f, false);
                v8Var.B = false;
                break;
        }
    }
}
