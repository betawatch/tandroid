package k2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ t(qf.b bVar, t0 t0Var, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        t0 t0Var = this.c;
        qf.b bVar = this.b;
        switch (i10) {
            case 0:
                u uVar = (u) bVar.c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.b0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, t0Var, 16));
                break;
            default:
                u uVar2 = (u) bVar.c;
                String str2 = e2.m0.a;
                j2.f fVar2 = ((i2.b0) uVar2).a.s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1031, new j2.c(p9, t0Var, 29));
                break;
        }
    }
}
