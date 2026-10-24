package a3;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                j2.e eVar2 = ((i2.b0) m0Var).a.s;
                j2.a p5 = eVar2.p();
                eVar2.q(p5, 1015, new j2.d(p5, eVar, 9));
                break;
            default:
                n4.s sVar2 = this.b;
                i2.e eVar3 = this.c;
                synchronized (eVar3) {
                }
                m0 m0Var2 = (m0) sVar2.c;
                String str2 = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) m0Var2).a;
                j2.e eVar4 = h0Var.s;
                j2.a n10 = eVar4.n((u2.h0) eVar4.d.e);
                eVar4.q(n10, 1020, new e1.c(n10, eVar3, 26));
                h0Var.S = null;
                break;
        }
    }
}
