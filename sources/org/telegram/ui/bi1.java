package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class bi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ki1 a;

    public bi1(ki1 ki1Var) {
        this.a = ki1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ki1 ki1Var = this.a;
        ki1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ki1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
