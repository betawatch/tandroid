package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;
    public final /* synthetic */ l0 c;

    public /* synthetic */ j0(l0 l0Var, z zVar, int i7) {
        this.a = i7;
        this.c = l0Var;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.c;
                l0Var.O0 = null;
                this.b.F = false;
                z zVar = l0Var.F;
                if (zVar != null) {
                    if (zVar.getParent() != null) {
                        l0Var.removeView(l0Var.F);
                        l0Var.F.e();
                    }
                    l0Var.F = null;
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.c;
                l0Var2.y.e();
                l0Var2.r = null;
                this.b.r = false;
                if (!l0Var2.b) {
                    l0Var2.d();
                    l0Var2.E = null;
                    l0Var2.d = 0L;
                }
                l0Var2.c = l0Var2.b ? 1.0f : 0.0f;
                l0Var2.l();
                l0Var2.i(false);
                if (!l0Var2.b) {
                    l0Var2.l0.setVisibility(8);
                    l0Var2.m0.setVisibility(8);
                    l0Var2.f0.setVisibility(8);
                    l0Var2.g0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                z zVar2 = this.b;
                if (zVar2.getParent() != null) {
                    this.c.removeView(zVar2);
                    zVar2.e();
                    break;
                }
                break;
            default:
                z zVar3 = this.b;
                if (zVar3.getParent() != null) {
                    this.c.removeView(zVar3);
                    zVar3.e();
                    break;
                }
                break;
        }
    }
}
