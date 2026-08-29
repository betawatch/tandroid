package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d21 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m21 b;

    public d21(m21 m21Var, boolean z10) {
        this.b = m21Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m21 m21Var = this.b;
        long j10 = m21Var.c;
        if (m21Var.Q == animator) {
            boolean z10 = this.a;
            m21Var.N = z10 ? 1.0f : 0.0f;
            m21Var.n();
            m21Var.O = false;
            m21Var.A.setImageResource(m21Var.L ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            m21Var.Q = null;
            MessagesController.getInstance(m21Var.b).getMainSettings().edit().putBoolean(a4.w.m(j10, "topicssidetabs"), m21Var.M).putBoolean(a4.w.m(j10, "topicssidetabsb"), m21Var.L).apply();
            Boolean bool = m21Var.P;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = m21Var.P.booleanValue();
                m21Var.P = null;
                m21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new fq0(this, 19));
        }
    }
}
