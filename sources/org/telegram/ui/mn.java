package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.jb0 a;

    public mn(org.telegram.ui.Components.jb0 jb0Var) {
        this.a = jb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.s(1.0f);
    }
}
