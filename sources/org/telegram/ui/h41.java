package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j41 b;

    public /* synthetic */ h41(j41 j41Var, int i7) {
        this.a = i7;
        this.b = j41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j41 j41Var = this.b;
                j41Var.b.setVisibility(4);
                lg.g gVar = j41Var.b;
                gVar.K = false;
                lg.g gVar2 = j41Var.c;
                gVar2.K = true;
                gVar.z0 = 0;
                gVar2.z0 = 0;
                Window window = j41Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                j41 j41Var2 = this.b;
                lg.g gVar3 = j41Var2.c;
                gVar3.setVisibility(4);
                lg.g gVar4 = j41Var2.b;
                gVar4.z0 = 0;
                gVar3.z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (gVar4 instanceof lg.q) {
                    gVar4.v0 = false;
                    gVar4.d();
                } else {
                    gVar4.v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.h0.k) - lg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = j41Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                j41 j41Var3 = this.b;
                j41Var3.b.z0 = 0;
                j41Var3.e.setVisibility(8);
                break;
        }
    }
}
