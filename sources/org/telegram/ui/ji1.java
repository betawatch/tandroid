package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
