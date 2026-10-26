package a3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ n4.s b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ j0(n4.s sVar, int i10, long j10) {
        this.b = sVar;
        this.d = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j10 = this.c;
        n4.s sVar = this.b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) sVar.c;
                String str = e2.n0.a;
                j2.e eVar = ((i2.d0) m0Var).a.s;
                j2.a n10 = eVar.n((u2.g0) eVar.d.e);
                eVar.q(n10, 1018, new ig.g(n10, i11, j10));
                break;
            default:
                m0 m0Var2 = (m0) sVar.c;
                String str2 = e2.n0.a;
                j2.e eVar2 = ((i2.d0) m0Var2).a.s;
                j2.a n11 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n11, 1021, new ig.g(n11, j10, i11));
                break;
        }
    }

    public /* synthetic */ j0(n4.s sVar, long j10, int i10) {
        this.b = sVar;
        this.c = j10;
        this.d = i10;
    }
}
