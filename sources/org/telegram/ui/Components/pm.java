package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
