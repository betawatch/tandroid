package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ co(vo voVar, int i3) {
        this.a = i3;
        this.b = voVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o1.f();
                break;
            case 1:
                this.b.K0(true);
                break;
            case 2:
                vo voVar = this.b;
                org.telegram.ui.wm wmVar = voVar.s1;
                org.telegram.ui.ActionBar.d2 g02 = org.telegram.ui.r41.g0(wmVar.getMessagesController().M0(Long.valueOf(-wmVar.a())), true);
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                g02.setResourceProvider(wmVar.getResourceProvider());
                b2Var.c = new go(0);
                b2Var.d = new co(voVar, 3);
                b2Var.b = new co(voVar, 4);
                b2Var.e = true;
                voVar.O1 = g02;
                wmVar.showAsSheet(g02, b2Var);
                break;
            case 3:
                this.b.O0();
                break;
            case 4:
                this.b.O1 = null;
                break;
            case 5:
                this.b.O0();
                break;
            case 6:
                this.b.O1 = null;
                break;
            default:
                vo voVar2 = this.b;
                voVar2.L1.c(voVar2.x1);
                break;
        }
    }
}
