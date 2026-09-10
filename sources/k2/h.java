package k2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of.b b;
    public final /* synthetic */ k c;

    public /* synthetic */ h(of.b bVar, k kVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k kVar = this.c;
        of.b bVar = this.b;
        switch (i10) {
            case 0:
                j jVar = (j) bVar.c;
                String str = e2.d0.a;
                j2.e eVar = ((i2.b0) jVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1032, new j2.d(p5, kVar, 24));
                break;
            default:
                j jVar2 = (j) bVar.c;
                String str2 = e2.d0.a;
                j2.e eVar2 = ((i2.b0) jVar2).a.s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1031, new j2.d(p10, kVar, 11));
                break;
        }
    }
}
