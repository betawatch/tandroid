// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h5c implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p5c b;

    public /* synthetic */ h5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                p5cVar.finishFragment();
                break;
            case 1:
                p5cVar.G0();
                p5cVar.finishFragment();
                break;
            case 2:
                p5cVar.S = "";
                p5cVar.J0(false);
                break;
            case 3:
                p5cVar.o0();
                break;
            default:
                p5cVar.u0();
                break;
        }
    }
}
