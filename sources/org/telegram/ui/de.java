package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ok0 b;

    public /* synthetic */ de(org.telegram.ui.Components.ok0 ok0Var, int i7) {
        this.a = i7;
        this.b = ok0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ok0 ok0Var = this.b;
                if (!ok0Var.N) {
                    ok0Var.N = true;
                    ok0Var.c(new org.telegram.ui.Components.mk0(ok0Var, 0), false);
                    ok0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
