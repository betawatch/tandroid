package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ h91(i91 i91Var, int i7) {
        this.a = i7;
        this.b = i91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i91 i91Var = this.b;
                i91Var.F = null;
                if (i91Var.G != -1) {
                    i91Var.H.getNotificationCenter().j(i91Var.G);
                    i91Var.G = -1;
                    break;
                }
                break;
            default:
                i91 i91Var2 = this.b;
                i91Var2.F = null;
                if (i91Var2.G != -1) {
                    i91Var2.H.getNotificationCenter().j(i91Var2.G);
                    i91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
