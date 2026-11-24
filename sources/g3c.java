// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class g3c implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3c b;

    public /* synthetic */ g3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                p3cVar.finishFragment();
                break;
            case 1:
                p3cVar.F0();
                p3cVar.finishFragment();
                break;
            case 2:
                p3cVar.S = "";
                p3cVar.I0(false);
                break;
            case 3:
                p3cVar.n0();
                break;
            default:
                p3cVar.t0();
                break;
        }
    }
}
