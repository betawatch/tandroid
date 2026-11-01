package i2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ x(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.a) {
            case 2:
                d1Var.p(this.b.P);
                break;
            default:
                d1Var.i(this.b.R);
                break;
        }
    }
}
