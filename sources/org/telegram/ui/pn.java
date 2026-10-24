package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.yc0 a;

    public pn(org.telegram.ui.Components.yc0 yc0Var) {
        this.a = yc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.r(1.0f);
    }
}
