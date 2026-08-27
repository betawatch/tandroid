package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x1 extends AnimatorListenerAdapter {
    public final /* synthetic */ u1 a;
    public final /* synthetic */ y1 b;

    public x1(y1 y1Var, u1 u1Var) {
        this.b = y1Var;
        this.a = u1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.a;
        u1Var.setLayerType(0, null);
        this.b.d.removeView(u1Var);
    }
}
