package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class n21 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ w21 b;

    public n21(w21 w21Var, boolean z10) {
        this.b = w21Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w21 w21Var = this.b;
        long j3 = w21Var.c;
        if (w21Var.U == animator) {
            boolean z10 = this.a;
            w21Var.R = z10 ? 1.0f : 0.0f;
            w21Var.n();
            w21Var.S = false;
            w21Var.E.setImageResource(w21Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            w21Var.U = null;
            MessagesController.getInstance(w21Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), w21Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), w21Var.P).apply();
            Boolean bool = w21Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = w21Var.T.booleanValue();
                w21Var.T = null;
                w21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new jq0(this, 19));
        }
    }
}
