package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
