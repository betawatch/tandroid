package m4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
