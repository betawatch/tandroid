package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n21 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ w21 b;

    public n21(w21 w21Var, boolean z4) {
        this.b = w21Var;
        this.a = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w21 w21Var = this.b;
        long j10 = w21Var.c;
        if (w21Var.R == animator) {
            boolean z4 = this.a;
            w21Var.O = z4 ? 1.0f : 0.0f;
            w21Var.n();
            w21Var.P = false;
            w21Var.B.setImageResource(w21Var.M ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            w21Var.R = null;
            MessagesController.getInstance(w21Var.b).getMainSettings().edit().putBoolean(android.support.v4.media.a.n(j10, "topicssidetabs"), w21Var.N).putBoolean(android.support.v4.media.a.n(j10, "topicssidetabsb"), w21Var.M).apply();
            Boolean bool = w21Var.Q;
            if (bool != null && z4 != bool.booleanValue()) {
                boolean booleanValue = w21Var.Q.booleanValue();
                w21Var.Q = null;
                w21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new nq0(this, 19));
        }
    }
}
