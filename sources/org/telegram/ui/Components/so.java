package org.telegram.ui.Components;

import org.telegram.ui.na1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                org.telegram.ui.ActionBar.p2 d02 = na1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
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
