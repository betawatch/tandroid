package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class al extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ an d;

    public al(an anVar, boolean z10, boolean z11, boolean z12) {
        this.d = anVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        an anVar = this.d;
        anVar.b3 = null;
        anVar.Y2.setVisibility(this.a ? 0 : 4);
        anVar.a3.setVisibility(this.b ? 0 : 4);
        anVar.Z2.setVisibility(this.c ? 0 : 4);
    }
}
