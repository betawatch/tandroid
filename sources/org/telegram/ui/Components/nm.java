package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
