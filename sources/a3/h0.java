package a3;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pf.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ h0(pf.b bVar, int i10, long j3) {
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
                i2.c0 c0Var = (i2.c0) bVar.c;
                String str = e2.d0.a;
                j2.f fVar = c0Var.a.s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1018, new j2.c(n10, i11, j3));
                break;
            default:
                i2.c0 c0Var2 = (i2.c0) bVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = c0Var2.a.s;
                j2.a n11 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n11, 1021, new j2.c(n11, j3, i11));
                break;
        }
    }

    public /* synthetic */ h0(pf.b bVar, long j3, int i10) {
        this.b = bVar;
        this.c = j3;
        this.d = i10;
    }
}
