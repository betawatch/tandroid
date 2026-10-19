package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
