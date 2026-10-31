package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn0 b;

    public /* synthetic */ dn0(nn0 nn0Var, int i10) {
        this.a = i10;
        this.b = nn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        nn0 nn0Var = this.b;
        switch (i10) {
            case 0:
                if (nn0Var.G) {
                    nn0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                nn0Var.h();
                break;
            case 2:
                int i11 = nn0.q0;
                nn0Var.h();
                break;
            default:
                int i12 = nn0.q0;
                nn0Var.h();
                break;
        }
    }
}
