package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ oh1 a;

    public fh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oh1 oh1Var = this.a;
        oh1Var.A.setText(LocaleController.getString(R.string.VoipCallEnded));
        oh1Var.A.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
