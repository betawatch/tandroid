package k2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new i0.b(p5, exc, 29));
                break;
            default:
                j jVar2 = (j) yVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar2).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                break;
        }
    }
}
