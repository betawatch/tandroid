// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohb implements ska, s84 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ thb b;

    public /* synthetic */ ohb(thb thbVar, byte b) {
        this.a = b;
        this.b = thbVar;
    }

    @Override // ska
    public final int c() {
        return this.b.b0;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        byte b = this.a;
        thb thbVar = this.b;
        switch (b) {
            case 1:
                thbVar.H0();
                break;
            case 2:
                thbVar.H0();
                break;
            default:
                thbVar.X.setAlpha(f);
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
