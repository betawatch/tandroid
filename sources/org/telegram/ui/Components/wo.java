package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ wo(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r1.f();
                break;
            case 1:
                this.b.L0(true);
                break;
            case 2:
                np npVar = this.b;
                org.telegram.ui.bn bnVar = npVar.v1;
                org.telegram.ui.ActionBar.g2 g02 = org.telegram.ui.c51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                e2Var.c = new me(4);
                e2Var.d = new wo(npVar, 3);
                e2Var.b = new wo(npVar, 4);
                e2Var.e = true;
                npVar.R1 = g02;
                bnVar.showAsSheet(g02, e2Var);
                break;
            case 3:
                this.b.P0();
                break;
            case 4:
                this.b.R1 = null;
                break;
            case 5:
                this.b.P0();
                break;
            case 6:
                this.b.R1 = null;
                break;
            default:
                np npVar2 = this.b;
                npVar2.O1.c(npVar2.A1);
                break;
        }
    }
}
