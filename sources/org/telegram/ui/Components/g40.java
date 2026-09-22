package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i40 b;

    public /* synthetic */ g40(i40 i40Var, int i10) {
        this.a = i10;
        this.b = i40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i40 i40Var = this.b;
                i40Var.f = null;
                if (!i40Var.H) {
                    xp xpVar = new xp(this, 21);
                    i40Var.h = xpVar;
                    AndroidUtilities.runOnUIThread(xpVar, i40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                i40 i40Var2 = this.b;
                i40Var2.f = null;
                if (!i40Var2.H) {
                    xp xpVar2 = new xp(this, 22);
                    i40Var2.h = xpVar2;
                    AndroidUtilities.runOnUIThread(xpVar2, i40Var2.E);
                    break;
                }
                break;
            default:
                i40 i40Var3 = this.b;
                i40Var3.setVisibility(4);
                i40Var3.getClass();
                i40Var3.e = null;
                i40Var3.d = null;
                i40Var3.f = null;
                break;
        }
    }
}
