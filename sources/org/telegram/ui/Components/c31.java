package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ l31 b;

    public c31(l31 l31Var, boolean z10) {
        this.b = l31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l31 l31Var = this.b;
        long j3 = l31Var.c;
        if (l31Var.U == animator) {
            boolean z10 = this.a;
            l31Var.R = z10 ? 1.0f : 0.0f;
            l31Var.n();
            l31Var.S = false;
            l31Var.E.setImageResource(l31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            l31Var.U = null;
            MessagesController.getInstance(l31Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), l31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), l31Var.P).apply();
            Boolean bool = l31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = l31Var.T.booleanValue();
                l31Var.T = null;
                l31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new wq0(this, 19));
        }
    }
}
