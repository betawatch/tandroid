// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ee implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ ee(byte b, pcc pccVar, boolean[] zArr) {
        this.a = b;
        this.b = pccVar;
        this.c = zArr;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        boolean[] zArr = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(Boolean.valueOf(zArr[0]));
                break;
            default:
                pccVar.a(Boolean.TRUE);
                zArr[0] = true;
                idVar.dismiss();
                break;
        }
    }
}
