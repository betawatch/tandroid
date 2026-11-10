package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ co(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q1.f();
                break;
            case 1:
                this.b.K0(true);
                break;
            case 2:
                vo voVar = this.b;
                org.telegram.ui.cn cnVar = voVar.u1;
                org.telegram.ui.ActionBar.f2 g02 = org.telegram.ui.e51.g0(cnVar.getMessagesController().M0(Long.valueOf(-cnVar.a())), true);
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                g02.setResourceProvider(cnVar.getResourceProvider());
                d2Var.c = new org.telegram.messenger.rc(28);
                d2Var.d = new co(voVar, 3);
                d2Var.b = new co(voVar, 4);
                d2Var.e = true;
                voVar.Q1 = g02;
                cnVar.showAsSheet(g02, d2Var);
                break;
            case 3:
                this.b.O0();
                break;
            case 4:
                this.b.Q1 = null;
                break;
            case 5:
                this.b.O0();
                break;
            case 6:
                this.b.Q1 = null;
                break;
            default:
                vo voVar2 = this.b;
                voVar2.N1.c(voVar2.z1);
                break;
        }
    }
}
