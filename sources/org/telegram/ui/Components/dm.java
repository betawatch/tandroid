package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dm extends AnimatorListenerAdapter {
    public final /* synthetic */ em a;

    public dm(em emVar) {
        this.a = emVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        em emVar = this.a;
        emVar.b.isChatPreviewSpoilerRevealed = true;
        emVar.O.z.invalidate();
    }
}
