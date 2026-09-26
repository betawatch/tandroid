package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class nm extends AnimatorListenerAdapter {
    public final /* synthetic */ om a;

    public nm(om omVar) {
        this.a = omVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        om omVar = this.a;
        omVar.b.isChatPreviewSpoilerRevealed = true;
        omVar.O.z.invalidate();
    }
}
