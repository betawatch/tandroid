package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d21 b;

    public u11(d21 d21Var, boolean z10) {
        this.b = d21Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d21 d21Var = this.b;
        long j10 = d21Var.c;
        if (d21Var.Q == animator) {
            boolean z10 = this.a;
            d21Var.N = z10 ? 1.0f : 0.0f;
            d21Var.n();
            d21Var.O = false;
            d21Var.A.setImageResource(d21Var.L ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            d21Var.Q = null;
            MessagesController.getInstance(d21Var.b).getMainSettings().edit().putBoolean(a9.p.l(j10, "topicssidetabs"), d21Var.M).putBoolean(a9.p.l(j10, "topicssidetabsb"), d21Var.L).apply();
            Boolean bool = d21Var.P;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = d21Var.P.booleanValue();
                d21Var.P = null;
                d21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new up0(this, 19));
        }
    }
}
