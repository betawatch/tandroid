package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ r01(g11 g11Var, int i3) {
        this.a = i3;
        this.b = g11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                if (g11Var.l()) {
                    g11Var.m();
                    break;
                }
                break;
            default:
                g11 g11Var2 = this.b;
                w01 w01Var = g11Var2.K;
                w01Var.z1(true);
                u01 u01Var = g11Var2.y;
                u01Var.z1(true);
                g11Var2.N.a(true, true);
                org.telegram.messenger.g0.b4(u01Var);
                org.telegram.messenger.g0.b4(w01Var);
                break;
        }
    }
}
