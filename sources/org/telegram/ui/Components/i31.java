package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class i31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s31 b;

    public i31(s31 s31Var, boolean z10) {
        this.b = s31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s31 s31Var = this.b;
        long j10 = s31Var.c;
        if (s31Var.U == animator) {
            boolean z10 = this.a;
            s31Var.R = z10 ? 1.0f : 0.0f;
            s31Var.n();
            s31Var.S = false;
            s31Var.E.setImageResource(s31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            s31Var.U = null;
            MessagesController.getInstance(s31Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), s31Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), s31Var.P).apply();
            Boolean bool = s31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = s31Var.T.booleanValue();
                s31Var.T = null;
                s31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new hr0(this, 19));
        }
    }
}
