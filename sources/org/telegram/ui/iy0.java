package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly0 b;

    public /* synthetic */ iy0(ly0 ly0Var, int i7) {
        this.a = i7;
        this.b = ly0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ly0 ly0Var = this.b;
                my0 my0Var = ly0Var.w;
                if (ly0Var.a != 0) {
                    my0Var.onBackPressed();
                    break;
                } else {
                    my0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.J3(this.b.n.d);
                break;
        }
    }
}
