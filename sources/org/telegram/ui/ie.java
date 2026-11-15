package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.Components.ok0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ie(an anVar, org.telegram.ui.Components.ok0 ok0Var, String str, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = ok0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.ok0 ok0Var = this.c;
        an anVar = this.b;
        switch (i10) {
            case 0:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131746335;
                break;
            case 1:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131743201;
                break;
            case 2:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131752553;
                break;
            default:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131743665;
                break;
        }
        org.telegram.messenger.i20.s(null, i7, a02);
    }
}
