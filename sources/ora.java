// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ora implements p8c {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gta b;
    public final /* synthetic */ int c;
    public final /* synthetic */ p8c d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ p8c f;

    public /* synthetic */ ora(gta gtaVar, int i, p8c p8cVar, boolean[] zArr, p8c p8cVar2) {
        this.b = gtaVar;
        this.c = i;
        this.d = p8cVar;
        this.e = zArr;
        this.f = p8cVar2;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        p8c p8cVar = this.f;
        boolean[] zArr = this.e;
        p8c p8cVar2 = this.d;
        int i = this.c;
        gta gtaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                zArr[0] = true;
                if (i > 0) {
                    gtaVar.O();
                }
                if (p8cVar2 != null) {
                    p8cVar2.a(bool.booleanValue() ? "paid" : "failed");
                }
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (i > 0) {
                    gtaVar.O();
                }
                if (p8cVar2 != null) {
                    p8cVar2.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (p8cVar != null) {
                    p8cVar.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ora(gta gtaVar, boolean[] zArr, int i, p8c p8cVar, p8c p8cVar2) {
        this.b = gtaVar;
        this.e = zArr;
        this.c = i;
        this.d = p8cVar;
        this.f = p8cVar2;
    }
}
