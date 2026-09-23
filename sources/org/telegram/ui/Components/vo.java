package org.telegram.ui.Components;

import org.telegram.ui.ra1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ vo(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
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
                np npVar = this.b;
                org.telegram.ui.xn xnVar = npVar.v;
                org.telegram.ui.ActionBar.n2 d02 = ra1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                l2Var.c = new th(2);
                l2Var.d = new vo(npVar, 3);
                l2Var.b = new vo(npVar, 4);
                l2Var.e = true;
                npVar.X = d02;
                xnVar.showAsSheet(d02, l2Var);
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
                np npVar2 = this.b;
                npVar2.U.f(npVar2.G, true);
                break;
        }
    }
}
