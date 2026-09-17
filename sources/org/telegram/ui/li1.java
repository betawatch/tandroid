package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
