package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c91 b;

    public /* synthetic */ a91(c91 c91Var, int i9) {
        this.a = i9;
        this.b = c91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c91 c91Var = this.b;
                c91Var.b.setVisibility(4);
                qf.g gVar = c91Var.b;
                gVar.F = false;
                qf.g gVar2 = c91Var.c;
                gVar2.F = true;
                gVar.u0 = 0;
                gVar2.u0 = 0;
                Window window = c91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                c91 c91Var2 = this.b;
                qf.g gVar3 = c91Var2.c;
                gVar3.setVisibility(4);
                qf.g gVar4 = c91Var2.b;
                gVar4.u0 = 0;
                gVar3.u0 = 0;
                gVar4.F = true;
                gVar3.F = false;
                if (gVar4 instanceof qf.q) {
                    gVar4.q0 = false;
                    gVar4.d();
                } else {
                    gVar4.q0 = true;
                    gVar4.x((gVar4.C0 * gVar4.c0.k) - qf.g.g1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = c91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                c91 c91Var3 = this.b;
                c91Var3.b.u0 = 0;
                c91Var3.e.setVisibility(8);
                break;
        }
    }
}
