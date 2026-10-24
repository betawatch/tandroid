package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
