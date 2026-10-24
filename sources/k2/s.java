package k2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ i2.e c;

    public /* synthetic */ s(qf.b bVar, i2.e eVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf.b bVar = this.b;
                i2.e eVar = this.c;
                synchronized (eVar) {
                }
                v vVar = (v) bVar.c;
                String str = e2.m0.a;
                j2.e eVar2 = ((i2.b0) vVar).a.s;
                j2.a n10 = eVar2.n((u2.h0) eVar2.d.e);
                eVar2.q(n10, 1013, new j2.d(n10, eVar, 0));
                break;
            default:
                qf.b bVar2 = this.b;
                i2.e eVar3 = this.c;
                v vVar2 = (v) bVar2.c;
                String str2 = e2.m0.a;
                j2.e eVar4 = ((i2.b0) vVar2).a.s;
                j2.a p5 = eVar4.p();
                eVar4.q(p5, 1007, new ih.l(p5, eVar3, 25));
                break;
        }
    }
}
