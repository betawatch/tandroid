package mg;

import org.telegram.messenger.e20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ a1(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1.l1(this.b);
                break;
            default:
                c1 c1Var = this.b;
                kg.v1 v1Var = new kg.v1(c1Var.o1, e20.s0, null, null, null, c1Var.I0);
                v1Var.B2 = true;
                v1Var.C2 = true;
                v1Var.U1 = true;
                c1Var.o1.showDialog(v1Var);
                break;
        }
    }
}
