package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ r3(org.telegram.ui.ActionBar.h2 h2Var, TL_wallet.card cardVar, int i7) {
        this.a = i7;
        this.b = h2Var;
        this.c = cardVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = this.b;
                h2Var.presentFragment(new da(h2Var.getCurrentAccount(), this.c.address));
                break;
            default:
                org.telegram.ui.ActionBar.h2 h2Var2 = this.b;
                h2Var2.presentFragment(new da(h2Var2.getCurrentAccount(), this.c.address));
                break;
        }
    }
}
