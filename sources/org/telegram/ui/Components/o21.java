package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o21 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ x21 b;

    public o21(x21 x21Var, boolean z4) {
        this.b = x21Var;
        this.a = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x21 x21Var = this.b;
        long j10 = x21Var.c;
        if (x21Var.R == animator) {
            boolean z4 = this.a;
            x21Var.O = z4 ? 1.0f : 0.0f;
            x21Var.n();
            x21Var.P = false;
            x21Var.B.setImageResource(x21Var.M ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            x21Var.R = null;
            MessagesController.getInstance(x21Var.b).getMainSettings().edit().putBoolean(android.support.v4.media.a.n(j10, "topicssidetabs"), x21Var.N).putBoolean(android.support.v4.media.a.n(j10, "topicssidetabsb"), x21Var.M).apply();
            Boolean bool = x21Var.Q;
            if (bool != null && z4 != bool.booleanValue()) {
                boolean booleanValue = x21Var.Q.booleanValue();
                x21Var.Q = null;
                x21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new oq0(this, 19));
        }
    }
}
