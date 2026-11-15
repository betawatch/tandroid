package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 d;

    public /* synthetic */ w0(s4 s4Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.e2 e2Var, int i7) {
        this.a = i7;
        this.b = s4Var;
        this.c = t1Var;
        this.d = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new w0(this.b, this.c, this.d, 1));
                break;
            default:
                t4.b0(this.b, this.c, this.d);
                break;
        }
    }
}
