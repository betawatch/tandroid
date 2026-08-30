package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        org.telegram.ui.Components.w51 w51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new d5((po) this.d, 4));
                break;
            default:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                x1Var.f = this.b;
                x1Var.h = this.c;
                org.telegram.ui.Components.a61 a61Var = x1Var.a;
                if (a61Var != null && (w51Var = a61Var.V2) != null && a61Var.D) {
                    w51Var.N(true);
                    break;
                }
                break;
        }
    }
}
