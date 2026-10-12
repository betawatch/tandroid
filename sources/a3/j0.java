package a3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                String str = e2.m0.a;
                j2.f fVar = ((i2.b0) m0Var).a.s;
                j2.a n10 = fVar.n((u2.g0) fVar.d.e);
                fVar.q(n10, 1018, new j2.c(n10, i11, j10));
                break;
            default:
                m0 m0Var2 = (m0) sVar.c;
                String str2 = e2.m0.a;
                j2.f fVar2 = ((i2.b0) m0Var2).a.s;
                j2.a n11 = fVar2.n((u2.g0) fVar2.d.e);
                fVar2.q(n11, 1021, new j2.c(n11, j10, i11));
                break;
        }
    }

    public /* synthetic */ j0(n4.s sVar, long j10, int i10) {
        this.b = sVar;
        this.c = j10;
        this.d = i10;
    }
}
