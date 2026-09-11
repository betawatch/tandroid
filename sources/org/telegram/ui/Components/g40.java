package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                    wp wpVar = new wp(this, 21);
                    i40Var.h = wpVar;
                    AndroidUtilities.runOnUIThread(wpVar, i40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                i40 i40Var2 = this.b;
                i40Var2.f = null;
                if (!i40Var2.H) {
                    wp wpVar2 = new wp(this, 22);
                    i40Var2.h = wpVar2;
                    AndroidUtilities.runOnUIThread(wpVar2, i40Var2.E);
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
