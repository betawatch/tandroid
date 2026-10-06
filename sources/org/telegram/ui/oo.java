package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 d;

    public /* synthetic */ oo(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = n2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.w61 w61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new c5((to) this.d, 4));
                break;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.h = this.b;
                a2Var.n = this.c;
                org.telegram.ui.Components.y61 y61Var = a2Var.a;
                if (y61Var != null && (w61Var = y61Var.f3) != null && y61Var.G) {
                    w61Var.N(true);
                    break;
                }
                break;
        }
    }
}
