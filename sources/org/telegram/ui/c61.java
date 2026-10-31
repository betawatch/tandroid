package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e61 b;

    public /* synthetic */ c61(e61 e61Var, int i10) {
        this.a = i10;
        this.b = e61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e61 e61Var = this.b;
                e61Var.b.setVisibility(4);
                bg.i iVar = e61Var.b;
                iVar.J = false;
                bg.i iVar2 = e61Var.c;
                iVar2.J = true;
                iVar.y0 = 0;
                iVar2.y0 = 0;
                Window window = e61Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                e61 e61Var2 = this.b;
                bg.i iVar3 = e61Var2.c;
                iVar3.setVisibility(4);
                bg.i iVar4 = e61Var2.b;
                iVar4.y0 = 0;
                iVar3.y0 = 0;
                iVar4.J = true;
                iVar3.J = false;
                if (iVar4 instanceof bg.v) {
                    iVar4.u0 = false;
                    iVar4.d();
                } else {
                    iVar4.u0 = true;
                    iVar4.x((iVar4.G0 * iVar4.g0.k) - bg.i.k1);
                    iVar4.c(true);
                    iVar4.invalidate();
                }
                Window window2 = e61Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                e61 e61Var3 = this.b;
                e61Var3.b.y0 = 0;
                e61Var3.e.setVisibility(8);
                break;
        }
    }
}
