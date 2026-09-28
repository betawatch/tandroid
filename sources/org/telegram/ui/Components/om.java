package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class om extends AnimatorListenerAdapter {
    public final /* synthetic */ pm a;

    public om(pm pmVar) {
        this.a = pmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pm pmVar = this.a;
        pmVar.b.isChatPreviewSpoilerRevealed = true;
        pmVar.O.z.invalidate();
    }
}
