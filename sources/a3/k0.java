package a3;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.s b;
    public final /* synthetic */ i2.d c;

    public /* synthetic */ k0(n4.s sVar, i2.d dVar, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.s sVar = this.b;
                i2.d dVar = this.c;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.a0) m0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.e(p5, dVar, 5));
                break;
            default:
                n4.s sVar2 = this.b;
                i2.d dVar2 = this.c;
                synchronized (dVar2) {
                }
                m0 m0Var2 = (m0) sVar2.c;
                String str2 = e2.m0.a;
                i2.g0 g0Var = ((i2.a0) m0Var2).a;
                j2.f fVar2 = g0Var.s;
                j2.a n10 = fVar2.n((u2.g0) fVar2.d.e);
                fVar2.q(n10, 1020, new e1.c(n10, dVar2, 26));
                g0Var.S = null;
                break;
        }
    }
}
