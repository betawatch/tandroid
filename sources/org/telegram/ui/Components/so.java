package org.telegram.ui.Components;

import org.telegram.ui.ha1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ so(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
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
                mp mpVar = this.b;
                org.telegram.ui.xn xnVar = mpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = ha1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                n2Var.c = new jc(7);
                n2Var.d = new so(mpVar, 3);
                n2Var.b = new so(mpVar, 4);
                n2Var.e = true;
                mpVar.U = d02;
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
                mp mpVar2 = this.b;
                mpVar2.R.f(mpVar2.D, true);
                break;
        }
    }
}
