package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g40 b;

    public /* synthetic */ e40(g40 g40Var, int i10) {
        this.a = i10;
        this.b = g40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g40 g40Var = this.b;
                g40Var.f = null;
                if (!g40Var.D) {
                    rp rpVar = new rp(this, 21);
                    g40Var.h = rpVar;
                    AndroidUtilities.runOnUIThread(rpVar, g40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                g40 g40Var2 = this.b;
                g40Var2.f = null;
                if (!g40Var2.D) {
                    rp rpVar2 = new rp(this, 22);
                    g40Var2.h = rpVar2;
                    AndroidUtilities.runOnUIThread(rpVar2, g40Var2.A);
                    break;
                }
                break;
            default:
                g40 g40Var3 = this.b;
                g40Var3.setVisibility(4);
                g40Var3.getClass();
                g40Var3.e = null;
                g40Var3.d = null;
                g40Var3.f = null;
                break;
        }
    }
}
