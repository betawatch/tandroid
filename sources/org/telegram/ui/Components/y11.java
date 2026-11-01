package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p21 b;

    public /* synthetic */ y11(p21 p21Var, int i10) {
        this.a = i10;
        this.b = p21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p21 p21Var = this.b;
                if (p21Var.l()) {
                    p21Var.m();
                    break;
                }
                break;
            default:
                p21 p21Var2 = this.b;
                f21 f21Var = p21Var2.J;
                f21Var.z1(true);
                d21 d21Var = p21Var2.y;
                d21Var.z1(true);
                p21Var2.M.a(true, true);
                org.telegram.messenger.i0.a4(d21Var);
                org.telegram.messenger.i0.a4(f21Var);
                break;
        }
    }
}
