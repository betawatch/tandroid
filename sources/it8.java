// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
