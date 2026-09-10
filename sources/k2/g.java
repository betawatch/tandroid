package k2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of.b b;
    public final /* synthetic */ i2.g c;

    public /* synthetic */ g(of.b bVar, i2.g gVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                of.b bVar = this.b;
                i2.g gVar = this.c;
                synchronized (gVar) {
                }
                j jVar = (j) bVar.c;
                String str = e2.d0.a;
                j2.e eVar = ((i2.b0) jVar).a.s;
                j2.a n10 = eVar.n((u2.g0) eVar.d.e);
                eVar.q(n10, 1013, new j2.d(n10, gVar, 5));
                break;
            default:
                of.b bVar2 = this.b;
                i2.g gVar2 = this.c;
                j jVar2 = (j) bVar2.c;
                String str2 = e2.d0.a;
                j2.e eVar2 = ((i2.b0) jVar2).a.s;
                j2.a p5 = eVar2.p();
                eVar2.q(p5, 1007, new i0.b(p5, gVar2, 28));
                break;
        }
    }
}
