package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bm extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ eo d;

    public bm(eo eoVar, boolean z10, boolean z11, boolean z12) {
        this.d = eoVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eo eoVar = this.d;
        eoVar.M2 = null;
        eoVar.J2.setVisibility(this.a ? 0 : 4);
        eoVar.L2.setVisibility(this.b ? 0 : 4);
        eoVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
