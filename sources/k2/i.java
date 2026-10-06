package k2;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;
    public final /* synthetic */ l c;

    public /* synthetic */ i(n4.y yVar, l lVar, int i10) {
        this.a = i10;
        this.b = yVar;
        this.c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        l lVar = this.c;
        n4.y yVar = this.b;
        switch (i10) {
            case 0:
                k kVar = (k) yVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) kVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, lVar, 2));
                break;
            default:
                k kVar2 = (k) yVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) kVar2).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, lVar, 19));
                break;
        }
    }
}
