package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class di extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ un d;

    public di(un unVar, boolean z10, boolean z11, boolean z12) {
        this.d = unVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        un unVar = this.d;
        unVar.a3 = null;
        unVar.X2.setVisibility(this.a ? 0 : 4);
        unVar.Z2.setVisibility(this.b ? 0 : 4);
        unVar.Y2.setVisibility(this.c ? 0 : 4);
    }
}
