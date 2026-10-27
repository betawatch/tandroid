package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ f41 b;

    public w31(f41 f41Var, boolean z10) {
        this.b = f41Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f41 f41Var = this.b;
        long j10 = f41Var.c;
        if (f41Var.a0 == animator) {
            boolean z10 = this.a;
            f41Var.R = z10 ? 1.0f : 0.0f;
            f41Var.o();
            f41Var.S = false;
            f41Var.E.setImageResource(f41Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            f41Var.a0 = null;
            MessagesController.getInstance(f41Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), f41Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), f41Var.P).apply();
            Boolean bool = f41Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = f41Var.W.booleanValue();
                f41Var.W = null;
                f41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new np0(this, 25));
        }
    }
}
