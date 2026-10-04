package org.telegram.ui.Components;

import org.telegram.ui.va1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;

    public /* synthetic */ xo(pp ppVar, int i10) {
        this.a = i10;
        this.b = ppVar;
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
                pp ppVar = this.b;
                org.telegram.ui.yn ynVar = ppVar.v;
                org.telegram.ui.ActionBar.n2 b02 = va1.b0(ynVar.getMessagesController().getChat(Long.valueOf(-ynVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                b02.setResourceProvider(ynVar.getResourceProvider());
                l2Var.c = new uh(2);
                l2Var.d = new xo(ppVar, 3);
                l2Var.b = new xo(ppVar, 4);
                l2Var.e = true;
                ppVar.X = b02;
                ynVar.showAsSheet(b02, l2Var);
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
                pp ppVar2 = this.b;
                ppVar2.U.f(ppVar2.G, true);
                break;
        }
    }
}
