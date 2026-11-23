package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ to(kp kpVar, int i7) {
        this.a = i7;
        this.b = kpVar;
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
                kp kpVar = this.b;
                org.telegram.ui.bn bnVar = kpVar.v1;
                org.telegram.ui.ActionBar.g2 g02 = org.telegram.ui.b51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                e2Var.c = new ne(4);
                e2Var.d = new to(kpVar, 3);
                e2Var.b = new to(kpVar, 4);
                e2Var.e = true;
                kpVar.R1 = g02;
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
                kp kpVar2 = this.b;
                kpVar2.O1.c(kpVar2.A1);
                break;
        }
    }
}
