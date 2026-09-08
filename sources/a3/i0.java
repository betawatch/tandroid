package a3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pf.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ i0(pf.b bVar, int i10, long j3) {
        this.b = bVar;
        this.d = i10;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j3 = this.c;
        pf.b bVar = this.b;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) l0Var).a.s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1018, new j2.c(n10, i11, j3));
                break;
            default:
                l0 l0Var2 = (l0) bVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) l0Var2).a.s;
                j2.a n11 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n11, 1021, new j2.c(n11, j3, i11));
                break;
        }
    }

    public /* synthetic */ i0(pf.b bVar, long j3, int i10) {
        this.b = bVar;
        this.c = j3;
        this.d = i10;
    }
}
