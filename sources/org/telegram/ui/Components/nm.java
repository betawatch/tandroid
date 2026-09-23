package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
