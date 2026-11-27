// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nbc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbc b;

    public /* synthetic */ nbc(sbc sbcVar, byte b) {
        this.a = b;
        this.b = sbcVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        sbc sbcVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                sbcVar.dismiss();
                break;
            default:
                sbcVar.i2 = (String) obj;
                bva bvaVar = sbcVar.p2;
                hl.r(bvaVar);
                hl.d3(bvaVar, 350L);
                break;
        }
    }
}
