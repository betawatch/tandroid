package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ hx0(jx0 jx0Var, int i7, int i10) {
        this.a = i10;
        this.b = jx0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jx0 jx0Var = this.b;
                org.telegram.ui.Components.v61 v61Var = jx0Var.b;
                ix0 ix0Var = jx0Var.d;
                int i7 = this.c;
                v61Var.d(i7, ix0Var.i(i7));
                break;
            default:
                jx0 jx0Var2 = this.b;
                org.telegram.ui.Components.v61 v61Var2 = jx0Var2.b;
                ix0 ix0Var2 = jx0Var2.d;
                int i10 = this.c;
                v61Var2.d(i10, ix0Var2.i(i10));
                break;
        }
    }
}
