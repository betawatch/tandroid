package k2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ i2.e c;

    public /* synthetic */ r(qf.b bVar, i2.e eVar, int i10) {
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
                u uVar = (u) bVar.c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.b0) uVar).a.s;
                j2.a n10 = fVar.n((u2.g0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, eVar, 24));
                break;
            default:
                qf.b bVar2 = this.b;
                i2.e eVar2 = this.c;
                u uVar2 = (u) bVar2.c;
                String str2 = e2.m0.a;
                j2.f fVar2 = ((i2.b0) uVar2).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, eVar2, 19));
                break;
        }
    }
}
