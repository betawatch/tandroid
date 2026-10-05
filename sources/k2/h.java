package k2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;
    public final /* synthetic */ i2.g c;

    public /* synthetic */ h(n4.y yVar, i2.g gVar, int i10) {
        this.a = i10;
        this.b = yVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.y yVar = this.b;
                i2.g gVar = this.c;
                synchronized (gVar) {
                }
                k kVar = (k) yVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) kVar).a.s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, gVar, 13));
                break;
            default:
                n4.y yVar2 = this.b;
                i2.g gVar2 = this.c;
                k kVar2 = (k) yVar2.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) kVar2).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, gVar2, 6));
                break;
        }
    }
}
