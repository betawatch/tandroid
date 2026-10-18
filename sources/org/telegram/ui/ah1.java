package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ah1 extends AnimatorListenerAdapter {
    public final /* synthetic */ jh1 a;

    public ah1(jh1 jh1Var) {
        this.a = jh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jh1 jh1Var = this.a;
        jh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        jh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
