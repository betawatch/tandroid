package li;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4.l b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ n0(a4.l lVar, Exception exc, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.b.b;
                x0Var.m.a("recording segment interrupted in state=".concat(i0.a.A(x0Var.Z)), this.c);
                int i10 = x0Var.Z;
                if (i10 != 3) {
                    if (i10 == 2) {
                        x0Var.D = true;
                        break;
                    }
                } else {
                    x0Var.q();
                    break;
                }
                break;
            default:
                ((x0) this.b.b).h(this.c);
                break;
        }
    }
}
