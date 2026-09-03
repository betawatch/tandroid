package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ag0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ ag0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bg0 bg0Var = this.b;
                bg0Var.h = false;
                bg0Var.a = bg0Var.c;
                bg0Var.invalidate();
                int i10 = bg0Var.G;
                if (i10 >= 0) {
                    bg0Var.b(i10);
                    bg0Var.G = -1;
                    break;
                }
                break;
            default:
                bg0 bg0Var2 = this.b;
                bg0Var2.n = false;
                bg0Var2.h = false;
                bg0Var2.invalidate();
                int i11 = bg0Var2.G;
                if (i11 >= 0) {
                    bg0Var2.b(i11);
                    bg0Var2.G = -1;
                }
                bg0Var2.a();
                break;
        }
    }
}
