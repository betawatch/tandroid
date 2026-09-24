package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
