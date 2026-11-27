// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
