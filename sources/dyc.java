// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dyc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dyc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b;
        byte b2 = this.a;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                fyc fycVar = (fyc) obj2;
                if (((nv5) obj) == nv5.d && ((b = fycVar.s) == 2 || b == 3)) {
                    fycVar.s = (byte) 1;
                }
                fycVar.h.run();
                break;
            default:
                ((ue3) obj2).m0(true);
                break;
        }
    }
}
