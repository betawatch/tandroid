package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        org.telegram.ui.Components.m61 m61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((uo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.b;
                a2Var.n = this.c;
                org.telegram.ui.Components.o61 o61Var = a2Var.a;
                if (o61Var != null && (m61Var = o61Var.Y2) != null && o61Var.G) {
                    m61Var.N(true);
                    break;
                }
                break;
        }
    }
}
