package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.bm0 b;

    public /* synthetic */ pe(org.telegram.ui.Components.bm0 bm0Var, int i10) {
        this.a = i10;
        this.b = bm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.bm0 bm0Var = this.b;
                if (!bm0Var.M) {
                    bm0Var.M = true;
                    bm0Var.c(new org.telegram.ui.Components.zl0(bm0Var, 0), false);
                    bm0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
