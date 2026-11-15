package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ no(ep epVar, int i7) {
        this.a = i7;
        this.b = epVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r1.f();
                break;
            case 1:
                this.b.K0(true);
                break;
            case 2:
                ep epVar = this.b;
                org.telegram.ui.an anVar = epVar.v1;
                org.telegram.ui.ActionBar.e2 g02 = org.telegram.ui.z41.g0(anVar.getMessagesController().M0(Long.valueOf(-anVar.a())), true);
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                g02.setResourceProvider(anVar.getResourceProvider());
                c2Var.c = new ih(2);
                c2Var.d = new no(epVar, 3);
                c2Var.b = new no(epVar, 4);
                c2Var.e = true;
                epVar.R1 = g02;
                anVar.showAsSheet(g02, c2Var);
                break;
            case 3:
                this.b.O0();
                break;
            case 4:
                this.b.R1 = null;
                break;
            case 5:
                this.b.O0();
                break;
            case 6:
                this.b.R1 = null;
                break;
            default:
                ep epVar2 = this.b;
                epVar2.O1.c(epVar2.A1);
                break;
        }
    }
}
