package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ji1 extends AnimatorListenerAdapter {
    public final /* synthetic */ si1 a;

    public ji1(si1 si1Var) {
        this.a = si1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        si1 si1Var = this.a;
        si1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        si1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
