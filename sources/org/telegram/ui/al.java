package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class al extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ an d;

    public al(an anVar, boolean z9, boolean z10, boolean z11) {
        this.d = anVar;
        this.a = z9;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        an anVar = this.d;
        anVar.a3 = null;
        anVar.X2.setVisibility(this.a ? 0 : 4);
        anVar.Z2.setVisibility(this.b ? 0 : 4);
        anVar.Y2.setVisibility(this.c ? 0 : 4);
    }
}
