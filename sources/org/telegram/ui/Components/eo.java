package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ eo(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
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
                vo voVar = this.b;
                org.telegram.ui.an anVar = voVar.r1;
                org.telegram.ui.ActionBar.f2 g02 = org.telegram.ui.c51.g0(anVar.getMessagesController().M0(Long.valueOf(-anVar.a())), true);
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                g02.setResourceProvider(anVar.getResourceProvider());
                d2Var.c = new org.telegram.messenger.pd(26);
                d2Var.d = new eo(voVar, 3);
                d2Var.b = new eo(voVar, 4);
                d2Var.e = true;
                voVar.N1 = g02;
                anVar.showAsSheet(g02, d2Var);
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
                vo voVar2 = this.b;
                voVar2.K1.c(voVar2.w1);
                break;
        }
    }
}
