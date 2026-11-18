package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ uo(lp lpVar, int i7) {
        this.a = i7;
        this.b = lpVar;
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
                lp lpVar = this.b;
                org.telegram.ui.bn bnVar = lpVar.v1;
                org.telegram.ui.ActionBar.h2 g02 = org.telegram.ui.c51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                f2Var.a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                f2Var.c = new me(4);
                f2Var.d = new uo(lpVar, 3);
                f2Var.b = new uo(lpVar, 4);
                f2Var.e = true;
                lpVar.R1 = g02;
                bnVar.showAsSheet(g02, f2Var);
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
                lp lpVar2 = this.b;
                lpVar2.O1.c(lpVar2.A1);
                break;
        }
    }
}
