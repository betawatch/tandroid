package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lm extends AnimatorListenerAdapter {
    public final /* synthetic */ mm a;

    public lm(mm mmVar) {
        this.a = mmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mm mmVar = this.a;
        mmVar.b.isChatPreviewSpoilerRevealed = true;
        mmVar.O.z.invalidate();
    }
}
