package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ih1 extends AnimatorListenerAdapter {
    public final /* synthetic */ rh1 a;

    public ih1(rh1 rh1Var) {
        this.a = rh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rh1 rh1Var = this.a;
        rh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        rh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
