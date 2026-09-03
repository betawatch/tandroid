package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jm extends AnimatorListenerAdapter {
    public final /* synthetic */ km a;

    public jm(km kmVar) {
        this.a = kmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        km kmVar = this.a;
        kmVar.b.isChatPreviewSpoilerRevealed = true;
        kmVar.O.z.invalidate();
    }
}
