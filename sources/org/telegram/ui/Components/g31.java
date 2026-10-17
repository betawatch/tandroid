package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ q31 b;

    public g31(q31 q31Var, boolean z10) {
        this.b = q31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q31 q31Var = this.b;
        long j10 = q31Var.c;
        if (q31Var.U == animator) {
            boolean z10 = this.a;
            q31Var.R = z10 ? 1.0f : 0.0f;
            q31Var.n();
            q31Var.S = false;
            q31Var.E.setImageResource(q31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            q31Var.U = null;
            MessagesController.getInstance(q31Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), q31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), q31Var.P).apply();
            Boolean bool = q31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = q31Var.T.booleanValue();
                q31Var.T = null;
                q31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new fr0(this, 19));
        }
    }
}
