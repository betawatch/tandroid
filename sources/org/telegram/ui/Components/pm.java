package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pm extends AnimatorListenerAdapter {
    public final /* synthetic */ qm a;

    public pm(qm qmVar) {
        this.a = qmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.a;
        qmVar.b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.z.invalidate();
    }
}
