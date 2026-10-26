package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ph1 a;

    public gh1(ph1 ph1Var) {
        this.a = ph1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ph1 ph1Var = this.a;
        ph1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ph1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
