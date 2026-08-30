package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;

    public /* synthetic */ zf0(ag0 ag0Var, int i10) {
        this.a = i10;
        this.b = ag0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ag0 ag0Var = this.b;
                ag0Var.h = false;
                ag0Var.a = ag0Var.c;
                ag0Var.invalidate();
                int i10 = ag0Var.G;
                if (i10 >= 0) {
                    ag0Var.b(i10);
                    ag0Var.G = -1;
                    break;
                }
                break;
            default:
                ag0 ag0Var2 = this.b;
                ag0Var2.n = false;
                ag0Var2.h = false;
                ag0Var2.invalidate();
                int i11 = ag0Var2.G;
                if (i11 >= 0) {
                    ag0Var2.b(i11);
                    ag0Var2.G = -1;
                }
                ag0Var2.a();
                break;
        }
    }
}
