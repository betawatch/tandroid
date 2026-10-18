package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ p40(r40 r40Var, int i10) {
        this.a = i10;
        this.b = r40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r40 r40Var = this.b;
                r40Var.f = null;
                if (!r40Var.H) {
                    hq hqVar = new hq(this, 21);
                    r40Var.h = hqVar;
                    AndroidUtilities.runOnUIThread(hqVar, r40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                r40 r40Var2 = this.b;
                r40Var2.f = null;
                if (!r40Var2.H) {
                    hq hqVar2 = new hq(this, 22);
                    r40Var2.h = hqVar2;
                    AndroidUtilities.runOnUIThread(hqVar2, r40Var2.E);
                    break;
                }
                break;
            default:
                r40 r40Var3 = this.b;
                r40Var3.setVisibility(4);
                r40Var3.getClass();
                r40Var3.e = null;
                r40Var3.d = null;
                r40Var3.f = null;
                break;
        }
    }
}
