package k2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;
    public final /* synthetic */ i2.h c;

    public /* synthetic */ g(n4.y yVar, i2.h hVar, int i10) {
        this.a = i10;
        this.b = yVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.y yVar = this.b;
                i2.h hVar = this.c;
                synchronized (hVar) {
                }
                j jVar = (j) yVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, hVar, 11));
                break;
            default:
                n4.y yVar2 = this.b;
                i2.h hVar2 = this.c;
                j jVar2 = (j) yVar2.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar2).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, hVar2, 4));
                break;
        }
    }
}
