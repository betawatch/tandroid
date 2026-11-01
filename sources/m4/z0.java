package m4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements h1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ z0(h1 h1Var, int i10) {
        this.a = i10;
        this.b = h1Var;
    }

    @Override // m4.h1
    public final Object f(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 0:
                if (f0Var != null) {
                    throw new ClassCastException();
                }
                j1.K0(null, wVar, i10, this.b, new i2.q(wVar, i10, 3));
                throw null;
            default:
                return j1.K0(f0Var, wVar, i10, this.b, new ag.b0(f0Var, wVar, i10, 3));
        }
    }
}
