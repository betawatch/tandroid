package k2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ q(qf.b bVar, Exception exc, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        qf.b bVar = this.b;
        switch (i10) {
            case 0:
                u uVar = (u) bVar.c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.c0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 16));
                break;
            default:
                u uVar2 = (u) bVar.c;
                String str2 = e2.m0.a;
                j2.f fVar2 = ((i2.c0) uVar2).a.s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1014, new j2.e(p9, exc, 8));
                break;
        }
    }
}
