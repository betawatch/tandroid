package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ k0 b;

    public h0(k0 k0Var, t tVar) {
        this.b = k0Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.a;
        if (tVar.getParent() != null) {
            this.b.removeView(tVar);
            tVar.e();
        }
    }
}
