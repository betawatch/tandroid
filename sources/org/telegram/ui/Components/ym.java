package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ym extends AnimatorListenerAdapter {
    public final /* synthetic */ zm a;

    public ym(zm zmVar) {
        this.a = zmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zm zmVar = this.a;
        zmVar.b.isChatPreviewSpoilerRevealed = true;
        zmVar.O.z.invalidate();
    }
}
