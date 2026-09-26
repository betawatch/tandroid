package org.telegram.ui.Components;

import org.telegram.ui.sa1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ vo(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
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
                np npVar = this.b;
                org.telegram.ui.wn wnVar = npVar.v;
                org.telegram.ui.ActionBar.m2 d02 = sa1.d0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                k2Var.a = true;
                d02.setResourceProvider(wnVar.getResourceProvider());
                k2Var.c = new th(2);
                k2Var.d = new vo(npVar, 3);
                k2Var.b = new vo(npVar, 4);
                k2Var.e = true;
                npVar.X = d02;
                wnVar.showAsSheet(d02, k2Var);
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
                np npVar2 = this.b;
                npVar2.U.f(npVar2.G, true);
                break;
        }
    }
}
