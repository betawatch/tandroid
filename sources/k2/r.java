package k2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf.b b;
    public final /* synthetic */ i2.d c;

    public /* synthetic */ r(qf.b bVar, i2.d dVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf.b bVar = this.b;
                i2.d dVar = this.c;
                synchronized (dVar) {
                }
                u uVar = (u) bVar.c;
                String str = e2.m0.a;
                j2.f fVar = ((i2.a0) uVar).a.s;
                j2.a n10 = fVar.n((u2.g0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, dVar, 26));
                break;
            default:
                qf.b bVar2 = this.b;
                i2.d dVar2 = this.c;
                u uVar2 = (u) bVar2.c;
                String str2 = e2.m0.a;
                j2.f fVar2 = ((i2.a0) uVar2).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, dVar2, 21));
                break;
        }
    }
}
