package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ k31 b;

    public b31(k31 k31Var, boolean z10) {
        this.b = k31Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k31 k31Var = this.b;
        long j3 = k31Var.c;
        if (k31Var.U == animator) {
            boolean z10 = this.a;
            k31Var.R = z10 ? 1.0f : 0.0f;
            k31Var.n();
            k31Var.S = false;
            k31Var.E.setImageResource(k31Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            k31Var.U = null;
            MessagesController.getInstance(k31Var.b).getMainSettings().edit().putBoolean(a4.a.o(j3, "topicssidetabs"), k31Var.Q).putBoolean(a4.a.o(j3, "topicssidetabsb"), k31Var.P).apply();
            Boolean bool = k31Var.T;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = k31Var.T.booleanValue();
                k31Var.T = null;
                k31Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new uq0(this, 19));
        }
    }
}
