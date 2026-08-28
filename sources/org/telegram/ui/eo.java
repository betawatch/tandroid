package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;

    public /* synthetic */ eo(org.telegram.ui.ActionBar.o2 o2Var, long j10, long j11, int i9) {
        this.a = i9;
        this.d = o2Var;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.z41 z41Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new a5((ho) this.d, 4));
                break;
            default:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.d;
                u1Var.f = this.b;
                u1Var.h = this.c;
                org.telegram.ui.Components.c51 c51Var = u1Var.a;
                if (c51Var != null && (z41Var = c51Var.U2) != null && c51Var.C) {
                    z41Var.N(true);
                    break;
                }
                break;
        }
    }
}
