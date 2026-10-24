package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                this.b.v(true);
                break;
            case 2:
                wp wpVar = this.b;
                org.telegram.ui.sn snVar = wpVar.v;
                org.telegram.ui.ActionBar.o2 d02 = org.telegram.ui.u91.d0(snVar.getMessagesController().getChat(Long.valueOf(-snVar.a())), true);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                d02.setResourceProvider(snVar.getResourceProvider());
                m2Var.c = new rc(7);
                m2Var.d = new ep(wpVar, 3);
                m2Var.b = new ep(wpVar, 4);
                m2Var.e = true;
                wpVar.W = d02;
                snVar.showAsSheet(d02, m2Var);
                break;
            case 3:
                this.b.z();
                break;
            case 4:
                this.b.W = null;
                break;
            case 5:
                this.b.z();
                break;
            case 6:
                this.b.W = null;
                break;
            default:
                wp wpVar2 = this.b;
                wpVar2.T.f(wpVar2.F, true);
                break;
        }
    }
}
