// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
