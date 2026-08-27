package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.nb0 a;

    public nn(org.telegram.ui.Components.nb0 nb0Var) {
        this.a = nb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.s(1.0f);
    }
}
