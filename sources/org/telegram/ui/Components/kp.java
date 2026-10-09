package org.telegram.ui.Components;

import org.telegram.ui.bb1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq b;

    public /* synthetic */ kp(cq cqVar, int i10) {
        this.a = i10;
        this.b = cqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.l();
                break;
            case 1:
                this.b.u(true);
                break;
            case 2:
                cq cqVar = this.b;
                org.telegram.ui.zn znVar = cqVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                l2Var.c = new vh(2);
                l2Var.d = new kp(cqVar, 3);
                l2Var.b = new kp(cqVar, 4);
                l2Var.e = true;
                cqVar.X = d02;
                znVar.showAsSheet(d02, l2Var);
                break;
            case 3:
                this.b.w();
                break;
            case 4:
                this.b.X = null;
                break;
            case 5:
                this.b.w();
                break;
            case 6:
                this.b.X = null;
                break;
            default:
                cq cqVar2 = this.b;
                cqVar2.U.f(cqVar2.G, true);
                break;
        }
    }
}
