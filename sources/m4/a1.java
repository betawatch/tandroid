package m4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements h1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ a1(h1 h1Var, int i10) {
        this.a = i10;
        this.b = h1Var;
    }

    @Override // m4.h1
    public final Object c(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 0:
                if (f0Var != null) {
                    throw new ClassCastException();
                }
                j1.I0(null, wVar, i10, this.b, new i2.r(wVar, i10, 3));
                throw null;
            default:
                return j1.I0(f0Var, wVar, i10, this.b, new i2.z(f0Var, wVar, i10, 4));
        }
    }
}
