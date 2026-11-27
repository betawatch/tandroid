// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nva implements icc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ icc c;
    public final /* synthetic */ pcc d;

    public /* synthetic */ nva(pcc pccVar, boolean[] zArr, icc iccVar) {
        this.d = pccVar;
        this.b = zArr;
        this.c = iccVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        pcc pccVar = this.d;
        icc iccVar = this.c;
        boolean[] zArr = this.b;
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                }
                zArr[0] = true;
                iccVar.a(bool.booleanValue() ? "paid" : "failed", l);
                break;
            default:
                zArr[0] = true;
                iccVar.a(bool.booleanValue() ? "paid" : "failed", l);
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nva(boolean[] zArr, icc iccVar, pcc pccVar) {
        this.b = zArr;
        this.c = iccVar;
        this.d = pccVar;
    }
}
