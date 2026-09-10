package a3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ of.b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ i0(of.b bVar, int i10, long j3) {
        this.b = bVar;
        this.d = i10;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        long j3 = this.c;
        of.b bVar = this.b;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                j2.e eVar = ((i2.b0) l0Var).a.s;
                j2.a n10 = eVar.n((u2.g0) eVar.d.e);
                eVar.q(n10, 1018, new j2.d(n10, i11, j3));
                break;
            default:
                l0 l0Var2 = (l0) bVar.c;
                String str2 = e2.d0.a;
                j2.e eVar2 = ((i2.b0) l0Var2).a.s;
                j2.a n11 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n11, 1021, new j2.d(n11, j3, i11));
                break;
        }
    }

    public /* synthetic */ i0(of.b bVar, long j3, int i10) {
        this.b = bVar;
        this.c = j3;
        this.d = i10;
    }
}
