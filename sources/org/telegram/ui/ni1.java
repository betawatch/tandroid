package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ni1 extends AnimatorListenerAdapter {
    public final /* synthetic */ wi1 a;

    public ni1(wi1 wi1Var) {
        this.a = wi1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wi1 wi1Var = this.a;
        wi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        wi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
