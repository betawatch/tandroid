package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pm extends AnimatorListenerAdapter {
    public final /* synthetic */ qm a;

    public pm(qm qmVar) {
        this.a = qmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.a;
        qmVar.b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.z.invalidate();
    }
}
