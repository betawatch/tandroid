package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ r3(org.telegram.ui.ActionBar.g2 g2Var, TL_wallet.card cardVar, int i7) {
        this.a = i7;
        this.b = g2Var;
        this.c = cardVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.b;
                g2Var.presentFragment(new da(g2Var.getCurrentAccount(), this.c.address));
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.b;
                g2Var2.presentFragment(new da(g2Var2.getCurrentAccount(), this.c.address));
                break;
        }
    }
}
