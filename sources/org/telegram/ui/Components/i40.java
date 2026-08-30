package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k40 b;

    public /* synthetic */ i40(k40 k40Var, int i10) {
        this.a = i10;
        this.b = k40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k40 k40Var = this.b;
                k40Var.f = null;
                if (!k40Var.E) {
                    vp vpVar = new vp(this, 21);
                    k40Var.h = vpVar;
                    AndroidUtilities.runOnUIThread(vpVar, k40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                k40 k40Var2 = this.b;
                k40Var2.f = null;
                if (!k40Var2.E) {
                    vp vpVar2 = new vp(this, 22);
                    k40Var2.h = vpVar2;
                    AndroidUtilities.runOnUIThread(vpVar2, k40Var2.B);
                    break;
                }
                break;
            default:
                k40 k40Var3 = this.b;
                k40Var3.setVisibility(4);
                k40Var3.getClass();
                k40Var3.e = null;
                k40Var3.d = null;
                k40Var3.f = null;
                break;
        }
    }
}
