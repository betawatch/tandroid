package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o21 b;

    public /* synthetic */ x11(o21 o21Var, int i10) {
        this.a = i10;
        this.b = o21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o21 o21Var = this.b;
                if (o21Var.l()) {
                    o21Var.m();
                    break;
                }
                break;
            default:
                o21 o21Var2 = this.b;
                e21 e21Var = o21Var2.M;
                e21Var.z1(true);
                c21 c21Var = o21Var2.F;
                c21Var.z1(true);
                o21Var2.P.a(true, true);
                org.telegram.messenger.i0.a4(c21Var);
                org.telegram.messenger.i0.a4(e21Var);
                break;
        }
    }
}
