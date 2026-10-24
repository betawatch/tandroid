package k2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ u0 c;

    public /* synthetic */ u(qf.b bVar, u0 u0Var, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        u0 u0Var = this.c;
        qf.b bVar = this.b;
        switch (i10) {
            case 0:
                v vVar = (v) bVar.c;
                String str = e2.m0.a;
                j2.e eVar = ((i2.b0) vVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1032, new j2.d(p5, u0Var, 22));
                break;
            default:
                v vVar2 = (v) bVar.c;
                String str2 = e2.m0.a;
                j2.e eVar2 = ((i2.b0) vVar2).a.s;
                j2.a p9 = eVar2.p();
                eVar2.q(p9, 1031, new j2.d(p9, u0Var, 5));
                break;
        }
    }
}
