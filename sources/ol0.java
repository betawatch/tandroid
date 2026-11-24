// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol0 implements ml0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wjb b;

    public /* synthetic */ ol0(wjb wjbVar, byte b) {
        this.a = b;
        this.b = wjbVar;
    }

    @Override // ml0
    public final int k(wjb wjbVar, boolean z) {
        byte b = this.a;
        wjb wjbVar2 = this.b;
        switch (b) {
            case 0:
                if (nod.d(y6c.t0, wjbVar2)) {
                    return bkb.p1(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.Ie, wjbVar));
                }
                return bm2.o(bkb.v0(bkb.Ie, wjbVar), kk7.d4);
            case 1:
                if (nod.d(y6c.t0, wjbVar2)) {
                    return bkb.p1(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.Se, wjbVar));
                }
                return bm2.o(bkb.v0(z ? bkb.r8 : bkb.Se, wjbVar), kk7.d4);
            default:
                if (nod.d(y6c.t0, wjbVar2)) {
                    return bkb.p1(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.Se, wjbVar));
                }
                return bm2.o(bkb.v0(z ? bkb.r8 : bkb.Se, wjbVar), kk7.d4);
        }
    }
}
