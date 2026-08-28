package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ mh1 a;

    public dh1(mh1 mh1Var) {
        this.a = mh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mh1 mh1Var = this.a;
        mh1Var.A.setText(LocaleController.getString(R.string.VoipCallEnded));
        mh1Var.A.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
