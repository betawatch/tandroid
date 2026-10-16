package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
