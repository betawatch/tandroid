// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x2b b;

    public /* synthetic */ i2b(x2b x2bVar, byte b) {
        this.a = b;
        this.b = x2bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x2b x2bVar = this.b;
        switch (b) {
            case 0:
                x2bVar.n1.f();
                break;
            case 1:
                x2bVar.n1.f();
                break;
            case 2:
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 1, x2bVar.F1, false, false);
                break;
            case 3:
                oc7.r1(x2bVar.a).C3("stickers", x2bVar.F1, 1, null);
                break;
            default:
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 1, x2bVar.F1, false, false);
                break;
        }
    }
}
