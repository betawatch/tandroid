package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n20 b;

    public /* synthetic */ h20(n20 n20Var, int i10) {
        this.a = i10;
        this.b = n20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n20 n20Var = this.b;
                n20Var.b.setVisibility(8);
                n20Var.y = false;
                n20Var.A = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
