package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mm extends AnimatorListenerAdapter {
    public final /* synthetic */ nm a;

    public mm(nm nmVar) {
        this.a = nmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.a;
        nmVar.b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.z.invalidate();
    }
}
