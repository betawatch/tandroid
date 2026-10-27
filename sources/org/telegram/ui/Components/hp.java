package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp b;

    public /* synthetic */ hp(zp zpVar, int i10) {
        this.a = i10;
        this.b = zpVar;
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
                zp zpVar = this.b;
                org.telegram.ui.wn wnVar = zpVar.v;
                org.telegram.ui.ActionBar.r2 c02 = org.telegram.ui.y91.c0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                c02.setResourceProvider(wnVar.getResourceProvider());
                p2Var.c = new k5(9);
                p2Var.d = new hp(zpVar, 3);
                p2Var.b = new hp(zpVar, 4);
                p2Var.e = true;
                zpVar.W = c02;
                wnVar.showAsSheet(c02, p2Var);
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
                zp zpVar2 = this.b;
                zpVar2.T.f(zpVar2.F, true);
                break;
        }
    }
}
