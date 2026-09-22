package org.telegram.ui.Components;

import org.telegram.ui.za1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ uo(mp mpVar, int i10) {
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
                org.telegram.ui.bo boVar = mpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = za1.d0(boVar.getMessagesController().getChat(Long.valueOf(-boVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                d02.setResourceProvider(boVar.getResourceProvider());
                l2Var.c = new sh(2);
                l2Var.d = new uo(mpVar, 3);
                l2Var.b = new uo(mpVar, 4);
                l2Var.e = true;
                mpVar.X = d02;
                boVar.showAsSheet(d02, l2Var);
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
                mp mpVar2 = this.b;
                mpVar2.U.f(mpVar2.G, true);
                break;
        }
    }
}
