package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cn d;

    public cl(cn cnVar, boolean z9, boolean z10, boolean z11) {
        this.d = cnVar;
        this.a = z9;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cn cnVar = this.d;
        cnVar.a3 = null;
        cnVar.X2.setVisibility(this.a ? 0 : 4);
        cnVar.Z2.setVisibility(this.b ? 0 : 4);
        cnVar.Y2.setVisibility(this.c ? 0 : 4);
    }
}
