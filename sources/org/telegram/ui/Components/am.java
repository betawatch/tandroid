package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class am extends AnimatorListenerAdapter {
    public final /* synthetic */ bm a;

    public am(bm bmVar) {
        this.a = bmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bm bmVar = this.a;
        bmVar.b.isChatPreviewSpoilerRevealed = true;
        bmVar.O.z.invalidate();
    }
}
