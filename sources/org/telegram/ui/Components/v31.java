package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e41 b;

    public v31(e41 e41Var, boolean z10) {
        this.b = e41Var;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e41 e41Var = this.b;
        long j10 = e41Var.c;
        if (e41Var.a0 == animator) {
            boolean z10 = this.a;
            e41Var.R = z10 ? 1.0f : 0.0f;
            e41Var.o();
            e41Var.S = false;
            e41Var.E.setImageResource(e41Var.P ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
            e41Var.a0 = null;
            MessagesController.getInstance(e41Var.b).getMainSettings().edit().putBoolean(a1.g.o(j10, "topicssidetabs"), e41Var.Q).putBoolean(a1.g.o(j10, "topicssidetabsb"), e41Var.P).apply();
            Boolean bool = e41Var.W;
            if (bool != null && z10 != bool.booleanValue()) {
                boolean booleanValue = e41Var.W.booleanValue();
                e41Var.W = null;
                e41Var.d(booleanValue);
            }
            AndroidUtilities.runOnUIThread(new mp0(this, 25));
        }
    }
}
