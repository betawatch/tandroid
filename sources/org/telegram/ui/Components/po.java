package org.telegram.ui.Components;

import org.telegram.ui.oa1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp b;

    public /* synthetic */ po(jp jpVar, int i10) {
        this.a = i10;
        this.b = jpVar;
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
                jp jpVar = this.b;
                org.telegram.ui.zn znVar = jpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = oa1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                n2Var.c = new mc(5);
                n2Var.d = new po(jpVar, 3);
                n2Var.b = new po(jpVar, 4);
                n2Var.e = true;
                jpVar.U = d02;
                znVar.showAsSheet(d02, n2Var);
                break;
            case 3:
                this.b.u();
                break;
            case 4:
                this.b.U = null;
                break;
            case 5:
                this.b.u();
                break;
            case 6:
                this.b.U = null;
                break;
            default:
                jp jpVar2 = this.b;
                jpVar2.R.f(jpVar2.D, true);
                break;
        }
    }
}
