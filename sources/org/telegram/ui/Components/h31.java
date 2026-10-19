package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class h31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ r31 b;

    public h31(r31 r31Var, boolean z10) {
        this.b = r31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r31 r31Var = this.b;
        long j10 = r31Var.c;
        if (r31Var.U == animator) {
            boolean z10 = this.a;
            r31Var.R = z10 ? 1.0f : 0.0f;
            r31Var.n();
            r31Var.S = false;
            r31Var.E.setImageResource(r31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            r31Var.U = null;
            MessagesController.getInstance(r31Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), r31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), r31Var.P).apply();
            Boolean bool = r31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = r31Var.T.booleanValue();
                r31Var.T = null;
                r31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new gr0(this, 19));
        }
    }
}
