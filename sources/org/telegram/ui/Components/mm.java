package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
