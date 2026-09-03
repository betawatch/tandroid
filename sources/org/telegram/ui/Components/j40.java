package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l40 b;

    public /* synthetic */ j40(l40 l40Var, int i10) {
        this.a = i10;
        this.b = l40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l40 l40Var = this.b;
                l40Var.f = null;
                if (!l40Var.E) {
                    up upVar = new up(this, 21);
                    l40Var.h = upVar;
                    AndroidUtilities.runOnUIThread(upVar, l40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                l40 l40Var2 = this.b;
                l40Var2.f = null;
                if (!l40Var2.E) {
                    up upVar2 = new up(this, 22);
                    l40Var2.h = upVar2;
                    AndroidUtilities.runOnUIThread(upVar2, l40Var2.B);
                    break;
                }
                break;
            default:
                l40 l40Var3 = this.b;
                l40Var3.setVisibility(4);
                l40Var3.getClass();
                l40Var3.e = null;
                l40Var3.d = null;
                l40Var3.f = null;
                break;
        }
    }
}
