package m4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ g0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                e2.l0.W(p0Var.h.l, new g0(p0Var, 1));
                break;
            default:
                this.b.o0();
                break;
        }
    }
}
