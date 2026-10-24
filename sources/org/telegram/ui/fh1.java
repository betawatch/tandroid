package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class fh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ oh1 a;

    public fh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oh1 oh1Var = this.a;
        oh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        oh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
