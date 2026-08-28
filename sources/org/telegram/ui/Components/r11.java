package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ b21 b;

    public r11(b21 b21Var, boolean z10) {
        this.b = b21Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b21 b21Var = this.b;
        long j10 = b21Var.c;
        if (b21Var.Q == animator) {
            boolean z10 = this.a;
            b21Var.N = z10 ? 1.0f : 0.0f;
            b21Var.n();
            b21Var.O = false;
            b21Var.A.setImageResource(b21Var.L ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            b21Var.Q = null;
            MessagesController.getInstance(b21Var.b).getMainSettings().edit().putBoolean(aa.d.m(j10, "topicssidetabs"), b21Var.M).putBoolean(aa.d.m(j10, "topicssidetabsb"), b21Var.L).apply();
            Boolean bool = b21Var.P;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = b21Var.P.booleanValue();
                b21Var.P = null;
                b21Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new tp0(this, 19));
        }
    }
}
