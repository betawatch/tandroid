package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ j3(org.telegram.ui.ActionBar.e2 e2Var, TL_wallet.card cardVar, int i7) {
        this.a = i7;
        this.b = e2Var;
        this.c = cardVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.b;
                e2Var.presentFragment(new p9(e2Var.getCurrentAccount(), this.c.address));
                break;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.b;
                e2Var2.presentFragment(new p9(e2Var2.getCurrentAccount(), this.c.address));
                break;
        }
    }
}
