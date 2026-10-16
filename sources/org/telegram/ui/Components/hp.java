package org.telegram.ui.Components;

import org.telegram.ui.hb1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp b;

    public /* synthetic */ hp(zp zpVar, int i10) {
        this.a = i10;
        this.b = zpVar;
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
                zp zpVar = this.b;
                org.telegram.ui.fo foVar = zpVar.v;
                org.telegram.ui.ActionBar.m2 d02 = hb1.d0(foVar.getMessagesController().getChat(Long.valueOf(-foVar.a())), true);
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                k2Var.a = true;
                d02.setResourceProvider(foVar.getResourceProvider());
                int i10 = 3;
                k2Var.c = new ve(i10);
                k2Var.d = new hp(zpVar, i10);
                k2Var.b = new hp(zpVar, 4);
                k2Var.e = true;
                zpVar.X = d02;
                foVar.showAsSheet(d02, k2Var);
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
                zp zpVar2 = this.b;
                zpVar2.U.f(zpVar2.G, true);
                break;
        }
    }
}
