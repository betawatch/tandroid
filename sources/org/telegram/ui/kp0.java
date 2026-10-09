package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
