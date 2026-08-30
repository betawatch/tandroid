package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q91 b;

    public /* synthetic */ o91(q91 q91Var, int i10) {
        this.a = i10;
        this.b = q91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q91 q91Var = this.b;
                q91Var.b.setVisibility(4);
                vf.g gVar = q91Var.b;
                gVar.G = false;
                vf.g gVar2 = q91Var.c;
                gVar2.G = true;
                gVar.v0 = 0;
                gVar2.v0 = 0;
                Window window = q91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                q91 q91Var2 = this.b;
                vf.g gVar3 = q91Var2.c;
                gVar3.setVisibility(4);
                vf.g gVar4 = q91Var2.b;
                gVar4.v0 = 0;
                gVar3.v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (gVar4 instanceof vf.q) {
                    gVar4.r0 = false;
                    gVar4.d();
                } else {
                    gVar4.r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.d0.k) - vf.g.h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = q91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                q91 q91Var3 = this.b;
                q91Var3.b.v0 = 0;
                q91Var3.e.setVisibility(8);
                break;
        }
    }
}
