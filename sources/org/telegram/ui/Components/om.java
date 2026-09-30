package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
