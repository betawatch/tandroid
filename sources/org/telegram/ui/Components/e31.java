package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ n31 b;

    public e31(n31 n31Var, boolean z10) {
        this.b = n31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n31 n31Var = this.b;
        long j3 = n31Var.c;
        if (n31Var.U == animator) {
            boolean z10 = this.a;
            n31Var.R = z10 ? 1.0f : 0.0f;
            n31Var.n();
            n31Var.S = false;
            n31Var.E.setImageResource(n31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            n31Var.U = null;
            MessagesController.getInstance(n31Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), n31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), n31Var.P).apply();
            Boolean bool = n31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = n31Var.T.booleanValue();
                n31Var.T = null;
                n31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new yq0(this, 20));
        }
    }
}
