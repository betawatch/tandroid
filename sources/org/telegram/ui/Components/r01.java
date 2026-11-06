package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ r01(g11 g11Var, int i7) {
        this.a = i7;
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
                w01 w01Var = g11Var2.J;
                w01Var.z1(true);
                u01 u01Var = g11Var2.y;
                u01Var.z1(true);
                g11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(u01Var);
                org.telegram.messenger.g0.b4(w01Var);
                break;
        }
    }
}
