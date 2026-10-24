package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ w31 b;

    public m31(w31 w31Var, boolean z10) {
        this.b = w31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w31 w31Var = this.b;
        long j10 = w31Var.c;
        if (w31Var.a0 == animator) {
            boolean z10 = this.a;
            w31Var.R = z10 ? 1.0f : 0.0f;
            w31Var.p();
            w31Var.S = false;
            w31Var.E.setImageResource(w31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            w31Var.a0 = null;
            MessagesController.getInstance(w31Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), w31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), w31Var.P).apply();
            Boolean bool = w31Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = w31Var.W.booleanValue();
                w31Var.W = null;
                w31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new kr0(this, 20));
        }
    }
}
