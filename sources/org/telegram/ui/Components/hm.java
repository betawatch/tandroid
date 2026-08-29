package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hm extends AnimatorListenerAdapter {
    public final /* synthetic */ im a;

    public hm(im imVar) {
        this.a = imVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        im imVar = this.a;
        imVar.b.isChatPreviewSpoilerRevealed = true;
        imVar.O.z.invalidate();
    }
}
