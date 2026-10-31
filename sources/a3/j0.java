package a3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hf.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ j0(hf.b bVar, int i10, long j10) {
        this.b = bVar;
        this.d = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j10 = this.c;
        hf.b bVar = this.b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) bVar.c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) m0Var).a.s;
                j2.a S = gVar.S((u2.g0) gVar.d.e);
                gVar.V(S, 1018, new j2.c(S, i11, j10));
                break;
            default:
                m0 m0Var2 = (m0) bVar.c;
                String str2 = e2.l0.a;
                j2.g gVar2 = ((i2.c0) m0Var2).a.s;
                j2.a S2 = gVar2.S((u2.g0) gVar2.d.e);
                gVar2.V(S2, 1021, new j2.c(S2, j10, i11));
                break;
        }
    }

    public /* synthetic */ j0(hf.b bVar, long j10, int i10) {
        this.b = bVar;
        this.c = j10;
        this.d = i10;
    }
}
