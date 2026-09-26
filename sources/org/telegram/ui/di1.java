package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
