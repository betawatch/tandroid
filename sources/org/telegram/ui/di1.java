package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class di1 extends AnimatorListenerAdapter {
    public final /* synthetic */ mi1 a;

    public di1(mi1 mi1Var) {
        this.a = mi1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mi1 mi1Var = this.a;
        mi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        mi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
