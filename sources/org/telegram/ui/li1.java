package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class li1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ui1 a;

    public li1(ui1 ui1Var) {
        this.a = ui1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ui1 ui1Var = this.a;
        ui1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ui1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
