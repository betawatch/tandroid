package org.telegram.ui.Components;

import org.telegram.ui.bb1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ uo(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
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
                mp mpVar = this.b;
                org.telegram.ui.zn znVar = mpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                l2Var.c = new sh(2);
                l2Var.d = new uo(mpVar, 3);
                l2Var.b = new uo(mpVar, 4);
                l2Var.e = true;
                mpVar.X = d02;
                znVar.showAsSheet(d02, l2Var);
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
                mp mpVar2 = this.b;
                mpVar2.U.f(mpVar2.G, true);
                break;
        }
    }
}
