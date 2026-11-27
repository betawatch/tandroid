// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
