package org.telegram.ui.Components;

import org.telegram.ui.s91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ ko(cp cpVar, int i9) {
        this.a = i9;
        this.b = cpVar;
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
                cp cpVar = this.b;
                org.telegram.ui.qn qnVar = cpVar.v;
                org.telegram.ui.ActionBar.o2 c02 = s91.c0(qnVar.getMessagesController().getChat(Long.valueOf(-qnVar.a())), true);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                c02.setResourceProvider(qnVar.getResourceProvider());
                m2Var.c = new hc(7);
                m2Var.d = new ko(cpVar, 3);
                m2Var.b = new ko(cpVar, 4);
                m2Var.e = true;
                cpVar.T = c02;
                qnVar.showAsSheet(c02, m2Var);
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
                cp cpVar2 = this.b;
                cpVar2.Q.f(cpVar2.C, true);
                break;
        }
    }
}
