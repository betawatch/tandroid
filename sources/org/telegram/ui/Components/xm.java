package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xm extends AnimatorListenerAdapter {
    public final /* synthetic */ ym a;

    public xm(ym ymVar) {
        this.a = ymVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.a;
        ymVar.b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.z.invalidate();
    }
}
