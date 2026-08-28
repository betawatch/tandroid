package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qn d;

    public nl(qn qnVar, boolean z10, boolean z11, boolean z12) {
        this.d = qnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qn qnVar = this.d;
        qnVar.I2 = null;
        qnVar.F2.setVisibility(this.a ? 0 : 4);
        qnVar.H2.setVisibility(this.b ? 0 : 4);
        qnVar.G2.setVisibility(this.c ? 0 : 4);
    }
}
