package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dn extends AnimatorListenerAdapter {
    public final /* synthetic */ en a;

    public dn(en enVar) {
        this.a = enVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        en enVar = this.a;
        enVar.b.isChatPreviewSpoilerRevealed = true;
        enVar.O.z.invalidate();
    }
}
