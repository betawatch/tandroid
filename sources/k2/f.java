package k2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ f(n4.y yVar, Exception exc, int i10) {
        this.a = i10;
        this.b = yVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        n4.y yVar = this.b;
        switch (i10) {
            case 0:
                j jVar = (j) yVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.b0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 0));
                break;
            default:
                j jVar2 = (j) yVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.b0) jVar2).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 24));
                break;
        }
    }
}
