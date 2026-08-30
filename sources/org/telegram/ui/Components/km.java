package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class km extends AnimatorListenerAdapter {
    public final /* synthetic */ lm a;

    public km(lm lmVar) {
        this.a = lmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lm lmVar = this.a;
        lmVar.b.isChatPreviewSpoilerRevealed = true;
        lmVar.O.z.invalidate();
    }
}
