package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yp0(zt0 zt0Var, int i10, int i11) {
        this.a = i11;
        this.b = zt0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n1(this.c);
                break;
            case 1:
                zt0 zt0Var = this.b;
                zt0Var.V0(zt0Var.x1, zt0Var.l1, this.c);
                break;
            case 2:
                this.b.m1(this.c, false);
                break;
            case 3:
                this.b.n1(this.c);
                break;
            default:
                zt0 zt0Var2 = this.b;
                zt0Var2.W0(zt0Var2.x1, zt0Var2.l1, this.c);
                break;
        }
    }
}
