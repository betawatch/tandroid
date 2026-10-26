package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp b;

    public /* synthetic */ gp(yp ypVar, int i10) {
        this.a = i10;
        this.b = ypVar;
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
                yp ypVar = this.b;
                org.telegram.ui.un unVar = ypVar.v;
                org.telegram.ui.ActionBar.r2 c02 = org.telegram.ui.w91.c0(unVar.getMessagesController().getChat(Long.valueOf(-unVar.a())), true);
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                c02.setResourceProvider(unVar.getResourceProvider());
                p2Var.c = new k5(9);
                p2Var.d = new gp(ypVar, 3);
                p2Var.b = new gp(ypVar, 4);
                p2Var.e = true;
                ypVar.W = c02;
                unVar.showAsSheet(c02, p2Var);
                break;
            case 3:
                this.b.y();
                break;
            case 4:
                this.b.W = null;
                break;
            case 5:
                this.b.y();
                break;
            case 6:
                this.b.W = null;
                break;
            default:
                yp ypVar2 = this.b;
                ypVar2.T.f(ypVar2.F, true);
                break;
        }
    }
}
