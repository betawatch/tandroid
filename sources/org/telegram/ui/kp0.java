package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ kp0(up0 up0Var, int i10) {
        this.a = i10;
        this.b = up0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        up0 up0Var = this.b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                up0Var.h();
                break;
            case 2:
                int i11 = up0.q0;
                up0Var.h();
                break;
            default:
                int i12 = up0.q0;
                up0Var.h();
                break;
        }
    }
}
