package a3;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.s b;
    public final /* synthetic */ i2.f c;

    public /* synthetic */ k0(n4.s sVar, i2.f fVar, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.s sVar = this.b;
                i2.f fVar = this.c;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                j2.f fVar2 = ((i2.c0) m0Var).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1015, new j2.e(p5, fVar, 5));
                break;
            default:
                n4.s sVar2 = this.b;
                i2.f fVar3 = this.c;
                synchronized (fVar3) {
                }
                m0 m0Var2 = (m0) sVar2.c;
                String str2 = e2.m0.a;
                i2.i0 i0Var = ((i2.c0) m0Var2).a;
                j2.f fVar4 = i0Var.s;
                j2.a n10 = fVar4.n((u2.g0) fVar4.d.e);
                fVar4.q(n10, 1020, new e1.c(n10, fVar3, 26));
                i0Var.S = null;
                break;
        }
    }
}
