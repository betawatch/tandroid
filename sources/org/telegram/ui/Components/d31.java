package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m31 b;

    public d31(m31 m31Var, boolean z10) {
        this.b = m31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m31 m31Var = this.b;
        long j3 = m31Var.c;
        if (m31Var.U == animator) {
            boolean z10 = this.a;
            m31Var.R = z10 ? 1.0f : 0.0f;
            m31Var.n();
            m31Var.S = false;
            m31Var.E.setImageResource(m31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            m31Var.U = null;
            MessagesController.getInstance(m31Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), m31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), m31Var.P).apply();
            Boolean bool = m31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = m31Var.T.booleanValue();
                m31Var.T = null;
                m31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new xq0(this, 19));
        }
    }
}
