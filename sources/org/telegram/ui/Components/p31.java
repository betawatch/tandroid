package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ y31 b;

    public p31(y31 y31Var, boolean z10) {
        this.b = y31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y31 y31Var = this.b;
        long j10 = y31Var.c;
        if (y31Var.U == animator) {
            boolean z10 = this.a;
            y31Var.R = z10 ? 1.0f : 0.0f;
            y31Var.n();
            y31Var.S = false;
            y31Var.E.setImageResource(y31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            y31Var.U = null;
            MessagesController.getInstance(y31Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), y31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), y31Var.P).apply();
            Boolean bool = y31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = y31Var.T.booleanValue();
                y31Var.T = null;
                y31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new lr0(this, 20));
        }
    }
}
