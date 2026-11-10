package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ k3(org.telegram.ui.ActionBar.f2 f2Var, TL_wallet.card cardVar, int i7) {
        this.a = i7;
        this.b = f2Var;
        this.c = cardVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = this.b;
                f2Var.presentFragment(new o9(f2Var.getCurrentAccount(), this.c.address));
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var2 = this.b;
                f2Var2.presentFragment(new o9(f2Var2.getCurrentAccount(), this.c.address));
                break;
        }
    }
}
