package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p21 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ y21 b;

    public p21(y21 y21Var, boolean z10) {
        this.b = y21Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y21 y21Var = this.b;
        long j3 = y21Var.c;
        if (y21Var.U == animator) {
            boolean z10 = this.a;
            y21Var.R = z10 ? 1.0f : 0.0f;
            y21Var.n();
            y21Var.S = false;
            y21Var.E.setImageResource(y21Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            y21Var.U = null;
            MessagesController.getInstance(y21Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), y21Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), y21Var.P).apply();
            Boolean bool = y21Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = y21Var.T.booleanValue();
                y21Var.T = null;
                y21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new kq0(this, 19));
        }
    }
}
