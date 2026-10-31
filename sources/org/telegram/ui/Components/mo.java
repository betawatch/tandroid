package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ mo(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n1.f();
                break;
            case 1:
                this.b.K0(true);
                break;
            case 2:
                dp dpVar = this.b;
                org.telegram.ui.un unVar = dpVar.r1;
                org.telegram.ui.ActionBar.k2 f02 = org.telegram.ui.u61.f0(unVar.getMessagesController().L0(Long.valueOf(-unVar.a())), true);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                f02.setResourceProvider(unVar.getResourceProvider());
                i2Var.c = new org.telegram.messenger.rz(17);
                i2Var.d = new mo(dpVar, 3);
                i2Var.b = new mo(dpVar, 4);
                i2Var.e = true;
                dpVar.N1 = f02;
                unVar.showAsSheet(f02, i2Var);
                break;
            case 3:
                this.b.O0();
                break;
            case 4:
                this.b.N1 = null;
                break;
            case 5:
                this.b.O0();
                break;
            case 6:
                this.b.N1 = null;
                break;
            default:
                dp dpVar2 = this.b;
                dpVar2.K1.f(dpVar2.w1, true);
                break;
        }
    }
}
