// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
