package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp0 b;

    public /* synthetic */ op0(yp0 yp0Var, int i10) {
        this.a = i10;
        this.b = yp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        yp0 yp0Var = this.b;
        switch (i10) {
            case 0:
                if (yp0Var.G) {
                    yp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                yp0Var.h();
                break;
            case 2:
                int i11 = yp0.q0;
                yp0Var.h();
                break;
            default:
                int i12 = yp0.q0;
                yp0Var.h();
                break;
        }
    }
}
