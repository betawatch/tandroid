package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 d;

    public /* synthetic */ oo(org.telegram.ui.ActionBar.p2 p2Var, long j10, long j11, int i10) {
        this.a = i10;
        this.d = p2Var;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new f5((ro) this.d, 4));
                break;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f = this.b;
                y1Var.h = this.c;
                org.telegram.ui.Components.a61 a61Var = y1Var.a;
                if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                    w51Var.N(true);
                    break;
                }
                break;
        }
    }
}
