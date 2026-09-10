package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tm extends AnimatorListenerAdapter {
    public final /* synthetic */ um a;

    public tm(um umVar) {
        this.a = umVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        um umVar = this.a;
        umVar.b.isChatPreviewSpoilerRevealed = true;
        umVar.O.z.invalidate();
    }
}
