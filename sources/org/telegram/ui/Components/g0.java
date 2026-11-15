package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 b;

    public /* synthetic */ g0(org.telegram.ui.ActionBar.t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.b;
                ((u5) t2Var.d).e(true, 0.0f);
                t2Var.invalidateSelf();
                break;
        }
    }
}
