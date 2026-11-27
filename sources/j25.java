// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class j25 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;

    public /* synthetic */ j25(icc iccVar, byte b) {
        this.a = b;
        this.b = iccVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a((c35) obj, (String) obj2);
                break;
            default:
                iccVar.a((Long) obj, (Boolean) obj2);
                break;
        }
    }
}
