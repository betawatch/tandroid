package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ ep0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        op0 op0Var = this.b;
        switch (i10) {
            case 0:
                if (op0Var.G) {
                    op0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                op0Var.h();
                break;
            case 2:
                int i11 = op0.q0;
                op0Var.h();
                break;
            default:
                int i12 = op0.q0;
                op0Var.h();
                break;
        }
    }
}
