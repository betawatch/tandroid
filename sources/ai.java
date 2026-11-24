// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ai implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ ai(byte b, qac qacVar, boolean[] zArr) {
        this.a = b;
        this.b = qacVar;
        this.c = zArr;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        boolean[] zArr = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(Boolean.valueOf(zArr[0]));
                break;
            default:
                qacVar.a(Boolean.TRUE);
                zArr[0] = true;
                heVar.dismiss();
                break;
        }
    }
}
