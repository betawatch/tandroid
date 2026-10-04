package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class m31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ v31 b;

    public m31(v31 v31Var, boolean z10) {
        this.b = v31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v31 v31Var = this.b;
        long j3 = v31Var.c;
        if (v31Var.U == animator) {
            boolean z10 = this.a;
            v31Var.R = z10 ? 1.0f : 0.0f;
            v31Var.n();
            v31Var.S = false;
            v31Var.E.setImageResource(v31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            v31Var.U = null;
            MessagesController.getInstance(v31Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), v31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), v31Var.P).apply();
            Boolean bool = v31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = v31Var.T.booleanValue();
                v31Var.T = null;
                v31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new br0(this, 21));
        }
    }
}
