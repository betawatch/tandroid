package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z90 b;

    public /* synthetic */ y90(z90 z90Var, int i7) {
        this.a = i7;
        this.b = z90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z90 z90Var = this.b;
                if (z90Var.W != -1) {
                    org.telegram.messenger.ns.f(z90Var.Y.d0.x).j(z90Var.W);
                    z90Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                z90 z90Var2 = this.b;
                if (z90Var2.W != -1) {
                    org.telegram.messenger.ns.f(z90Var2.Y.d0.x).j(z90Var2.W);
                    z90Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
