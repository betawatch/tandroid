// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ah implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ ah(byte b, p8c p8cVar, boolean[] zArr) {
        this.a = b;
        this.b = p8cVar;
        this.c = zArr;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        boolean[] zArr = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(Boolean.valueOf(zArr[0]));
                break;
            default:
                p8cVar.a(Boolean.TRUE);
                zArr[0] = true;
                hdVar.dismiss();
                break;
        }
    }
}
