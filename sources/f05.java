// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f05 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8c b;

    public /* synthetic */ f05(i8c i8cVar, byte b) {
        this.a = b;
        this.b = i8cVar;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                i8cVar.a((y05) obj, (String) obj2);
                break;
            default:
                i8cVar.a((Long) obj, (Boolean) obj2);
                break;
        }
    }
}
