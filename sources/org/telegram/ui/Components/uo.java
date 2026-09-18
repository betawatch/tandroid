package org.telegram.ui.Components;

import org.telegram.ui.ab1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.ActionBar.o2 d02 = ab1.d0(boVar.getMessagesController().getChat(Long.valueOf(-boVar.a())), true);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                d02.setResourceProvider(boVar.getResourceProvider());
                m2Var.c = new sh(2);
                m2Var.d = new uo(mpVar, 3);
                m2Var.b = new uo(mpVar, 4);
                m2Var.e = true;
                mpVar.X = d02;
                boVar.showAsSheet(d02, m2Var);
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
