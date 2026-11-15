package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da0 b;

    public /* synthetic */ u90(da0 da0Var, int i7) {
        this.a = i7;
        this.b = da0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da0 da0Var = this.b;
                di.c1 c1Var = da0Var.f;
                if (!da0Var.d0.d.r) {
                    c1Var.x0(c1Var.computeVerticalScrollRange() - (c1Var.computeVerticalScrollExtent() + c1Var.computeVerticalScrollOffset()), org.telegram.messenger.ns.Z3, pi.k.V);
                    break;
                } else {
                    c1Var.x0(-c1Var.computeVerticalScrollOffset(), org.telegram.messenger.ns.Z3, pi.k.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
