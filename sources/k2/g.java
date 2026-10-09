package k2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.x b;
    public final /* synthetic */ i2.g c;

    public /* synthetic */ g(n4.x xVar, i2.g gVar, int i10) {
        this.a = i10;
        this.b = xVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.x xVar = this.b;
                i2.g gVar = this.c;
                synchronized (gVar) {
                }
                j jVar = (j) xVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 11));
                break;
            default:
                n4.x xVar2 = this.b;
                i2.g gVar2 = this.c;
                j jVar2 = (j) xVar2.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar2).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 4));
                break;
        }
    }
}
