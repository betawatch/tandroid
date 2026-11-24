// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nva implements g94, bja {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nxa b;

    public /* synthetic */ nva(nxa nxaVar, byte b) {
        this.a = b;
        this.b = nxaVar;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        byte b = this.a;
        nxa nxaVar = this.b;
        switch (b) {
            case 0:
                nxaVar.s1();
                break;
            case 1:
                nxaVar.s1();
                break;
            default:
                nxaVar.X.setAlpha(f);
                break;
        }
    }

    @Override // g94
    public final void V(float f, int i) {
        byte b = this.a;
    }

    @Override // bja
    public final int b() {
        return this.b.b0;
    }

    private final void a(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
