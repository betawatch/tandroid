package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o21 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ x21 b;

    public o21(x21 x21Var, boolean z10) {
        this.b = x21Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x21 x21Var = this.b;
        long j3 = x21Var.c;
        if (x21Var.U == animator) {
            boolean z10 = this.a;
            x21Var.R = z10 ? 1.0f : 0.0f;
            x21Var.n();
            x21Var.S = false;
            x21Var.E.setImageResource(x21Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            x21Var.U = null;
            MessagesController.getInstance(x21Var.b).getMainSettings().edit().putBoolean(a4.a.p(j3, "topicssidetabs"), x21Var.Q).putBoolean(a4.a.p(j3, "topicssidetabsb"), x21Var.P).apply();
            Boolean bool = x21Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = x21Var.T.booleanValue();
                x21Var.T = null;
                x21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new jq0(this, 19));
        }
    }
}
