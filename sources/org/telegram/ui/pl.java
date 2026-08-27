package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rn d;

    public pl(rn rnVar, boolean z10, boolean z11, boolean z12) {
        this.d = rnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rn rnVar = this.d;
        rnVar.I2 = null;
        rnVar.F2.setVisibility(this.a ? 0 : 4);
        rnVar.H2.setVisibility(this.b ? 0 : 4);
        rnVar.G2.setVisibility(this.c ? 0 : 4);
    }
}
