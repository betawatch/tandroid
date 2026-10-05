package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class n31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ w31 b;

    public n31(w31 w31Var, boolean z10) {
        this.b = w31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w31 w31Var = this.b;
        long j3 = w31Var.c;
        if (w31Var.U == animator) {
            boolean z10 = this.a;
            w31Var.R = z10 ? 1.0f : 0.0f;
            w31Var.n();
            w31Var.S = false;
            w31Var.E.setImageResource(w31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            w31Var.U = null;
            MessagesController.getInstance(w31Var.b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), w31Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), w31Var.P).apply();
            Boolean bool = w31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = w31Var.T.booleanValue();
                w31Var.T = null;
                w31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new gq0(this, 22));
        }
    }
}
