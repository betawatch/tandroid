// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nxa implements s84, ska {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nza b;

    public /* synthetic */ nxa(nza nzaVar, byte b) {
        this.a = b;
        this.b = nzaVar;
    }

    @Override // ska
    public final int c() {
        return this.b.b0;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        byte b = this.a;
        nza nzaVar = this.b;
        switch (b) {
            case 0:
                nzaVar.s1();
                break;
            case 1:
                nzaVar.s1();
                break;
            default:
                nzaVar.X.setAlpha(f);
                break;
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
        byte b = this.a;
    }

    private final void a(float f, int i) {
    }

    private final void b(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
