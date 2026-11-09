package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;

    public /* synthetic */ x01(n11 n11Var, int i7) {
        this.a = i7;
        this.b = n11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n11 n11Var = this.b;
                if (n11Var.l()) {
                    n11Var.m();
                    break;
                }
                break;
            default:
                n11 n11Var2 = this.b;
                c11 c11Var = n11Var2.J;
                c11Var.z1(true);
                a11 a11Var = n11Var2.y;
                a11Var.z1(true);
                n11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(a11Var);
                org.telegram.messenger.g0.b4(c11Var);
                break;
        }
    }
}
