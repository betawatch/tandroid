package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a21 b;

    public /* synthetic */ k11(a21 a21Var, int i7) {
        this.a = i7;
        this.b = a21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a21 a21Var = this.b;
                if (a21Var.l()) {
                    a21Var.m();
                    break;
                }
                break;
            default:
                a21 a21Var2 = this.b;
                p11 p11Var = a21Var2.K;
                p11Var.z1(true);
                n11 n11Var = a21Var2.y;
                n11Var.z1(true);
                a21Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(n11Var);
                org.telegram.messenger.g0.Z3(p11Var);
                break;
        }
    }
}
