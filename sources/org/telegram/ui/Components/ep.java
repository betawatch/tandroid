package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ ep(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.l();
                break;
            case 1:
                this.b.t(true);
                break;
            case 2:
                wp wpVar = this.b;
                org.telegram.ui.sn snVar = wpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = org.telegram.ui.r91.d0(snVar.getMessagesController().getChat(Long.valueOf(-snVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(snVar.getResourceProvider());
                l2Var.c = new sc(6);
                l2Var.d = new ep(wpVar, 3);
                l2Var.b = new ep(wpVar, 4);
                l2Var.e = true;
                wpVar.X = d02;
                snVar.showAsSheet(d02, l2Var);
                break;
            case 3:
                this.b.w();
                break;
            case 4:
                this.b.X = null;
                break;
            case 5:
                this.b.w();
                break;
            case 6:
                this.b.X = null;
                break;
            default:
                wp wpVar2 = this.b;
                wpVar2.U.f(wpVar2.G, true);
                break;
        }
    }
}
