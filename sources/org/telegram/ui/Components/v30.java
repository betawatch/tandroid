package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ v30(x30 x30Var, int i10) {
        this.a = i10;
        this.b = x30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x30 x30Var = this.b;
                x30Var.f = null;
                if (!x30Var.D) {
                    lp lpVar = new lp(this, 21);
                    x30Var.h = lpVar;
                    AndroidUtilities.runOnUIThread(lpVar, x30Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                x30 x30Var2 = this.b;
                x30Var2.f = null;
                if (!x30Var2.D) {
                    lp lpVar2 = new lp(this, 22);
                    x30Var2.h = lpVar2;
                    AndroidUtilities.runOnUIThread(lpVar2, x30Var2.A);
                    break;
                }
                break;
            default:
                x30 x30Var3 = this.b;
                x30Var3.setVisibility(4);
                x30Var3.getClass();
                x30Var3.e = null;
                x30Var3.d = null;
                x30Var3.f = null;
                break;
        }
    }
}
