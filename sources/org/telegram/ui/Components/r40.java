package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t40 b;

    public /* synthetic */ r40(t40 t40Var, int i10) {
        this.a = i10;
        this.b = t40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t40 t40Var = this.b;
                t40Var.f = null;
                if (!t40Var.H) {
                    cp cpVar = new cp(this, 24);
                    t40Var.h = cpVar;
                    AndroidUtilities.runOnUIThread(cpVar, t40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                t40 t40Var2 = this.b;
                t40Var2.f = null;
                if (!t40Var2.H) {
                    cp cpVar2 = new cp(this, 25);
                    t40Var2.h = cpVar2;
                    AndroidUtilities.runOnUIThread(cpVar2, t40Var2.E);
                    break;
                }
                break;
            default:
                t40 t40Var3 = this.b;
                t40Var3.setVisibility(4);
                t40Var3.getClass();
                t40Var3.e = null;
                t40Var3.d = null;
                t40Var3.f = null;
                break;
        }
    }
}
