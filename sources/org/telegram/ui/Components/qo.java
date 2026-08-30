package org.telegram.ui.Components;

import org.telegram.ui.ga1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ qo(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.l();
                break;
            case 1:
                this.b.s(true);
                break;
            case 2:
                kp kpVar = this.b;
                org.telegram.ui.xn xnVar = kpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = ga1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                n2Var.c = new mc(5);
                n2Var.d = new qo(kpVar, 3);
                n2Var.b = new qo(kpVar, 4);
                n2Var.e = true;
                kpVar.U = d02;
                xnVar.showAsSheet(d02, n2Var);
                break;
            case 3:
                this.b.u();
                break;
            case 4:
                this.b.U = null;
                break;
            case 5:
                this.b.u();
                break;
            case 6:
                this.b.U = null;
                break;
            default:
                kp kpVar2 = this.b;
                kpVar2.R.f(kpVar2.D, true);
                break;
        }
    }
}
