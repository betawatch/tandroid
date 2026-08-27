package org.telegram.ui.Components;

import org.telegram.ui.q91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ io(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.l();
                break;
            case 1:
                this.b.t(true);
                break;
            case 2:
                ap apVar = this.b;
                org.telegram.ui.rn rnVar = apVar.v;
                org.telegram.ui.ActionBar.n2 d02 = q91.d0(rnVar.getMessagesController().getChat(Long.valueOf(-rnVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(rnVar.getResourceProvider());
                l2Var.c = new gc(6);
                l2Var.d = new io(apVar, 3);
                l2Var.b = new io(apVar, 4);
                l2Var.e = true;
                apVar.T = d02;
                rnVar.showAsSheet(d02, l2Var);
                break;
            case 3:
                this.b.v();
                break;
            case 4:
                this.b.T = null;
                break;
            case 5:
                this.b.v();
                break;
            case 6:
                this.b.T = null;
                break;
            default:
                ap apVar2 = this.b;
                apVar2.Q.f(apVar2.C, true);
                break;
        }
    }
}
