package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 d;

    public /* synthetic */ mo(org.telegram.ui.ActionBar.p2 p2Var, long j10, long j11, int i10) {
        this.a = i10;
        this.d = p2Var;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.x51 x51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new d5((po) this.d, 4));
                break;
            default:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                y1Var.f = this.b;
                y1Var.h = this.c;
                org.telegram.ui.Components.b61 b61Var = y1Var.a;
                if (b61Var != null && (x51Var = b61Var.V2) != null && b61Var.D) {
                    x51Var.N(true);
                    break;
                }
                break;
        }
    }
}
