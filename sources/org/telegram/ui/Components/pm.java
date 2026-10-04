package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
