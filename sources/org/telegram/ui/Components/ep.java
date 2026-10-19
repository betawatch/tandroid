package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                this.b.u(true);
                break;
            case 2:
                wp wpVar = this.b;
                org.telegram.ui.qn qnVar = wpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = org.telegram.ui.p91.d0(qnVar.getMessagesController().getChat(Long.valueOf(-qnVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(qnVar.getResourceProvider());
                l2Var.c = new rc(7);
                l2Var.d = new ep(wpVar, 3);
                l2Var.b = new ep(wpVar, 4);
                l2Var.e = true;
                wpVar.X = d02;
                qnVar.showAsSheet(d02, l2Var);
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
