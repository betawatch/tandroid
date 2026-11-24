// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o9c implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t9c b;

    public /* synthetic */ o9c(t9c t9cVar, byte b) {
        this.a = b;
        this.b = t9cVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        t9c t9cVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                t9cVar.dismiss();
                break;
            default:
                t9cVar.i2 = (String) obj;
                zka zkaVar = t9cVar.p2;
                gm.r(zkaVar);
                gm.d3(zkaVar, 350L);
                break;
        }
    }
}
