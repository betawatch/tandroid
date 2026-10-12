package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class an extends AnimatorListenerAdapter {
    public final /* synthetic */ bn a;

    public an(bn bnVar) {
        this.a = bnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bn bnVar = this.a;
        bnVar.b.isChatPreviewSpoilerRevealed = true;
        bnVar.O.z.invalidate();
    }
}
