package a3;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.s b;
    public final /* synthetic */ i2.e c;

    public /* synthetic */ k0(n4.s sVar, i2.e eVar, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4.s sVar = this.b;
                i2.e eVar = this.c;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.b0) m0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.e(p5, eVar, 5));
                break;
            default:
                n4.s sVar2 = this.b;
                i2.e eVar2 = this.c;
                synchronized (eVar2) {
                }
                m0 m0Var2 = (m0) sVar2.c;
                String str2 = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) m0Var2).a;
                j2.f fVar2 = h0Var.s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n10, 1020, new e1.c(n10, eVar2, 26));
                h0Var.S = null;
                break;
        }
    }
}
