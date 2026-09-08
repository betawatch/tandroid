package k2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;
    public final /* synthetic */ k c;

    public /* synthetic */ h(n4.y yVar, k kVar, int i10) {
        this.a = i10;
        this.b = yVar;
        this.c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k kVar = this.c;
        n4.y yVar = this.b;
        switch (i10) {
            case 0:
                j jVar = (j) yVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(0, p5, kVar));
                break;
            default:
                j jVar2 = (j) yVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar2).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, kVar, 17));
                break;
        }
    }
}
