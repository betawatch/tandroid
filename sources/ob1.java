// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j7b b;

    public /* synthetic */ ob1(j7b j7bVar, byte b) {
        this.a = b;
        this.b = j7bVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        j7b j7bVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                j7bVar.setPeriod(num.intValue());
                p8c p8cVar = j7bVar.B1;
                if (p8cVar != null) {
                    p8cVar.a(num);
                    break;
                }
                break;
            default:
                p8c p8cVar2 = j7bVar.C1;
                if (p8cVar2 != null) {
                    p8cVar2.a(num);
                    break;
                }
                break;
        }
    }
}
