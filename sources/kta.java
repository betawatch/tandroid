// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kta implements x74, zga {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jva b;

    public /* synthetic */ kta(jva jvaVar, byte b) {
        this.a = b;
        this.b = jvaVar;
    }

    @Override // x74
    public final void D(float f, int i) {
        byte b = this.a;
    }

    @Override // zga
    public final int b() {
        return this.b.b0;
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        byte b = this.a;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                jvaVar.r1();
                break;
            case 1:
                jvaVar.r1();
                break;
            default:
                jvaVar.X.setAlpha(f);
                break;
        }
    }

    private final void a(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
