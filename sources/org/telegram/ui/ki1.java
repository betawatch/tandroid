package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ki1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ti1 a;

    public ki1(ti1 ti1Var) {
        this.a = ti1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ti1 ti1Var = this.a;
        ti1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ti1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
