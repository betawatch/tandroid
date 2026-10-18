package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class on extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.wc0 a;

    public on(org.telegram.ui.Components.wc0 wc0Var) {
        this.a = wc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.r(1.0f);
    }
}
