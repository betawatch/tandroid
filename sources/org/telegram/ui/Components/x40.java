package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z40 b;

    public /* synthetic */ x40(z40 z40Var, int i10) {
        this.a = i10;
        this.b = z40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z40 z40Var = this.b;
                z40Var.f = null;
                if (!z40Var.H) {
                    nq nqVar = new nq(this, 21);
                    z40Var.h = nqVar;
                    AndroidUtilities.runOnUIThread(nqVar, z40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                z40 z40Var2 = this.b;
                z40Var2.f = null;
                if (!z40Var2.H) {
                    nq nqVar2 = new nq(this, 22);
                    z40Var2.h = nqVar2;
                    AndroidUtilities.runOnUIThread(nqVar2, z40Var2.E);
                    break;
                }
                break;
            default:
                z40 z40Var3 = this.b;
                z40Var3.setVisibility(4);
                z40Var3.getClass();
                z40Var3.e = null;
                z40Var3.d = null;
                z40Var3.f = null;
                break;
        }
    }
}
