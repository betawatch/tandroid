package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                    zp zpVar = new zp(this, 22);
                    r40Var.h = zpVar;
                    AndroidUtilities.runOnUIThread(zpVar, r40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                r40 r40Var2 = this.b;
                r40Var2.f = null;
                if (!r40Var2.H) {
                    zp zpVar2 = new zp(this, 23);
                    r40Var2.h = zpVar2;
                    AndroidUtilities.runOnUIThread(zpVar2, r40Var2.E);
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
