package org.telegram.ui.Components;

import org.telegram.ui.fb1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;

    public /* synthetic */ ap(sp spVar, int i10) {
        this.a = i10;
        this.b = spVar;
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
                sp spVar = this.b;
                org.telegram.ui.eo eoVar = spVar.v;
                org.telegram.ui.ActionBar.p2 d02 = fb1.d0(eoVar.getMessagesController().getChat(Long.valueOf(-eoVar.a())), true);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                d02.setResourceProvider(eoVar.getResourceProvider());
                n2Var.c = new bi.f0(27);
                n2Var.d = new ap(spVar, 3);
                n2Var.b = new ap(spVar, 4);
                n2Var.e = true;
                spVar.X = d02;
                eoVar.showAsSheet(d02, n2Var);
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
                sp spVar2 = this.b;
                spVar2.U.f(spVar2.G, true);
                break;
        }
    }
}
