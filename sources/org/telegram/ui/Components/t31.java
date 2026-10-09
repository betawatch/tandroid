package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ c41 b;

    public t31(c41 c41Var, boolean z10) {
        this.b = c41Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c41 c41Var = this.b;
        long j3 = c41Var.c;
        if (c41Var.U == animator) {
            boolean z10 = this.a;
            c41Var.R = z10 ? 1.0f : 0.0f;
            c41Var.o();
            c41Var.S = false;
            c41Var.E.setImageResource(c41Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            c41Var.U = null;
            MessagesController.getInstance(c41Var.b).getMainSettings().edit().putBoolean(a1.g.p(j3, "topicssidetabs"), c41Var.Q).putBoolean(a1.g.p(j3, "topicssidetabsb"), c41Var.P).apply();
            Boolean bool = c41Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = c41Var.T.booleanValue();
                c41Var.T = null;
                c41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new or0(this, 19));
        }
    }
}
