package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ o b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(o oVar, int i) {
        this.b = oVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.b;
        oVar.v0[1].a();
        oVar.v0[1].setVisibility(8);
        oVar.Q0.Q(oVar.v0[0].b);
        gkb gkbVar = oVar.Q0;
        m[] mVarArr = oVar.v0;
        gkbVar.z0 = mVarArr[0].d;
        boolean z = this.a;
        mVarArr[z ? 1 : 0].setBackgroundDrawable(null);
        oVar.v0[z ? 1 : 0].setLayerType(0, null);
        oVar.w0 = null;
        oVar.g0.f = false;
    }
}
