package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class aw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ aw0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bw0 bw0Var = this.b;
                bw0Var.y = 1.0f;
                bw0Var.invalidate();
                bw0Var.C = null;
                break;
            case 1:
                bw0 bw0Var2 = this.b;
                bw0Var2.m(((Float) bw0Var2.v.getAnimatedValue()).floatValue());
                bw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.B = null;
                break;
        }
    }
}
