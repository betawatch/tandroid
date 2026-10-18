package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ah1 extends AnimatorListenerAdapter {
    public final /* synthetic */ jh1 a;

    public ah1(jh1 jh1Var) {
        this.a = jh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jh1 jh1Var = this.a;
        jh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        jh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
