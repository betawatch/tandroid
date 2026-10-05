package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp0 b;

    public /* synthetic */ gp0(qp0 qp0Var, int i10) {
        this.a = i10;
        this.b = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        qp0 qp0Var = this.b;
        switch (i10) {
            case 0:
                if (qp0Var.G) {
                    qp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                qp0Var.h();
                break;
            case 2:
                int i11 = qp0.q0;
                qp0Var.h();
                break;
            default:
                int i12 = qp0.q0;
                qp0Var.h();
                break;
        }
    }
}
