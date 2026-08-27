package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ch1 extends AnimatorListenerAdapter {
    public final /* synthetic */ lh1 a;

    public ch1(lh1 lh1Var) {
        this.a = lh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lh1 lh1Var = this.a;
        lh1Var.A.setText(LocaleController.getString(R.string.VoipCallEnded));
        lh1Var.A.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
