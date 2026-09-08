package org.telegram.ui.Components;

import org.telegram.ui.bb1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ to(lp lpVar, int i10) {
        this.a = i10;
        this.b = lpVar;
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
                lp lpVar = this.b;
                org.telegram.ui.co coVar = lpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(coVar.getMessagesController().getChat(Long.valueOf(-coVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(coVar.getResourceProvider());
                int i10 = 3;
                l2Var.c = new ue(i10);
                l2Var.d = new to(lpVar, i10);
                l2Var.b = new to(lpVar, 4);
                l2Var.e = true;
                lpVar.X = d02;
                coVar.showAsSheet(d02, l2Var);
                break;
            case 3:
                this.b.u();
                break;
            case 4:
                this.b.X = null;
                break;
            case 5:
                this.b.u();
                break;
            case 6:
                this.b.X = null;
                break;
            default:
                lp lpVar2 = this.b;
                lpVar2.U.f(lpVar2.G, true);
                break;
        }
    }
}
