// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mta implements jac {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ jac c;
    public final /* synthetic */ qac d;

    public /* synthetic */ mta(qac qacVar, boolean[] zArr, jac jacVar) {
        this.d = qacVar;
        this.b = zArr;
        this.c = jacVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        qac qacVar = this.d;
        jac jacVar = this.c;
        boolean[] zArr = this.b;
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                if (qacVar != null) {
                    qacVar.a(Boolean.TRUE);
                }
                zArr[0] = true;
                jacVar.a(bool.booleanValue() ? "paid" : "failed", l);
                break;
            default:
                zArr[0] = true;
                jacVar.a(bool.booleanValue() ? "paid" : "failed", l);
                if (qacVar != null) {
                    qacVar.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mta(boolean[] zArr, jac jacVar, qac qacVar) {
        this.b = zArr;
        this.c = jacVar;
        this.d = qacVar;
    }
}
