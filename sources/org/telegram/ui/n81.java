package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ n81(s81 s81Var, int i7) {
        this.a = i7;
        this.b = s81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s81 s81Var = this.b;
                s81Var.getClass();
                new ug.x0((org.telegram.ui.ActionBar.e2) s81Var, 11, false).show();
                break;
            default:
                s81 s81Var2 = this.b;
                s81Var2.e.requestFocus();
                org.telegram.messenger.g0.J3(s81Var2.e);
                break;
        }
    }
}
