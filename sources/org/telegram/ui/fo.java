package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 d;

    public /* synthetic */ fo(org.telegram.ui.ActionBar.n2 n2Var, long j10, long j11, int i10) {
        this.a = i10;
        this.d = n2Var;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.b51 b51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((jo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.d;
                v1Var.f = this.b;
                v1Var.h = this.c;
                org.telegram.ui.Components.e51 e51Var = v1Var.a;
                if (e51Var != null && (b51Var = e51Var.U2) != null && e51Var.C) {
                    b51Var.N(true);
                    break;
                }
                break;
        }
    }
}
