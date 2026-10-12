package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dm extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fo d;

    public dm(fo foVar, boolean z10, boolean z11, boolean z12) {
        this.d = foVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fo foVar = this.d;
        foVar.M2 = null;
        foVar.J2.setVisibility(this.a ? 0 : 4);
        foVar.L2.setVisibility(this.b ? 0 : 4);
        foVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
