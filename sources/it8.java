// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class it8 implements s84, jcc {
    public final /* synthetic */ cga a;

    public /* synthetic */ it8(cga cgaVar) {
        this.a = cgaVar;
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        cga cgaVar = this.a;
        cgaVar.i();
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        cgaVar.h(new jt8(cgaVar, (byte) 1), null);
        return Boolean.TRUE;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.a.l();
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
