package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class cd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ xd1 a;

    public cd1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.a;
        xd1Var.J0[xd1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
