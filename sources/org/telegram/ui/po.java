package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 d;

    public /* synthetic */ po(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = n2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.l61 l61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((uo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.b;
                a2Var.n = this.c;
                org.telegram.ui.Components.n61 n61Var = a2Var.a;
                if (n61Var != null && (l61Var = n61Var.Y2) != null && n61Var.G) {
                    l61Var.N(true);
                    break;
                }
                break;
        }
    }
}
