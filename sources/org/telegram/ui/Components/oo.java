package org.telegram.ui.Components;

import org.telegram.ui.t91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ oo(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
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
                gp gpVar = this.b;
                org.telegram.ui.tn tnVar = gpVar.v;
                org.telegram.ui.ActionBar.o2 d02 = t91.d0(tnVar.getMessagesController().getChat(Long.valueOf(-tnVar.a())), true);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                d02.setResourceProvider(tnVar.getResourceProvider());
                m2Var.c = new g5(9);
                m2Var.d = new oo(gpVar, 3);
                m2Var.b = new oo(gpVar, 4);
                m2Var.e = true;
                gpVar.T = d02;
                tnVar.showAsSheet(d02, m2Var);
                break;
            case 3:
                this.b.u();
                break;
            case 4:
                this.b.T = null;
                break;
            case 5:
                this.b.u();
                break;
            case 6:
                this.b.T = null;
                break;
            default:
                gp gpVar2 = this.b;
                gpVar2.Q.f(gpVar2.C, true);
                break;
        }
    }
}
