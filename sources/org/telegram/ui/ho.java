package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;

    public /* synthetic */ ho(org.telegram.ui.ActionBar.o2 o2Var, long j10, long j11, int i10) {
        this.a = i10;
        this.d = o2Var;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.k51 k51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((ko) this.d, 4));
                break;
            default:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.d;
                w1Var.f = this.b;
                w1Var.h = this.c;
                org.telegram.ui.Components.o51 o51Var = w1Var.a;
                if (o51Var != null && (k51Var = o51Var.U2) != null && o51Var.C) {
                    k51Var.N(true);
                    break;
                }
                break;
        }
    }
}
