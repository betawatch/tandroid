package org.telegram.ui.Components;

import org.telegram.ui.sa1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ op b;

    public /* synthetic */ wo(op opVar, int i10) {
        this.a = i10;
        this.b = opVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.l();
                break;
            case 1:
                this.b.s(true);
                break;
            case 2:
                op opVar = this.b;
                org.telegram.ui.wn wnVar = opVar.v;
                org.telegram.ui.ActionBar.m2 d02 = sa1.d0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                k2Var.a = true;
                d02.setResourceProvider(wnVar.getResourceProvider());
                k2Var.c = new th(2);
                k2Var.d = new wo(opVar, 3);
                k2Var.b = new wo(opVar, 4);
                k2Var.e = true;
                opVar.X = d02;
                wnVar.showAsSheet(d02, k2Var);
                break;
            case 3:
                this.b.u();
                break;
            case 4:
                this.b.X = null;
                break;
            case 5:
                this.b.u();
                break;
            case 6:
                this.b.X = null;
                break;
            default:
                op opVar2 = this.b;
                opVar2.U.f(opVar2.G, true);
                break;
        }
    }
}
