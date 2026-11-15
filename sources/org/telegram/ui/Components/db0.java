package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class db0 implements Runnable {
    public boolean a;
    public final /* synthetic */ ib0 b;

    public db0(ib0 ib0Var) {
        this.b = ib0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        ib0 ib0Var = this.b;
        ib0Var.a(z10);
        ib0Var.postDelayed(this, ib0Var.N);
    }
}
