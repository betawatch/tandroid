package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j40 b;

    public /* synthetic */ h40(j40 j40Var, int i10) {
        this.a = i10;
        this.b = j40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j40 j40Var = this.b;
                j40Var.f = null;
                if (!j40Var.H) {
                    yp ypVar = new yp(this, 21);
                    j40Var.h = ypVar;
                    AndroidUtilities.runOnUIThread(ypVar, j40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                j40 j40Var2 = this.b;
                j40Var2.f = null;
                if (!j40Var2.H) {
                    yp ypVar2 = new yp(this, 22);
                    j40Var2.h = ypVar2;
                    AndroidUtilities.runOnUIThread(ypVar2, j40Var2.E);
                    break;
                }
                break;
            default:
                j40 j40Var3 = this.b;
                j40Var3.setVisibility(4);
                j40Var3.getClass();
                j40Var3.e = null;
                j40Var3.d = null;
                j40Var3.f = null;
                break;
        }
    }
}
